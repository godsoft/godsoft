package kr.godsoft.egovframe.generatorwebapp.comthsyshist.service;

/**
 * @Class Name : ComthsyshistVO.java
 * @Description : Comthsyshist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthsyshistVO extends ComthsyshistDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String histId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String histSeCode;
    
    /**  */
    private String histCn;
    
    /**  */
    private String sysNm;
    
    /**  */
    private String atchFileId;
    
    public String getHistId() {
        return this.histId;
    }
    
    public void setHistId(String histId) {
        this.histId = histId;
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
    
    public String getHistSeCode() {
        return this.histSeCode;
    }
    
    public void setHistSeCode(String histSeCode) {
        this.histSeCode = histSeCode;
    }
    
    public String getHistCn() {
        return this.histCn;
    }
    
    public void setHistCn(String histCn) {
        this.histCn = histCn;
    }
    
    public String getSysNm() {
        return this.sysNm;
    }
    
    public void setSysNm(String sysNm) {
        this.sysNm = sysNm;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
}
