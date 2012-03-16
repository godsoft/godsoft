package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service;

/**
 * @Class Name : ComtnnttstatsVO.java
 * @Description : Comtnnttstats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
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
    private int ntceCo;
    
    /** AVRG_RDCNT */
    private int avrgRdcnt;
    
    /** TOP_RDCNT */
    private int topRdcnt;
    
    /** MUMM_RDCNT */
    private int mummRdcnt;
    
    /** TOP_NTCR_ID */
    private String topNtcrId;
    
    public String getStatsId() {
        return this.statsId;
    }
    
    public void setStatsId(String statsId) {
        this.statsId = statsId;
    }
    
    public int getNtceCo() {
        return this.ntceCo;
    }
    
    public void setNtceCo(int ntceCo) {
        this.ntceCo = ntceCo;
    }
    
    public int getAvrgRdcnt() {
        return this.avrgRdcnt;
    }
    
    public void setAvrgRdcnt(int avrgRdcnt) {
        this.avrgRdcnt = avrgRdcnt;
    }
    
    public int getTopRdcnt() {
        return this.topRdcnt;
    }
    
    public void setTopRdcnt(int topRdcnt) {
        this.topRdcnt = topRdcnt;
    }
    
    public int getMummRdcnt() {
        return this.mummRdcnt;
    }
    
    public void setMummRdcnt(int mummRdcnt) {
        this.mummRdcnt = mummRdcnt;
    }
    
    public String getTopNtcrId() {
        return this.topNtcrId;
    }
    
    public void setTopNtcrId(String topNtcrId) {
        this.topNtcrId = topNtcrId;
    }
    
}
