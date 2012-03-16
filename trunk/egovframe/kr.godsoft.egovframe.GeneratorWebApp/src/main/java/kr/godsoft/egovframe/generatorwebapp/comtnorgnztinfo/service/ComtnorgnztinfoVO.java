package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service;

/**
 * @Class Name : ComtnorgnztinfoVO.java
 * @Description : Comtnorgnztinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnorgnztinfoVO extends ComtnorgnztinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ORGNZT_ID */
    private String orgnztId;
    
    /** ORGNZT_NM */
    private String orgnztNm;
    
    /** ORGNZT_DC */
    private String orgnztDc;
    
    public String getOrgnztId() {
        return this.orgnztId;
    }
    
    public void setOrgnztId(String orgnztId) {
        this.orgnztId = orgnztId;
    }
    
    public String getOrgnztNm() {
        return this.orgnztNm;
    }
    
    public void setOrgnztNm(String orgnztNm) {
        this.orgnztNm = orgnztNm;
    }
    
    public String getOrgnztDc() {
        return this.orgnztDc;
    }
    
    public void setOrgnztDc(String orgnztDc) {
        this.orgnztDc = orgnztDc;
    }
    
}
