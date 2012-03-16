package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service;

/**
 * @Class Name : ComtndammapteamVO.java
 * @Description : Comtndammapteam VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndammapteamVO extends ComtndammapteamDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ORGNZT_ID */
    private String orgnztId;
    
    /** ORGNZT_NM */
    private String orgnztNm;
    
    /** CL_DE */
    private String clDe;
    
    /** KNWLDG_URL */
    private String knwldgUrl;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getOrgnztId() {
        return this.orgnztId;
    }
    
    public void setOrgnztId(String orgnztId) {
        this.orgnztId = orgnztId;
    }
    
    public String getOrgnztNm() {
        return this.orgnztNm;
    }
    
    public void setOrgnztNm(String orgnztNm) {
        this.orgnztNm = orgnztNm;
    }
    
    public String getClDe() {
        return this.clDe;
    }
    
    public void setClDe(String clDe) {
        this.clDe = clDe;
    }
    
    public String getKnwldgUrl() {
        return this.knwldgUrl;
    }
    
    public void setKnwldgUrl(String knwldgUrl) {
        this.knwldgUrl = knwldgUrl;
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
