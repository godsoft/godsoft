package kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service;

/**
 * @Class Name : ComtnsyslogVO.java
 * @Description : Comtnsyslog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsyslogVO extends ComtnsyslogDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** REQUST_ID */
    private String requstId;
    
    /** JOB_SE_CODE */
    private String jobSeCode;
    
    /** INSTT_CODE */
    private String insttCode;
    
    /** OCCRRNC_DE */
    private String occrrncDe;
    
    /** RQESTER_IP */
    private String rqesterIp;
    
    /** RQESTER_ID */
    private String rqesterId;
    
    /** TRGET_MENU_NM */
    private String trgetMenuNm;
    
    /** SVC_NM */
    private String svcNm;
    
    /** METHOD_NM */
    private String methodNm;
    
    /** PROCESS_SE_CODE */
    private String processSeCode;
    
    /** PROCESS_CO */
    private int processCo;
    
    /** PROCESS_TIME */
    private String processTime;
    
    /** RSPNS_CODE */
    private String rspnsCode;
    
    /** ERROR_SE */
    private String errorSe;
    
    /** ERROR_CO */
    private int errorCo;
    
    /** ERROR_CODE */
    private String errorCode;
    
    public String getRequstId() {
        return this.requstId;
    }
    
    public void setRequstId(String requstId) {
        this.requstId = requstId;
    }
    
    public String getJobSeCode() {
        return this.jobSeCode;
    }
    
    public void setJobSeCode(String jobSeCode) {
        this.jobSeCode = jobSeCode;
    }
    
    public String getInsttCode() {
        return this.insttCode;
    }
    
    public void setInsttCode(String insttCode) {
        this.insttCode = insttCode;
    }
    
    public String getOccrrncDe() {
        return this.occrrncDe;
    }
    
    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }
    
    public String getRqesterIp() {
        return this.rqesterIp;
    }
    
    public void setRqesterIp(String rqesterIp) {
        this.rqesterIp = rqesterIp;
    }
    
    public String getRqesterId() {
        return this.rqesterId;
    }
    
    public void setRqesterId(String rqesterId) {
        this.rqesterId = rqesterId;
    }
    
    public String getTrgetMenuNm() {
        return this.trgetMenuNm;
    }
    
    public void setTrgetMenuNm(String trgetMenuNm) {
        this.trgetMenuNm = trgetMenuNm;
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
    
    public String getProcessSeCode() {
        return this.processSeCode;
    }
    
    public void setProcessSeCode(String processSeCode) {
        this.processSeCode = processSeCode;
    }
    
    public int getProcessCo() {
        return this.processCo;
    }
    
    public void setProcessCo(int processCo) {
        this.processCo = processCo;
    }
    
    public String getProcessTime() {
        return this.processTime;
    }
    
    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }
    
    public String getRspnsCode() {
        return this.rspnsCode;
    }
    
    public void setRspnsCode(String rspnsCode) {
        this.rspnsCode = rspnsCode;
    }
    
    public String getErrorSe() {
        return this.errorSe;
    }
    
    public void setErrorSe(String errorSe) {
        this.errorSe = errorSe;
    }
    
    public int getErrorCo() {
        return this.errorCo;
    }
    
    public void setErrorCo(int errorCo) {
        this.errorCo = errorCo;
    }
    
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
}
