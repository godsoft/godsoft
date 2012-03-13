package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service;

/**
 * @Class Name : ComtntmplatinfoVO.java
 * @Description : Comtntmplatinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtntmplatinfoVO extends ComtntmplatinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String tmplatId;
    
    /**  */
    private String tmplatNm;
    
    /**  */
    private String tmplatCours;
    
    /**  */
    private String useAt;
    
    /**  */
    private String tmplatSeCode;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getTmplatId() {
        return this.tmplatId;
    }
    
    public void setTmplatId(String tmplatId) {
        this.tmplatId = tmplatId;
    }
    
    public String getTmplatNm() {
        return this.tmplatNm;
    }
    
    public void setTmplatNm(String tmplatNm) {
        this.tmplatNm = tmplatNm;
    }
    
    public String getTmplatCours() {
        return this.tmplatCours;
    }
    
    public void setTmplatCours(String tmplatCours) {
        this.tmplatCours = tmplatCours;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getTmplatSeCode() {
        return this.tmplatSeCode;
    }
    
    public void setTmplatSeCode(String tmplatSeCode) {
        this.tmplatSeCode = tmplatSeCode;
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
