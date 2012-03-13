package kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service;

/**
 * @Class Name : ComtncntcmessageitemVO.java
 * @Description : Comtncntcmessageitem VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcmessageitemVO extends ComtncntcmessageitemDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String cntcMssageId;
    
    /**  */
    private String iemId;
    
    /**  */
    private String iemNm;
    
    /**  */
    private String iemTy;
    
    /**  */
    private int iemLt;
    
    /**  */
    private String useAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getCntcMssageId() {
        return this.cntcMssageId;
    }
    
    public void setCntcMssageId(String cntcMssageId) {
        this.cntcMssageId = cntcMssageId;
    }
    
    public String getIemId() {
        return this.iemId;
    }
    
    public void setIemId(String iemId) {
        this.iemId = iemId;
    }
    
    public String getIemNm() {
        return this.iemNm;
    }
    
    public void setIemNm(String iemNm) {
        this.iemNm = iemNm;
    }
    
    public String getIemTy() {
        return this.iemTy;
    }
    
    public void setIemTy(String iemTy) {
        this.iemTy = iemTy;
    }
    
    public int getIemLt() {
        return this.iemLt;
    }
    
    public void setIemLt(int iemLt) {
        this.iemLt = iemLt;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
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