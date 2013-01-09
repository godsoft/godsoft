package egovframework.codegen.comtnprogrmlist.service;

/**
 * @Class Name : ComtnprogrmlistVO.java
 * @Description : Comtnprogrmlist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class ComtnprogrmlistVO extends ComtnprogrmlistDefaultVO {
    private static final long serialVersionUID = 1L;

    /** progrm_file_nm */
    private String progrmFileNm;

    /** progrm_stre_path */
    private String progrmStrePath;

    /** progrm_korean_nm */
    private String progrmKoreanNm;

    /** progrm_dc */
    private String progrmDc;

    /** url */
    private String url;

    public String getProgrmFileNm() {
        return this.progrmFileNm;
    }

    public void setProgrmFileNm(String progrmFileNm) {
        this.progrmFileNm = progrmFileNm;
    }

    public String getProgrmStrePath() {
        return this.progrmStrePath;
    }

    public void setProgrmStrePath(String progrmStrePath) {
        this.progrmStrePath = progrmStrePath;
    }

    public String getProgrmKoreanNm() {
        return this.progrmKoreanNm;
    }

    public void setProgrmKoreanNm(String progrmKoreanNm) {
        this.progrmKoreanNm = progrmKoreanNm;
    }

    public String getProgrmDc() {
        return this.progrmDc;
    }

    public void setProgrmDc(String progrmDc) {
        this.progrmDc = progrmDc;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
