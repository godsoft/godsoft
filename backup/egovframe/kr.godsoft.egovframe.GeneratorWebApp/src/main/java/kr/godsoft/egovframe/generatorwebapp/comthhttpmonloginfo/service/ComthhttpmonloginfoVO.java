package kr.godsoft.egovframe.generatorwebapp.comthhttpmonloginfo.service;

/**
 * @Class Name : ComthhttpmonloginfoVO.java
 * @Description : Comthhttpmonloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthhttpmonloginfoVO extends ComthhttpmonloginfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SYS_ID */
    private String sysId;
    
    /** SITE_URL */
    private String siteUrl;
    
    /** WEBSVC_KND */
    private String websvcKnd;
    
    /** HTTP_STTUS_CODE */
    private String httpSttusCode;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** LOG_INFO */
    private String logInfo;
    
    /** MNGR_NM */
    private String mngrNm;
    
    /** MNGR_EMAIL_ADRES */
    private String mngrEmailAdres;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LOG_ID */
    private String logId;
    
    public String getSysId() {
        return this.sysId;
    }
    
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
    
    public String getSiteUrl() {
        return this.siteUrl;
    }
    
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
    
    public String getWebsvcKnd() {
        return this.websvcKnd;
    }
    
    public void setWebsvcKnd(String websvcKnd) {
        this.websvcKnd = websvcKnd;
    }
    
    public String getHttpSttusCode() {
        return this.httpSttusCode;
    }
    
    public void setHttpSttusCode(String httpSttusCode) {
        this.httpSttusCode = httpSttusCode;
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