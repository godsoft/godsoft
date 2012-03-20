package kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service;

/**
 * @Class Name : ComtccmmnclcodeVO.java
 * @Description : Comtccmmnclcode VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtccmmnclcodeVO extends ComtccmmnclcodeDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CL_CODE */
    private String clCode;
    
    /** CL_CODE_NM */
    private String clCodeNm;
    
    /** CL_CODE_DC */
    private String clCodeDc;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public String getClCode() {
        return this.clCode;
    }
    
    public void setClCode(String clCode) {
        this.clCode = clCode;
    }
    
    public String getClCodeNm() {
        return this.clCodeNm;
    }
    
    public void setClCodeNm(String clCodeNm) {
        this.clCodeNm = clCodeNm;
    }
    
    public String getClCodeDc() {
        return this.clCodeDc;
    }
    
    public void setClCodeDc(String clCodeDc) {
        this.clCodeDc = clCodeDc;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
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
