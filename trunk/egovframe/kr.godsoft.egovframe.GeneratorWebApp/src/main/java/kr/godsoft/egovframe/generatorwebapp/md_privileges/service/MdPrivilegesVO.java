package kr.godsoft.egovframe.generatorwebapp.md_privileges.service;

/**
 * @Class Name : MdPrivilegesVO.java
 * @Description : MdPrivileges VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdPrivilegesVO extends MdPrivilegesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** SCHEMA_ID_FK */
    private String schemaIdFk;
    
    /** PRIVILEGE_NAME */
    private String privilegeName;
    
    /** PRIVELEGE_OBJECT_ID */
    private String privelegeObjectId;
    
    /** PRIVELEGEOBJECTTYPE */
    private String privelegeobjecttype;
    
    /** PRIVELEGE_TYPE */
    private String privelegeType;
    
    /** ADMIN_OPTION */
    private String adminOption;
    
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
    
    public String getPrivilegeName() {
        return this.privilegeName;
    }
    
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }
    
    public String getPrivelegeObjectId() {
        return this.privelegeObjectId;
    }
    
    public void setPrivelegeObjectId(String privelegeObjectId) {
        this.privelegeObjectId = privelegeObjectId;
    }
    
    public String getPrivelegeobjecttype() {
        return this.privelegeobjecttype;
    }
    
    public void setPrivelegeobjecttype(String privelegeobjecttype) {
        this.privelegeobjecttype = privelegeobjecttype;
    }
    
    public String getPrivelegeType() {
        return this.privelegeType;
    }
    
    public void setPrivelegeType(String privelegeType) {
        this.privelegeType = privelegeType;
    }
    
    public String getAdminOption() {
        return this.adminOption;
    }
    
    public void setAdminOption(String adminOption) {
        this.adminOption = adminOption;
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
