package godsoft.egov.codegen.run;

import godsoft.egov.codegen.cmm.CodeGenDataModelContext;
import godsoft.egov.codegen.cmm.CodeGenUtils;
import godsoft.egov.codegen.cmm.CrudCodeGen;
import godsoft.egov.codegen.cmm.DataModelContext;
import godsoft.egov.codegen.cmm.Entity;
import godsoft.egov.codegen.cmm.OracleVO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	private CrudCodeGen crudCodeGen = new CrudCodeGen();;

	//	private DataModelContext dataModel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main main = new Main();

			main.getDataModelContexts();
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
		dataModel.setTopLevelPackage("godsoft.com");
		dataModel.setMiddleLevelPackage("user");

		dataModel.setProjectLocation("../godsoft.com-2.6.0");

		return dataModel;
	}

	public void getDataModelContexts() throws Exception {
		CodeGenDataModelContext codeGenDataModelContext = new CodeGenDataModelContext(getOracleVO(), getParameterDataModel());

		for (DataModelContext dataModelContext : codeGenDataModelContext.getDataModelContexts()) {
			//						this.defaultVO(dataModelContext);
			this.vo(dataModelContext);
			this.sqlMap(dataModelContext);
			this.dao(dataModelContext);
			this.daoTest(dataModelContext);
		}
	}

	public void defaultVO(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDefaultVOPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void vo(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getVoPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void sqlMap(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

		String pathname = dataModelContext.getCodeGenPathname().getSqlMapPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void dao(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDaoPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void daoTest(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/egov/com/eGovFrameTemplates/crud/java/pkg/service/impl/DAOTest.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDaoTestPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

}
