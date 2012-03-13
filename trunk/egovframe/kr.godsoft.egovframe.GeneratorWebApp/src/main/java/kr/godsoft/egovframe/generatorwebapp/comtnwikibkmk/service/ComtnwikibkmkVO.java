package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service;

/**
 * @Class Name : ComtnwikibkmkVO.java
 * @Description : Comtnwikibkmk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnwikibkmkVO extends ComtnwikibkmkDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String wikiBkmkId;
    
    /**  */
    private String userId;
    
    /**  */
    private String wikiBkmkNm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
