package kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service;

/**
 * @Class Name : ComtsusersummaryVO.java
 * @Description : Comtsusersummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtsusersummaryVO extends ComtsusersummaryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OCCRRNC_DE */
    private String occrrncDe;
    
    /** STATS_SE */
    private String statsSe;
    
    /** DETAIL_STATS_SE */
    private String detailStatsSe;
    
    /** USER_CO */
    private int userCo;
    
    public String getOccrrncDe() {
        return this.occrrncDe;
    }
    
    public void setOccrrncDe(String occrrncDe) {
        this.occrrncDe = occrrncDe;
    }
    
    public String getStatsSe() {
        return this.statsSe;
    }
    
    public void setStatsSe(String statsSe) {
        this.statsSe = statsSe;
    }
    
    public String getDetailStatsSe() {
        return this.detailStatsSe;
    }
    
    public void setDetailStatsSe(String detailStatsSe) {
        this.detailStatsSe = detailStatsSe;
    }
    
    public int getUserCo() {
        return this.userCo;
    }
    
    public void setUserCo(int userCo) {
        this.userCo = userCo;
    }
    
}
