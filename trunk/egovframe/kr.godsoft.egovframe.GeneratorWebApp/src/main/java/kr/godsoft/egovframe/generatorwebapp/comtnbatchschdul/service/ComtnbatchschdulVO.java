package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service;

/**
 * @Class Name : ComtnbatchschdulVO.java
 * @Description : Comtnbatchschdul VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbatchschdulVO extends ComtnbatchschdulDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BATCH_SCHDUL_ID */
    private String batchSchdulId;
    
    /** BATCH_OPERT_ID */
    private String batchOpertId;
    
    /** EXECUT_CYCLE */
    private String executCycle;
    
    /** EXECUT_SCHDUL_DE */
    private String executSchdulDe;
    
    /** EXECUT_SCHDUL_HOUR */
    private String executSchdulHour;
    
    /** EXECUT_SCHDUL_MNT */
    private String executSchdulMnt;
    
    /** EXECUT_SCHDUL_SECND */
    private String executSchdulSecnd;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
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
    
    public String getExecutCycle() {
        return this.executCycle;
    }
    
    public void setExecutCycle(String executCycle) {
        this.executCycle = executCycle;
    }
    
    public String getExecutSchdulDe() {
        return this.executSchdulDe;
    }
    
    public void setExecutSchdulDe(String executSchdulDe) {
        this.executSchdulDe = executSchdulDe;
    }
    
    public String getExecutSchdulHour() {
        return this.executSchdulHour;
    }
    
    public void setExecutSchdulHour(String executSchdulHour) {
        this.executSchdulHour = executSchdulHour;
    }
    
    public String getExecutSchdulMnt() {
        return this.executSchdulMnt;
    }
    
    public void setExecutSchdulMnt(String executSchdulMnt) {
        this.executSchdulMnt = executSchdulMnt;
    }
    
    public String getExecutSchdulSecnd() {
        return this.executSchdulSecnd;
    }
    
    public void setExecutSchdulSecnd(String executSchdulSecnd) {
        this.executSchdulSecnd = executSchdulSecnd;
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
