package godsoft.codegen;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;
import godsoft.codegen.cmm.OracleVO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrudCodeGenLBH {

	private static AllTabColsDAO allTabColsDAO;
	private static AllTabCommentsDAO allTabCommentsDAO;

	private static OracleVO oracleVO;

	static {
		String configLocation = "classpath:godsoft/spring/codegen-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

		// Bean
		allTabColsDAO = (AllTabColsDAO) context.getBean("allTabColsDAO");
		allTabCommentsDAO = (AllTabCommentsDAO) context.getBean("allTabCommentsDAO");

		// VO
		oracleVO = new OracleVO();

		oracleVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();
		tableNames.add("IDS");
		tableNames.add("SAMPLE");
		oracleVO.setTableNames(tableNames);
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		List<EgovMap> allTabComments = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
		//		List<EgovMap> results = allTabColsDAO.selectAllTabColsList(oracleVO);

		for (EgovMap allTabComment : allTabComments) {
			String tableName = (String) allTabComment.get("tableName");

			System.out.println(tableName);
		}

		//
		//		for (String tableName : tableNames) {
		//			System.out.println(tableName);
		//		}

		//		DataModelContext dataModel = new DataModelContext();
		//
		//		dataModel.setPackageName("forest.pms");
		//		dataModel.setAuthor("이백행");
		//		dataModel.setTeam("(주)메타지아이에스컨설팅");
		//		dataModel.setCreateDate("2009.02.01");
		//
		//		Entity entity = new Entity("SAMPLE2");
		//
		//		dataModel.setEntity(entity);
		//
		//		List<Attribute> attributes = new ArrayList<Attribute>();
		//		List<Attribute> primaryKeys = new ArrayList<Attribute>();
		//
		//		for (EgovMap result : results) {
		//			String columnName = (String) result.get("columnName");
		//
		//			Attribute attribute = new Attribute(columnName);
		//			attribute.setJavaType("String");
		//			attributes.add(attribute);
		//			//			primaryKeys.add(attr);
		//		}
		//
		//		dataModel.setAttributes(attributes);
		//		dataModel.setPrimaryKeys(primaryKeys);
		//
		//		CrudCodeGen crudCodeGen = new CrudCodeGen();
		//
		//		String templateFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2List.vm";
		//		//		String targetFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.xml";
		//
		//		String result = crudCodeGen.generate(dataModel, templateFile);
		//
		//		//		System.out.println(result);
	}

}
