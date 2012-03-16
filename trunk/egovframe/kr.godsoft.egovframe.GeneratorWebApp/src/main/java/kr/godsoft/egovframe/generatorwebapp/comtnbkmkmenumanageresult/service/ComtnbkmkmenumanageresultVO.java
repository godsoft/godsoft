package kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service;

/**
 * @Class Name : ComtnbkmkmenumanageresultVO.java
 * @Description : Comtnbkmkmenumanageresult VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbkmkmenumanageresultVO extends ComtnbkmkmenumanageresultDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MENU_ID */
    private int menuId;
    
    /** EMPLYR_ID */
    private String emplyrId;
    
    /** MENU_NM */
    private String menuNm;
    
    /** PROGRM_STRE_PATH */
    private String progrmStrePath;
    
    public int getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
    public String getMenuNm() {
        return this.menuNm;
    }
    
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }
    
    public String getProgrmStrePath() {
        return this.progrmStrePath;
    }
    
    public void setProgrmStrePath(String progrmStrePath) {
        this.progrmStrePath = progrmStrePath;
    }
    
}
