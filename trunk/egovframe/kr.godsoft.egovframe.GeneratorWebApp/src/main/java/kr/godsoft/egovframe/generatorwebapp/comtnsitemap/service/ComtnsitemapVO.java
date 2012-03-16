package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service;

/**
 * @Class Name : ComtnsitemapVO.java
 * @Description : Comtnsitemap VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsitemapVO extends ComtnsitemapDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** MAPNG_CREAT_ID */
    private String mapngCreatId;
    
    /** CREATR_ID */
    private String creatrId;
    
    /** MAPNG_FILE_NM */
    private String mapngFileNm;
    
    /** MAPNG_FILE_PATH */
    private String mapngFilePath;
    
    public String getMapngCreatId() {
        return this.mapngCreatId;
    }
    
    public void setMapngCreatId(String mapngCreatId) {
        this.mapngCreatId = mapngCreatId;
    }
    
    public String getCreatrId() {
        return this.creatrId;
    }
    
    public void setCreatrId(String creatrId) {
        this.creatrId = creatrId;
    }
    
    public String getMapngFileNm() {
        return this.mapngFileNm;
    }
    
    public void setMapngFileNm(String mapngFileNm) {
        this.mapngFileNm = mapngFileNm;
    }
    
    public String getMapngFilePath() {
        return this.mapngFilePath;
    }
    
    public void setMapngFilePath(String mapngFilePath) {
        this.mapngFilePath = mapngFilePath;
    }
    
}
