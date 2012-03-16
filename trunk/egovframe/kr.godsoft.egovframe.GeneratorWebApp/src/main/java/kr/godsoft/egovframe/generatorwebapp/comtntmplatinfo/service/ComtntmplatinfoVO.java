package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service;

/**
 * @Class Name : ComtntmplatinfoVO.java
 * @Description : Comtntmplatinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtntmplatinfoVO extends ComtntmplatinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** TMPLAT_ID */
    private String tmplatId;
    
    /** TMPLAT_NM */
    private String tmplatNm;
    
    /** TMPLAT_COURS */
    private String tmplatCours;
    
    /** USE_AT */
    private String useAt;
    
    /** TMPLAT_SE_CODE */
    private String tmplatSeCode;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
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
