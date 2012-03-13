package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service;

/**
 * @Class Name : ComtnntwrksvcmntrngloginfoVO.java
 * @Description : Comtnntwrksvcmntrngloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnntwrksvcmntrngloginfoVO extends ComtnntwrksvcmntrngloginfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String sysIp;
    
    /**  */
    private int sysPort;
    
    /**  */
    private String sysNm;
    
    /**  */
    private String mntrngSttus;
    
    /**  */
    private String logInfo;
    
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
    
    /**  */
    private String logId;
    
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
    
    public String getMntrngSttus() {
        return this.mntrngSttus;
    }
    
    public void setMntrngSttus(String mntrngSttus) {
        this.mntrngSttus = mntrngSttus;
    }
    
    public String getLogInfo() {
        return this.logInfo;
    }
    
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
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
    
    public String getLogId() {
        return this.logId;
    }
    
    public void setLogId(String logId) {
        this.logId = logId;
    }
    
}
