package kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service;

/**
 * @Class Name : ComtnbbsmasterVO.java
 * @Description : Comtnbbsmaster VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbbsmasterVO extends ComtnbbsmasterDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BBS_ID */
    private String bbsId;
    
    /** BBS_NM */
    private String bbsNm;
    
    /** BBS_INTRCN */
    private String bbsIntrcn;
    
    /** BBS_TY_CODE */
    private String bbsTyCode;
    
    /** BBS_ATTRB_CODE */
    private String bbsAttrbCode;
    
    /** REPLY_POSBL_AT */
    private String replyPosblAt;
    
    /** FILE_ATCH_POSBL_AT */
    private String fileAtchPosblAt;
    
    /** ATCH_POSBL_FILE_NUMBER */
    private int atchPosblFileNumber;
    
    /** ATCH_POSBL_FILE_SIZE */
    private int atchPosblFileSize;
    
    /** USE_AT */
    private String useAt;
    
    /** TMPLAT_ID */
    private String tmplatId;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getBbsNm() {
        return this.bbsNm;
    }
    
    public void setBbsNm(String bbsNm) {
        this.bbsNm = bbsNm;
    }
    
    public String getBbsIntrcn() {
        return this.bbsIntrcn;
    }
    
    public void setBbsIntrcn(String bbsIntrcn) {
        this.bbsIntrcn = bbsIntrcn;
    }
    
    public String getBbsTyCode() {
        return this.bbsTyCode;
    }
    
    public void setBbsTyCode(String bbsTyCode) {
        this.bbsTyCode = bbsTyCode;
    }
    
    public String getBbsAttrbCode() {
        return this.bbsAttrbCode;
    }
    
    public void setBbsAttrbCode(String bbsAttrbCode) {
        this.bbsAttrbCode = bbsAttrbCode;
    }
    
    public String getReplyPosblAt() {
        return this.replyPosblAt;
    }
    
    public void setReplyPosblAt(String replyPosblAt) {
        this.replyPosblAt = replyPosblAt;
    }
    
    public String getFileAtchPosblAt() {
        return this.fileAtchPosblAt;
    }
    
    public void setFileAtchPosblAt(String fileAtchPosblAt) {
        this.fileAtchPosblAt = fileAtchPosblAt;
    }
    
    public int getAtchPosblFileNumber() {
        return this.atchPosblFileNumber;
    }
    
    public void setAtchPosblFileNumber(int atchPosblFileNumber) {
        this.atchPosblFileNumber = atchPosblFileNumber;
    }
    
    public int getAtchPosblFileSize() {
        return this.atchPosblFileSize;
    }
    
    public void setAtchPosblFileSize(int atchPosblFileSize) {
        this.atchPosblFileSize = atchPosblFileSize;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getTmplatId() {
        return this.tmplatId;
    }
    
    public void setTmplatId(String tmplatId) {
        this.tmplatId = tmplatId;
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
