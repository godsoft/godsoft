package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service;

/**
 * @Class Name : ComtnsitelistVO.java
 * @Description : Comtnsitelist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsitelistVO extends ComtnsitelistDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SITE_ID */
    private String siteId;
    
    /** SITE_NM */
    private String siteNm;
    
    /** SITE_URL */
    private String siteUrl;
    
    /** SITE_DC */
    private String siteDc;
    
    /** SITE_THEMA_CL_CODE */
    private String siteThemaClCode;
    
    /** ACTVTY_AT */
    private String actvtyAt;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getSiteId() {
        return this.siteId;
    }
    
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    
    public String getSiteNm() {
        return this.siteNm;
    }
    
    public void setSiteNm(String siteNm) {
        this.siteNm = siteNm;
    }
    
    public String getSiteUrl() {
        return this.siteUrl;
    }
    
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
    
    public String getSiteDc() {
        return this.siteDc;
    }
    
    public void setSiteDc(String siteDc) {
        this.siteDc = siteDc;
    }
    
    public String getSiteThemaClCode() {
        return this.siteThemaClCode;
    }
    
    public void setSiteThemaClCode(String siteThemaClCode) {
        this.siteThemaClCode = siteThemaClCode;
    }
    
    public String getActvtyAt() {
        return this.actvtyAt;
    }
    
    public void setActvtyAt(String actvtyAt) {
        this.actvtyAt = actvtyAt;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
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
