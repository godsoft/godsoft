package kr.godsoft.egovframe.generatorwebapp.md_synonyms.service;

/**
 * @Class Name : MdSynonymsVO.java
 * @Description : MdSynonyms VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdSynonymsVO extends MdSynonymsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** SCHEMA_ID_FK */
    private String schemaIdFk;
    
    /** NAME */
    private String name;
    
    /** SYNONYM_FOR_ID */
    private String synonymForId;
    
    /** FOR_OBJECT_TYPE */
    private String forObjectType;
    
    /** PRIVATE_VISIBILITY */
    private String privateVisibility;
    
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
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSynonymForId() {
        return this.synonymForId;
    }
    
    public void setSynonymForId(String synonymForId) {
        this.synonymForId = synonymForId;
    }
    
    public String getForObjectType() {
        return this.forObjectType;
    }
    
    public void setForObjectType(String forObjectType) {
        this.forObjectType = forObjectType;
    }
    
    public String getPrivateVisibility() {
        return this.privateVisibility;
    }
    
    public void setPrivateVisibility(String privateVisibility) {
        this.privateVisibility = privateVisibility;
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
