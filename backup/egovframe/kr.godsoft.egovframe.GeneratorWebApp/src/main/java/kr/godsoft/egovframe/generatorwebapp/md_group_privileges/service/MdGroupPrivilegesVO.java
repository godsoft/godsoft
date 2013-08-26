package kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service;

/**
 * @Class Name : MdGroupPrivilegesVO.java
 * @Description : MdGroupPrivileges VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdGroupPrivilegesVO extends MdGroupPrivilegesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** GROUP_ID_FK */
    private String groupIdFk;
    
    /** PRIVILEGE_ID_FK */
    private String privilegeIdFk;
    
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
    
    public String getGroupIdFk() {
        return this.groupIdFk;
    }
    
    public void setGroupIdFk(String groupIdFk) {
        this.groupIdFk = groupIdFk;
    }
    
    public String getPrivilegeIdFk() {
        return this.privilegeIdFk;
    }
    
    public void setPrivilegeIdFk(String privilegeIdFk) {
        this.privilegeIdFk = privilegeIdFk;
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
