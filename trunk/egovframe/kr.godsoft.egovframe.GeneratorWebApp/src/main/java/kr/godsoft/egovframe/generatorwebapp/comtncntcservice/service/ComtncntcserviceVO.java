package kr.godsoft.egovframe.generatorwebapp.comtncntcservice.service;

/**
 * @Class Name : ComtncntcserviceVO.java
 * @Description : Comtncntcservice VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcserviceVO extends ComtncntcserviceDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** INSTT_ID */
    private String insttId;
    
    /** SYS_ID */
    private String sysId;
    
    /** SVC_ID */
    private String svcId;
    
    /** SVC_NM */
    private String svcNm;
    
    /** REQUST_MSSAGE_ID */
    private String requstMssageId;
    
    /** RSPNS_MSSAGE_ID */
    private String rspnsMssageId;
    
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
    
    public String getSvcId() {
        return this.svcId;
    }
    
    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }
    
    public String getSvcNm() {
        return this.svcNm;
    }
    
    public void setSvcNm(String svcNm) {
        this.svcNm = svcNm;
    }
    
    public String getRequstMssageId() {
        return this.requstMssageId;
    }
    
    public void setRequstMssageId(String requstMssageId) {
        this.requstMssageId = requstMssageId;
    }
    
    public String getRspnsMssageId() {
        return this.rspnsMssageId;
    }
    
    public void setRspnsMssageId(String rspnsMssageId) {
        this.rspnsMssageId = rspnsMssageId;
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
