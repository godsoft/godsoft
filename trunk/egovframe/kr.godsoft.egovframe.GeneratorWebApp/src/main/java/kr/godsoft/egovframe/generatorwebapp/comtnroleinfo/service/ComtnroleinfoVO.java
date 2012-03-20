package kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service;

/**
 * @Class Name : ComtnroleinfoVO.java
 * @Description : Comtnroleinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnroleinfoVO extends ComtnroleinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ROLE_CODE */
    private String roleCode;
    
    /** ROLE_NM */
    private String roleNm;
    
    /** ROLE_PTTRN */
    private String rolePttrn;
    
    /** ROLE_DC */
    private String roleDc;
    
    /** ROLE_TY */
    private String roleTy;
    
    /** ROLE_SORT */
    private String roleSort;
    
    /** ROLE_CREAT_DE */
    private String roleCreatDe;
    
    public String getRoleCode() {
        return this.roleCode;
    }
    
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    
    public String getRoleNm() {
        return this.roleNm;
    }
    
    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }
    
    public String getRolePttrn() {
        return this.rolePttrn;
    }
    
    public void setRolePttrn(String rolePttrn) {
        this.rolePttrn = rolePttrn;
    }
    
    public String getRoleDc() {
        return this.roleDc;
    }
    
    public void setRoleDc(String roleDc) {
        this.roleDc = roleDc;
    }
    
    public String getRoleTy() {
        return this.roleTy;
    }
    
    public void setRoleTy(String roleTy) {
        this.roleTy = roleTy;
    }
    
    public String getRoleSort() {
        return this.roleSort;
    }
    
    public void setRoleSort(String roleSort) {
        this.roleSort = roleSort;
    }
    
    public String getRoleCreatDe() {
        return this.roleCreatDe;
    }
    
    public void setRoleCreatDe(String roleCreatDe) {
        this.roleCreatDe = roleCreatDe;
    }
    
}
