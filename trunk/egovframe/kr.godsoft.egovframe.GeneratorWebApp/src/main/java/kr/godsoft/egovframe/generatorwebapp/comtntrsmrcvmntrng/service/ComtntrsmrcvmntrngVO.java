package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service;

/**
 * @Class Name : ComtntrsmrcvmntrngVO.java
 * @Description : Comtntrsmrcvmntrng VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtntrsmrcvmntrngVO extends ComtntrsmrcvmntrngDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String cntcId;
    
    /**  */
    private String testClassNm;
    
    /**  */
    private String mngrNm;
    
    /**  */
    private String mngrEmailAdres;
    
    /**  */
    private String mntrngSttus;
    
    /**  */
    private String creatDt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getCntcId() {
        return this.cntcId;
    }
    
    public void setCntcId(String cntcId) {
        this.cntcId = cntcId;
    }
    
    public String getTestClassNm() {
        return this.testClassNm;
    }
    
    public void setTestClassNm(String testClassNm) {
        this.testClassNm = testClassNm;
    }
    
    public String getMngrNm() {
        return this.mngrNm;
    }
    
    public void setMngrNm(String mngrNm) {
        this.mngrNm = mngrNm;
    }
    
    public String getMngrEmailAdres() {
        return this.mngrEmailAdres;
    }
    
    public void setMngrEmailAdres(String mngrEmailAdres) {
        this.mngrEmailAdres = mngrEmailAdres;
    }
    
    public String getMntrngSttus() {
        return this.mntrngSttus;
    }
    
    public void setMntrngSttus(String mntrngSttus) {
        this.mntrngSttus = mntrngSttus;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
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
