package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service;

/**
 * @Class Name : ComtnonlinemanualVO.java
 * @Description : Comtnonlinemanual VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnonlinemanualVO extends ComtnonlinemanualDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String onlineMnlId;
    
    /**  */
    private String onlineMnlSeCode;
    
    /**  */
    private int onlineMnlDfn;
    
    /**  */
    private int onlineMnlDc;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String onlineMnlNm;
    
    public String getOnlineMnlId() {
        return this.onlineMnlId;
    }
    
    public void setOnlineMnlId(String onlineMnlId) {
        this.onlineMnlId = onlineMnlId;
    }
    
    public String getOnlineMnlSeCode() {
        return this.onlineMnlSeCode;
    }
    
    public void setOnlineMnlSeCode(String onlineMnlSeCode) {
        this.onlineMnlSeCode = onlineMnlSeCode;
    }
    
    public int getOnlineMnlDfn() {
        return this.onlineMnlDfn;
    }
    
    public void setOnlineMnlDfn(int onlineMnlDfn) {
        this.onlineMnlDfn = onlineMnlDfn;
    }
    
    public int getOnlineMnlDc() {
        return this.onlineMnlDc;
    }
    
    public void setOnlineMnlDc(int onlineMnlDc) {
        this.onlineMnlDc = onlineMnlDc;
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
    
    public String getOnlineMnlNm() {
        return this.onlineMnlNm;
    }
    
    public void setOnlineMnlNm(String onlineMnlNm) {
        this.onlineMnlNm = onlineMnlNm;
    }
    
}
