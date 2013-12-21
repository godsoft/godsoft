package godsoft.codegen.run;

import godsoft.codegen.cmm.CodeGenDataModelContext;
import godsoft.codegen.cmm.CrudCodeGen;
import godsoft.codegen.cmm.DataModelContext;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class BootstrapRun {

	private CrudCodeGen crudCodeGen = new CrudCodeGen();;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BootstrapRun main = new BootstrapRun();

			main.getDataModelContexts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getDataModelContexts() throws Exception {
		Main main = new Main();
		CodeGenDataModelContext codeGenDataModelContext = new CodeGenDataModelContext(main.getOracleVO(), main.getParameterDataModel());

		for (DataModelContext dataModelContext : codeGenDataModelContext.getDataModelContexts()) {
			this.list(dataModelContext);
			this.regist(dataModelContext);
		}
	}

	public void list(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/jsp/pkg/egovSample2List-bootstrap-3.0.3.vm";

		String pathname = dataModelContext.getCodeGenPathname().getBootstrapListPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void regist(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/jsp/pkg/egovSample2Register-bootstrap-3.0.3.vm";

		String pathname = dataModelContext.getCodeGenPathname().getBootstrapRegistPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

}
