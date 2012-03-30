package kr.godsoft.egovframe.generatorwebapp.migrlog.service;

/**
 * @Class Name : MigrlogVO.java
 * @Description : Migrlog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MigrlogVO extends MigrlogDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** PARENT_LOG_ID */
    private String parentLogId;
    
    /** LOG_DATE */
    private String logDate;
    
    /** SEVERITY */
    private String severity;
    
    /** LOGTEXT */
    private String logtext;
    
    /** PHASE */
    private String phase;
    
    /** REF_OBJECT_ID */
    private String refObjectId;
    
    /** REF_OBJECT_TYPE */
    private String refObjectType;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getParentLogId() {
        return this.parentLogId;
    }
    
    public void setParentLogId(String parentLogId) {
        this.parentLogId = parentLogId;
    }
    
    public String getLogDate() {
        return this.logDate;
    }
    
    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }
    
    public String getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    public String getLogtext() {
        return this.logtext;
    }
    
    public void setLogtext(String logtext) {
        this.logtext = logtext;
    }
    
    public String getPhase() {
        return this.phase;
    }
    
    public void setPhase(String phase) {
        this.phase = phase;
    }
    
    public String getRefObjectId() {
        return this.refObjectId;
    }
    
    public void setRefObjectId(String refObjectId) {
        this.refObjectId = refObjectId;
    }
    
    public String getRefObjectType() {
        return this.refObjectType;
    }
    
    public void setRefObjectType(String refObjectType) {
        this.refObjectType = refObjectType;
    }
    
}
