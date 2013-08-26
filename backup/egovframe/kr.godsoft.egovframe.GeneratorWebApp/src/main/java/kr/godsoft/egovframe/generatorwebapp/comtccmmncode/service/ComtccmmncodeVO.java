package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service;

/**
 * @Class Name : ComtccmmncodeVO.java
 * @Description : Comtccmmncode VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtccmmncodeVO extends ComtccmmncodeDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CODE_ID */
    private String codeId;
    
    /** CODE_ID_NM */
    private String codeIdNm;
    
    /** CODE_ID_DC */
    private String codeIdDc;
    
    /** USE_AT */
    private String useAt;
    
    /** CL_CODE */
    private String clCode;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getCodeId() {
        return this.codeId;
    }
    
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }
    
    public String getCodeIdNm() {
        return this.codeIdNm;
    }
    
    public void setCodeIdNm(String codeIdNm) {
        this.codeIdNm = codeIdNm;
    }
    
    public String getCodeIdDc() {
        return this.codeIdDc;
    }
    
    public void setCodeIdDc(String codeIdDc) {
        this.codeIdDc = codeIdDc;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getClCode() {
        return this.clCode;
    }
    
    public void setClCode(String clCode) {
        this.clCode = clCode;
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
