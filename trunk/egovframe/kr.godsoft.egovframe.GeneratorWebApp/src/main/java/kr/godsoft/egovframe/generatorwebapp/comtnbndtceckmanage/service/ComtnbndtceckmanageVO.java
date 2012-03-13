package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service;

/**
 * @Class Name : ComtnbndtceckmanageVO.java
 * @Description : Comtnbndtceckmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbndtceckmanageVO extends ComtnbndtceckmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String bndtCeckSe;
    
    /**  */
    private String bndtCeckCode;
    
    /**  */
    private String bndtCeckCodeNm;
    
    /**  */
    private String useAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getBndtCeckSe() {
        return this.bndtCeckSe;
    }
    
    public void setBndtCeckSe(String bndtCeckSe) {
        this.bndtCeckSe = bndtCeckSe;
    }
    
    public String getBndtCeckCode() {
        return this.bndtCeckCode;
    }
    
    public void setBndtCeckCode(String bndtCeckCode) {
        this.bndtCeckCode = bndtCeckCode;
    }
    
    public String getBndtCeckCodeNm() {
        return this.bndtCeckCodeNm;
    }
    
    public void setBndtCeckCodeNm(String bndtCeckCodeNm) {
        this.bndtCeckCodeNm = bndtCeckCodeNm;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
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
