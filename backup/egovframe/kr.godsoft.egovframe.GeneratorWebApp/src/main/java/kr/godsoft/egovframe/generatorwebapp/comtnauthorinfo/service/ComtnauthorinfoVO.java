package kr.godsoft.egovframe.generatorwebapp.comtnauthorinfo.service;

/**
 * @Class Name : ComtnauthorinfoVO.java
 * @Description : Comtnauthorinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnauthorinfoVO extends ComtnauthorinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** AUTHOR_CODE */
    private String authorCode;
    
    /** AUTHOR_NM */
    private String authorNm;
    
    /** AUTHOR_DC */
    private String authorDc;
    
    /** AUTHOR_CREAT_DE */
    private String authorCreatDe;
    
    public String getAuthorCode() {
        return this.authorCode;
    }
    
    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }
    
    public String getAuthorNm() {
        return this.authorNm;
    }
    
    public void setAuthorNm(String authorNm) {
        this.authorNm = authorNm;
    }
    
    public String getAuthorDc() {
        return this.authorDc;
    }
    
    public void setAuthorDc(String authorDc) {
        this.authorDc = authorDc;
    }
    
    public String getAuthorCreatDe() {
        return this.authorCreatDe;
    }
    
    public void setAuthorCreatDe(String authorCreatDe) {
        this.authorCreatDe = authorCreatDe;
    }
    
}
