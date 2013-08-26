package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service;

/**
 * @Class Name : ComtnnttstatsVO.java
 * @Description : Comtnnttstats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnttstatsVO extends ComtnnttstatsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** STATS_ID */
    private String statsId;
    
    /** NTCE_CO */
    private String ntceCo;
    
    /** AVRG_RDCNT */
    private String avrgRdcnt;
    
    /** TOP_RDCNT */
    private String topRdcnt;
    
    /** MUMM_RDCNT */
    private String mummRdcnt;
    
    /** TOP_NTCR_ID */
    private String topNtcrId;
    
    public String getStatsId() {
        return this.statsId;
    }
    
    public void setStatsId(String statsId) {
        this.statsId = statsId;
    }
    
    public String getNtceCo() {
        return this.ntceCo;
    }
    
    public void setNtceCo(String ntceCo) {
        this.ntceCo = ntceCo;
    }
    
    public String getAvrgRdcnt() {
        return this.avrgRdcnt;
    }
    
    public void setAvrgRdcnt(String avrgRdcnt) {
        this.avrgRdcnt = avrgRdcnt;
    }
    
    public String getTopRdcnt() {
        return this.topRdcnt;
    }
    
    public void setTopRdcnt(String topRdcnt) {
        this.topRdcnt = topRdcnt;
    }
    
    public String getMummRdcnt() {
        return this.mummRdcnt;
    }
    
    public void setMummRdcnt(String mummRdcnt) {
        this.mummRdcnt = mummRdcnt;
    }
    
    public String getTopNtcrId() {
        return this.topNtcrId;
    }
    
    public void setTopNtcrId(String topNtcrId) {
        this.topNtcrId = topNtcrId;
    }
    
}
