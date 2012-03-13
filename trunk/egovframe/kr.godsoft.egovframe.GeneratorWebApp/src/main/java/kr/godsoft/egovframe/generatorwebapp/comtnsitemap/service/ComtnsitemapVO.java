package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service;

/**
 * @Class Name : ComtnsitemapVO.java
 * @Description : Comtnsitemap VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnsitemapVO extends ComtnsitemapDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String mapngCreatId;
    
    /**  */
    private String creatrId;
    
    /**  */
    private String mapngFileNm;
    
    /**  */
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
