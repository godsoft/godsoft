package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service;

/**
 * @Class Name : ComtnindvdlpgeestbsVO.java
 * @Description : Comtnindvdlpgeestbs VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnindvdlpgeestbsVO extends ComtnindvdlpgeestbsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String emplyrId;
    
    /**  */
    private String upendImage;
    
    /**  */
    private String titlebarColor;
    
    /**  */
    private String algnMthd;
    
    /**  */
    private int algnCo;
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
    public String getUpendImage() {
        return this.upendImage;
    }
    
    public void setUpendImage(String upendImage) {
        this.upendImage = upendImage;
    }
    
    public String getTitlebarColor() {
        return this.titlebarColor;
    }
    
    public void setTitlebarColor(String titlebarColor) {
        this.titlebarColor = titlebarColor;
    }
    
    public String getAlgnMthd() {
        return this.algnMthd;
    }
    
    public void setAlgnMthd(String algnMthd) {
        this.algnMthd = algnMthd;
    }
    
    public int getAlgnCo() {
        return this.algnCo;
    }
    
    public void setAlgnCo(int algnCo) {
        this.algnCo = algnCo;
    }
    
}
