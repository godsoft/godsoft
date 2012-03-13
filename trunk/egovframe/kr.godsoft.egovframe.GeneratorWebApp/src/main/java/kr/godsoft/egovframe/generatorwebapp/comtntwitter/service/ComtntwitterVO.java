package kr.godsoft.egovframe.generatorwebapp.comtntwitter.service;

/**
 * @Class Name : ComtntwitterVO.java
 * @Description : Comtntwitter VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtntwitterVO extends ComtntwitterDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String userId;
    
    /**  */
    private String cnsmrKey;
    
    /**  */
    private String cnsmrSecret;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getCnsmrKey() {
        return this.cnsmrKey;
    }
    
    public void setCnsmrKey(String cnsmrKey) {
        this.cnsmrKey = cnsmrKey;
    }
    
    public String getCnsmrSecret() {
        return this.cnsmrSecret;
    }
    
    public void setCnsmrSecret(String cnsmrSecret) {
        this.cnsmrSecret = cnsmrSecret;
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
