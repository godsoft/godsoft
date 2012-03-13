package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service;

/**
 * @Class Name : ComtnbatchschduldfkVO.java
 * @Description : Comtnbatchschduldfk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbatchschduldfkVO extends ComtnbatchschduldfkDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String batchSchdulId;
    
    /**  */
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
