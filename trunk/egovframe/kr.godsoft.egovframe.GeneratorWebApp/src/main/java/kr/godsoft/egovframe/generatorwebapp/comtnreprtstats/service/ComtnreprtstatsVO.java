package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service;

/**
 * @Class Name : ComtnreprtstatsVO.java
 * @Description : Comtnreprtstats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnreprtstatsVO extends ComtnreprtstatsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String reprtId;
    
    /**  */
    private String reprtNm;
    
    /**  */
    private String reprtSttus;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
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
