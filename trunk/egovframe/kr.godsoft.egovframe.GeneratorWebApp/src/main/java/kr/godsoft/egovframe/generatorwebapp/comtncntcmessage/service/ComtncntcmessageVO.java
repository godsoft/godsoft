package kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service;

/**
 * @Class Name : ComtncntcmessageVO.java
 * @Description : Comtncntcmessage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtncntcmessageVO extends ComtncntcmessageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** CNTC_MSSAGE_ID */
    private String cntcMssageId;
    
    /** CNTC_MSSAGE_NM */
    private String cntcMssageNm;
    
    /** UPPER_CNTC_MSSAGE_ID */
    private String upperCntcMssageId;
    
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
    
    public String getCntcMssageId() {
        return this.cntcMssageId;
    }
    
    public void setCntcMssageId(String cntcMssageId) {
        this.cntcMssageId = cntcMssageId;
    }
    
    public String getCntcMssageNm() {
        return this.cntcMssageNm;
    }
    
    public void setCntcMssageNm(String cntcMssageNm) {
        this.cntcMssageNm = cntcMssageNm;
    }
    
    public String getUpperCntcMssageId() {
        return this.upperCntcMssageId;
    }
    
    public void setUpperCntcMssageId(String upperCntcMssageId) {
        this.upperCntcMssageId = upperCntcMssageId;
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
