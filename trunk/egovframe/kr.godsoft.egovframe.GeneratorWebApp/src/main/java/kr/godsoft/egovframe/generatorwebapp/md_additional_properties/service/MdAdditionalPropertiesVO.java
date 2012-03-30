package kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service;

/**
 * @Class Name : MdAdditionalPropertiesVO.java
 * @Description : MdAdditionalProperties VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdAdditionalPropertiesVO extends MdAdditionalPropertiesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** CONNECTION_ID_FK */
    private String connectionIdFk;
    
    /** REF_ID_FK */
    private String refIdFk;
    
    /** REF_TYPE */
    private String refType;
    
    /** PROPERTY_ORDER */
    private String propertyOrder;
    
    /** PROP_KEY */
    private String propKey;
    
    /** VALUE */
    private String value;
    
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
    
    public String getRefIdFk() {
        return this.refIdFk;
    }
    
    public void setRefIdFk(String refIdFk) {
        this.refIdFk = refIdFk;
    }
    
    public String getRefType() {
        return this.refType;
    }
    
    public void setRefType(String refType) {
        this.refType = refType;
    }
    
    public String getPropertyOrder() {
        return this.propertyOrder;
    }
    
    public void setPropertyOrder(String propertyOrder) {
        this.propertyOrder = propertyOrder;
    }
    
    public String getPropKey() {
        return this.propKey;
    }
    
    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
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
