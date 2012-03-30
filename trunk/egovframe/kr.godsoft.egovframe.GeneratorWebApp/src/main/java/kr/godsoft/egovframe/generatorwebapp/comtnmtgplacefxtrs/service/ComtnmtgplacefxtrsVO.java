package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service;

/**
 * @Class Name : ComtnmtgplacefxtrsVO.java
 * @Description : Comtnmtgplacefxtrs VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmtgplacefxtrsVO extends ComtnmtgplacefxtrsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MTGRUM_ID */
    private String mtgrumId;
    
    /** FXTRS_CODE */
    private String fxtrsCode;
    
    /** QY */
    private String qy;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getMtgrumId() {
        return this.mtgrumId;
    }
    
    public void setMtgrumId(String mtgrumId) {
        this.mtgrumId = mtgrumId;
    }
    
    public String getFxtrsCode() {
        return this.fxtrsCode;
    }
    
    public void setFxtrsCode(String fxtrsCode) {
        this.fxtrsCode = fxtrsCode;
    }
    
    public String getQy() {
        return this.qy;
    }
    
    public void setQy(String qy) {
        this.qy = qy;
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
