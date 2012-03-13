package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service;

/**
 * @Class Name : ComtndiaryinfoVO.java
 * @Description : Comtndiaryinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndiaryinfoVO extends ComtndiaryinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String schdulId;
    
    /**  */
    private String diaryId;
    
    /**  */
    private int diaryProgrsrt;
    
    /**  */
    private String diaryNm;
    
    /**  */
    private String drctMatter;
    
    /**  */
    private String partclrMatter;
    
    /**  */
    private String atchFileId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    public String getSchdulId() {
        return this.schdulId;
    }
    
    public void setSchdulId(String schdulId) {
        this.schdulId = schdulId;
    }
    
    public String getDiaryId() {
        return this.diaryId;
    }
    
    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }
    
    public int getDiaryProgrsrt() {
        return this.diaryProgrsrt;
    }
    
    public void setDiaryProgrsrt(int diaryProgrsrt) {
        this.diaryProgrsrt = diaryProgrsrt;
    }
    
    public String getDiaryNm() {
        return this.diaryNm;
    }
    
    public void setDiaryNm(String diaryNm) {
        this.diaryNm = diaryNm;
    }
    
    public String getDrctMatter() {
        return this.drctMatter;
    }
    
    public void setDrctMatter(String drctMatter) {
        this.drctMatter = drctMatter;
    }
    
    public String getPartclrMatter() {
        return this.partclrMatter;
    }
    
    public void setPartclrMatter(String partclrMatter) {
        this.partclrMatter = partclrMatter;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
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
