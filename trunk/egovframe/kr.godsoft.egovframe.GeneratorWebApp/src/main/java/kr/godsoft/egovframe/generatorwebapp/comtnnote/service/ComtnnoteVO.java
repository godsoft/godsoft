package kr.godsoft.egovframe.generatorwebapp.comtnnote.service;

/**
 * @Class Name : ComtnnoteVO.java
 * @Description : Comtnnote VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnoteVO extends ComtnnoteDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** NOTE_ID */
    private String noteId;
    
    /** NOTE_SJ */
    private String noteSj;
    
    /** NOTE_CN */
    private String noteCn;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    
    public String getNoteSj() {
        return this.noteSj;
    }
    
    public void setNoteSj(String noteSj) {
        this.noteSj = noteSj;
    }
    
    public String getNoteCn() {
        return this.noteCn;
    }
    
    public void setNoteCn(String noteCn) {
        this.noteCn = noteCn;
    }
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
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
