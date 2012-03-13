package kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service;

/**
 * @Class Name : ComtnbbsmasteroptnVO.java
 * @Description : Comtnbbsmasteroptn VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbbsmasteroptnVO extends ComtnbbsmasteroptnDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String bbsId;
    
    /**  */
    private String answerAt;
    
    /**  */
    private String stsfdgAt;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdusrId;
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getAnswerAt() {
        return this.answerAt;
    }
    
    public void setAnswerAt(String answerAt) {
        this.answerAt = answerAt;
    }
    
    public String getStsfdgAt() {
        return this.stsfdgAt;
    }
    
    public void setStsfdgAt(String stsfdgAt) {
        this.stsfdgAt = stsfdgAt;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
