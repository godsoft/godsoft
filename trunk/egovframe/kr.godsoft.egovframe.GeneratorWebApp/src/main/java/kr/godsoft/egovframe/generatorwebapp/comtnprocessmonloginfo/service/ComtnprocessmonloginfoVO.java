package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service;

/**
 * @Class Name : ComtnprocessmonloginfoVO.java
 * @Description : Comtnprocessmonloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnprocessmonloginfoVO extends ComtnprocessmonloginfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String procsId;
    
    /**  */
    private String procsNm;
    
    /**  */
    private String procsSttus;
    
    /**  */
    private String creatDt;
    
    /**  */
    private String logInfo;
    
    /**  */
    private String mngrNm;
    
    /**  */
    private String mngrEmailAdres;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String logId;
    
    public String getProcsId() {
        return this.procsId;
    }
    
    public void setProcsId(String procsId) {
        this.procsId = procsId;
    }
    
    public String getProcsNm() {
        return this.procsNm;
    }
    
    public void setProcsNm(String procsNm) {
        this.procsNm = procsNm;
    }
    
    public String getProcsSttus() {
        return this.procsSttus;
    }
    
    public void setProcsSttus(String procsSttus) {
        this.procsSttus = procsSttus;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
    public String getLogInfo() {
        return this.logInfo;
    }
    
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }
    
    public String getMngrNm() {
        return this.mngrNm;
    }
    
    public void setMngrNm(String mngrNm) {
        this.mngrNm = mngrNm;
    }
    
    public String getMngrEmailAdres() {
        return this.mngrEmailAdres;
    }
    
    public void setMngrEmailAdres(String mngrEmailAdres) {
        this.mngrEmailAdres = mngrEmailAdres;
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
