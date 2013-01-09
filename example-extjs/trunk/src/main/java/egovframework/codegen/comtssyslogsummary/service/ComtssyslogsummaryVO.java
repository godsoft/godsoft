package egovframework.codegen.comtssyslogsummary.service;

/**
 * @Class Name : ComtssyslogsummaryVO.java
 * @Description : Comtssyslogsummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtssyslogsummaryVO extends ComtssyslogsummaryDefaultVO {
    private static final long serialVersionUID = 1L;

    /** occrrnc_de */
    private String occrrncDe;

    /** svc_nm */
    private String svcNm;

    /** method_nm */
    private String methodNm;

    /** creat_co */
    private int creatCo;

    /** updt_co */
    private int updtCo;

    /** rdcnt */
    private int rdcnt;

    /** delete_co */
    private int deleteCo;

    /** outpt_co */
    private int outptCo;

    /** error_co */
    private int errorCo;

    public String getOccrrncDe() {
        return this.occrrncDe;
    }

    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }

    public String getSvcNm() {
        return this.svcNm;
    }

    public void setSvcNm(String svcNm) {
        this.svcNm = svcNm;
    }

    public String getMethodNm() {
        return this.methodNm;
    }

    public void setMethodNm(String methodNm) {
        this.methodNm = methodNm;
    }

    public int getCreatCo() {
        return this.creatCo;
    }

    public void setCreatCo(int creatCo) {
        this.creatCo = creatCo;
    }

    public int getUpdtCo() {
        return this.updtCo;
    }

    public void setUpdtCo(int updtCo) {
        this.updtCo = updtCo;
    }

    public int getRdcnt() {
        return this.rdcnt;
    }

    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
    }

    public int getDeleteCo() {
        return this.deleteCo;
    }

    public void setDeleteCo(int deleteCo) {
        this.deleteCo = deleteCo;
    }

    public int getOutptCo() {
        return this.outptCo;
    }

    public void setOutptCo(int outptCo) {
        this.outptCo = outptCo;
    }

    public int getErrorCo() {
        return this.errorCo;
    }

    public void setErrorCo(int errorCo) {
        this.errorCo = errorCo;
    }

}
