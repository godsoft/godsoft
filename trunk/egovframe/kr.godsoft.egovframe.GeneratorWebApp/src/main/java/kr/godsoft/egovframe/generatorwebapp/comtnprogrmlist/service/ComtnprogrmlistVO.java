package kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service;

/**
 * @Class Name : ComtnprogrmlistVO.java
 * @Description : Comtnprogrmlist VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnprogrmlistVO extends ComtnprogrmlistDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String progrmFileNm;
    
    /**  */
    private String progrmStrePath;
    
    /**  */
    private String progrmKoreanNm;
    
    /**  */
    private String progrmDc;
    
    /**  */
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
