package kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service;

/**
 * @Class Name : ComtncpyrhtinfoVO.java
 * @Description : Comtncpyrhtinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncpyrhtinfoVO extends ComtncpyrhtinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String cpyrhtId;
    
    /**  */
    private String cpyrhtPrtcPolicyCn;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    public String getCpyrhtId() {
        return this.cpyrhtId;
    }
    
    public void setCpyrhtId(String cpyrhtId) {
        this.cpyrhtId = cpyrhtId;
    }
    
    public String getCpyrhtPrtcPolicyCn() {
        return this.cpyrhtPrtcPolicyCn;
    }
    
    public void setCpyrhtPrtcPolicyCn(String cpyrhtPrtcPolicyCn) {
        this.cpyrhtPrtcPolicyCn = cpyrhtPrtcPolicyCn;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
