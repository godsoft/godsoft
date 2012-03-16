package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service;

/**
 * @Class Name : ComtnwikibkmkVO.java
 * @Description : Comtnwikibkmk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnwikibkmkVO extends ComtnwikibkmkDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** WIKI_BKMK_ID */
    private String wikiBkmkId;
    
    /** USER_ID */
    private String userId;
    
    /** WIKI_BKMK_NM */
    private String wikiBkmkNm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getWikiBkmkId() {
        return this.wikiBkmkId;
    }
    
    public void setWikiBkmkId(String wikiBkmkId) {
        this.wikiBkmkId = wikiBkmkId;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getWikiBkmkNm() {
        return this.wikiBkmkNm;
    }
    
    public void setWikiBkmkNm(String wikiBkmkNm) {
        this.wikiBkmkNm = wikiBkmkNm;
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
