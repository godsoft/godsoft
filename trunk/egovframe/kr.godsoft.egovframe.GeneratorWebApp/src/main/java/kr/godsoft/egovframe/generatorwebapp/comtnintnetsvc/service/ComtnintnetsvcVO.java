package kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service;

/**
 * @Class Name : ComtnintnetsvcVO.java
 * @Description : Comtnintnetsvc VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnintnetsvcVO extends ComtnintnetsvcDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String intnetSvcId;
    
    /**  */
    private String intnetSvcNm;
    
    /**  */
    private String intnetSvcDc;
    
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
    
    public String getIntnetSvcId() {
        return this.intnetSvcId;
    }
    
    public void setIntnetSvcId(String intnetSvcId) {
        this.intnetSvcId = intnetSvcId;
    }
    
    public String getIntnetSvcNm() {
        return this.intnetSvcNm;
    }
    
    public void setIntnetSvcNm(String intnetSvcNm) {
        this.intnetSvcNm = intnetSvcNm;
    }
    
    public String getIntnetSvcDc() {
        return this.intnetSvcDc;
    }
    
    public void setIntnetSvcDc(String intnetSvcDc) {
        this.intnetSvcDc = intnetSvcDc;
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
