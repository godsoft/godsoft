package kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service;

/**
 * @Class Name : ComthconfmhistoryVO.java
 * @Description : Comthconfmhistory VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthconfmhistoryVO extends ComthconfmhistoryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CONFM_NO */
    private int confmNo;
    
    /** CONFM_RQESTER_ID */
    private String confmRqesterId;
    
    /** CONFMER_ID */
    private String confmerId;
    
    /** CONFM_DE */
    private String confmDe;
    
    /** CONFM_TY_CODE */
    private String confmTyCode;
    
    /** CONFM_STTUS_CODE */
    private String confmSttusCode;
    
    /** OPERT_TY_CODE */
    private String opertTyCode;
    
    /** OPERT_ID */
    private String opertId;
    
    /** TRGET_JOB_TY_CODE */
    private String trgetJobTyCode;
    
    /** TRGET_JOB_ID */
    private String trgetJobId;
    
    public int getConfmNo() {
        return this.confmNo;
    }
    
    public void setConfmNo(int confmNo) {
        this.confmNo = confmNo;
    }
    
    public String getConfmRqesterId() {
        return this.confmRqesterId;
    }
    
    public void setConfmRqesterId(String confmRqesterId) {
        this.confmRqesterId = confmRqesterId;
    }
    
    public String getConfmerId() {
        return this.confmerId;
    }
    
    public void setConfmerId(String confmerId) {
        this.confmerId = confmerId;
    }
    
    public String getConfmDe() {
        return this.confmDe;
    }
    
    public void setConfmDe(String confmDe) {
        this.confmDe = confmDe;
    }
    
    public String getConfmTyCode() {
        return this.confmTyCode;
    }
    
    public void setConfmTyCode(String confmTyCode) {
        this.confmTyCode = confmTyCode;
    }
    
    public String getConfmSttusCode() {
        return this.confmSttusCode;
    }
    
    public void setConfmSttusCode(String confmSttusCode) {
        this.confmSttusCode = confmSttusCode;
    }
    
    public String getOpertTyCode() {
        return this.opertTyCode;
    }
    
    public void setOpertTyCode(String opertTyCode) {
        this.opertTyCode = opertTyCode;
    }
    
    public String getOpertId() {
        return this.opertId;
    }
    
    public void setOpertId(String opertId) {
        this.opertId = opertId;
    }
    
    public String getTrgetJobTyCode() {
        return this.trgetJobTyCode;
    }
    
    public void setTrgetJobTyCode(String trgetJobTyCode) {
        this.trgetJobTyCode = trgetJobTyCode;
    }
    
    public String getTrgetJobId() {
        return this.trgetJobId;
    }
    
    public void setTrgetJobId(String trgetJobId) {
        this.trgetJobId = trgetJobId;
    }
    
}
