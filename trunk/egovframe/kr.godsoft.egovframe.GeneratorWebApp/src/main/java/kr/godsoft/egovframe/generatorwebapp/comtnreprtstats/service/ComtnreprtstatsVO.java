package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service;

/**
 * @Class Name : ComtnreprtstatsVO.java
 * @Description : Comtnreprtstats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnreprtstatsVO extends ComtnreprtstatsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** REPRT_ID */
    private String reprtId;
    
    /** REPRT_NM */
    private String reprtNm;
    
    /** REPRT_STTUS */
    private String reprtSttus;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** REPRT_TY */
    private String reprtTy;
    
    public String getReprtId() {
        return this.reprtId;
    }
    
    public void setReprtId(String reprtId) {
        this.reprtId = reprtId;
    }
    
    public String getReprtNm() {
        return this.reprtNm;
    }
    
    public void setReprtNm(String reprtNm) {
        this.reprtNm = reprtNm;
    }
    
    public String getReprtSttus() {
        return this.reprtSttus;
    }
    
    public void setReprtSttus(String reprtSttus) {
        this.reprtSttus = reprtSttus;
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
    
    public String getReprtTy() {
        return this.reprtTy;
    }
    
    public void setReprtTy(String reprtTy) {
        this.reprtTy = reprtTy;
    }
    
}
