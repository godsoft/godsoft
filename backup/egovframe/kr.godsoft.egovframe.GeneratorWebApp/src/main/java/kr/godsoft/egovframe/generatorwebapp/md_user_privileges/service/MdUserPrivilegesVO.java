package kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service;

/**
 * @Class Name : MdUserPrivilegesVO.java
 * @Description : MdUserPrivileges VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdUserPrivilegesVO extends MdUserPrivilegesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** USER_ID_FK */
    private String userIdFk;
    
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
    
    /** LAST_UDPATED_BY */
    private String lastUdpatedBy;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUserIdFk() {
        return this.userIdFk;
    }
    
    public void setUserIdFk(String userIdFk) {
        this.userIdFk = userIdFk;
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
    
    public String getLastUdpatedBy() {
        return this.lastUdpatedBy;
    }
    
    public void setLastUdpatedBy(String lastUdpatedBy) {
        this.lastUdpatedBy = lastUdpatedBy;
    }
    
}
