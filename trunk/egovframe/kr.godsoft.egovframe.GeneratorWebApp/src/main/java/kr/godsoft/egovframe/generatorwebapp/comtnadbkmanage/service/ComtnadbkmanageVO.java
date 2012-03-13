package kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service;

/**
 * @Class Name : ComtnadbkmanageVO.java
 * @Description : Comtnadbkmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnadbkmanageVO extends ComtnadbkmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String adbkId;
    
    /**  */
    private String adbkNm;
    
    /**  */
    private String othbcScope;
    
    /**  */
    private String useAt;
    
    /**  */
    private String wrterId;
    
    /**  */
    private String trgetOrgnztId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdusrId;
    
    public String getAdbkId() {
        return this.adbkId;
    }
    
    public void setAdbkId(String adbkId) {
        this.adbkId = adbkId;
    }
    
    public String getAdbkNm() {
        return this.adbkNm;
    }
    
    public void setAdbkNm(String adbkNm) {
        this.adbkNm = adbkNm;
    }
    
    public String getOthbcScope() {
        return this.othbcScope;
    }
    
    public void setOthbcScope(String othbcScope) {
        this.othbcScope = othbcScope;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getWrterId() {
        return this.wrterId;
    }
    
    public void setWrterId(String wrterId) {
        this.wrterId = wrterId;
    }
    
    public String getTrgetOrgnztId() {
        return this.trgetOrgnztId;
    }
    
    public void setTrgetOrgnztId(String trgetOrgnztId) {
        this.trgetOrgnztId = trgetOrgnztId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
