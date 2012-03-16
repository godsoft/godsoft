package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service;

/**
 * @Class Name : ComtndeptjobVO.java
 * @Description : Comtndeptjob VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndeptjobVO extends ComtndeptjobDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** DEPT_JOB_ID */
    private String deptJobId;
    
    /** DEPT_JOBBX_ID */
    private String deptJobbxId;
    
    /** DEPT_JOB_NM */
    private String deptJobNm;
    
    /** DEPT_JOB_CN */
    private String deptJobCn;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** CHARGER_ID */
    private String chargerId;
    
    /** PRIORT */
    private String priort;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getDeptJobId() {
        return this.deptJobId;
    }
    
    public void setDeptJobId(String deptJobId) {
        this.deptJobId = deptJobId;
    }
    
    public String getDeptJobbxId() {
        return this.deptJobbxId;
    }
    
    public void setDeptJobbxId(String deptJobbxId) {
        this.deptJobbxId = deptJobbxId;
    }
    
    public String getDeptJobNm() {
        return this.deptJobNm;
    }
    
    public void setDeptJobNm(String deptJobNm) {
        this.deptJobNm = deptJobNm;
    }
    
    public String getDeptJobCn() {
        return this.deptJobCn;
    }
    
    public void setDeptJobCn(String deptJobCn) {
        this.deptJobCn = deptJobCn;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
    public String getChargerId() {
        return this.chargerId;
    }
    
    public void setChargerId(String chargerId) {
        this.chargerId = chargerId;
    }
    
    public String getPriort() {
        return this.priort;
    }
    
    public void setPriort(String priort) {
        this.priort = priort;
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
