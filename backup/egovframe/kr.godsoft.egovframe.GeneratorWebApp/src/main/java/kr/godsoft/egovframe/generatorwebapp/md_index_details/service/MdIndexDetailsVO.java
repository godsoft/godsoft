package kr.godsoft.egovframe.generatorwebapp.md_index_details.service;

/**
 * @Class Name : MdIndexDetailsVO.java
 * @Description : MdIndexDetails VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdIndexDetailsVO extends MdIndexDetailsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** INDEX_ID_FK */
    private String indexIdFk;
    
    /** COLUMN_ID_FK */
    private String columnIdFk;
    
    /** INDEX_PORTION */
    private String indexPortion;
    
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
    
    public String getIndexIdFk() {
        return this.indexIdFk;
    }
    
    public void setIndexIdFk(String indexIdFk) {
        this.indexIdFk = indexIdFk;
    }
    
    public String getColumnIdFk() {
        return this.columnIdFk;
    }
    
    public void setColumnIdFk(String columnIdFk) {
        this.columnIdFk = columnIdFk;
    }
    
    public String getIndexPortion() {
        return this.indexPortion;
    }
    
    public void setIndexPortion(String indexPortion) {
        this.indexPortion = indexPortion;
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
