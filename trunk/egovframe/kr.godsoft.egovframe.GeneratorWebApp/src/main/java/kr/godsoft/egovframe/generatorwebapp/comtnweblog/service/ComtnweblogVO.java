package kr.godsoft.egovframe.generatorwebapp.comtnweblog.service;

/**
 * @Class Name : ComtnweblogVO.java
 * @Description : Comtnweblog VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnweblogVO extends ComtnweblogDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String requstId;
    
    /**  */
    private String occrrncDe;
    
    /**  */
    private String url;
    
    /**  */
    private String rqesterId;
    
    /**  */
    private String rqesterIp;
    
    public String getRequstId() {
        return this.requstId;
    }
    
    public void setRequstId(String requstId) {
        this.requstId = requstId;
    }
    
    public String getOccrrncDe() {
        return this.occrrncDe;
    }
    
    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getRqesterId() {
        return this.rqesterId;
    }
    
    public void setRqesterId(String rqesterId) {
        this.rqesterId = rqesterId;
    }
    
    public String getRqesterIp() {
        return this.rqesterIp;
    }
    
    public void setRqesterIp(String rqesterIp) {
        this.rqesterIp = rqesterIp;
    }
    
}
