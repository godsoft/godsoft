package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service;

/**
 * @Class Name : ComtnfxtrsmanageVO.java
 * @Description : Comtnfxtrsmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfxtrsmanageVO extends ComtnfxtrsmanageDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** FXTRS_CODE */
    private String fxtrsCode;
    
    /** FXTRS_NM */
    private String fxtrsNm;
    
    /** MAKR_NM */
    private String makrNm;
    
    /** PRICE */
    private String price;
    
    public String getFxtrsCode() {
        return this.fxtrsCode;
    }
    
    public void setFxtrsCode(String fxtrsCode) {
        this.fxtrsCode = fxtrsCode;
    }
    
    public String getFxtrsNm() {
        return this.fxtrsNm;
    }
    
    public void setFxtrsNm(String fxtrsNm) {
        this.fxtrsNm = fxtrsNm;
    }
    
    public String getMakrNm() {
        return this.makrNm;
    }
    
    public void setMakrNm(String makrNm) {
        this.makrNm = makrNm;
    }
    
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
}
