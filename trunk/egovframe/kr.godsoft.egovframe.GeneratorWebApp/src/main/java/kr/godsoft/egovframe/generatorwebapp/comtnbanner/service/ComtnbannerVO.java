package kr.godsoft.egovframe.generatorwebapp.comtnbanner.service;

/**
 * @Class Name : ComtnbannerVO.java
 * @Description : Comtnbanner VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbannerVO extends ComtnbannerDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String bannerId;
    
    /**  */
    private String bannerNm;
    
    /**  */
    private String linkUrl;
    
    /**  */
    private String bannerImage;
    
    /**  */
    private String bannerDc;
    
    /**  */
    private String reflctAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String bannerImageFile;
    
    /**  */
    private int sortOrdr;
    
    public String getBannerId() {
        return this.bannerId;
    }
    
    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }
    
    public String getBannerNm() {
        return this.bannerNm;
    }
    
    public void setBannerNm(String bannerNm) {
        this.bannerNm = bannerNm;
    }
    
    public String getLinkUrl() {
        return this.linkUrl;
    }
    
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
    
    public String getBannerImage() {
        return this.bannerImage;
    }
    
    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }
    
    public String getBannerDc() {
        return this.bannerDc;
    }
    
    public void setBannerDc(String bannerDc) {
        this.bannerDc = bannerDc;
    }
    
    public String getReflctAt() {
        return this.reflctAt;
    }
    
    public void setReflctAt(String reflctAt) {
        this.reflctAt = reflctAt;
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
    
    public String getBannerImageFile() {
        return this.bannerImageFile;
    }
    
    public void setBannerImageFile(String bannerImageFile) {
        this.bannerImageFile = bannerImageFile;
    }
    
    public int getSortOrdr() {
        return this.sortOrdr;
    }
    
    public void setSortOrdr(int sortOrdr) {
        this.sortOrdr = sortOrdr;
    }
    
}
