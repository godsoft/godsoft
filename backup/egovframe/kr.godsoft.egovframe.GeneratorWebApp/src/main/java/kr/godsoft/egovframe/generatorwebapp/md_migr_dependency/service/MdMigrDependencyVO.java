package kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service;

/**
 * @Class Name : MdMigrDependencyVO.java
 * @Description : MdMigrDependency VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdMigrDependencyVO extends MdMigrDependencyDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** CONNECTION_ID_FK */
    private String connectionIdFk;
    
    /** PARENT_ID */
    private String parentId;
    
    /** CHILD_ID */
    private String childId;
    
    /** PARENT_OBJECT_TYPE */
    private String parentObjectType;
    
    /** CHILD_OBJECT_TYPE */
    private String childObjectType;
    
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
    
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    public String getChildId() {
        return this.childId;
    }
    
    public void setChildId(String childId) {
        this.childId = childId;
    }
    
    public String getParentObjectType() {
        return this.parentObjectType;
    }
    
    public void setParentObjectType(String parentObjectType) {
        this.parentObjectType = parentObjectType;
    }
    
    public String getChildObjectType() {
        return this.childObjectType;
    }
    
    public void setChildObjectType(String childObjectType) {
        this.childObjectType = childObjectType;
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
