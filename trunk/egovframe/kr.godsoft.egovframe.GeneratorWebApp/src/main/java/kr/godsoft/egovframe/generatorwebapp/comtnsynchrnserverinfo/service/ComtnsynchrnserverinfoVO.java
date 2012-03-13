package kr.godsoft.egovframe.generatorwebapp.comtnsynchrnserverinfo.service;

/**
 * @Class Name : ComtnsynchrnserverinfoVO.java
 * @Description : Comtnsynchrnserverinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsynchrnserverinfoVO extends ComtnsynchrnserverinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String serverId;
    
    /**  */
    private String serverNm;
    
    /**  */
    private String serverIp;
    
    /**  */
    private String serverPort;
    
    /**  */
    private String ftpId;
    
    /**  */
    private String ftpPassword;
    
    /**  */
    private String synchrnLc;
    
    /**  */
    private String reflctAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
