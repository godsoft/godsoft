package kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service;

/**
 * @Class Name : ComtnsynchrnserverinfoVO.java
 * @Description : Comtnsynchrnserverinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsynchrnserverinfoVO extends ComtnsynchrnserverinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SERVER_ID */
    private String serverId;
    
    /** SERVER_NM */
    private String serverNm;
    
    /** SERVER_IP */
    private String serverIp;
    
    /** SERVER_PORT */
    private String serverPort;
    
    /** FTP_ID */
    private String ftpId;
    
    /** FTP_PASSWORD */
    private String ftpPassword;
    
    /** SYNCHRN_LC */
    private String synchrnLc;
    
    /** REFLCT_AT */
    private String reflctAt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getServerId() {
        return this.serverId;
    }
    
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
    
    public String getServerNm() {
        return this.serverNm;
    }
    
    public void setServerNm(String serverNm) {
        this.serverNm = serverNm;
    }
    
    public String getServerIp() {
        return this.serverIp;
    }
    
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
    
    public String getServerPort() {
        return this.serverPort;
    }
    
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }
    
    public String getFtpId() {
        return this.ftpId;
    }
    
    public void setFtpId(String ftpId) {
        this.ftpId = ftpId;
    }
    
    public String getFtpPassword() {
        return this.ftpPassword;
    }
    
    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }
    
    public String getSynchrnLc() {
        return this.synchrnLc;
    }
    
    public void setSynchrnLc(String synchrnLc) {
        this.synchrnLc = synchrnLc;
    }
    
    public String getReflctAt() {
        return this.reflctAt;
    }
    
    public void setReflctAt(String reflctAt) {
        this.reflctAt = reflctAt;
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
