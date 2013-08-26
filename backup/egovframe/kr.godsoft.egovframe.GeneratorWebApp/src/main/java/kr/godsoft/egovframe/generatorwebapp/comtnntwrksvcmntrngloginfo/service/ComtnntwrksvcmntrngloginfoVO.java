package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service;

/**
 * @Class Name : ComtnntwrksvcmntrngloginfoVO.java
 * @Description : Comtnntwrksvcmntrngloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnntwrksvcmntrngloginfoVO extends ComtnntwrksvcmntrngloginfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SYS_IP */
    private String sysIp;
    
    /** SYS_PORT */
    private String sysPort;
    
    /** SYS_NM */
    private String sysNm;
    
    /** MNTRNG_STTUS */
    private String mntrngSttus;
    
    /** LOG_INFO */
    private String logInfo;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LOG_ID */
    private String logId;
    
    public String getSysIp() {
        return this.sysIp;
    }
    
    public void setSysIp(String sysIp) {
        this.sysIp = sysIp;
    }
    
    public String getSysPort() {
        return this.sysPort;
    }
    
    public void setSysPort(String sysPort) {
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
