package kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service;

/**
 * @Class Name : ComtnleadersttusVO.java
 * @Description : Comtnleadersttus VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnleadersttusVO extends ComtnleadersttusDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** LEADER_ID */
    private String leaderId;
    
    /** LEADER_STTUS */
    private String leaderSttus;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getLeaderId() {
        return this.leaderId;
    }
    
    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }
    
    public String getLeaderSttus() {
        return this.leaderSttus;
    }
    
    public void setLeaderSttus(String leaderSttus) {
        this.leaderSttus = leaderSttus;
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
    
}
