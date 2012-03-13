package kr.godsoft.egovframe.generatorwebapp.comtnserverinfo.service;

/**
 * @Class Name : ComtnserverinfoVO.java
 * @Description : Comtnserverinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnserverinfoVO extends ComtnserverinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String serverId;
    
    /**  */
    private String serverNm;
    
    /**  */
    private String serverKnd;
    
    /**  */
    private String rgsde;
    
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
    
    public String getServerKnd() {
        return this.serverKnd;
    }
    
    public void setServerKnd(String serverKnd) {
        this.serverKnd = serverKnd;
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
