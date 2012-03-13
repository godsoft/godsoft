package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service;

/**
 * @Class Name : ComtnfxtrsmanageVO.java
 * @Description : Comtnfxtrsmanage VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfxtrsmanageVO extends ComtnfxtrsmanageDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String fxtrsCode;
    
    /**  */
    private String fxtrsNm;
    
    /**  */
    private String makrNm;
    
    /**  */
    private int price;
    
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
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
}
