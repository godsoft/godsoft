package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service;

/**
 * @Class Name : ComtnntwrksvcmntrngVO.java
 * @Description : Comtnntwrksvcmntrng VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnntwrksvcmntrngVO extends ComtnntwrksvcmntrngDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String sysIp;
    
    /**  */
    private int sysPort;
    
    /**  */
    private String sysNm;
    
    /**  */
    private String mngrNm;
    
    /**  */
    private String mngrEmailAdres;
    
    /**  */
    private String mntrngSttus;
    
    /**  */
    private String creatDt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getSysIp() {
        return this.sysIp;
    }
    
    public void setSysIp(String sysIp) {
        this.sysIp = sysIp;
    }
    
    public int getSysPort() {
        return this.sysPort;
    }
    
    public void setSysPort(int sysPort) {
        this.sysPort = sysPort;
    }
    
    public String getSysNm() {
        return this.sysNm;
    }
    
    public void setSysNm(String sysNm) {
        this.sysNm = sysNm;
    }
    
    public String getMngrNm() {
        return this.mngrNm;
    }
    
    public void setMngrNm(String mngrNm) {
        this.mngrNm = mngrNm;
    }
    
    public String getMngrEmailAdres() {
        return this.mngrEmailAdres;
    }
    
    public void setMngrEmailAdres(String mngrEmailAdres) {
        this.mngrEmailAdres = mngrEmailAdres;
    }
    
    public String getMntrngSttus() {
        return this.mntrngSttus;
    }
    
    public void setMntrngSttus(String mntrngSttus) {
        this.mntrngSttus = mntrngSttus;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
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
