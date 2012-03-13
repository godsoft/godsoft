package kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service;

/**
 * @Class Name : ComtnbatchresultVO.java
 * @Description : Comtnbatchresult VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbatchresultVO extends ComtnbatchresultDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String batchResultId;
    
    /**  */
    private String batchSchdulId;
    
    /**  */
    private String batchOpertId;
    
    /**  */
    private String paramtr;
    
    /**  */
    private String sttus;
    
    /**  */
    private String errorInfo;
    
    /**  */
    private String executBeginTm;
    
    /**  */
    private String executEndTm;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    public String getBatchResultId() {
        return this.batchResultId;
    }
    
    public void setBatchResultId(String batchResultId) {
        this.batchResultId = batchResultId;
    }
    
    public String getBatchSchdulId() {
        return this.batchSchdulId;
    }
    
    public void setBatchSchdulId(String batchSchdulId) {
        this.batchSchdulId = batchSchdulId;
    }
    
    public String getBatchOpertId() {
        return this.batchOpertId;
    }
    
    public void setBatchOpertId(String batchOpertId) {
        this.batchOpertId = batchOpertId;
    }
    
    public String getParamtr() {
        return this.paramtr;
    }
    
    public void setParamtr(String paramtr) {
        this.paramtr = paramtr;
    }
    
    public String getSttus() {
        return this.sttus;
    }
    
    public void setSttus(String sttus) {
        this.sttus = sttus;
    }
    
    public String getErrorInfo() {
        return this.errorInfo;
    }
    
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
    
    public String getExecutBeginTm() {
        return this.executBeginTm;
    }
    
    public void setExecutBeginTm(String executBeginTm) {
        this.executBeginTm = executBeginTm;
    }
    
    public String getExecutEndTm() {
        return this.executEndTm;
    }
    
    public void setExecutEndTm(String executEndTm) {
        this.executEndTm = executEndTm;
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
    
}
