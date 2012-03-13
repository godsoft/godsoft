package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service;

/**
 * @Class Name : ComtnstplatinfoVO.java
 * @Description : Comtnstplatinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnstplatinfoVO extends ComtnstplatinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String useStplatId;
    
    /**  */
    private String useStplatNm;
    
    /**  */
    private int useStplatCn;
    
    /**  */
    private int infoProvdAgreCn;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    public String getUseStplatId() {
        return this.useStplatId;
    }
    
    public void setUseStplatId(String useStplatId) {
        this.useStplatId = useStplatId;
    }
    
    public String getUseStplatNm() {
        return this.useStplatNm;
    }
    
    public void setUseStplatNm(String useStplatNm) {
        this.useStplatNm = useStplatNm;
    }
    
    public int getUseStplatCn() {
        return this.useStplatCn;
    }
    
    public void setUseStplatCn(int useStplatCn) {
        this.useStplatCn = useStplatCn;
    }
    
    public int getInfoProvdAgreCn() {
        return this.infoProvdAgreCn;
    }
    
    public void setInfoProvdAgreCn(int infoProvdAgreCn) {
        this.infoProvdAgreCn = infoProvdAgreCn;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
