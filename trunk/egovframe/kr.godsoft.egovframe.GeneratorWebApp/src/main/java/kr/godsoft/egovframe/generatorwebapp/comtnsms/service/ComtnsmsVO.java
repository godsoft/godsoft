package kr.godsoft.egovframe.generatorwebapp.comtnsms.service;

/**
 * @Class Name : ComtnsmsVO.java
 * @Description : Comtnsms VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsmsVO extends ComtnsmsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String smsId;
    
    /**  */
    private String trnsmisTelno;
    
    /**  */
    private String trnsmisCn;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    public String getSmsId() {
        return this.smsId;
    }
    
    public void setSmsId(String smsId) {
        this.smsId = smsId;
    }
    
    public String getTrnsmisTelno() {
        return this.trnsmisTelno;
    }
    
    public void setTrnsmisTelno(String trnsmisTelno) {
        this.trnsmisTelno = trnsmisTelno;
    }
    
    public String getTrnsmisCn() {
        return this.trnsmisCn;
    }
    
    public void setTrnsmisCn(String trnsmisCn) {
        this.trnsmisCn = trnsmisCn;
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
    
}