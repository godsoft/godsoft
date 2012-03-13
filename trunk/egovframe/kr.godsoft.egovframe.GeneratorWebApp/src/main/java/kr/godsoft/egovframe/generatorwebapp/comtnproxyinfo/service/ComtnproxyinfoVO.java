package kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service;

/**
 * @Class Name : ComtnproxyinfoVO.java
 * @Description : Comtnproxyinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnproxyinfoVO extends ComtnproxyinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String proxyId;
    
    /**  */
    private String proxyNm;
    
    /**  */
    private String proxyIp;
    
    /**  */
    private String proxyPort;
    
    /**  */
    private String trgetSvcNm;
    
    /**  */
    private String svcDc;
    
    /**  */
    private String svcIp;
    
    /**  */
    private String svcPort;
    
    /**  */
    private String svcSttus;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getProxyId() {
        return this.proxyId;
    }
    
    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }
    
    public String getProxyNm() {
        return this.proxyNm;
    }
    
    public void setProxyNm(String proxyNm) {
        this.proxyNm = proxyNm;
    }
    
    public String getProxyIp() {
        return this.proxyIp;
    }
    
    public void setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
    }
    
    public String getProxyPort() {
        return this.proxyPort;
    }
    
    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }
    
    public String getTrgetSvcNm() {
        return this.trgetSvcNm;
    }
    
    public void setTrgetSvcNm(String trgetSvcNm) {
        this.trgetSvcNm = trgetSvcNm;
    }
    
    public String getSvcDc() {
        return this.svcDc;
    }
    
    public void setSvcDc(String svcDc) {
        this.svcDc = svcDc;
    }
    
    public String getSvcIp() {
        return this.svcIp;
    }
    
    public void setSvcIp(String svcIp) {
        this.svcIp = svcIp;
    }
    
    public String getSvcPort() {
        return this.svcPort;
    }
    
    public void setSvcPort(String svcPort) {
        this.svcPort = svcPort;
    }
    
    public String getSvcSttus() {
        return this.svcSttus;
    }
    
    public void setSvcSttus(String svcSttus) {
        this.svcSttus = svcSttus;
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
