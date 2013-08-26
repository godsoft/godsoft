package egovframework.codegen.comtnsyslog.service;

/**
 * @Class Name : ComtnsyslogVO.java
 * @Description : Comtnsyslog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtnsyslogVO extends ComtnsyslogDefaultVO {
    private static final long serialVersionUID = 1L;

    /** requst_id */
    private String requstId;

    /** job_se_code */
    private String jobSeCode;

    /** instt_code */
    private String insttCode;

    /** occrrnc_de */
    private String occrrncDe;

    /** rqester_ip */
    private String rqesterIp;

    /** rqester_id */
    private String rqesterId;

    /** trget_menu_nm */
    private String trgetMenuNm;

    /** svc_nm */
    private String svcNm;

    /** method_nm */
    private String methodNm;

    /** process_se_code */
    private String processSeCode;

    /** process_co */
    private int processCo;

    /** process_time */
    private String processTime;

    /** rspns_code */
    private String rspnsCode;

    /** error_se */
    private String errorSe;

    /** error_co */
    private int errorCo;

    /** error_code */
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
