package godsoft.codegen;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.model.Attribute;
import godsoft.codegen.model.DataModelContext;
import godsoft.codegen.model.Entity;
import godsoft.codegen.operation.CrudCodeGen;

import java.util.ArrayList;
import java.util.List;

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

		for (EgovMap allTabComment : allTabComments) {
			String allTabCommentTableName = (String) allTabComment.get("tableName");

			System.out.println(allTabCommentTableName);

			DataModelContext dataModel = new DataModelContext();

			//			dataModel.setPackageName("forest.pms");
			//			dataModel.setAuthor("이백행");
			//			dataModel.setTeam("(주)메타지아이에스컨설팅");
			//			dataModel.setCreateDate("2009.02.01");

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

			CrudCodeGen crudCodeGen = new CrudCodeGen();

			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";
			//		String targetFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.xml";

			String result = crudCodeGen.generate(dataModel, templateFile);

			//		System.out.println(result);
		}

	}

}
