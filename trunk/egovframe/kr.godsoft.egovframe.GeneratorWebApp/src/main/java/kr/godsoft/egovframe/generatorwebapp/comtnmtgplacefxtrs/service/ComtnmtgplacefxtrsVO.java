package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service;

/**
 * @Class Name : ComtnmtgplacefxtrsVO.java
 * @Description : Comtnmtgplacefxtrs VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmtgplacefxtrsVO extends ComtnmtgplacefxtrsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String mtgrumId;
    
    /**  */
    private String fxtrsCode;
    
    /**  */
    private int qy;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
    
    public int getQy() {
        return this.qy;
    }
    
    public void setQy(int qy) {
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
