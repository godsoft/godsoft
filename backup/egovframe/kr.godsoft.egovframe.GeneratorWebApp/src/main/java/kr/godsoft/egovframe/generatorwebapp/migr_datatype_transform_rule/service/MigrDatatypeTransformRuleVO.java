package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_rule.service;

/**
 * @Class Name : MigrDatatypeTransformRuleVO.java
 * @Description : MigrDatatypeTransformRule VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MigrDatatypeTransformRuleVO extends MigrDatatypeTransformRuleDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** MAP_ID_FK */
    private String mapIdFk;
    
    /** SOURCE_DATA_TYPE_NAME */
    private String sourceDataTypeName;
    
    /** SOURCE_PRECISION */
    private String sourcePrecision;
    
    /** SOURCE_SCALE */
    private String sourceScale;
    
    /** TARGET_DATA_TYPE_NAME */
    private String targetDataTypeName;
    
    /** TARGET_PRECISION */
    private String targetPrecision;
    
    /** TARGET_SCALE */
    private String targetScale;
    
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
    
    public String getMapIdFk() {
        return this.mapIdFk;
    }
    
    public void setMapIdFk(String mapIdFk) {
        this.mapIdFk = mapIdFk;
    }
    
    public String getSourceDataTypeName() {
        return this.sourceDataTypeName;
    }
    
    public void setSourceDataTypeName(String sourceDataTypeName) {
        this.sourceDataTypeName = sourceDataTypeName;
    }
    
    public String getSourcePrecision() {
        return this.sourcePrecision;
    }
    
    public void setSourcePrecision(String sourcePrecision) {
        this.sourcePrecision = sourcePrecision;
    }
    
    public String getSourceScale() {
        return this.sourceScale;
    }
    
    public void setSourceScale(String sourceScale) {
        this.sourceScale = sourceScale;
    }
    
    public String getTargetDataTypeName() {
        return this.targetDataTypeName;
    }
    
    public void setTargetDataTypeName(String targetDataTypeName) {
        this.targetDataTypeName = targetDataTypeName;
    }
    
    public String getTargetPrecision() {
        return this.targetPrecision;
    }
    
    public void setTargetPrecision(String targetPrecision) {
        this.targetPrecision = targetPrecision;
    }
    
    public String getTargetScale() {
        return this.targetScale;
    }
    
    public void setTargetScale(String targetScale) {
        this.targetScale = targetScale;
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
