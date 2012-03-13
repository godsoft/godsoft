package kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service;

/**
 * @Class Name : ComtnloginpolicyVO.java
 * @Description : Comtnloginpolicy VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnloginpolicyVO extends ComtnloginpolicyDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String emplyrId;
    
    /**  */
    private String ipInfo;
    
    /**  */
    private String dplctPermAt;
    
    /**  */
    private String lmttAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
    public String getIpInfo() {
        return this.ipInfo;
    }
    
    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }
    
    public String getDplctPermAt() {
        return this.dplctPermAt;
    }
    
    public void setDplctPermAt(String dplctPermAt) {
        this.dplctPermAt = dplctPermAt;
    }
    
    public String getLmttAt() {
        return this.lmttAt;
    }
    
    public void setLmttAt(String lmttAt) {
        this.lmttAt = lmttAt;
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
