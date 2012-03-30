package kr.godsoft.egovframe.generatorwebapp.md_constraints.service;

/**
 * @Class Name : MdConstraintsVO.java
 * @Description : MdConstraints VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdConstraintsVO extends MdConstraintsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** DELETE_CLAUSE */
    private String deleteClause;
    
    /** NAME */
    private String name;
    
    /** CONSTRAINT_TYPE */
    private String constraintType;
    
    /** TABLE_ID_FK */
    private String tableIdFk;
    
    /** REFTABLE_ID_FK */
    private String reftableIdFk;
    
    /** CONSTRAINT_TEXT */
    private String constraintText;
    
    /** LANGUAGE */
    private String language;
    
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
    
    public String getDeleteClause() {
        return this.deleteClause;
    }
    
    public void setDeleteClause(String deleteClause) {
        this.deleteClause = deleteClause;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getConstraintType() {
        return this.constraintType;
    }
    
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }
    
    public String getTableIdFk() {
        return this.tableIdFk;
    }
    
    public void setTableIdFk(String tableIdFk) {
        this.tableIdFk = tableIdFk;
    }
    
    public String getReftableIdFk() {
        return this.reftableIdFk;
    }
    
    public void setReftableIdFk(String reftableIdFk) {
        this.reftableIdFk = reftableIdFk;
    }
    
    public String getConstraintText() {
        return this.constraintText;
    }
    
    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
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
