package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service;

/**
 * @Class Name : ComtnworddicaryinfoVO.java
 * @Description : Comtnworddicaryinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnworddicaryinfoVO extends ComtnworddicaryinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** WORD_ID */
    private String wordId;
    
    /** WORD_NM */
    private String wordNm;
    
    /** ENG_NM */
    private String engNm;
    
    /** WORD_DC */
    private String wordDc;
    
    /** SYNONM */
    private String synonm;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getWordId() {
        return this.wordId;
    }
    
    public void setWordId(String wordId) {
        this.wordId = wordId;
    }
    
    public String getWordNm() {
        return this.wordNm;
    }
    
    public void setWordNm(String wordNm) {
        this.wordNm = wordNm;
    }
    
    public String getEngNm() {
        return this.engNm;
    }
    
    public void setEngNm(String engNm) {
        this.engNm = engNm;
    }
    
    public String getWordDc() {
        return this.wordDc;
    }
    
    public void setWordDc(String wordDc) {
        this.wordDc = wordDc;
    }
    
    public String getSynonm() {
        return this.synonm;
    }
    
    public void setSynonm(String synonm) {
        this.synonm = synonm;
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
