package kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service;

/**
 * @Class Name : MdConstraintDetailsVO.java
 * @Description : MdConstraintDetails VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdConstraintDetailsVO extends MdConstraintDetailsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** REF_FLAG */
    private String refFlag;
    
    /** CONSTRAINT_ID_FK */
    private String constraintIdFk;
    
    /** COLUMN_ID_FK */
    private String columnIdFk;
    
    /** COLUMN_PORTION */
    private String columnPortion;
    
    /** CONSTRAINT_TEXT */
    private String constraintText;
    
    /** DETAIL_ORDER */
    private String detailOrder;
    
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
    
    public String getRefFlag() {
        return this.refFlag;
    }
    
    public void setRefFlag(String refFlag) {
        this.refFlag = refFlag;
    }
    
    public String getConstraintIdFk() {
        return this.constraintIdFk;
    }
    
    public void setConstraintIdFk(String constraintIdFk) {
        this.constraintIdFk = constraintIdFk;
    }
    
    public String getColumnIdFk() {
        return this.columnIdFk;
    }
    
    public void setColumnIdFk(String columnIdFk) {
        this.columnIdFk = columnIdFk;
    }
    
    public String getColumnPortion() {
        return this.columnPortion;
    }
    
    public void setColumnPortion(String columnPortion) {
        this.columnPortion = columnPortion;
    }
    
    public String getConstraintText() {
        return this.constraintText;
    }
    
    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
    }
    
    public String getDetailOrder() {
        return this.detailOrder;
    }
    
    public void setDetailOrder(String detailOrder) {
        this.detailOrder = detailOrder;
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
