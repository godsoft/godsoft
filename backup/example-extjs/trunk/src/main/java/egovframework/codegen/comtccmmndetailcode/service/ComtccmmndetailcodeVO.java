package egovframework.codegen.comtccmmndetailcode.service;

/**
 * @Class Name : ComtccmmndetailcodeVO.java
 * @Description : Comtccmmndetailcode VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtccmmndetailcodeVO extends ComtccmmndetailcodeDefaultVO {
    private static final long serialVersionUID = 1L;

    /** code_id */
    private String codeId;

    /** code */
    private String code;

    /** code_nm */
    private String codeNm;

    /** code_dc */
    private String codeDc;

    /** use_at */
    private String useAt;

    /** frst_regist_pnttm */
    private String frstRegistPnttm;

    /** frst_register_id */
    private String frstRegisterId;

    /** last_updt_pnttm */
    private String lastUpdtPnttm;

    /** last_updusr_id */
    private String lastUpdusrId;

    public String getCodeId() {
        return this.codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeNm() {
        return this.codeNm;
    }

    public void setCodeNm(String codeNm) {
        this.codeNm = codeNm;
    }

    public String getCodeDc() {
        return this.codeDc;
    }

    public void setCodeDc(String codeDc) {
        this.codeDc = codeDc;
    }

    public String getUseAt() {
        return this.useAt;
    }

    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }

    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }

    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }

    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }

    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }

    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }

    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }

    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }

    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }

}
