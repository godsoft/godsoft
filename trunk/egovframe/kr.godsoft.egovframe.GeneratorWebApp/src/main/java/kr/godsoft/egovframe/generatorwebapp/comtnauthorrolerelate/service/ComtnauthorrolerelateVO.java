package kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service;

/**
 * @Class Name : ComtnauthorrolerelateVO.java
 * @Description : Comtnauthorrolerelate VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnauthorrolerelateVO extends ComtnauthorrolerelateDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** AUTHOR_CODE */
    private String authorCode;
    
    /** ROLE_CODE */
    private String roleCode;
    
    /** CREAT_DT */
    private String creatDt;
    
    public String getAuthorCode() {
        return this.authorCode;
    }
    
    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }
    
    public String getRoleCode() {
        return this.roleCode;
    }
    
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
}
