package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service;

/**
 * @Class Name : ComtnbndtdiaryVO.java
 * @Description : Comtnbndtdiary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbndtdiaryVO extends ComtnbndtdiaryDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String bndtId;
    
    /**  */
    private String bndtDe;
    
    /**  */
    private String bndtCeckSe;
    
    /**  */
    private String bndtCeckCode;
    
    /**  */
    private String chckSttus;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
