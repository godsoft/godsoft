package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service;

/**
 * @Class Name : ComtsbbssummaryVO.java
 * @Description : Comtsbbssummary VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtsbbssummaryVO extends ComtsbbssummaryDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String occrrncDe;
    
    /**  */
    private String statsSe;
    
    /**  */
    private String detailStatsSe;
    
    /**  */
    private int creatCo;
    
    /**  */
    private int totRdcnt;
    
    /**  */
    private int avrgRdcnt;
    
    /**  */
    private String topInqireBbscttId;
    
    /**  */
    private String mummInqireBbscttId;
    
    /**  */
    private String topNtcrId;
    
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
    
    public int getCreatCo() {
        return this.creatCo;
    }
    
    public void setCreatCo(int creatCo) {
        this.creatCo = creatCo;
    }
    
    public int getTotRdcnt() {
        return this.totRdcnt;
    }
    
    public void setTotRdcnt(int totRdcnt) {
        this.totRdcnt = totRdcnt;
    }
    
    public int getAvrgRdcnt() {
        return this.avrgRdcnt;
    }
    
    public void setAvrgRdcnt(int avrgRdcnt) {
        this.avrgRdcnt = avrgRdcnt;
    }
    
    public String getTopInqireBbscttId() {
        return this.topInqireBbscttId;
    }
    
    public void setTopInqireBbscttId(String topInqireBbscttId) {
        this.topInqireBbscttId = topInqireBbscttId;
    }
    
    public String getMummInqireBbscttId() {
        return this.mummInqireBbscttId;
    }
    
    public void setMummInqireBbscttId(String mummInqireBbscttId) {
        this.mummInqireBbscttId = mummInqireBbscttId;
    }
    
    public String getTopNtcrId() {
        return this.topNtcrId;
    }
    
    public void setTopNtcrId(String topNtcrId) {
        this.topNtcrId = topNtcrId;
    }
    
}
