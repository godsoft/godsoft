package kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service;

/**
 * @Class Name : ComtnbatchopertVO.java
 * @Description : Comtnbatchopert VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbatchopertVO extends ComtnbatchopertDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String batchOpertId;
    
    /**  */
    private String batchOpertNm;
    
    /**  */
    private String batchProgrm;
    
    /**  */
    private String paramtr;
    
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
    
    public String getBatchOpertId() {
        return this.batchOpertId;
    }
    
    public void setBatchOpertId(String batchOpertId) {
        this.batchOpertId = batchOpertId;
    }
    
    public String getBatchOpertNm() {
        return this.batchOpertNm;
    }
    
    public void setBatchOpertNm(String batchOpertNm) {
        this.batchOpertNm = batchOpertNm;
    }
    
    public String getBatchProgrm() {
        return this.batchProgrm;
    }
    
    public void setBatchProgrm(String batchProgrm) {
        this.batchProgrm = batchProgrm;
    }
    
    public String getParamtr() {
        return this.paramtr;
    }
    
    public void setParamtr(String paramtr) {
        this.paramtr = paramtr;
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
