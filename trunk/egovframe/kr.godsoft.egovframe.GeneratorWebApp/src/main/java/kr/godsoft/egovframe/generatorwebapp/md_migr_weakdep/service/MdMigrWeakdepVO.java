package kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service;

/**
 * @Class Name : MdMigrWeakdepVO.java
 * @Description : MdMigrWeakdep VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdMigrWeakdepVO extends MdMigrWeakdepDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** CONNECTION_ID_FK */
    private String connectionIdFk;
    
    /** SCHEMA_ID_FK */
    private String schemaIdFk;
    
    /** PARENT_ID */
    private String parentId;
    
    /** CHILD_NAME */
    private String childName;
    
    /** PARENT_TYPE */
    private String parentType;
    
    /** CHILD_TYPE */
    private String childType;
    
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
    
    public String getSchemaIdFk() {
        return this.schemaIdFk;
    }
    
    public void setSchemaIdFk(String schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
    }
    
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    public String getChildName() {
        return this.childName;
    }
    
    public void setChildName(String childName) {
        this.childName = childName;
    }
    
    public String getParentType() {
        return this.parentType;
    }
    
    public void setParentType(String parentType) {
        this.parentType = parentType;
    }
    
    public String getChildType() {
        return this.childType;
    }
    
    public void setChildType(String childType) {
        this.childType = childType;
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
