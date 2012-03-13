package kr.godsoft.egovframe.generatorwebapp.comtnfile.service;

/**
 * @Class Name : ComtnfileVO.java
 * @Description : Comtnfile VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfileVO extends ComtnfileDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String atchFileId;
    
    /**  */
    private String creatDt;
    
    /**  */
    private String useAt;
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
}
