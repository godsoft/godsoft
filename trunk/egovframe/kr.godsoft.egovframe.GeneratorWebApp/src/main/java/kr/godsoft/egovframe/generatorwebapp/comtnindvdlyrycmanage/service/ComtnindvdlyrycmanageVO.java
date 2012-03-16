package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service;

/**
 * @Class Name : ComtnindvdlyrycmanageVO.java
 * @Description : Comtnindvdlyrycmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnindvdlyrycmanageVO extends ComtnindvdlyrycmanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OCCRRNC_YEAR */
    private String occrrncYear;
    
    /** YRYC_OCCRRNC_CO */
    private int yrycOccrrncCo;
    
    /** USE_YRYC_CO */
    private int useYrycCo;
    
    /** REMNDR_YRYC_CO */
    private int remndrYrycCo;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** USER_ID */
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
