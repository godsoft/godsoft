package egovframework.codegen.comtsweblogsummary.service;

/**
 * @Class Name : ComtsweblogsummaryVO.java
 * @Description : Comtsweblogsummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtsweblogsummaryVO extends ComtsweblogsummaryDefaultVO {
    private static final long serialVersionUID = 1L;

    /** occrrnc_de */
    private String occrrncDe;

    /** url */
    private String url;

    /** rdcnt */
    private int rdcnt;

    public String getOccrrncDe() {
        return this.occrrncDe;
    }

    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRdcnt() {
        return this.rdcnt;
    }

    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
    }

}
