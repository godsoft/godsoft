package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service;

/**
 * @Class Name : ComtnnttstatsVO.java
 * @Description : Comtnnttstats VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnttstatsVO extends ComtnnttstatsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String statsId;
    
    /**  */
    private int ntceCo;
    
    /**  */
    private int avrgRdcnt;
    
    /**  */
    private int topRdcnt;
    
    /**  */
    private int mummRdcnt;
    
    /**  */
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
