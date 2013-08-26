package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service;

/**
 * @Class Name : ComtnbndtdiaryVO.java
 * @Description : Comtnbndtdiary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbndtdiaryVO extends ComtnbndtdiaryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BNDT_ID */
    private String bndtId;
    
    /** BNDT_DE */
    private String bndtDe;
    
    /** BNDT_CECK_SE */
    private String bndtCeckSe;
    
    /** BNDT_CECK_CODE */
    private String bndtCeckCode;
    
    /** CHCK_STTUS */
    private String chckSttus;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getBndtId() {
        return this.bndtId;
    }
    
    public void setBndtId(String bndtId) {
        this.bndtId = bndtId;
    }
    
    public String getBndtDe() {
        return this.bndtDe;
    }
    
    public void setBndtDe(String bndtDe) {
        this.bndtDe = bndtDe;
    }
    
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
    
    public String getChckSttus() {
        return this.chckSttus;
    }
    
    public void setChckSttus(String chckSttus) {
        this.chckSttus = chckSttus;
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
