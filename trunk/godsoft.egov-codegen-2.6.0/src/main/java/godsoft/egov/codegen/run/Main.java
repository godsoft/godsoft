package godsoft.egov.codegen.run;

import godsoft.egov.codegen.cmm.Attribute;
import godsoft.egov.codegen.cmm.CrudCodeGen;
import godsoft.egov.codegen.cmm.DataModelContext;
import godsoft.egov.codegen.cmm.Entity;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private CrudCodeGen crudCodeGen;
	private DataModelContext dataModel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main main = new Main();
			main.crudCodeGen();
			main.defaultVO();
			//			main.sqlMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void crudCodeGen() {
		crudCodeGen = new CrudCodeGen();

		dataModel = new DataModelContext();

		//		dataModel.setPackageName("pkg");
		//		dataModel.setAuthor("홍길동");
		//		dataModel.setTeam("실행환경 개발팀");
		//		dataModel.setCreateDate("2009.02.01");

		Entity entity = new Entity("SAMPLE2");

		dataModel.setEntity(entity);

		List<Attribute> attributes = new ArrayList<Attribute>();
		List<Attribute> primaryKeys = new ArrayList<Attribute>();

		Attribute attr = new Attribute("ID");
		attr.setJavaType("String");
		attributes.add(attr);
		primaryKeys.add(attr);

		attr = new Attribute("NAME");
		attr.setJavaType("String");
		attributes.add(attr);
		//		primaryKeys.add(attr);

		attr = new Attribute("DESCRIPTION");
		attr.setJavaType("String");
		attributes.add(attr);

		attr = new Attribute("USE_YN");
		attr.setJavaType("String");
		attributes.add(attr);

		attr = new Attribute("REG_USER");
		attr.setJavaType("String");
		attributes.add(attr);

		dataModel.setAttributes(attributes);
		dataModel.setPrimaryKeys(primaryKeys);
	}

	public void defaultVO() throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

		String result = crudCodeGen.generate(dataModel, templateFile);

		//		System.out.println(result);
	}

	public void sqlMap() throws Exception {
		String templateFile = "eGovFrameTemplates/crud/resource/godsoft/egov/core/EgovSample_Sample2_SQL.vm";

		String result = crudCodeGen.generate(dataModel, templateFile);

		System.out.println(result);
	}

}
