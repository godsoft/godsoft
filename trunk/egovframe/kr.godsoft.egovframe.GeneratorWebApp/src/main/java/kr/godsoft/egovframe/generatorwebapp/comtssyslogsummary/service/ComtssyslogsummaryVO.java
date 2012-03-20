package kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service;

/**
 * @Class Name : ComtssyslogsummaryVO.java
 * @Description : Comtssyslogsummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtssyslogsummaryVO extends ComtssyslogsummaryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OCCRRNC_DE */
    private String occrrncDe;
    
    /** SVC_NM */
    private String svcNm;
    
    /** METHOD_NM */
    private String methodNm;
    
    /** CREAT_CO */
    private int creatCo;
    
    /** UPDT_CO */
    private int updtCo;
    
    /** RDCNT */
    private int rdcnt;
    
    /** DELETE_CO */
    private int deleteCo;
    
    /** OUTPT_CO */
    private int outptCo;
    
    /** ERROR_CO */
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
