package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service;

/**
 * @Class Name : ComtnrecentsrchwrdmanageVO.java
 * @Description : Comtnrecentsrchwrdmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnrecentsrchwrdmanageVO extends ComtnrecentsrchwrdmanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SRCHWRD_MANAGE_ID */
    private String srchwrdManageId;
    
    /** SRCHWRD_MANAGE_NM */
    private String srchwrdManageNm;
    
    /** SRCHWRD_CONECT_URL */
    private String srchwrdConectUrl;
    
    /** USER_SEARCH_AT */
    private String userSearchAt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getSrchwrdManageId() {
        return this.srchwrdManageId;
    }
    
    public void setSrchwrdManageId(String srchwrdManageId) {
        this.srchwrdManageId = srchwrdManageId;
    }
    
    public String getSrchwrdManageNm() {
        return this.srchwrdManageNm;
    }
    
    public void setSrchwrdManageNm(String srchwrdManageNm) {
        this.srchwrdManageNm = srchwrdManageNm;
    }
    
    public String getSrchwrdConectUrl() {
        return this.srchwrdConectUrl;
    }
    
    public void setSrchwrdConectUrl(String srchwrdConectUrl) {
        this.srchwrdConectUrl = srchwrdConectUrl;
    }
    
    public String getUserSearchAt() {
        return this.userSearchAt;
    }
    
    public void setUserSearchAt(String userSearchAt) {
        this.userSearchAt = userSearchAt;
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
