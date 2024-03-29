package godsoft.codegen.cmm;

public class CodeGenPathname {

	private DataModelContext dataModelContext;

	private String topLevelPathname;

	private String servicePathname; // Pathname -> Directory
	private String serviceImplPathname;
	private String webPathname;

	private String defaultVOPathname;
	private String voPathname;
	private String sqlMapPathname;
	private String daoPathname;
	private String daoTestPathname;
	private String service2Pathname;
	private String serviceImpl2Pathname;
	private String serviceImplTestPathname;
	private String controllerPathname;

	private String listPathname;
	private String registPathname;

	private String cssPathname;
	private String jsPathname;

	private String jqGridPathname;
	private String jqGridJsPathname;

	private String bootstrapListPathname;
	private String bootstrapRegistPathname;

	//    <sourceDirectory>E:\eGovFrameDev-2.6.0-FullVer\workspace\godsoft.codegen-2.6.0\src\main\java</sourceDirectory>
	//    <scriptSourceDirectory>E:\eGovFrameDev-2.6.0-FullVer\workspace\godsoft.codegen-2.6.0\src\main\scripts</scriptSourceDirectory>
	//    <testSourceDirectory>E:\eGovFrameDev-2.6.0-FullVer\workspace\godsoft.codegen-2.6.0\src\test\java</testSourceDirectory>
	//    
	//    resourceDirectory
	//    testResourceDirectory

	public CodeGenPathname(DataModelContext dataModelContext) {
		this.dataModelContext = dataModelContext;

		this.setTopLevelPathname();
		this.setServicePathname();
		this.setServiceImplPathname();
		this.setWebPathname();

		this.setDefaultVOPathname();
		this.setVoPathname();
		this.setSqlMapPathname();
		this.setDaoPathname();
		this.setDaoTestPathname();
		this.setService2Pathname();
		this.setServiceImpl2Pathname();
		this.setServiceImplTestPathname();
		this.setControllerPathname();

		this.setListPathname();
		this.setRegistPathname();

		this.setCssPathname();
		this.setJsPathname();

		this.setJqGridPathname();
		this.setJqGridJsPathname();

		this.setBootstrapListPathname();
		this.setBootstrapRegistPathname();
	}

	public void setTopLevelPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/java/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());

		this.topLevelPathname = sb.toString();
	}

	public void setServicePathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPathname);
		sb.append("/service");

		this.servicePathname = sb.toString();
	}

	public void setServiceImplPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPathname);
		sb.append("/service/impl");

		this.serviceImplPathname = sb.toString();
	}

	public void setWebPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPathname);
		sb.append("/web");

		this.webPathname = sb.toString();
	}

	public void setDefaultVOPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servicePathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("DefaultVO.java");

		this.defaultVOPathname = sb.toString();
	}

	public void setVoPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servicePathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("VO.java");

		this.voPathname = sb.toString();
	}

	public void setSqlMapPathname() {
		String sqlMapPathname = this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/");

		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/resources/");
		sb.append(sqlMapPathname.substring(0, sqlMapPathname.indexOf("/")));
		sb.append("/sqlmap");
		sb.append(sqlMapPathname.substring(sqlMapPathname.indexOf("/")));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		this.sqlMapPathname = sb.toString();
	}

	public void setDaoPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.serviceImplPathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("DAO.java");

		this.daoPathname = sb.toString();
	}

	public void setDaoTestPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/test/java/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/service/impl/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("DAOTest.java");

		this.daoTestPathname = sb.toString();
	}

	public void setService2Pathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servicePathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("Service.java");

		this.service2Pathname = sb.toString();
	}

	public void setServiceImpl2Pathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.serviceImplPathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("ServiceImpl.java");

		this.serviceImpl2Pathname = sb.toString();
	}

	public void setServiceImplTestPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/test/java/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/service/impl/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("ServiceImplTest.java");

		this.serviceImplTestPathname = sb.toString();
	}

	public void setControllerPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.webPathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("Controller.java");

		this.controllerPathname = sb.toString();
	}

	public void setListPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/WEB-INF/jsp/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("List.jsp");

		this.listPathname = sb.toString();
	}

	public void setRegistPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/WEB-INF/jsp/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("Regist.jsp");

		this.registPathname = sb.toString();
	}

	public void setCssPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/css/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append(".css");

		this.cssPathname = sb.toString();
	}

	public void setJsPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/js/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append(".js");

		this.jsPathname = sb.toString();
	}

	public void setJqGridPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/WEB-INF/jsp/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("JqGrid.jsp");

		this.jqGridPathname = sb.toString();
	}

	public void setJqGridJsPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/js/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("JqGrid.js");

		this.jqGridJsPathname = sb.toString();
	}

	public void setBootstrapListPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/WEB-INF/jsp/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("ListBootstrap.jsp");

		this.bootstrapListPathname = sb.toString();
	}

	public void setBootstrapRegistPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/webapp/WEB-INF/jsp/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("RegistBootstrap.jsp");

		this.bootstrapRegistPathname = sb.toString();
	}

	public DataModelContext getDataModelContext() {
		return dataModelContext;
	}

	public void setDataModelContext(DataModelContext dataModelContext) {
		this.dataModelContext = dataModelContext;
	}

	public String getTopLevelPathname() {
		return topLevelPathname;
	}

	public void setTopLevelPathname(String topLevelPathname) {
		this.topLevelPathname = topLevelPathname;
	}

	public String getServicePathname() {
		return servicePathname;
	}

	public void setServicePathname(String servicePathname) {
		this.servicePathname = servicePathname;
	}

	public String getServiceImplPathname() {
		return serviceImplPathname;
	}

	public void setServiceImplPathname(String serviceImplPathname) {
		this.serviceImplPathname = serviceImplPathname;
	}

	public String getWebPathname() {
		return webPathname;
	}

	public void setWebPathname(String webPathname) {
		this.webPathname = webPathname;
	}

	public String getDefaultVOPathname() {
		return defaultVOPathname;
	}

	public void setDefaultVOPathname(String defaultVOPathname) {
		this.defaultVOPathname = defaultVOPathname;
	}

	public String getVoPathname() {
		return voPathname;
	}

	public void setVoPathname(String voPathname) {
		this.voPathname = voPathname;
	}

	public String getSqlMapPathname() {
		return sqlMapPathname;
	}

	public void setSqlMapPathname(String sqlMapPathname) {
		this.sqlMapPathname = sqlMapPathname;
	}

	public String getDaoPathname() {
		return daoPathname;
	}

	public void setDaoPathname(String daoPathname) {
		this.daoPathname = daoPathname;
	}

	public String getDaoTestPathname() {
		return daoTestPathname;
	}

	public void setDaoTestPathname(String daoTestPathname) {
		this.daoTestPathname = daoTestPathname;
	}

	public String getService2Pathname() {
		return service2Pathname;
	}

	public void setService2Pathname(String service2Pathname) {
		this.service2Pathname = service2Pathname;
	}

	public String getServiceImpl2Pathname() {
		return serviceImpl2Pathname;
	}

	public void setServiceImpl2Pathname(String serviceImpl2Pathname) {
		this.serviceImpl2Pathname = serviceImpl2Pathname;
	}

	public String getServiceImplTestPathname() {
		return serviceImplTestPathname;
	}

	public void setServiceImplTestPathname(String serviceImplTestPathname) {
		this.serviceImplTestPathname = serviceImplTestPathname;
	}

	public String getControllerPathname() {
		return controllerPathname;
	}

	public void setControllerPathname(String controllerPathname) {
		this.controllerPathname = controllerPathname;
	}

	public String getListPathname() {
		return listPathname;
	}

	public void setListPathname(String listPathname) {
		this.listPathname = listPathname;
	}

	public String getRegistPathname() {
		return registPathname;
	}

	public void setRegistPathname(String registPathname) {
		this.registPathname = registPathname;
	}

	public String getCssPathname() {
		return cssPathname;
	}

	public void setCssPathname(String cssPathname) {
		this.cssPathname = cssPathname;
	}

	public String getJsPathname() {
		return jsPathname;
	}

	public void setJsPathname(String jsPathname) {
		this.jsPathname = jsPathname;
	}

	public String getJqGridPathname() {
		return jqGridPathname;
	}

	public void setJqGridPathname(String jqGridPathname) {
		this.jqGridPathname = jqGridPathname;
	}

	public String getJqGridJsPathname() {
		return jqGridJsPathname;
	}

	public void setJqGridJsPathname(String jqGridJsPathname) {
		this.jqGridJsPathname = jqGridJsPathname;
	}

	public String getBootstrapListPathname() {
		return bootstrapListPathname;
	}

	public void setBootstrapListPathname(String bootstrapListPathname) {
		this.bootstrapListPathname = bootstrapListPathname;
	}

	public String getBootstrapRegistPathname() {
		return bootstrapRegistPathname;
	}

	public void setBootstrapRegistPathname(String bootstrapRegistPathname) {
		this.bootstrapRegistPathname = bootstrapRegistPathname;
	}

}
