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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
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

		Map<String, String> entityTableName = new HashMap<String, String>();
		entityTableName.put("SAMPLE", "PMSSAMPLE");

		for (EgovMap allTabComment : allTabComments) {
			String allTabCommentTableName = (String) allTabComment.get("tableName");

			System.out.println(allTabCommentTableName);

			DataModelContext dataModel = new DataModelContext();

			dataModel.setProjectName(dataModel2.getProjectName());

			dataModel.setVender(dataModel2.getVender());
			dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
			dataModel.setCreateDate(GodsoftUtils.getToday());
			dataModel.setPackageName(dataModel2.getPackageName());

			Entity entity = new Entity(entityTableName.get(allTabCommentTableName));
			entity.setTableName(allTabCommentTableName);

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			for (EgovMap allTabCol : allTabCols) {
				String allTabColTableName = (String) allTabCol.get("tableName");
				String columnName = (String) allTabCol.get("columnName");
				String dataType = (String) allTabCol.get("dataType");
				int dataLength = MapUtils.getIntValue(allTabCol, "dataLength", 0);
				String columnComments = (String) allTabCol.get("columnComments");
				int position = MapUtils.getIntValue(allTabCol, "position", 0);

				if (allTabColTableName.equals(allTabCommentTableName)) {
					System.out.println(columnName);

					Attribute attribute = new Attribute(columnName);
					attribute.setJavaType(GodsoftUtils.getDataType(dataType));
					attributes.add(attribute);

					if (position > 0) {
						primaryKeys.add(attribute);
					}
				}
			}

			dataModel.setAttributes(attributes);
			dataModel.setPrimaryKeys(primaryKeys);

			//			dataModels.add(dataModel);

			String templateFile = "";
			String data = "";

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDefaultVO(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileVO(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMap(dataModel), data);

			sqlMaps.add(GodsoftUtils.getSqlMap(dataModel));

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDAO(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/DAOTest.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileDAOTest(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/EgovSample2Service.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileService(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileServiceImpl(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/ServiceImplTest.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileServiceImplTest(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/java/pkg/web/EgovSample2Controller.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileController(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileList(dataModel), data);

			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2Register.vm";
			data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(GodsoftUtils.getFileRegister(dataModel), data);
		}

		dataModel2.setSqlMaps(sqlMaps);

		String templateFileSqlMapConfig = "eGovFrameTemplates/crud/resource/pkg/sqlMapConfig.vm";
		String dataSqlMapConfig = crudCodeGen.generate(dataModel2, templateFileSqlMapConfig);
		FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMapConfig(dataModel2), dataSqlMapConfig);
	}
}
