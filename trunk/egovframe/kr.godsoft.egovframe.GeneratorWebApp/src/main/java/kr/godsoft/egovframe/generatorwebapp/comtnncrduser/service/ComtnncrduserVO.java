package kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service;

/**
 * @Class Name : ComtnncrduserVO.java
 * @Description : Comtnncrduser VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnncrduserVO extends ComtnncrduserDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** NCRD_ID */
    private String ncrdId;
    
    /** REGIST_SE_CODE */
    private String registSeCode;
    
    /** USE_AT */
    private String useAt;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** EMPLYR_ID */
    private String emplyrId;
    
    public String getNcrdId() {
        return this.ncrdId;
    }
    
    public void setNcrdId(String ncrdId) {
        this.ncrdId = ncrdId;
    }
    
    public String getRegistSeCode() {
        return this.registSeCode;
    }
    
    public void setRegistSeCode(String registSeCode) {
        this.registSeCode = registSeCode;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getCreatDt() {
        return this.creatDt;
    }
    
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }
    
    public String getEmplyrId() {
        return this.emplyrId;
    }
    
    public void setEmplyrId(String emplyrId) {
        this.emplyrId = emplyrId;
    }
    
}
