package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service;

/**
 * @Class Name : ComtncmmntyuserVO.java
 * @Description : Comtncmmntyuser VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncmmntyuserVO extends ComtncmmntyuserDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CMMNTY_ID */
    private String cmmntyId;
    
    /** EMPLYR_ID */
    private String emplyrId;
    
    /** MNGR_AT */
    private String mngrAt;
    
    /** SBSCRB_DE */
    private String sbscrbDe;
    
    /** SECSN_DE */
    private String secsnDe;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getCmmntyId() {
        return this.cmmntyId;
    }
    
    public void setCmmntyId(String cmmntyId) {
        this.cmmntyId = cmmntyId;
    }
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
    public String getMngrAt() {
        return this.mngrAt;
    }
    
    public void setMngrAt(String mngrAt) {
        this.mngrAt = mngrAt;
    }
    
    public String getSbscrbDe() {
        return this.sbscrbDe;
    }
    
    public void setSbscrbDe(String sbscrbDe) {
        this.sbscrbDe = sbscrbDe;
    }
    
    public String getSecsnDe() {
        return this.secsnDe;
    }
    
    public void setSecsnDe(String secsnDe) {
        this.secsnDe = secsnDe;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
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
