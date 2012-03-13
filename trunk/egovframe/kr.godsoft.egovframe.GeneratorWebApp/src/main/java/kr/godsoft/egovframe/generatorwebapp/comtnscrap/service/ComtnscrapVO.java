package kr.godsoft.egovframe.generatorwebapp.comtnscrap.service;

/**
 * @Class Name : ComtnscrapVO.java
 * @Description : Comtnscrap VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnscrapVO extends ComtnscrapDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String scrapId;
    
    /**  */
    private int nttId;
    
    /**  */
    private String bbsId;
    
    /**  */
    private String scrapNm;
    
    /**  */
    private String useAt;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdtPnttm;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String lastUpdusrId;
    
    public String getScrapId() {
        return this.scrapId;
    }
    
    public void setScrapId(String scrapId) {
        this.scrapId = scrapId;
    }
    
    public int getNttId() {
        return this.nttId;
    }
    
    public void setNttId(int nttId) {
        this.nttId = nttId;
    }
    
    public String getBbsId() {
        return this.bbsId;
    }
    
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    
    public String getScrapNm() {
        return this.scrapNm;
    }
    
    public void setScrapNm(String scrapNm) {
        this.scrapNm = scrapNm;
    }
    
    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
