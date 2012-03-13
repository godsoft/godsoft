package kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service;

/**
 * @Class Name : ComtnnewsinfoVO.java
 * @Description : Comtnnewsinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnewsinfoVO extends ComtnnewsinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String newsId;
    
    /**  */
    private String newsSj;
    
    /**  */
    private String newsCn;
    
    /**  */
    private String newsOrigin;
    
    /**  */
    private String ntceAt;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String ntceDe;
    
    /**  */
    private String atchFileId;
    
    public String getNewsId() {
        return this.newsId;
    }
    
    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }
    
    public String getNewsSj() {
        return this.newsSj;
    }
    
    public void setNewsSj(String newsSj) {
        this.newsSj = newsSj;
    }
    
    public String getNewsCn() {
        return this.newsCn;
    }
    
    public void setNewsCn(String newsCn) {
        this.newsCn = newsCn;
    }
    
    public String getNewsOrigin() {
        return this.newsOrigin;
    }
    
    public void setNewsOrigin(String newsOrigin) {
        this.newsOrigin = newsOrigin;
    }
    
    public String getNtceAt() {
        return this.ntceAt;
    }
    
    public void setNtceAt(String ntceAt) {
        this.ntceAt = ntceAt;
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
    
    public String getNtceDe() {
        return this.ntceDe;
    }
    
    public void setNtceDe(String ntceDe) {
        this.ntceDe = ntceDe;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
}
