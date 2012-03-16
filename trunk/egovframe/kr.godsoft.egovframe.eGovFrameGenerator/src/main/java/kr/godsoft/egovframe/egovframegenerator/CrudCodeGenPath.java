package kr.godsoft.egovframe.egovframegenerator;

import model.DataModelContext;
import utils.NamingUtils;

public class CrudCodeGenPath {

	private static final String SRC_MAIN_JAVA = "src/main/java/";

	private static final String SRC_MAIN_RESOURCES = "src/main/resources/";

	private static final String SRC_MAIN_WEBAPP = "src/main/webapp/";

	private String projectPath;

	private String servicePath;

	private String serviceImplPath;

	private String jspPath;

	// gen
	private String defaultVOPath;

	private String voPath;

	private String sqlMapPath;

	private String daoPath;

	private String genServicePath;

	private String genServiceImplPath;

	private String controllerPath;

	private String listPath;

	private String registerPath;

	// SqlMapConfig.xml, index.jsp
	private String sqlMapResource;

	private String sqlMapConfigPath;

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

	public String getJspPath() {
		return jspPath;
	}

	public void setJspPath(String jspPath) {
		this.jspPath = jspPath;
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

	public String getGenServicePath() {
		return genServicePath;
	}

	public void setGenServicePath(String genServicePath) {
		this.genServicePath = genServicePath;
	}

	public void setGenServicePath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		setServicePath(dataModelContext);

		sb.append(servicePath);
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("Service.java");

		this.genServicePath = sb.toString();
	}

	public String getGenServiceImplPath() {
		return genServiceImplPath;
	}

	public void setGenServiceImplPath(String genServiceImplPath) {
		this.genServiceImplPath = genServiceImplPath;
	}

	public void setGenServiceImplPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		setServiceImplPath(dataModelContext);

		sb.append(serviceImplPath);
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("ServiceImpl.java");

		this.genServiceImplPath = sb.toString();
	}

	public String getControllerPath() {
		return controllerPath;
	}

	public void setControllerPath(String controllerPath) {
		this.controllerPath = controllerPath;
	}

	public void setControllerPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_JAVA);
		sb.append(dataModelContext.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/web/");
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("Controller.java");

		this.controllerPath = sb.toString();
	}

	public String getListPath() {
		return listPath;
	}

	public void setListPath(String listPath) {
		this.listPath = listPath;
	}

	public void setListPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_WEBAPP);
		sb.append(jspPath);
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("List.jsp");

		this.listPath = sb.toString();
	}

	public String getRegisterPath() {
		return registerPath;
	}

	public void setRegisterPath(String registerPath) {
		this.registerPath = registerPath;
	}

	public void setRegisterPath(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_WEBAPP);
		sb.append(jspPath);
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("Register.jsp");

		this.registerPath = sb.toString();
	}

	// SqlMapConfig.xml, index.jsp
	public String getSqlMapResource() {
		return sqlMapResource;
	}

	public void setSqlMapResource(String sqlMapResource) {
		this.sqlMapResource = sqlMapResource;
	}

	public void setSqlMapResource(DataModelContext dataModelContext) {
		StringBuilder sb = new StringBuilder();

		sb.append(dataModelContext.getPackageName().replaceAll("\\.", "/"));
		sb.append("/sqlmap/");
		sb.append(dataModelContext.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModelContext.getEntity().getPcName());
		sb.append("_SQL_");
		sb.append(NamingUtils.convertUppercaseFirstLetter(dataModelContext
				.getVender()));
		sb.append(".xml");

		this.sqlMapResource = sb.toString();
	}

	public String getSqlMapConfigPath() {
		return sqlMapConfigPath;
	}

	public void setSqlMapConfigPath(String sqlMapConfigPath) {
		this.sqlMapConfigPath = sqlMapConfigPath;
	}

	public void setProjectSqlMapConfigPath(String sqlMapConfigPath) {
		StringBuilder sb = new StringBuilder();

		sb.append(projectPath);
		sb.append(SRC_MAIN_RESOURCES);
		sb.append(sqlMapConfigPath);

		this.sqlMapConfigPath = sb.toString();
	}

}
