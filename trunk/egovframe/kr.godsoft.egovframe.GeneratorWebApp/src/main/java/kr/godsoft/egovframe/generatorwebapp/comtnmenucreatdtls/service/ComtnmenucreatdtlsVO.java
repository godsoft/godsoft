package kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service;

/**
 * @Class Name : ComtnmenucreatdtlsVO.java
 * @Description : Comtnmenucreatdtls VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmenucreatdtlsVO extends ComtnmenucreatdtlsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MENU_NO */
    private String menuNo;
    
    /** AUTHOR_CODE */
    private String authorCode;
    
    /** MAPNG_CREAT_ID */
    private String mapngCreatId;
    
    public String getMenuNo() {
        return this.menuNo;
    }
    
    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }
    
    public String getAuthorCode() {
        return this.authorCode;
    }
    
    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }
    
    public String getMapngCreatId() {
        return this.mapngCreatId;
    }
    
    public void setMapngCreatId(String mapngCreatId) {
        this.mapngCreatId = mapngCreatId;
    }
    
}
