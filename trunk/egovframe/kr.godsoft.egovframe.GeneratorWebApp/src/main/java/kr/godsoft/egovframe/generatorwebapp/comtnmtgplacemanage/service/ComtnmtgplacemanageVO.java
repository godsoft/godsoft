package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service;

/**
 * @Class Name : ComtnmtgplacemanageVO.java
 * @Description : Comtnmtgplacemanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmtgplacemanageVO extends ComtnmtgplacemanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MTGRUM_ID */
    private String mtgrumId;
    
    /** MTGRUM_NM */
    private String mtgrumNm;
    
    /** OPN_BEGIN_TM */
    private String opnBeginTm;
    
    /** OPN_END_TM */
    private String opnEndTm;
    
    /** ACEPTNC_POSBL_NMPR */
    private int aceptncPosblNmpr;
    
    /** LC_SE */
    private String lcSe;
    
    /** LC_DETAIL */
    private String lcDetail;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getMtgrumId() {
        return this.mtgrumId;
    }
    
    public void setMtgrumId(String mtgrumId) {
        this.mtgrumId = mtgrumId;
    }
    
    public String getMtgrumNm() {
        return this.mtgrumNm;
    }
    
    public void setMtgrumNm(String mtgrumNm) {
        this.mtgrumNm = mtgrumNm;
    }
    
    public String getOpnBeginTm() {
        return this.opnBeginTm;
    }
    
    public void setOpnBeginTm(String opnBeginTm) {
        this.opnBeginTm = opnBeginTm;
    }
    
    public String getOpnEndTm() {
        return this.opnEndTm;
    }
    
    public void setOpnEndTm(String opnEndTm) {
        this.opnEndTm = opnEndTm;
    }
    
    public int getAceptncPosblNmpr() {
        return this.aceptncPosblNmpr;
    }
    
    public void setAceptncPosblNmpr(int aceptncPosblNmpr) {
        this.aceptncPosblNmpr = aceptncPosblNmpr;
    }
    
    public String getLcSe() {
        return this.lcSe;
    }
    
    public void setLcSe(String lcSe) {
        this.lcSe = lcSe;
    }
    
    public String getLcDetail() {
        return this.lcDetail;
    }
    
    public void setLcDetail(String lcDetail) {
        this.lcDetail = lcDetail;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
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
