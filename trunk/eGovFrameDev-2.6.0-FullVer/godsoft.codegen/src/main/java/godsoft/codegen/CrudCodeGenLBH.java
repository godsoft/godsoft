package godsoft.codegen;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;
import godsoft.codegen.cmm.GodsoftUtils;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.model.Attribute;
import godsoft.codegen.model.DataModelContext;
import godsoft.codegen.model.Entity;
import godsoft.codegen.operation.CrudCodeGen;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrudCodeGenLBH {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String configLocation = "classpath:godsoft/spring/codegen-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

		// Bean
		AllTabColsDAO allTabColsDAO = (AllTabColsDAO) context.getBean("allTabColsDAO");
		AllTabCommentsDAO allTabCommentsDAO = (AllTabCommentsDAO) context.getBean("allTabCommentsDAO");

		// VO
		OracleVO oracleVO = new OracleVO();

		oracleVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();
		//		tableNames.add("IDS");
		tableNames.add("SAMPLE");
		oracleVO.setTableNames(tableNames);

		List<EgovMap> allTabComments = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
		List<EgovMap> allTabCols = allTabColsDAO.selectAllTabColsList(oracleVO);

		//		List<DataModelContext> dataModels = new ArrayList<DataModelContext>();

		DataModelContext dataModel2 = new DataModelContext();
		dataModel2.setProjectName("pms-webapp");
		dataModel2.setVender("Oracle");
		dataModel2.setPackageName("forest.pms");
		List<String> sqlMaps = new ArrayList<String>();

		CrudCodeGen crudCodeGen = new CrudCodeGen();

		for (EgovMap allTabComment : allTabComments) {
			String allTabCommentTableName = (String) allTabComment.get("tableName");

			System.out.println(allTabCommentTableName);

			DataModelContext dataModel = new DataModelContext();

			dataModel.setProjectName(dataModel2.getProjectName());

			dataModel.setVender(dataModel2.getVender());
			dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
			dataModel.setCreateDate(GodsoftUtils.getToday());
			dataModel.setPackageName(dataModel2.getPackageName());

			Entity entity = new Entity(allTabCommentTableName);

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			for (EgovMap allTabCol : allTabCols) {
				String allTabColTableName = (String) allTabCol.get("tableName");
				String columnName = (String) allTabCol.get("columnName");

				if (allTabColTableName.equals(allTabCommentTableName)) {
					System.out.println(columnName);

					Attribute attribute = new Attribute(columnName);
					attribute.setJavaType("String");
					attributes.add(attribute);

					//			primaryKeys.add(attr);
				}
			}

			dataModel.setAttributes(attributes);
			dataModel.setPrimaryKeys(primaryKeys);

			//			dataModels.add(dataModel);

			String templateFileDefaultVO = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";
			String dataDefaultVO = crudCodeGen.generate(dataModel, templateFileDefaultVO);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDefaultVO(dataModel), dataDefaultVO);

			String templateFileVO = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";
			String dataVO = crudCodeGen.generate(dataModel, templateFileVO);
			FileUtils.writeStringToFile(GodsoftUtils.getFileVO(dataModel), dataVO);

			String templateFileSqlMap = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";
			String dataSqlMap = crudCodeGen.generate(dataModel, templateFileSqlMap);
			FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMap(dataModel), dataSqlMap);

			sqlMaps.add(GodsoftUtils.getSqlMap(dataModel));

			String templateFileDAO = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";
			String dataDAO = crudCodeGen.generate(dataModel, templateFileDAO);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDAO(dataModel), dataDAO);

			String templateFileDAOTest = "eGovFrameTemplates/crud/java/pkg/service/impl/DAOTest.vm";
			String dataDAOTest = crudCodeGen.generate(dataModel, templateFileDAOTest);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDAOTest(dataModel), dataDAOTest);

			//			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";
			//			result = crudCodeGen.generate(dataModel, templateFile);

		}

		dataModel2.setSqlMaps(sqlMaps);

		String templateFileSqlMapConfig = "eGovFrameTemplates/crud/resource/pkg/sqlMapConfig.vm";
		String dataSqlMapConfig = crudCodeGen.generate(dataModel2, templateFileSqlMapConfig);
		FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMapConfig(dataModel2), dataSqlMapConfig);
	}

}
