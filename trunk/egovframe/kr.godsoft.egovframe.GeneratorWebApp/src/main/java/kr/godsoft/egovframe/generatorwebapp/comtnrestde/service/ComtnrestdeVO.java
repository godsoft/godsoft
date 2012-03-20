package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service;

/**
 * @Class Name : ComtnrestdeVO.java
 * @Description : Comtnrestde VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnrestdeVO extends ComtnrestdeDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** RESTDE_NO */
    private int restdeNo;
    
    /** RESTDE */
    private String restde;
    
    /** RESTDE_NM */
    private String restdeNm;
    
    /** RESTDE_DC */
    private String restdeDc;
    
    /** RESTDE_SE_CODE */
    private String restdeSeCode;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public int getRestdeNo() {
        return this.restdeNo;
    }
    
    public void setRestdeNo(int restdeNo) {
        this.restdeNo = restdeNo;
    }
    
    public String getRestde() {
        return this.restde;
    }
    
    public void setRestde(String restde) {
        this.restde = restde;
    }
    
    public String getRestdeNm() {
        return this.restdeNm;
    }
    
    public void setRestdeNm(String restdeNm) {
        this.restdeNm = restdeNm;
    }
    
    public String getRestdeDc() {
        return this.restdeDc;
    }
    
    public void setRestdeDc(String restdeDc) {
        this.restdeDc = restdeDc;
    }
    
    public String getRestdeSeCode() {
        return this.restdeSeCode;
    }
    
    public void setRestdeSeCode(String restdeSeCode) {
        this.restdeSeCode = restdeSeCode;
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
