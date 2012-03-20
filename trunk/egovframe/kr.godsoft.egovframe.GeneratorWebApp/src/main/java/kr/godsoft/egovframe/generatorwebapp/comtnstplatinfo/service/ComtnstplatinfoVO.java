package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service;

/**
 * @Class Name : ComtnstplatinfoVO.java
 * @Description : Comtnstplatinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnstplatinfoVO extends ComtnstplatinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** USE_STPLAT_ID */
    private String useStplatId;
    
    /** USE_STPLAT_NM */
    private String useStplatNm;
    
    /** USE_STPLAT_CN */
    private String useStplatCn;
    
    /** INFO_PROVD_AGRE_CN */
    private String infoProvdAgreCn;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
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
    
    public String getUseStplatCn() {
        return this.useStplatCn;
    }
    
    public void setUseStplatCn(String useStplatCn) {
        this.useStplatCn = useStplatCn;
    }
    
    public String getInfoProvdAgreCn() {
        return this.infoProvdAgreCn;
    }
    
    public void setInfoProvdAgreCn(String infoProvdAgreCn) {
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
