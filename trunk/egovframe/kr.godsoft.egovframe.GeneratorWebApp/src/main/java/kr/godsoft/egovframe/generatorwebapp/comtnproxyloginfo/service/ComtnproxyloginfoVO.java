package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service;

/**
 * @Class Name : ComtnproxyloginfoVO.java
 * @Description : Comtnproxyloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnproxyloginfoVO extends ComtnproxyloginfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** PROXY_ID */
    private String proxyId;
    
    /** CLNT_IP */
    private String clntIp;
    
    /** CLNT_PORT */
    private String clntPort;
    
    /** CONECT_TIME */
    private String conectTime;
    
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
    
    public String getProxyId() {
        return this.proxyId;
    }
    
    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }
    
    public String getClntIp() {
        return this.clntIp;
    }
    
    public void setClntIp(String clntIp) {
        this.clntIp = clntIp;
    }
    
    public String getClntPort() {
        return this.clntPort;
    }
    
    public void setClntPort(String clntPort) {
        this.clntPort = clntPort;
    }
    
    public String getConectTime() {
        return this.conectTime;
    }
    
    public void setConectTime(String conectTime) {
        this.conectTime = conectTime;
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
