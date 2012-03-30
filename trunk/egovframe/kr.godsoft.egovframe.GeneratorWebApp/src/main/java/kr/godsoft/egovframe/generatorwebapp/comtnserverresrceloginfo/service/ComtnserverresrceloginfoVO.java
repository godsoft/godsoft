package kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service;

/**
 * @Class Name : ComtnserverresrceloginfoVO.java
 * @Description : Comtnserverresrceloginfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnserverresrceloginfoVO extends ComtnserverresrceloginfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** SERVER_EQPMN_ID */
    private String serverEqpmnId;
    
    /** CPU_USE_RT */
    private String cpuUseRt;
    
    /** MORY_USE_RT */
    private String moryUseRt;
    
    /** SVC_STTUS */
    private String svcSttus;
    
    /** LOG_INFO */
    private String logInfo;
    
    /** CREAT_DT */
    private String creatDt;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** SERVER_ID */
    private String serverId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    /** LOG_ID */
    private String logId;
    
    public String getServerEqpmnId() {
        return this.serverEqpmnId;
    }
    
    public void setServerEqpmnId(String serverEqpmnId) {
        this.serverEqpmnId = serverEqpmnId;
    }
    
    public String getCpuUseRt() {
        return this.cpuUseRt;
    }
    
    public void setCpuUseRt(String cpuUseRt) {
        this.cpuUseRt = cpuUseRt;
    }
    
    public String getMoryUseRt() {
        return this.moryUseRt;
    }
    
    public void setMoryUseRt(String moryUseRt) {
        this.moryUseRt = moryUseRt;
    }
    
    public String getSvcSttus() {
        return this.svcSttus;
    }
    
    public void setSvcSttus(String svcSttus) {
        this.svcSttus = svcSttus;
    }
    
    public String getLogInfo() {
        return this.logInfo;
    }
    
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
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
    
    public String getServerId() {
        return this.serverId;
    }
    
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getLogId() {
        return this.logId;
    }
    
    public void setLogId(String logId) {
        this.logId = logId;
    }
    
}
