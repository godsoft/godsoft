package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service;

/**
 * @Class Name : ComtnrecentsrchwrdVO.java
 * @Description : Comtnrecentsrchwrd VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnrecentsrchwrdVO extends ComtnrecentsrchwrdDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SRCHWRD_MANAGE_ID */
    private String srchwrdManageId;
    
    /** RECENT_SRCHWRD_ID */
    private String recentSrchwrdId;
    
    /** RECENT_SRCHWRD_NM */
    private String recentSrchwrdNm;
    
    /** RECENT_SRCHWRD_CO */
    private String recentSrchwrdCo;
    
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
    
    public String getRecentSrchwrdId() {
        return this.recentSrchwrdId;
    }
    
    public void setRecentSrchwrdId(String recentSrchwrdId) {
        this.recentSrchwrdId = recentSrchwrdId;
    }
    
    public String getRecentSrchwrdNm() {
        return this.recentSrchwrdNm;
    }
    
    public void setRecentSrchwrdNm(String recentSrchwrdNm) {
        this.recentSrchwrdNm = recentSrchwrdNm;
    }
    
    public String getRecentSrchwrdCo() {
        return this.recentSrchwrdCo;
    }
    
    public void setRecentSrchwrdCo(String recentSrchwrdCo) {
        this.recentSrchwrdCo = recentSrchwrdCo;
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
