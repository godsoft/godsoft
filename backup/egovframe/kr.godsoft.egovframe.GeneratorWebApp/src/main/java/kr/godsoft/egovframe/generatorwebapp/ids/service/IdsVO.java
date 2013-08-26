package kr.godsoft.egovframe.generatorwebapp.ids.service;

/**
 * @Class Name : IdsVO.java
 * @Description : Ids VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class IdsVO extends IdsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** IDGEN_TABLE_NM */
    private String idgenTableNm;
    
    /** IDGEN_NEXT_ID */
    private String idgenNextId;
    
    public String getIdgenTableNm() {
        return this.idgenTableNm;
    }
    
    public void setIdgenTableNm(String idgenTableNm) {
        this.idgenTableNm = idgenTableNm;
    }
    
    public String getIdgenNextId() {
        return this.idgenNextId;
    }
    
    public void setIdgenNextId(String idgenNextId) {
        this.idgenNextId = idgenNextId;
    }
    
}
