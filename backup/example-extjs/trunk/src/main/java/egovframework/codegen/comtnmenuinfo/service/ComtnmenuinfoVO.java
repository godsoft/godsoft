package egovframework.codegen.comtnmenuinfo.service;

/**
 * @Class Name : ComtnmenuinfoVO.java
 * @Description : Comtnmenuinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtnmenuinfoVO extends ComtnmenuinfoDefaultVO {
    private static final long serialVersionUID = 1L;

    /** menu_nm */
    private String menuNm;

    /** progrm_file_nm */
    private String progrmFileNm;

    /** menu_no */
    private int menuNo;

    /** upper_menu_no */
    private int upperMenuNo;

    /** menu_ordr */
    private int menuOrdr;

    /** menu_dc */
    private String menuDc;

    /** relate_image_path */
    private String relateImagePath;

    /** relate_image_nm */
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
