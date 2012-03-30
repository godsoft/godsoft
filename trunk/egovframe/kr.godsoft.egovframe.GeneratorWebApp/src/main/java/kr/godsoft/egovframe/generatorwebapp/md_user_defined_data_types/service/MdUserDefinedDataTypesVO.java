package kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service;

/**
 * @Class Name : MdUserDefinedDataTypesVO.java
 * @Description : MdUserDefinedDataTypes VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdUserDefinedDataTypesVO extends MdUserDefinedDataTypesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** SCHEMA_ID_FK */
    private String schemaIdFk;
    
    /** DATA_TYPE_NAME */
    private String dataTypeName;
    
    /** DEFINITION */
    private String definition;
    
    /** NATIVE_SQL */
    private String nativeSql;
    
    /** NATIVE_KEY */
    private String nativeKey;
    
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
    
    public String getSchemaIdFk() {
        return this.schemaIdFk;
    }
    
    public void setSchemaIdFk(String schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
    }
    
    public String getDataTypeName() {
        return this.dataTypeName;
    }
    
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }
    
    public String getDefinition() {
        return this.definition;
    }
    
    public void setDefinition(String definition) {
        this.definition = definition;
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
