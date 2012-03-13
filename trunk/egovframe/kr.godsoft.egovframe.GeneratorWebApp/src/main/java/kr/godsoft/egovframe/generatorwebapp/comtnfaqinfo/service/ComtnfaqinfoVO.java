package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service;

/**
 * @Class Name : ComtnfaqinfoVO.java
 * @Description : Comtnfaqinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfaqinfoVO extends ComtnfaqinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String faqId;
    
    /**  */
    private String qestnSj;
    
    /**  */
    private String qestnCn;
    
    /**  */
    private String answerCn;
    
    /**  */
    private int rdcnt;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String atchFileId;
    
    /**  */
    private String qnaProcessSttusCode;
    
    public String getFaqId() {
        return this.faqId;
    }
    
    public void setFaqId(String faqId) {
        this.faqId = faqId;
    }
    
    public String getQestnSj() {
        return this.qestnSj;
    }
    
    public void setQestnSj(String qestnSj) {
        this.qestnSj = qestnSj;
    }
    
    public String getQestnCn() {
        return this.qestnCn;
    }
    
    public void setQestnCn(String qestnCn) {
        this.qestnCn = qestnCn;
    }
    
    public String getAnswerCn() {
        return this.answerCn;
    }
    
    public void setAnswerCn(String answerCn) {
        this.answerCn = answerCn;
    }
    
    public int getRdcnt() {
        return this.rdcnt;
    }
    
    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
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
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
    public String getQnaProcessSttusCode() {
        return this.qnaProcessSttusCode;
    }
    
    public void setQnaProcessSttusCode(String qnaProcessSttusCode) {
        this.qnaProcessSttusCode = qnaProcessSttusCode;
    }
    
}
