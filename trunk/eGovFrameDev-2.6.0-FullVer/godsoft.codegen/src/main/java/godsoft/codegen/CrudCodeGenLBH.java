package godsoft.codegen;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.model.Attribute;
import godsoft.codegen.model.DataModelContext;
import godsoft.codegen.model.Entity;
import godsoft.codegen.operation.CrudCodeGen;

import java.io.File;
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

		for (EgovMap allTabComment : allTabComments) {
			String allTabCommentTableName = (String) allTabComment.get("tableName");

			System.out.println(allTabCommentTableName);

			DataModelContext dataModel = new DataModelContext();

			dataModel.setProjectName("pms-webapp");

			dataModel.setVender("Oracle");
			dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
			dataModel.setCreateDate("2009.02.01");
			dataModel.setPackageName("forest.pms");

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

			String templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";
			String data = crudCodeGen.generate(dataModel, templateFile);
			FileUtils.writeStringToFile(new File(getSqlMapPath(dataModel)), data);
			//			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";
			//			result = crudCodeGen.generate(dataModel, templateFile);
		}
	}

	private static String getSqlMapPath(DataModelContext dataModel) {
		//			/pms-webapp/src/main/resources/forest/sqlmap/pms/fpuser/Fpuser_SQL_Oracle.xml

		String[] packageNames = dataModel.getPackageName().split("\\.");

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/resources/");
		sb.append(packageNames[0]);
		sb.append("/sqlmap/");
		sb.append(packageNames[1]);
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		return sb.toString();
	}

}