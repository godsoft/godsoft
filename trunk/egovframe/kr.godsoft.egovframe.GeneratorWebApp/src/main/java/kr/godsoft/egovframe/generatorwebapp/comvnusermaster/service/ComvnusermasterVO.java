package kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service;

/**
 * @Class Name : ComvnusermasterVO.java
 * @Description : Comvnusermaster VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComvnusermasterVO extends ComvnusermasterDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ESNTL_ID */
    private String esntlId;
    
    /** USER_ID */
    private String userId;
    
    /** PASSWORD */
    private String password;
    
    /** USER_NM */
    private String userNm;
    
    /** USER_ZIP */
    private String userZip;
    
    /** USER_ADRES */
    private String userAdres;
    
    /** USER_EMAIL */
    private String userEmail;
    
    /** GROUP_ID */
    private String groupId;
    
    /** USER_SE */
    private String userSe;
    
    /** ORGNZT_ID */
    private String orgnztId;
    
    public String getEsntlId() {
        return this.esntlId;
    }
    
    public void setEsntlId(String esntlId) {
        this.esntlId = esntlId;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserNm() {
        return this.userNm;
    }
    
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
    
    public String getUserZip() {
        return this.userZip;
    }
    
    public void setUserZip(String userZip) {
        this.userZip = userZip;
    }
    
    public String getUserAdres() {
        return this.userAdres;
    }
    
    public void setUserAdres(String userAdres) {
        this.userAdres = userAdres;
    }
    
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public String getUserSe() {
        return this.userSe;
    }
    
    public void setUserSe(String userSe) {
        this.userSe = userSe;
    }
    
    public String getOrgnztId() {
        return this.orgnztId;
    }
    
    public void setOrgnztId(String orgnztId) {
        this.orgnztId = orgnztId;
    }
    
}
