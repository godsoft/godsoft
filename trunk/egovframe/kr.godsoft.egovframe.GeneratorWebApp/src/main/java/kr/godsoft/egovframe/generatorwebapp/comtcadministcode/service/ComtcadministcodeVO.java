package kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service;

/**
 * @Class Name : ComtcadministcodeVO.java
 * @Description : Comtcadministcode VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtcadministcodeVO extends ComtcadministcodeDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** 행정구역구분 */
    private String administZoneSe;
    
    /** 행정구역코드 */
    private String administZoneCode;
    
    /** 사용여부 */
    private String useAt;
    
    /** 행정구역명 */
    private String administZoneNm;
    
    /** 상위행정구역코드 */
    private String upperAdministZoneCode;
    
    /** 생성일자 */
    private String creatDe;
    
    /** 폐지일자 */
    private String ablDe;
    
    /** 최초등록시점 */
    private String frstRegistPnttm;
    
    /** 최초등록자ID */
    private String frstRegisterId;
    
    /** 최종수정시점 */
    private String lastUpdtPnttm;
    
    /** 최종수정자ID */
    private String lastUpdusrId;
    
    public String getAdministZoneSe() {
        return this.administZoneSe;
    }
    
    public void setAdministZoneSe(String administZoneSe) {
        this.administZoneSe = administZoneSe;
    }
    
    public String getAdministZoneCode() {
        return this.administZoneCode;
    }
    
    public void setAdministZoneCode(String administZoneCode) {
        this.administZoneCode = administZoneCode;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getAdministZoneNm() {
        return this.administZoneNm;
    }
    
    public void setAdministZoneNm(String administZoneNm) {
        this.administZoneNm = administZoneNm;
    }
    
    public String getUpperAdministZoneCode() {
        return this.upperAdministZoneCode;
    }
    
    public void setUpperAdministZoneCode(String upperAdministZoneCode) {
        this.upperAdministZoneCode = upperAdministZoneCode;
    }
    
    public String getCreatDe() {
        return this.creatDe;
    }
    
    public void setCreatDe(String creatDe) {
        this.creatDe = creatDe;
    }
    
    public String getAblDe() {
        return this.ablDe;
    }
    
    public void setAblDe(String ablDe) {
        this.ablDe = ablDe;
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
