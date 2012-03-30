package kr.godsoft.egovframe.generatorwebapp.mgv_all_catalogs.service;

/**
 * @Class Name : MgvAllCatalogsVO.java
 * @Description : MgvAllCatalogs VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MgvAllCatalogsVO extends MgvAllCatalogsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** PROJECT_ID */
    private String projectId;
    
    /** PROJECT_NAME */
    private String projectName;
    
    /** CONNECTION_ID */
    private String connectionId;
    
    /** HOST */
    private String host;
    
    /** PORT */
    private String port;
    
    /** USERNAME */
    private String username;
    
    /** DBURL */
    private String dburl;
    
    /** CATALOG_ID */
    private String catalogId;
    
    /** CATALOG_NAME */
    private String catalogName;
    
    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public String getConnectionId() {
        return this.connectionId;
    }
    
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public String getPort() {
        return this.port;
    }
    
    public void setPort(String port) {
        this.port = port;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getDburl() {
        return this.dburl;
    }
    
    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
    
    public String getCatalogId() {
        return this.catalogId;
    }
    
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }
    
    public String getCatalogName() {
        return this.catalogName;
    }
    
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
    
}
