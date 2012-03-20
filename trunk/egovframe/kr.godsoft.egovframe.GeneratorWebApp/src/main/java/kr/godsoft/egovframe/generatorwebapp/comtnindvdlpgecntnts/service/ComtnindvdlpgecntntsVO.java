package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service;

/**
 * @Class Name : ComtnindvdlpgecntntsVO.java
 * @Description : Comtnindvdlpgecntnts VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnindvdlpgecntntsVO extends ComtnindvdlpgecntntsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CNTNTS_ID */
    private String cntntsId;
    
    /** CNTNTS_NM */
    private String cntntsNm;
    
    /** CNTC_URL */
    private String cntcUrl;
    
    /** CNTNTS_USE_AT */
    private String cntntsUseAt;
    
    /** CNTNTS_LINK_URL */
    private String cntntsLinkUrl;
    
    /** CNTNTS_DC */
    private String cntntsDc;
    
    public String getCntntsId() {
        return this.cntntsId;
    }
    
    public void setCntntsId(String cntntsId) {
        this.cntntsId = cntntsId;
    }
    
    public String getCntntsNm() {
        return this.cntntsNm;
    }
    
    public void setCntntsNm(String cntntsNm) {
        this.cntntsNm = cntntsNm;
    }
    
    public String getCntcUrl() {
        return this.cntcUrl;
    }
    
    public void setCntcUrl(String cntcUrl) {
        this.cntcUrl = cntcUrl;
    }
    
    public String getCntntsUseAt() {
        return this.cntntsUseAt;
    }
    
    public void setCntntsUseAt(String cntntsUseAt) {
        this.cntntsUseAt = cntntsUseAt;
    }
    
    public String getCntntsLinkUrl() {
        return this.cntntsLinkUrl;
    }
    
    public void setCntntsLinkUrl(String cntntsLinkUrl) {
        this.cntntsLinkUrl = cntntsLinkUrl;
    }
    
    public String getCntntsDc() {
        return this.cntntsDc;
    }
    
    public void setCntntsDc(String cntntsDc) {
        this.cntntsDc = cntntsDc;
    }
    
}
