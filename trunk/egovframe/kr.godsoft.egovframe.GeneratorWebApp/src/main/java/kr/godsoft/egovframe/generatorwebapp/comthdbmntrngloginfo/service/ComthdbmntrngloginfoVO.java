package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service;

/**
 * @Class Name : ComthdbmntrngloginfoVO.java
 * @Description : Comthdbmntrngloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComthdbmntrngloginfoVO extends ComthdbmntrngloginfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** DATA_SOURC_NM */
    private String dataSourcNm;
    
    /** SERVER_NM */
    private String serverNm;
    
    /** DBMS_KND */
    private String dbmsKnd;
    
    /** CECK_SQL */
    private String ceckSql;
    
    /** MNGR_NM */
    private String mngrNm;
    
    /** MNGR_EMAIL_ADRES */
    private String mngrEmailAdres;
    
    /** MNTRNG_STTUS */
    private String mntrngSttus;
    
    /** LOG_INFO */
    private String logInfo;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LOG_ID */
    private String logId;
    
    public String getDataSourcNm() {
        return this.dataSourcNm;
    }
    
    public void setDataSourcNm(String dataSourcNm) {
        this.dataSourcNm = dataSourcNm;
    }
    
    public String getServerNm() {
        return this.serverNm;
    }
    
    public void setServerNm(String serverNm) {
        this.serverNm = serverNm;
    }
    
    public String getDbmsKnd() {
        return this.dbmsKnd;
    }
    
    public void setDbmsKnd(String dbmsKnd) {
        this.dbmsKnd = dbmsKnd;
    }
    
    public String getCeckSql() {
        return this.ceckSql;
    }
    
    public void setCeckSql(String ceckSql) {
        this.ceckSql = ceckSql;
    }
    
    public String getMngrNm() {
        return this.mngrNm;
    }
    
    public void setMngrNm(String mngrNm) {
        this.mngrNm = mngrNm;
    }
    
    public String getMngrEmailAdres() {
        return this.mngrEmailAdres;
    }
    
    public void setMngrEmailAdres(String mngrEmailAdres) {
        this.mngrEmailAdres = mngrEmailAdres;
    }
    
    public String getMntrngSttus() {
        return this.mntrngSttus;
    }
    
    public void setMntrngSttus(String mntrngSttus) {
        this.mntrngSttus = mntrngSttus;
    }
    
    public String getLogInfo() {
        return this.logInfo;
    }
    
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
    public String getLogId() {
        return this.logId;
    }
    
    public void setLogId(String logId) {
        this.logId = logId;
    }
    
}
