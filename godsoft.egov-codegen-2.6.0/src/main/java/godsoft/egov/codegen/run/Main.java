package godsoft.egov.codegen.run;

import godsoft.egov.codegen.cmm.Attribute;
import godsoft.egov.codegen.cmm.CodeGenDataModelContext;
import godsoft.egov.codegen.cmm.CodeGenUtils;
import godsoft.egov.codegen.cmm.CrudCodeGen;
import godsoft.egov.codegen.cmm.DataModelContext;
import godsoft.egov.codegen.cmm.Entity;
import godsoft.egov.codegen.cmm.OracleVO;

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

			main.getDataModelContexts();

			//			main.crudCodeGen();
			//			main.defaultVO();
			//			main.sqlMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public OracleVO getOracleVO() {
		OracleVO oracleVO = new OracleVO();

		oracleVO.setOwner("EGOV");

		List<Entity> entitys = new ArrayList<Entity>();

		Entity entity = new Entity("TEST_IDS");
		entity.setTableName("IDS");
		entitys.add(entity);

		entity = new Entity("TEST_SAMPLE");
		entity.setTableName("SAMPLE");
		entitys.add(entity);

		oracleVO.setEntitys(entitys);

		return oracleVO;
	}

	public DataModelContext getParameterDataModel() {
		DataModelContext dataModel = new DataModelContext();

		dataModel.setVender("Oracle");

		dataModel.setAuthor("갓소프트 이백행");
		dataModel.setCreateDate(CodeGenUtils.getToday());
		dataModel.setPackageName("godsoft.egov.com.user");

		dataModel.setProjectLocation("../godsoft.egov-com-2.6.0");

		return dataModel;
	}

	public void getDataModelContexts() throws Exception {
		CodeGenDataModelContext codeGenDataModelContext = new CodeGenDataModelContext(getOracleVO(), null, getParameterDataModel());

		for (DataModelContext dataModel : codeGenDataModelContext.getDataModelContexts()) {
			//			System.out.println(dataModel);
			System.out.println(dataModel.getEntity().getCcName());
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
