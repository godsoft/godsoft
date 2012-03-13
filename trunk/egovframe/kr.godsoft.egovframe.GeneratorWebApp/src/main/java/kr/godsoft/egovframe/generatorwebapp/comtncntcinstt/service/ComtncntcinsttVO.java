package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service;

/**
 * @Class Name : ComtncntcinsttVO.java
 * @Description : Comtncntcinstt VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcinsttVO extends ComtncntcinsttDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String insttId;
    
    /**  */
    private String insttNm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String useAt;
    
    public String getInsttId() {
        return this.insttId;
    }
    
    public void setInsttId(String insttId) {
        this.insttId = insttId;
    }
    
    public String getInsttNm() {
        return this.insttNm;
    }
    
    public void setInsttNm(String insttNm) {
        this.insttNm = insttNm;
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
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
}
