package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service;

/**
 * @Class Name : ComtccmmncodeVO.java
 * @Description : Comtccmmncode VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtccmmncodeVO extends ComtccmmncodeDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String codeId;
    
    /**  */
    private String codeIdNm;
    
    /**  */
    private String codeIdDc;
    
    /**  */
    private String useAt;
    
    /**  */
    private String clCode;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
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
