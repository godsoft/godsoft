package kr.godsoft.egovframe.generatorwebapp.comtczip.service;

/**
 * @Class Name : ComtczipVO.java
 * @Description : Comtczip VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtczipVO extends ComtczipDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ZIP */
    private String zip;
    
    /** SN */
    private int sn;
    
    /** CTPRVN_NM */
    private String ctprvnNm;
    
    /** SIGNGU_NM */
    private String signguNm;
    
    /** EMD_NM */
    private String emdNm;
    
    /** LI_BULD_NM */
    private String liBuldNm;
    
    /** LNBR_DONG_HO */
    private String lnbrDongHo;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public int getSn() {
        return this.sn;
    }
    
    public void setSn(int sn) {
        this.sn = sn;
    }
    
    public String getCtprvnNm() {
        return this.ctprvnNm;
    }
    
    public void setCtprvnNm(String ctprvnNm) {
        this.ctprvnNm = ctprvnNm;
    }
    
    public String getSignguNm() {
        return this.signguNm;
    }
    
    public void setSignguNm(String signguNm) {
        this.signguNm = signguNm;
    }
    
    public String getEmdNm() {
        return this.emdNm;
    }
    
    public void setEmdNm(String emdNm) {
        this.emdNm = emdNm;
    }
    
    public String getLiBuldNm() {
        return this.liBuldNm;
    }
    
    public void setLiBuldNm(String liBuldNm) {
        this.liBuldNm = liBuldNm;
    }
    
    public String getLnbrDongHo() {
        return this.lnbrDongHo;
    }
    
    public void setLnbrDongHo(String lnbrDongHo) {
        this.lnbrDongHo = lnbrDongHo;
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
