package kr.godsoft.egovframe.generatorwebapp.comtncomment.service;

/**
 * @Class Name : ComtncommentVO.java
 * @Description : Comtncomment VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncommentVO extends ComtncommentDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** NTT_ID */
    private String nttId;
    
    /** BBS_ID */
    private String bbsId;
    
    /** ANSWER_NO */
    private String answerNo;
    
    /** WRTER_ID */
    private String wrterId;
    
    /** WRTER_NM */
    private String wrterNm;
    
    /** ANSWER */
    private String answer;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** PASSWORD */
    private String password;
    
    public String getNttId() {
        return this.nttId;
    }
    
    public void setNttId(String nttId) {
        this.nttId = nttId;
    }
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getAnswerNo() {
        return this.answerNo;
    }
    
    public void setAnswerNo(String answerNo) {
        this.answerNo = answerNo;
    }
    
    public String getWrterId() {
        return this.wrterId;
    }
    
    public void setWrterId(String wrterId) {
        this.wrterId = wrterId;
    }
    
    public String getWrterNm() {
        return this.wrterNm;
    }
    
    public void setWrterNm(String wrterNm) {
        this.wrterNm = wrterNm;
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
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
