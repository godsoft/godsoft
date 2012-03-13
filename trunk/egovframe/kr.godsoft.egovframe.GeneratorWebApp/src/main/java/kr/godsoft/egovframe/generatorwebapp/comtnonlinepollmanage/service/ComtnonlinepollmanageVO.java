package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service;

/**
 * @Class Name : ComtnonlinepollmanageVO.java
 * @Description : Comtnonlinepollmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnonlinepollmanageVO extends ComtnonlinepollmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String pollId;
    
    /**  */
    private String pollNm;
    
    /**  */
    private String pollBgnde;
    
    /**  */
    private String pollEndde;
    
    /**  */
    private String pollKnd;
    
    /**  */
    private String pollDsuseEnnc;
    
    /**  */
    private String pollAtmcDsuseEnnc;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
