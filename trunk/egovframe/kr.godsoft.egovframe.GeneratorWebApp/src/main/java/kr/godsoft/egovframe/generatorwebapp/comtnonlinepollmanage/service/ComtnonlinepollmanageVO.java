package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service;

/**
 * @Class Name : ComtnonlinepollmanageVO.java
 * @Description : Comtnonlinepollmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnonlinepollmanageVO extends ComtnonlinepollmanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** POLL_ID */
    private String pollId;
    
    /** POLL_NM */
    private String pollNm;
    
    /** POLL_BGNDE */
    private String pollBgnde;
    
    /** POLL_ENDDE */
    private String pollEndde;
    
    /** POLL_KND */
    private String pollKnd;
    
    /** POLL_DSUSE_ENNC */
    private String pollDsuseEnnc;
    
    /** POLL_ATMC_DSUSE_ENNC */
    private String pollAtmcDsuseEnnc;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getPollId() {
        return this.pollId;
    }
    
    public void setPollId(String pollId) {
        this.pollId = pollId;
    }
    
    public String getPollNm() {
        return this.pollNm;
    }
    
    public void setPollNm(String pollNm) {
        this.pollNm = pollNm;
    }
    
    public String getPollBgnde() {
        return this.pollBgnde;
    }
    
    public void setPollBgnde(String pollBgnde) {
        this.pollBgnde = pollBgnde;
    }
    
    public String getPollEndde() {
        return this.pollEndde;
    }
    
    public void setPollEndde(String pollEndde) {
        this.pollEndde = pollEndde;
    }
    
    public String getPollKnd() {
        return this.pollKnd;
    }
    
    public void setPollKnd(String pollKnd) {
        this.pollKnd = pollKnd;
    }
    
    public String getPollDsuseEnnc() {
        return this.pollDsuseEnnc;
    }
    
    public void setPollDsuseEnnc(String pollDsuseEnnc) {
        this.pollDsuseEnnc = pollDsuseEnnc;
    }
    
    public String getPollAtmcDsuseEnnc() {
        return this.pollAtmcDsuseEnnc;
    }
    
    public void setPollAtmcDsuseEnnc(String pollAtmcDsuseEnnc) {
        this.pollAtmcDsuseEnnc = pollAtmcDsuseEnnc;
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
