package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service;

/**
 * @Class Name : ComtnbackupschduldfkVO.java
 * @Description : Comtnbackupschduldfk VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnbackupschduldfkVO extends ComtnbackupschduldfkDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** BACKUP_OPERT_ID */
    private String backupOpertId;
    
    /** EXECUT_SCHDUL_DFK_SE */
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
