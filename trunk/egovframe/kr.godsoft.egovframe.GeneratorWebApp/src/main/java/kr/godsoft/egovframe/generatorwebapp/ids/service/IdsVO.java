package kr.godsoft.egovframe.generatorwebapp.ids.service;

/**
 * @Class Name : IdsVO.java
 * @Description : Ids VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class IdsVO extends IdsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String idgenTableNm;
    
    /**  */
    private int idgenNextId;
    
    public String getIdgenTableNm() {
        return this.idgenTableNm;
    }
    
    public void setIdgenTableNm(String idgenTableNm) {
        this.idgenTableNm = idgenTableNm;
    }
    
    public int getIdgenNextId() {
        return this.idgenNextId;
    }
    
    public void setIdgenNextId(int idgenNextId) {
        this.idgenNextId = idgenNextId;
    }
    
}
