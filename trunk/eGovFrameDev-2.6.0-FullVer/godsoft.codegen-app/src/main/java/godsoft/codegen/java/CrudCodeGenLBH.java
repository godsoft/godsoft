package godsoft.codegen.java;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.AllTabColsVO;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;

import java.util.ArrayList;
import java.util.List;

import model.Attribute;
import model.DataModelContext;
import model.Entity;
import operation.CrudCodeGen;

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

		AllTabColsDAO allTabColsDAO = (AllTabColsDAO) context.getBean("allTabColsDAO");

		AllTabColsVO allTabColsVO = new AllTabColsVO();
		allTabColsVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		allTabColsVO.setTableNames(tableNames);

		List<EgovMap> results = allTabColsDAO.selectAllTabColsList(allTabColsVO);

		System.out.println(results);

		DataModelContext dataModel = new DataModelContext();

		dataModel.setPackageName("forest.pms");
		dataModel.setAuthor("이백행");
		dataModel.setTeam("(주)메타지아이에스컨설팅");
		dataModel.setCreateDate("2009.02.01");

		Entity entity = new Entity("SAMPLE2");

		dataModel.setEntity(entity);

		List<Attribute> attributes = new ArrayList<Attribute>();
		List<Attribute> primaryKeys = new ArrayList<Attribute>();

		for (EgovMap result : results) {
			String columnName = (String) result.get("columnName");

			Attribute attribute = new Attribute(columnName);
			attribute.setJavaType("String");
			attributes.add(attribute);
			//			primaryKeys.add(attr);
		}

		dataModel.setAttributes(attributes);
		dataModel.setPrimaryKeys(primaryKeys);

		CrudCodeGen crudCodeGen = new CrudCodeGen();

		String templateFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2List.vm";
		//		String targetFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.xml";

		String result = crudCodeGen.generate(dataModel, templateFile);

		//		System.out.println(result);
	}

}
