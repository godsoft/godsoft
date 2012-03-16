package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service;

/**
 * @Class Name : ComtnbatchschduldfkVO.java
 * @Description : Comtnbatchschduldfk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbatchschduldfkVO extends ComtnbatchschduldfkDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BATCH_SCHDUL_ID */
    private String batchSchdulId;
    
    /** EXECUT_SCHDUL_DFK_SE */
    private String executSchdulDfkSe;
    
    public String getBatchSchdulId() {
        return this.batchSchdulId;
    }
    
    public void setBatchSchdulId(String batchSchdulId) {
        this.batchSchdulId = batchSchdulId;
    }
    
    public String getExecutSchdulDfkSe() {
        return this.executSchdulDfkSe;
    }
    
    public void setExecutSchdulDfkSe(String executSchdulDfkSe) {
        this.executSchdulDfkSe = executSchdulDfkSe;
    }
    
}
