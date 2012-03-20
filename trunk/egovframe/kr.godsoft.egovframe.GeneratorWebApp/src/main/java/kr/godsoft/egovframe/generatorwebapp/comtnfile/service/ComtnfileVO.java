package kr.godsoft.egovframe.generatorwebapp.comtnfile.service;

/**
 * @Class Name : ComtnfileVO.java
 * @Description : Comtnfile VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfileVO extends ComtnfileDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** USE_AT */
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
