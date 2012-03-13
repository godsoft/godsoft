package kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service;

/**
 * @Class Name : ComtnbackupresultVO.java
 * @Description : Comtnbackupresult VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbackupresultVO extends ComtnbackupresultDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String backupResultId;
    
    /**  */
    private String backupOpertId;
    
    /**  */
    private String backupFile;
    
    /**  */
    private String sttus;
    
    /**  */
    private String errorInfo;
    
    /**  */
    private String executBeginTm;
    
    /**  */
    private String executEndTm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getBackupResultId() {
        return this.backupResultId;
    }
    
    public void setBackupResultId(String backupResultId) {
        this.backupResultId = backupResultId;
    }
    
    public String getBackupOpertId() {
        return this.backupOpertId;
    }
    
    public void setBackupOpertId(String backupOpertId) {
        this.backupOpertId = backupOpertId;
    }
    
    public String getBackupFile() {
        return this.backupFile;
    }
    
    public void setBackupFile(String backupFile) {
        this.backupFile = backupFile;
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
