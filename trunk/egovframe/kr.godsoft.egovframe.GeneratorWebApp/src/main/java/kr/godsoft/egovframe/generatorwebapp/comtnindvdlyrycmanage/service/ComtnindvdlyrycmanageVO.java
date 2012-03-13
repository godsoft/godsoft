package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service;

/**
 * @Class Name : ComtnindvdlyrycmanageVO.java
 * @Description : Comtnindvdlyrycmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnindvdlyrycmanageVO extends ComtnindvdlyrycmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String occrrncYear;
    
    /**  */
    private int yrycOccrrncCo;
    
    /**  */
    private int useYrycCo;
    
    /**  */
    private int remndrYrycCo;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String userId;
    
    public String getOccrrncYear() {
        return this.occrrncYear;
    }
    
    public void setOccrrncYear(String occrrncYear) {
        this.occrrncYear = occrrncYear;
    }
    
    public int getYrycOccrrncCo() {
        return this.yrycOccrrncCo;
    }
    
    public void setYrycOccrrncCo(int yrycOccrrncCo) {
        this.yrycOccrrncCo = yrycOccrrncCo;
    }
    
    public int getUseYrycCo() {
        return this.useYrycCo;
    }
    
    public void setUseYrycCo(int useYrycCo) {
        this.useYrycCo = useYrycCo;
    }
    
    public int getRemndrYrycCo() {
        return this.remndrYrycCo;
    }
    
    public void setRemndrYrycCo(int remndrYrycCo) {
        this.remndrYrycCo = remndrYrycCo;
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
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
