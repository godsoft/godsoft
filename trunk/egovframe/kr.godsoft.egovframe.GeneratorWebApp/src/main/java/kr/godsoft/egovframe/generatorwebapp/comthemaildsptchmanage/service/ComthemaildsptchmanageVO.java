package kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service;

/**
 * @Class Name : ComthemaildsptchmanageVO.java
 * @Description : Comthemaildsptchmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthemaildsptchmanageVO extends ComthemaildsptchmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String mssageId;
    
    /**  */
    private int emailCn;
    
    /**  */
    private String sndr;
    
    /**  */
    private String rcver;
    
    /**  */
    private String sj;
    
    /**  */
    private String sndngResultCode;
    
    /**  */
    private String dsptchDt;
    
    /**  */
    private String atchFileId;
    
    public String getMssageId() {
        return this.mssageId;
    }
    
    public void setMssageId(String mssageId) {
        this.mssageId = mssageId;
    }
    
    public int getEmailCn() {
        return this.emailCn;
    }
    
    public void setEmailCn(int emailCn) {
        this.emailCn = emailCn;
    }
    
    public String getSndr() {
        return this.sndr;
    }
    
    public void setSndr(String sndr) {
        this.sndr = sndr;
    }
    
    public String getRcver() {
        return this.rcver;
    }
    
    public void setRcver(String rcver) {
        this.rcver = rcver;
    }
    
    public String getSj() {
        return this.sj;
    }
    
    public void setSj(String sj) {
        this.sj = sj;
    }
    
    public String getSndngResultCode() {
        return this.sndngResultCode;
    }
    
    public void setSndngResultCode(String sndngResultCode) {
        this.sndngResultCode = sndngResultCode;
    }
    
    public String getDsptchDt() {
        return this.dsptchDt;
    }
    
    public void setDsptchDt(String dsptchDt) {
        this.dsptchDt = dsptchDt;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
}
