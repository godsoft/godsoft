package kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service;

/**
 * @Class Name : ComtnuserlogVO.java
 * @Description : Comtnuserlog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnuserlogVO extends ComtnuserlogDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OCCRRNC_DE */
    private String occrrncDe;
    
    /** RQESTER_ID */
    private String rqesterId;
    
    /** SVC_NM */
    private String svcNm;
    
    /** METHOD_NM */
    private String methodNm;
    
    /** CREAT_CO */
    private String creatCo;
    
    /** UPDT_CO */
    private String updtCo;
    
    /** RDCNT */
    private String rdcnt;
    
    /** DELETE_CO */
    private String deleteCo;
    
    /** OUTPT_CO */
    private String outptCo;
    
    /** ERROR_CO */
    private String errorCo;
    
    public String getOccrrncDe() {
        return this.occrrncDe;
    }
    
    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }
    
    public String getRqesterId() {
        return this.rqesterId;
    }
    
    public void setRqesterId(String rqesterId) {
        this.rqesterId = rqesterId;
    }
    
    public String getSvcNm() {
        return this.svcNm;
    }
    
    public void setSvcNm(String svcNm) {
        this.svcNm = svcNm;
    }
    
    public String getMethodNm() {
        return this.methodNm;
    }
    
    public void setMethodNm(String methodNm) {
        this.methodNm = methodNm;
    }
    
    public String getCreatCo() {
        return this.creatCo;
    }
    
    public void setCreatCo(String creatCo) {
        this.creatCo = creatCo;
    }
    
    public String getUpdtCo() {
        return this.updtCo;
    }
    
    public void setUpdtCo(String updtCo) {
        this.updtCo = updtCo;
    }
    
    public String getRdcnt() {
        return this.rdcnt;
    }
    
    public void setRdcnt(String rdcnt) {
        this.rdcnt = rdcnt;
    }
    
    public String getDeleteCo() {
        return this.deleteCo;
    }
    
    public void setDeleteCo(String deleteCo) {
        this.deleteCo = deleteCo;
    }
    
    public String getOutptCo() {
        return this.outptCo;
    }
    
    public void setOutptCo(String outptCo) {
        this.outptCo = outptCo;
    }
    
    public String getErrorCo() {
        return this.errorCo;
    }
    
    public void setErrorCo(String errorCo) {
        this.errorCo = errorCo;
    }
    
}
