package kr.godsoft.egovframe.generatorwebapp.md_triggers.service;

/**
 * @Class Name : MdTriggersVO.java
 * @Description : MdTriggers VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdTriggersVO extends MdTriggersDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** TABLE_OR_VIEW_ID_FK */
    private String tableOrViewIdFk;
    
    /** TRIGGER_ON_FLAG */
    private String triggerOnFlag;
    
    /** TRIGGER_NAME */
    private String triggerName;
    
    /** TRIGGER_TIMING */
    private String triggerTiming;
    
    /** TRIGGER_OPERATION */
    private String triggerOperation;
    
    /** TRIGGER_EVENT */
    private String triggerEvent;
    
    /** NATIVE_SQL */
    private String nativeSql;
    
    /** NATIVE_KEY */
    private String nativeKey;
    
    /** LANGUAGE */
    private String language;
    
    /** COMMENTS */
    private String comments;
    
    /** SECURITY_GROUP_ID */
    private String securityGroupId;
    
    /** CREATED_ON */
    private String createdOn;
    
    /** CREATED_BY */
    private String createdBy;
    
    /** LAST_UPDATED_ON */
    private String lastUpdatedOn;
    
    /** LAST_UPDATED_BY */
    private String lastUpdatedBy;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTableOrViewIdFk() {
        return this.tableOrViewIdFk;
    }
    
    public void setTableOrViewIdFk(String tableOrViewIdFk) {
        this.tableOrViewIdFk = tableOrViewIdFk;
    }
    
    public String getTriggerOnFlag() {
        return this.triggerOnFlag;
    }
    
    public void setTriggerOnFlag(String triggerOnFlag) {
        this.triggerOnFlag = triggerOnFlag;
    }
    
    public String getTriggerName() {
        return this.triggerName;
    }
    
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
    public String getTriggerTiming() {
        return this.triggerTiming;
    }
    
    public void setTriggerTiming(String triggerTiming) {
        this.triggerTiming = triggerTiming;
    }
    
    public String getTriggerOperation() {
        return this.triggerOperation;
    }
    
    public void setTriggerOperation(String triggerOperation) {
        this.triggerOperation = triggerOperation;
    }
    
    public String getTriggerEvent() {
        return this.triggerEvent;
    }
    
    public void setTriggerEvent(String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }
    
    public String getNativeSql() {
        return this.nativeSql;
    }
    
    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }
    
    public String getNativeKey() {
        return this.nativeKey;
    }
    
    public void setNativeKey(String nativeKey) {
        this.nativeKey = nativeKey;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }
    
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    
    public String getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
    
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
}
