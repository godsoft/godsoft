package kr.godsoft.egovframe.generatorwebapp.comthsyshist.service;

/**
 * @Class Name : ComthsyshistVO.java
 * @Description : Comthsyshist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthsyshistVO extends ComthsyshistDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** HIST_ID */
    private String histId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** HIST_SE_CODE */
    private String histSeCode;
    
    /** HIST_CN */
    private String histCn;
    
    /** SYS_NM */
    private String sysNm;
    
    /** ATCH_FILE_ID */
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
