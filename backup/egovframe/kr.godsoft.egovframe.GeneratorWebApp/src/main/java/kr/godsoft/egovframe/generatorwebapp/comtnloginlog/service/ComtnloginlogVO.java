package kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service;

/**
 * @Class Name : ComtnloginlogVO.java
 * @Description : Comtnloginlog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnloginlogVO extends ComtnloginlogDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** LOG_ID */
    private String logId;
    
    /** CONECT_ID */
    private String conectId;
    
    /** CONECT_IP */
    private String conectIp;
    
    /** CONECT_MTHD */
    private String conectMthd;
    
    /** ERROR_OCCRRNC_AT */
    private String errorOccrrncAt;
    
    /** ERROR_CODE */
    private String errorCode;
    
    /** CREAT_DT */
    private String creatDt;
    
    public String getLogId() {
        return this.logId;
    }
    
    public void setLogId(String logId) {
        this.logId = logId;
    }
    
    public String getConectId() {
        return this.conectId;
    }
    
    public void setConectId(String conectId) {
        this.conectId = conectId;
    }
    
    public String getConectIp() {
        return this.conectIp;
    }
    
    public void setConectIp(String conectIp) {
        this.conectIp = conectIp;
    }
    
    public String getConectMthd() {
        return this.conectMthd;
    }
    
    public void setConectMthd(String conectMthd) {
        this.conectMthd = conectMthd;
    }
    
    public String getErrorOccrrncAt() {
        return this.errorOccrrncAt;
    }
    
    public void setErrorOccrrncAt(String errorOccrrncAt) {
        this.errorOccrrncAt = errorOccrrncAt;
    }
    
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
}
