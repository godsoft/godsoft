package kr.godsoft.egovframe.generatorwebapp.imgtemp.service;

/**
 * @Class Name : ImgtempVO.java
 * @Description : Imgtemp VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ImgtempVO extends ImgtempDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String orgnztCode;
    
    /**  */
    private String erncslSe;
    
    /**  */
    private int imageInfo;
    
    /**  */
    private String imageTy;
    
    public String getOrgnztCode() {
        return this.orgnztCode;
    }
    
    public void setOrgnztCode(String orgnztCode) {
        this.orgnztCode = orgnztCode;
    }
    
    public String getErncslSe() {
        return this.erncslSe;
    }
    
    public void setErncslSe(String erncslSe) {
        this.erncslSe = erncslSe;
    }
    
    public int getImageInfo() {
        return this.imageInfo;
    }
    
    public void setImageInfo(int imageInfo) {
        this.imageInfo = imageInfo;
    }
    
    public String getImageTy() {
        return this.imageTy;
    }
    
    public void setImageTy(String imageTy) {
        this.imageTy = imageTy;
    }
    
}
