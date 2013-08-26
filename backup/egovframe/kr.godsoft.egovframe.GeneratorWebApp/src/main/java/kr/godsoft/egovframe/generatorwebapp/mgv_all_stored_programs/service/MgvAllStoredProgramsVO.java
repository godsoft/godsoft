package kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service;

/**
 * @Class Name : MgvAllStoredProgramsVO.java
 * @Description : MgvAllStoredPrograms VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MgvAllStoredProgramsVO extends MgvAllStoredProgramsDefaultVO {
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
    
    /** CATALOG_ID */
    private String catalogId;
    
    /** CATALOG_NAME */
    private String catalogName;
    
    /** SCHEMA_ID */
    private String schemaId;
    
    /** SCHEMA_NAME */
    private String schemaName;
    
    /** STORED_PROGRAM_ID */
    private String storedProgramId;
    
    /** PROGRAMTYPE */
    private String programtype;
    
    /** STORED_PROGRAM_NAME */
    private String storedProgramName;
    
    /** PACKAGE_ID_FK */
    private String packageIdFk;
    
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
    
    public String getSchemaId() {
        return this.schemaId;
    }
    
    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }
    
    public String getSchemaName() {
        return this.schemaName;
    }
    
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
    
    public String getStoredProgramId() {
        return this.storedProgramId;
    }
    
    public void setStoredProgramId(String storedProgramId) {
        this.storedProgramId = storedProgramId;
    }
    
    public String getProgramtype() {
        return this.programtype;
    }
    
    public void setProgramtype(String programtype) {
        this.programtype = programtype;
    }
    
    public String getStoredProgramName() {
        return this.storedProgramName;
    }
    
    public void setStoredProgramName(String storedProgramName) {
        this.storedProgramName = storedProgramName;
    }
    
    public String getPackageIdFk() {
        return this.packageIdFk;
    }
    
    public void setPackageIdFk(String packageIdFk) {
        this.packageIdFk = packageIdFk;
    }
    
}
