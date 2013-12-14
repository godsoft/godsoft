package godsoft.codegen.run;

import godsoft.codegen.cmm.CodeGenDataModelContext;
import godsoft.codegen.cmm.CrudCodeGen;
import godsoft.codegen.cmm.DataModelContext;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class JqGridRun {

	private CrudCodeGen crudCodeGen = new CrudCodeGen();;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JqGridRun main = new JqGridRun();

			main.getDataModelContexts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getDataModelContexts() throws Exception {
		Main main = new Main();
		CodeGenDataModelContext codeGenDataModelContext = new CodeGenDataModelContext(main.getOracleVO(), main.getParameterDataModel());

		for (DataModelContext dataModelContext : codeGenDataModelContext.getDataModelContexts()) {
			this.jqGrid(dataModelContext);
			//			this.js(dataModelContext);
		}
	}

	public void jqGrid(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/jsp/pkg/jqGrid.vm";

		String pathname = dataModelContext.getCodeGenPathname().getListPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		//		FileUtils.writeStringToFile(new File(pathname), data);
	}

	public void js(DataModelContext dataModelContext) throws Exception {
		String templateFile = "godsoft/com/eGovFrameTemplates/crud/jsp/pkg/js.vm";

		String pathname = dataModelContext.getCodeGenPathname().getJsPathname();
		String data = this.crudCodeGen.generate(dataModelContext, templateFile);

		System.out.println(pathname);

		FileUtils.writeStringToFile(new File(pathname), data);
	}

}
