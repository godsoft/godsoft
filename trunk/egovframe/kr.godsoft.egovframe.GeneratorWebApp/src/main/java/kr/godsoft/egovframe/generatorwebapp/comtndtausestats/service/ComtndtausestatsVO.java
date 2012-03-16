package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service;

/**
 * @Class Name : ComtndtausestatsVO.java
 * @Description : Comtndtausestats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndtausestatsVO extends ComtndtausestatsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** DTA_USE_STATS_ID */
    private String dtaUseStatsId;
    
    /** BBS_ID */
    private String bbsId;
    
    /** NTT_ID */
    private int nttId;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** FILE_SN */
    private int fileSn;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getDtaUseStatsId() {
        return this.dtaUseStatsId;
    }
    
    public void setDtaUseStatsId(String dtaUseStatsId) {
        this.dtaUseStatsId = dtaUseStatsId;
    }
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public int getNttId() {
        return this.nttId;
    }
    
    public void setNttId(int nttId) {
        this.nttId = nttId;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
    public int getFileSn() {
        return this.fileSn;
    }
    
    public void setFileSn(int fileSn) {
        this.fileSn = fileSn;
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
