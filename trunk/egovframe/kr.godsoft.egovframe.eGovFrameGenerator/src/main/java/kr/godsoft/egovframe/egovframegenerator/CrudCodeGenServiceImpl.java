package kr.godsoft.egovframe.egovframegenerator;

import java.io.File;

import model.DataModelContext;
import operation.CrudCodeGen;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CrudCodeGenServiceImpl {

	private static final String ENCODING = "UTF-8";

	private static final Log log = LogFactory.getLog(CrudCodeGenApp.class);

	private CrudCodeGen crudCodeGen;

	private CrudCodeGenPath crudCodeGenPath;

	public CrudCodeGenServiceImpl() {
		crudCodeGen = new CrudCodeGen();
	}

	public void setCrudCodeGenPath(CrudCodeGenPath crudCodeGenPath) {
		this.crudCodeGenPath = crudCodeGenPath;
	}

	public void genDefaultVO(DataModelContext dataModelContext)
			throws Exception {
		String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

		String data = crudCodeGen.generate(dataModelContext, templateFile);

		crudCodeGenPath.setDefaultVOPath(dataModelContext);

		if (log.isDebugEnabled()) {
			log.debug("defaultVOPath=" + crudCodeGenPath.getDefaultVOPath());
		}

		writeStringToFile(crudCodeGenPath.getDefaultVOPath(), data);
	}

	public void genVO(DataModelContext dataModelContext) throws Exception {
		String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";

		String data = crudCodeGen.generate(dataModelContext, templateFile);

		crudCodeGenPath.setVoPath(dataModelContext);

		if (log.isDebugEnabled()) {
			log.debug("voPath=" + crudCodeGenPath.getVoPath());
		}

		writeStringToFile(crudCodeGenPath.getVoPath(), data);
	}

	public void genSQLMap(DataModelContext dataModelContext) throws Exception {
		String templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

		String data = crudCodeGen.generate(dataModelContext, templateFile);

		crudCodeGenPath.setSqlMapPath(dataModelContext);

		if (log.isDebugEnabled()) {
			log.debug("SqlMapPath=" + crudCodeGenPath.getSqlMapPath());
		}

		writeStringToFile(crudCodeGenPath.getSqlMapPath(), data);
	}

	public void genDao(DataModelContext dataModelContext) throws Exception {
		String templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";

		String data = crudCodeGen.generate(dataModelContext, templateFile);

		crudCodeGenPath.setDaoPath(dataModelContext);

		if (log.isDebugEnabled()) {
			log.debug("daoPath=" + crudCodeGenPath.getDaoPath());
		}

		writeStringToFile(crudCodeGenPath.getDaoPath(), data);
	}

	private void writeStringToFile(String pathname, String data)
			throws Exception {
		File file = new File(pathname);

		FileUtils.writeStringToFile(file, data, ENCODING);
	}

}
