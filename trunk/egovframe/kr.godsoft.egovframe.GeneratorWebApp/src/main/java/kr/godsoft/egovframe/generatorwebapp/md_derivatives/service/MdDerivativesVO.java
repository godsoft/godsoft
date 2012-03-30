package kr.godsoft.egovframe.generatorwebapp.md_derivatives.service;

/**
 * @Class Name : MdDerivativesVO.java
 * @Description : MdDerivatives VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdDerivativesVO extends MdDerivativesDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** SRC_ID */
    private String srcId;
    
    /** SRC_TYPE */
    private String srcType;
    
    /** DERIVED_ID */
    private String derivedId;
    
    /** DERIVED_TYPE */
    private String derivedType;
    
    /** DERIVED_CONNECTION_ID_FK */
    private String derivedConnectionIdFk;
    
    /** TRANSFORMED */
    private String transformed;
    
    /** ORIGINAL_IDENTIFIER */
    private String originalIdentifier;
    
    /** NEW_IDENTIFIER */
    private String newIdentifier;
    
    /** DERIVED_OBJECT_NAMESPACE */
    private String derivedObjectNamespace;
    
    /** DERIVATIVE_REASON */
    private String derivativeReason;
    
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
    
    public String getSrcId() {
        return this.srcId;
    }
    
    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }
    
    public String getSrcType() {
        return this.srcType;
    }
    
    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }
    
    public String getDerivedId() {
        return this.derivedId;
    }
    
    public void setDerivedId(String derivedId) {
        this.derivedId = derivedId;
    }
    
    public String getDerivedType() {
        return this.derivedType;
    }
    
    public void setDerivedType(String derivedType) {
        this.derivedType = derivedType;
    }
    
    public String getDerivedConnectionIdFk() {
        return this.derivedConnectionIdFk;
    }
    
    public void setDerivedConnectionIdFk(String derivedConnectionIdFk) {
        this.derivedConnectionIdFk = derivedConnectionIdFk;
    }
    
    public String getTransformed() {
        return this.transformed;
    }
    
    public void setTransformed(String transformed) {
        this.transformed = transformed;
    }
    
    public String getOriginalIdentifier() {
        return this.originalIdentifier;
    }
    
    public void setOriginalIdentifier(String originalIdentifier) {
        this.originalIdentifier = originalIdentifier;
    }
    
    public String getNewIdentifier() {
        return this.newIdentifier;
    }
    
    public void setNewIdentifier(String newIdentifier) {
        this.newIdentifier = newIdentifier;
    }
    
    public String getDerivedObjectNamespace() {
        return this.derivedObjectNamespace;
    }
    
    public void setDerivedObjectNamespace(String derivedObjectNamespace) {
        this.derivedObjectNamespace = derivedObjectNamespace;
    }
    
    public String getDerivativeReason() {
        return this.derivativeReason;
    }
    
    public void setDerivativeReason(String derivativeReason) {
        this.derivativeReason = derivativeReason;
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
