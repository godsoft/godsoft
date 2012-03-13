package kr.godsoft.egovframe.generatorwebapp.comtndeptjobbx.service;

/**
 * @Class Name : ComtndeptjobbxVO.java
 * @Description : Comtndeptjobbx VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtndeptjobbxVO extends ComtndeptjobbxDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String deptJobbxId;
    
    /**  */
    private String deptJobbxNm;
    
    /**  */
    private String deptId;
    
    /**  */
    private int indictOrdr;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getDeptJobbxId() {
        return this.deptJobbxId;
    }
    
    public void setDeptJobbxId(String deptJobbxId) {
        this.deptJobbxId = deptJobbxId;
    }
    
    public String getDeptJobbxNm() {
        return this.deptJobbxNm;
    }
    
    public void setDeptJobbxNm(String deptJobbxNm) {
        this.deptJobbxNm = deptJobbxNm;
    }
    
    public String getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    
    public int getIndictOrdr() {
        return this.indictOrdr;
    }
    
    public void setIndictOrdr(int indictOrdr) {
        this.indictOrdr = indictOrdr;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
}
