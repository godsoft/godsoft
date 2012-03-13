package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service;

/**
 * @Class Name : ComtndbmntrngVO.java
 * @Description : Comtndbmntrng VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndbmntrngVO extends ComtndbmntrngDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String dataSourcNm;
    
    /**  */
    private String serverNm;
    
    /**  */
    private String dbmsKnd;
    
    /**  */
    private String ceckSql;
    
    /**  */
    private String mngrNm;
    
    /**  */
    private String mngrEmailAdres;
    
    /**  */
    private String mntrngSttus;
    
    /**  */
    private String creatDt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
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
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
}
