package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service;

/**
 * @Class Name : ComtnanswerVO.java
 * @Description : Comtnanswer VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnanswerVO extends ComtnanswerDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private int nttId;
    
    /**  */
    private String bbsId;
    
    /**  */
    private String wrterId;
    
    /**  */
    private String answer;
    
    /**  */
    private String useAt;
    
    /**  */
    private String wrterNm;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private int answerNo;
    
    public int getNttId() {
        return this.nttId;
    }
    
    public void setNttId(int nttId) {
        this.nttId = nttId;
    }
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getWrterId() {
        return this.wrterId;
    }
    
    public void setWrterId(String wrterId) {
        this.wrterId = wrterId;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getWrterNm() {
        return this.wrterNm;
    }
    
    public void setWrterNm(String wrterNm) {
        this.wrterNm = wrterNm;
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
    
    public int getAnswerNo() {
        return this.answerNo;
    }
    
    public void setAnswerNo(int answerNo) {
        this.answerNo = answerNo;
    }
    
}
