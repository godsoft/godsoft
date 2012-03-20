package kr.godsoft.egovframe.generatorwebapp.comtnclub.service;

/**
 * @Class Name : ComtnclubVO.java
 * @Description : Comtnclub VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnclubVO extends ComtnclubDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CLB_ID */
    private String clbId;
    
    /** CMMNTY_ID */
    private String cmmntyId;
    
    /** CLB_NM */
    private String clbNm;
    
    /** CLB_INTRCN */
    private String clbIntrcn;
    
    /** USE_AT */
    private String useAt;
    
    /** REGIST_SE_CODE */
    private String registSeCode;
    
    /** TMPLAT_ID */
    private String tmplatId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getClbId() {
        return this.clbId;
    }
    
    public void setClbId(String clbId) {
        this.clbId = clbId;
    }
    
    public String getCmmntyId() {
        return this.cmmntyId;
    }
    
    public void setCmmntyId(String cmmntyId) {
        this.cmmntyId = cmmntyId;
    }
    
    public String getClbNm() {
        return this.clbNm;
    }
    
    public void setClbNm(String clbNm) {
        this.clbNm = clbNm;
    }
    
    public String getClbIntrcn() {
        return this.clbIntrcn;
    }
    
    public void setClbIntrcn(String clbIntrcn) {
        this.clbIntrcn = clbIntrcn;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getRegistSeCode() {
        return this.registSeCode;
    }
    
    public void setRegistSeCode(String registSeCode) {
        this.registSeCode = registSeCode;
    }
    
    public String getTmplatId() {
        return this.tmplatId;
    }
    
    public void setTmplatId(String tmplatId) {
        this.tmplatId = tmplatId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
