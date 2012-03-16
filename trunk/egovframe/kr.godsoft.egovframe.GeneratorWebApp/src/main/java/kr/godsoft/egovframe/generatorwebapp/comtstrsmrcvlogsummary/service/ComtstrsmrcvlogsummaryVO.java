package kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service;

/**
 * @Class Name : ComtstrsmrcvlogsummaryVO.java
 * @Description : Comtstrsmrcvlogsummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtstrsmrcvlogsummaryVO extends ComtstrsmrcvlogsummaryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OCCRRNC_DE */
    private String occrrncDe;
    
    /** TRSMRCV_SE_CODE */
    private String trsmrcvSeCode;
    
    /** PROVD_INSTT_ID */
    private String provdInsttId;
    
    /** PROVD_SYS_ID */
    private String provdSysId;
    
    /** PROVD_SVC_ID */
    private String provdSvcId;
    
    /** REQUST_INSTT_ID */
    private String requstInsttId;
    
    /** REQUST_SYS_ID */
    private String requstSysId;
    
    /** RDCNT */
    private int rdcnt;
    
    /** ERROR_CO */
    private int errorCo;
    
    public String getOccrrncDe() {
        return this.occrrncDe;
    }
    
    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }
    
    public String getTrsmrcvSeCode() {
        return this.trsmrcvSeCode;
    }
    
    public void setTrsmrcvSeCode(String trsmrcvSeCode) {
        this.trsmrcvSeCode = trsmrcvSeCode;
    }
    
    public String getProvdInsttId() {
        return this.provdInsttId;
    }
    
    public void setProvdInsttId(String provdInsttId) {
        this.provdInsttId = provdInsttId;
    }
    
    public String getProvdSysId() {
        return this.provdSysId;
    }
    
    public void setProvdSysId(String provdSysId) {
        this.provdSysId = provdSysId;
    }
    
    public String getProvdSvcId() {
        return this.provdSvcId;
    }
    
    public void setProvdSvcId(String provdSvcId) {
        this.provdSvcId = provdSvcId;
    }
    
    public String getRequstInsttId() {
        return this.requstInsttId;
    }
    
    public void setRequstInsttId(String requstInsttId) {
        this.requstInsttId = requstInsttId;
    }
    
    public String getRequstSysId() {
        return this.requstSysId;
    }
    
    public void setRequstSysId(String requstSysId) {
        this.requstSysId = requstSysId;
    }
    
    public int getRdcnt() {
        return this.rdcnt;
    }
    
    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
    }
    
    public int getErrorCo() {
        return this.errorCo;
    }
    
    public void setErrorCo(int errorCo) {
        this.errorCo = errorCo;
    }
    
}
