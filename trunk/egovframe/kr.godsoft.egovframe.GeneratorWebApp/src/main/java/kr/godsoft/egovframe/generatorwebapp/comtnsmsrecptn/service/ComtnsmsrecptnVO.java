package kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service;

/**
 * @Class Name : ComtnsmsrecptnVO.java
 * @Description : Comtnsmsrecptn VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsmsrecptnVO extends ComtnsmsrecptnDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String smsId;
    
    /**  */
    private String recptnTelno;
    
    /**  */
    private String resultCode;
    
    /**  */
    private String resultMssage;
    
    public String getSmsId() {
        return this.smsId;
    }
    
    public void setSmsId(String smsId) {
        this.smsId = smsId;
    }
    
    public String getRecptnTelno() {
        return this.recptnTelno;
    }
    
    public void setRecptnTelno(String recptnTelno) {
        this.recptnTelno = recptnTelno;
    }
    
    public String getResultCode() {
        return this.resultCode;
    }
    
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    
    public String getResultMssage() {
        return this.resultMssage;
    }
    
    public void setResultMssage(String resultMssage) {
        this.resultMssage = resultMssage;
    }
    
}
