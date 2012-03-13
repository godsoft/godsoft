package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service;

/**
 * @Class Name : ComtnbackupschduldfkVO.java
 * @Description : Comtnbackupschduldfk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbackupschduldfkVO extends ComtnbackupschduldfkDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String backupOpertId;
    
    /**  */
    private String executSchdulDfkSe;
    
    public String getBackupOpertId() {
        return this.backupOpertId;
    }
    
    public void setBackupOpertId(String backupOpertId) {
        this.backupOpertId = backupOpertId;
    }
    
    public String getExecutSchdulDfkSe() {
        return this.executSchdulDfkSe;
    }
    
    public void setExecutSchdulDfkSe(String executSchdulDfkSe) {
        this.executSchdulDfkSe = executSchdulDfkSe;
    }
    
}
