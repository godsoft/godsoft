package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service;

/**
 * @Class Name : ComtndammapteamVO.java
 * @Description : Comtndammapteam VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndammapteamVO extends ComtndammapteamDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String orgnztId;
    
    /**  */
    private String orgnztNm;
    
    /**  */
    private String clDe;
    
    /**  */
    private String knwldgUrl;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
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
