package kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service;

/**
 * @Class Name : ComtnemplyrscrtyestbsVO.java
 * @Description : Comtnemplyrscrtyestbs VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnemplyrscrtyestbsVO extends ComtnemplyrscrtyestbsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SCRTY_DTRMN_TRGET_ID */
    private String scrtyDtrmnTrgetId;
    
    /** MBER_TY_CODE */
    private String mberTyCode;
    
    /** AUTHOR_CODE */
    private String authorCode;
    
    public String getScrtyDtrmnTrgetId() {
        return this.scrtyDtrmnTrgetId;
    }
    
    public void setScrtyDtrmnTrgetId(String scrtyDtrmnTrgetId) {
        this.scrtyDtrmnTrgetId = scrtyDtrmnTrgetId;
    }
    
    public String getMberTyCode() {
        return this.mberTyCode;
    }
    
    public void setMberTyCode(String mberTyCode) {
        this.mberTyCode = mberTyCode;
    }
    
    public String getAuthorCode() {
        return this.authorCode;
    }
    
    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }
    
}
