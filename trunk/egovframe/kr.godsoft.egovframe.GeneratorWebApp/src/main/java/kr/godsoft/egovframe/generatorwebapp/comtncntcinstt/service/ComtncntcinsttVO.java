package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service;

/**
 * @Class Name : ComtncntcinsttVO.java
 * @Description : Comtncntcinstt VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcinsttVO extends ComtncntcinsttDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** INSTT_ID */
    private String insttId;
    
    /** INSTT_NM */
    private String insttNm;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** USE_AT */
    private String useAt;
    
    public String getInsttId() {
        return this.insttId;
    }
    
    public void setInsttId(String insttId) {
        this.insttId = insttId;
    }
    
    public String getInsttNm() {
        return this.insttNm;
    }
    
    public void setInsttNm(String insttNm) {
        this.insttNm = insttNm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
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
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
}
