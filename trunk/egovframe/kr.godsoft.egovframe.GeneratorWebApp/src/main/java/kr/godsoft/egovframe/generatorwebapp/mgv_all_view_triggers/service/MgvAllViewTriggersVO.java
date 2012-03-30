package kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service;

/**
 * @Class Name : MgvAllViewTriggersVO.java
 * @Description : MgvAllViewTriggers VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MgvAllViewTriggersVO extends MgvAllViewTriggersDefaultVO {
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
    
    /** DUMMY_FLAG */
    private String dummyFlag;
    
    /** SCHEMA_ID */
    private String schemaId;
    
    /** SCHEMA_NAME */
    private String schemaName;
    
    /** VIEW_ID */
    private String viewId;
    
    /** VIEW_NAME */
    private String viewName;
    
    /** TRIGGER_ID */
    private String triggerId;
    
    /** TRIGGER_NAME */
    private String triggerName;
    
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
    
    public String getDummyFlag() {
        return this.dummyFlag;
    }
    
    public void setDummyFlag(String dummyFlag) {
        this.dummyFlag = dummyFlag;
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
    
    public String getViewId() {
        return this.viewId;
    }
    
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }
    
    public String getViewName() {
        return this.viewName;
    }
    
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    
    public String getTriggerId() {
        return this.triggerId;
    }
    
    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }
    
    public String getTriggerName() {
        return this.triggerName;
    }
    
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
}
