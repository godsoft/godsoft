package kr.godsoft.egovframe.generatorwebapp.md_migr_parameter.service;

/**
 * @Class Name : MdMigrParameterVO.java
 * @Description : MdMigrParameter VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdMigrParameterVO extends MdMigrParameterDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** CONNECTION_ID_FK */
    private String connectionIdFk;
    
    /** OBJECT_ID */
    private String objectId;
    
    /** OBJECT_TYPE */
    private String objectType;
    
    /** PARAM_EXISTING */
    private String paramExisting;
    
    /** PARAM_ORDER */
    private String paramOrder;
    
    /** PARAM_NAME */
    private String paramName;
    
    /** PARAM_TYPE */
    private String paramType;
    
    /** PARAM_DATA_TYPE */
    private String paramDataType;
    
    /** PERCISION */
    private String percision;
    
    /** SCALE */
    private String scale;
    
    /** NULLABLE */
    private String nullable;
    
    /** DEFAULT_VALUE */
    private String defaultValue;
    
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
    
    public String getConnectionIdFk() {
        return this.connectionIdFk;
    }
    
    public void setConnectionIdFk(String connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }
    
    public String getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
    public String getParamExisting() {
        return this.paramExisting;
    }
    
    public void setParamExisting(String paramExisting) {
        this.paramExisting = paramExisting;
    }
    
    public String getParamOrder() {
        return this.paramOrder;
    }
    
    public void setParamOrder(String paramOrder) {
        this.paramOrder = paramOrder;
    }
    
    public String getParamName() {
        return this.paramName;
    }
    
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }
    
    public String getParamType() {
        return this.paramType;
    }
    
    public void setParamType(String paramType) {
        this.paramType = paramType;
    }
    
    public String getParamDataType() {
        return this.paramDataType;
    }
    
    public void setParamDataType(String paramDataType) {
        this.paramDataType = paramDataType;
    }
    
    public String getPercision() {
        return this.percision;
    }
    
    public void setPercision(String percision) {
        this.percision = percision;
    }
    
    public String getScale() {
        return this.scale;
    }
    
    public void setScale(String scale) {
        this.scale = scale;
    }
    
    public String getNullable() {
        return this.nullable;
    }
    
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
