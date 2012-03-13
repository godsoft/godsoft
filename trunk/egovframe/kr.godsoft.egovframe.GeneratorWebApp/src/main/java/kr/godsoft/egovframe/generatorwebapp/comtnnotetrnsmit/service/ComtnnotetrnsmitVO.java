package kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service;

/**
 * @Class Name : ComtnnotetrnsmitVO.java
 * @Description : Comtnnotetrnsmit VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnotetrnsmitVO extends ComtnnotetrnsmitDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String noteId;
    
    /**  */
    private String noteTrnsmitId;
    
    /**  */
    private String trnsmiterId;
    
    /**  */
    private String deleteAt;
    
    /**  */
    private String frstRegisterId;
    
    /**  */
    private String frstRegistPnttm;
    
    /**  */
    private String lastUpdusrId;
    
    /**  */
    private String lastUpdtPnttm;
    
    public String getNoteId() {
        return this.noteId;
    }
    
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    
    public String getNoteTrnsmitId() {
        return this.noteTrnsmitId;
    }
    
    public void setNoteTrnsmitId(String noteTrnsmitId) {
        this.noteTrnsmitId = noteTrnsmitId;
    }
    
    public String getTrnsmiterId() {
        return this.trnsmiterId;
    }
    
    public void setTrnsmiterId(String trnsmiterId) {
        this.trnsmiterId = trnsmiterId;
    }
    
    public String getDeleteAt() {
        return this.deleteAt;
    }
    
    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
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