package kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service;

/**
 * @Class Name : ComtnroleinfoVO.java
 * @Description : Comtnroleinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnroleinfoVO extends ComtnroleinfoDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String roleCode;
    
    /**  */
    private String roleNm;
    
    /**  */
    private String rolePttrn;
    
    /**  */
    private String roleDc;
    
    /**  */
    private String roleTy;
    
    /**  */
    private String roleSort;
    
    /**  */
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
