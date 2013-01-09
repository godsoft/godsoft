package model;

public class Pathname {

    private String projectPath;

    private String sqlMapPath;

    private String sqlMapConfigPath;

    // service
    private String defaultVoPath;
    private String voPath;
    private String servicePath;

    // service.impl
    private String daoPath;
    private String serviceImplPath;

    // web
    private String controllerPath;

    // jsp
    private String listPath;
    private String registPath;

    // js
    private String extjsPath;

    public Pathname(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getSqlMapPath() {
        return sqlMapPath;
    }

    public void setSqlMapPath(String sqlMapPath) {
        this.sqlMapPath = sqlMapPath;
    }

    public void setSqlMapPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/resources/egovframework/sqlmap/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("_SQL_");
        sb.append(dataModel.getVendor());
        sb.append(".xml");

        this.sqlMapPath = sb.toString();
    }

    public String getSqlMapConfigPath() {
        return sqlMapConfigPath;
    }

    public void setSqlMapConfigPath(String sqlMapConfigPath) {
        this.sqlMapConfigPath = sqlMapConfigPath;
    }

    public void setSqlMapConfigPath(DataModelContext dataModel) {
        String vendor = dataModel.getVendor().toLowerCase();

        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/resources/egovframework/sqlmap/config/");
        sb.append(vendor);
        sb.append("/sql-map-config-");
        sb.append(vendor);
        sb.append("-");
        sb.append(dataModel.getProjectName());
        sb.append(".xml");

        this.sqlMapConfigPath = sb.toString();
    }

    public String getDefaultVoPath() {
        return defaultVoPath;
    }

    public void setDefaultVoPath(String defaultVoPath) {
        this.defaultVoPath = defaultVoPath;
    }

    public void setDefaultVoPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/service/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("DefaultVO.java");

        this.defaultVoPath = sb.toString();
    }

    public String getVoPath() {
        return voPath;
    }

    public void setVoPath(String voPath) {
        this.voPath = voPath;
    }

    public void setVoPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/service/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("VO.java");

        this.voPath = sb.toString();
    }

    public String getServicePath() {
        return servicePath;
    }

    public void setServicePath(String servicePath) {
        this.servicePath = servicePath;
    }

    public void setServicePath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/service/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("Service.java");

        this.servicePath = sb.toString();
    }

    public String getDaoPath() {
        return daoPath;
    }

    public void setDaoPath(String daoPath) {
        this.daoPath = daoPath;
    }

    public void setDaoPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/service/impl/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("DAO.java");

        this.daoPath = sb.toString();
    }

    public String getServiceImplPath() {
        return serviceImplPath;
    }

    public void setServiceImplPath(String serviceImplPath) {
        this.serviceImplPath = serviceImplPath;
    }

    public void setServiceImplPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/service/impl/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("ServiceImpl.java");

        this.serviceImplPath = sb.toString();
    }

    public String getControllerPath() {
        return controllerPath;
    }

    public void setControllerPath(String controllerPath) {
        this.controllerPath = controllerPath;
    }

    public void setControllerPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/java/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/web/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("Controller.java");

        this.controllerPath = sb.toString();
    }

    public String getListPath() {
        return listPath;
    }

    public void setListPath(String listPath) {
        this.listPath = listPath;
    }

    public void setListPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/webapp/WEB-INF/jsp/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("List.jsp");

        this.listPath = sb.toString();
    }

    public String getRegistPath() {
        return registPath;
    }

    public void setRegistPath(String registPath) {
        this.registPath = registPath;
    }

    public void setRegistPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/webapp/WEB-INF/jsp/egovframework/");
        sb.append(dataModel.getProjectName());
        sb.append("/");
        sb.append(dataModel.getEntity().getLcName());
        sb.append("/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("Regist.jsp");

        this.registPath = sb.toString();
    }

    public String getExtjsPath() {
        return extjsPath;
    }

    public void setExtjsPath(String extjsPath) {
        this.extjsPath = extjsPath;
    }

    public void setExtjsPath(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPathname().getProjectPath());
        sb.append("/src/main/webapp/desktop/");
        sb.append(dataModel.getEntity().getPcName());
        sb.append("GridWindow.js");

        this.extjsPath = sb.toString();
    }

}
