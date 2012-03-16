package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service;

/**
 * @Class Name : ComtnbndtceckmanageVO.java
 * @Description : Comtnbndtceckmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbndtceckmanageVO extends ComtnbndtceckmanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BNDT_CECK_SE */
    private String bndtCeckSe;
    
    /** BNDT_CECK_CODE */
    private String bndtCeckCode;
    
    /** BNDT_CECK_CODE_NM */
    private String bndtCeckCodeNm;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getBndtCeckSe() {
        return this.bndtCeckSe;
    }
    
    public void setBndtCeckSe(String bndtCeckSe) {
        this.bndtCeckSe = bndtCeckSe;
    }
    
    public String getBndtCeckCode() {
        return this.bndtCeckCode;
    }
    
    public void setBndtCeckCode(String bndtCeckCode) {
        this.bndtCeckCode = bndtCeckCode;
    }
    
    public String getBndtCeckCodeNm() {
        return this.bndtCeckCodeNm;
    }
    
    public void setBndtCeckCodeNm(String bndtCeckCodeNm) {
        this.bndtCeckCodeNm = bndtCeckCodeNm;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
}
