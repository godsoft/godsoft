package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service;

/**
 * @Class Name : ComtndtausestatsVO.java
 * @Description : Comtndtausestats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndtausestatsVO extends ComtndtausestatsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String dtaUseStatsId;
    
    /**  */
    private String bbsId;
    
    /**  */
    private int nttId;
    
    /**  */
    private String atchFileId;
    
    /**  */
    private int fileSn;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
