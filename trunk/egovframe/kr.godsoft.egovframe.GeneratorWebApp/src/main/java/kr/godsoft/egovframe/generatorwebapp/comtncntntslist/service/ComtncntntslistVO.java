package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service;

/**
 * @Class Name : ComtncntntslistVO.java
 * @Description : Comtncntntslist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntntslistVO extends ComtncntntslistDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String cntntsId;
    
    /**  */
    private String emplyrId;
    
    public String getCntntsId() {
        return this.cntntsId;
    }
    
    public void setCntntsId(String cntntsId) {
        this.cntntsId = cntntsId;
    }
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
}
