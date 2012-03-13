package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service;

/**
 * @Class Name : ComtnmenuinfoVO.java
 * @Description : Comtnmenuinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmenuinfoVO extends ComtnmenuinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String menuNm;
    
    /**  */
    private String progrmFileNm;
    
    /**  */
    private int menuNo;
    
    /**  */
    private int upperMenuNo;
    
    /**  */
    private int menuOrdr;
    
    /**  */
    private String menuDc;
    
    /**  */
    private String relateImagePath;
    
    /**  */
    private String relateImageNm;
    
    public String getMenuNm() {
        return this.menuNm;
    }
    
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }
    
    public String getProgrmFileNm() {
        return this.progrmFileNm;
    }
    
    public void setProgrmFileNm(String progrmFileNm) {
        this.progrmFileNm = progrmFileNm;
    }
    
    public int getMenuNo() {
        return this.menuNo;
    }
    
    public void setMenuNo(int menuNo) {
        this.menuNo = menuNo;
    }
    
    public int getUpperMenuNo() {
        return this.upperMenuNo;
    }
    
    public void setUpperMenuNo(int upperMenuNo) {
        this.upperMenuNo = upperMenuNo;
    }
    
    public int getMenuOrdr() {
        return this.menuOrdr;
    }
    
    public void setMenuOrdr(int menuOrdr) {
        this.menuOrdr = menuOrdr;
    }
    
    public String getMenuDc() {
        return this.menuDc;
    }
    
    public void setMenuDc(String menuDc) {
        this.menuDc = menuDc;
    }
    
    public String getRelateImagePath() {
        return this.relateImagePath;
    }
    
    public void setRelateImagePath(String relateImagePath) {
        this.relateImagePath = relateImagePath;
    }
    
    public String getRelateImageNm() {
        return this.relateImageNm;
    }
    
    public void setRelateImageNm(String relateImageNm) {
        this.relateImageNm = relateImageNm;
    }
    
}
