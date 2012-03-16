package kr.godsoft.egovframe.generatorwebapp.comtnntwrkinfo.service;

/**
 * @Class Name : ComtnntwrkinfoVO.java
 * @Description : Comtnntwrkinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnntwrkinfoVO extends ComtnntwrkinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** NTWRK_ID */
    private String ntwrkId;
    
    /** NTWRK_IP */
    private String ntwrkIp;
    
    /** GTWY */
    private String gtwy;
    
    /** SUBNET */
    private String subnet;
    
    /** DOMN_NM_SERVER */
    private String domnNmServer;
    
    /** MANAGE_IEM */
    private String manageIem;
    
    /** USER_NM */
    private String userNm;
    
    /** USE_AT */
    private String useAt;
    
    /** RGSDE */
    private String rgsde;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getNtwrkId() {
        return this.ntwrkId;
    }
    
    public void setNtwrkId(String ntwrkId) {
        this.ntwrkId = ntwrkId;
    }
    
    public String getNtwrkIp() {
        return this.ntwrkIp;
    }
    
    public void setNtwrkIp(String ntwrkIp) {
        this.ntwrkIp = ntwrkIp;
    }
    
    public String getGtwy() {
        return this.gtwy;
    }
    
    public void setGtwy(String gtwy) {
        this.gtwy = gtwy;
    }
    
    public String getSubnet() {
        return this.subnet;
    }
    
    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }
    
    public String getDomnNmServer() {
        return this.domnNmServer;
    }
    
    public void setDomnNmServer(String domnNmServer) {
        this.domnNmServer = domnNmServer;
    }
    
    public String getManageIem() {
        return this.manageIem;
    }
    
    public void setManageIem(String manageIem) {
        this.manageIem = manageIem;
    }
    
    public String getUserNm() {
        return this.userNm;
    }
    
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getRgsde() {
        return this.rgsde;
    }
    
    public void setRgsde(String rgsde) {
        this.rgsde = rgsde;
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
