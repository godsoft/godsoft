package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service;

/**
 * @Class Name : ComtnrolesHierarchyVO.java
 * @Description : ComtnrolesHierarchy VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnrolesHierarchyVO extends ComtnrolesHierarchyDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String parntsRole;
    
    /**  */
    private String chldrnRole;
    
    public String getParntsRole() {
        return this.parntsRole;
    }
    
    public void setParntsRole(String parntsRole) {
        this.parntsRole = parntsRole;
    }
    
    public String getChldrnRole() {
        return this.chldrnRole;
    }
    
    public void setChldrnRole(String chldrnRole) {
        this.chldrnRole = chldrnRole;
    }
    
}