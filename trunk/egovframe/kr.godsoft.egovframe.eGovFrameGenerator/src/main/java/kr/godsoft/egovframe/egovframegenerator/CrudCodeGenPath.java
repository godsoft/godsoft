package kr.godsoft.egovframe.egovframegenerator;

import model.DataModelContext;
import utils.NamingUtils;

public class CrudCodeGenPath {

	// /kr.godsoft.egovframe.GeneratorWebApp/src/main/java/kr/godsoft/egovframe/generatorwebapp/comtcadministcode/service

	// /kr.godsoft.egovframe.GeneratorWebApp/src/main/resources/kr/godsoft/egovframe/generatorwebapp/sqlmap

	// /kr.godsoft.egovframe.GeneratorWebApp/src/main/webapp/WEB-INF/jsp/egovframework/rte

	private static final String SRC_MAIN_JAVA = "src/main/java/";

	private static final String SRC_MAIN_RESOURCES = "src/main/resources/";

	private static final String SRC_MAIN_EBAPP = "src/main/webapp/";

	private String projectPath;

	private String servicePath;

	private String serviceImplPath;

	// gen
	private String defaultVOPath;

	private String voPath;

	private String sqlMapPath;

	private String daoPath;

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	public String getServicePath() {
		return servicePath;
	}

	public void setServicePath(String servicePath) {
		this.servicePath = servicePath;
	}

	public void setServicePath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_JAVA);
		sb.append(dataModelContext.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/service/");

		this.servicePath = sb.toString();
	}

	public String getServiceImplPath() {
		return serviceImplPath;
	}

	public void setServiceImplPath(String serviceImplPath) {
		this.serviceImplPath = serviceImplPath;
	}

	public void setServiceImplPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_JAVA);
		sb.append(dataModelContext.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/service/impl/");

		this.serviceImplPath = sb.toString();
	}

	// gen
	public String getDefaultVOPath() {
		return defaultVOPath;
	}

	public void setDefaultVOPath(String defaultVOPath) {
		this.defaultVOPath = defaultVOPath;
	}

	public void setDefaultVOPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		setServicePath(dataModelContext);

		sb.append(servicePath);
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("DefaultVO.java");

		this.defaultVOPath = sb.toString();
	}

	public String getVoPath() {
		return voPath;
	}

	public void setVoPath(String voPath) {
		this.voPath = voPath;
	}

	public void setVoPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		setServicePath(dataModelContext);

		sb.append(servicePath);
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("VO.java");

		this.voPath = sb.toString();
	}

	public String getSqlMapPath() {
		return sqlMapPath;
	}

	public void setSqlMapPath(String sqlMapPath) {
		this.sqlMapPath = sqlMapPath;
	}

	public void setSqlMapPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_RESOURCES);
		sb.append(dataModelContext.getPackageName().replaceAll("\\.", "/"));
		sb.append("/sqlmap/");
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("_SQL_");
		sb.append(NamingUtils.convertUppercaseFirstLetter(dataModelContext
				.getVender()));
		sb.append(".xml");

		this.sqlMapPath = sb.toString();
	}

	public String getDaoPath() {
		return daoPath;
	}

	public void setDaoPath(String daoPath) {
		this.daoPath = daoPath;
	}

	public void setDaoPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		setServiceImplPath(dataModelContext);

		sb.append(serviceImplPath);
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("DAO.java");

		this.daoPath = sb.toString();
	}

}
