package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service;

/**
 * @Class Name : ComtnmenuinfoVO.java
 * @Description : Comtnmenuinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmenuinfoVO extends ComtnmenuinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MENU_NM */
    private String menuNm;
    
    /** PROGRM_FILE_NM */
    private String progrmFileNm;
    
    /** MENU_NO */
    private String menuNo;
    
    /** UPPER_MENU_NO */
    private String upperMenuNo;
    
    /** MENU_ORDR */
    private String menuOrdr;
    
    /** MENU_DC */
    private String menuDc;
    
    /** RELATE_IMAGE_PATH */
    private String relateImagePath;
    
    /** RELATE_IMAGE_NM */
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
    
    public String getMenuNo() {
        return this.menuNo;
    }
    
    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }
    
    public String getUpperMenuNo() {
        return this.upperMenuNo;
    }
    
    public void setUpperMenuNo(String upperMenuNo) {
        this.upperMenuNo = upperMenuNo;
    }
    
    public String getMenuOrdr() {
        return this.menuOrdr;
    }
    
    public void setMenuOrdr(String menuOrdr) {
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
