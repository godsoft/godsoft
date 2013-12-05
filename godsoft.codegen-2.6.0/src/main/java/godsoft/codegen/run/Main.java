package godsoft.codegen.run;

import godsoft.codegen.cmm.CodeGenDataModelContext;
import godsoft.codegen.cmm.CodeGenUtils;
import godsoft.codegen.cmm.CrudCodeGen;
import godsoft.codegen.cmm.DataModelContext;
import godsoft.codegen.cmm.Entity;
import godsoft.codegen.cmm.OracleVO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	private CrudCodeGen crudCodeGen = new CrudCodeGen();;

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
			this.service(dataModelContext);
			this.serviceImpl(dataModelContext);
			this.serviceImplTest(dataModelContext);
			this.controller(dataModelContext);
		}
	}

	public void defaultVO(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDefaultVOPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void vo(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getVoPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void sqlMap(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

		String pathname = dataModelContext.getCodeGenPathname().getSqlMapPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void dao(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDaoPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void daoTest(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/impl/DAOTest.vm";

		String pathname = dataModelContext.getCodeGenPathname().getDaoTestPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void service(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/EgovSample2Service.vm";

		String pathname = dataModelContext.getCodeGenPathname().getService2Pathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void serviceImpl(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm";

		String pathname = dataModelContext.getCodeGenPathname().getServiceImpl2Pathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void serviceImplTest(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/service/impl/ServiceImplTest.vm";

		String pathname = dataModelContext.getCodeGenPathname().getServiceImplTestPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void controller(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/java/pkg/web/EgovSample2Controller.vm";

		String pathname = dataModelContext.getCodeGenPathname().getControllerPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

}
