package kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service;

/**
 * @Class Name : ComtncntcsystemVO.java
 * @Description : Comtncntcsystem VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcsystemVO extends ComtncntcsystemDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** INSTT_ID */
    private String insttId;
    
    /** SYS_ID */
    private String sysId;
    
    /** SYS_NM */
    private String sysNm;
    
    /** SYS_IP */
    private String sysIp;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
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
    
    public String getSysId() {
        return this.sysId;
    }
    
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
    
    public String getSysNm() {
        return this.sysNm;
    }
    
    public void setSysNm(String sysNm) {
        this.sysNm = sysNm;
    }
    
    public String getSysIp() {
        return this.sysIp;
    }
    
    public void setSysIp(String sysIp) {
        this.sysIp = sysIp;
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
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
}
