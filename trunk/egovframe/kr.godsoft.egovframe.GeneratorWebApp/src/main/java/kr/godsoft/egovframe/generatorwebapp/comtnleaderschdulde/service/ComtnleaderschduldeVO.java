package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service;

/**
 * @Class Name : ComtnleaderschduldeVO.java
 * @Description : Comtnleaderschdulde VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnleaderschduldeVO extends ComtnleaderschduldeDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SCHDUL_ID */
    private String schdulId;
    
    /** SCHDUL_DE */
    private String schdulDe;
    
    public String getSchdulId() {
        return this.schdulId;
    }
    
    public void setSchdulId(String schdulId) {
        this.schdulId = schdulId;
    }
    
    public String getSchdulDe() {
        return this.schdulDe;
    }
    
    public void setSchdulDe(String schdulDe) {
        this.schdulDe = schdulDe;
    }
    
}
