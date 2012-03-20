package kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service;

/**
 * @Class Name : ComtnstsfdgVO.java
 * @Description : Comtnstsfdg VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnstsfdgVO extends ComtnstsfdgDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** STSFDG_NO */
    private int stsfdgNo;
    
    /** NTT_ID */
    private int nttId;
    
    /** BBS_ID */
    private String bbsId;
    
    /** WRTER_ID */
    private String wrterId;
    
    /** WRTER_NM */
    private String wrterNm;
    
    /** PASSWORD */
    private String password;
    
    /** STSFDG */
    private int stsfdg;
    
    /** STSFDG_CN */
    private String stsfdgCn;
    
    /** USE_AT */
    private String useAt;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    public int getStsfdgNo() {
        return this.stsfdgNo;
    }
    
    public void setStsfdgNo(int stsfdgNo) {
        this.stsfdgNo = stsfdgNo;
    }
    
    public int getNttId() {
        return this.nttId;
    }
    
    public void setNttId(int nttId) {
        this.nttId = nttId;
    }
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getWrterId() {
        return this.wrterId;
    }
    
    public void setWrterId(String wrterId) {
        this.wrterId = wrterId;
    }
    
    public String getWrterNm() {
        return this.wrterNm;
    }
    
    public void setWrterNm(String wrterNm) {
        this.wrterNm = wrterNm;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getStsfdg() {
        return this.stsfdg;
    }
    
    public void setStsfdg(int stsfdg) {
        this.stsfdg = stsfdg;
    }
    
    public String getStsfdgCn() {
        return this.stsfdgCn;
    }
    
    public void setStsfdgCn(String stsfdgCn) {
        this.stsfdgCn = stsfdgCn;
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
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
