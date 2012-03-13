package kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service;

/**
 * @Class Name : ComtnnoterecptnVO.java
 * @Description : Comtnnoterecptn VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnnoterecptnVO extends ComtnnoterecptnDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String noteId;
    
    /**  */
    private String noteTrnsmitId;
    
    /**  */
    private String noteRecptnId;
    
    /**  */
    private String rcverId;
    
    /**  */
    private String openYn;
    
    /**  */
    private String recptnSe;
    
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
    
    public String getNoteRecptnId() {
        return this.noteRecptnId;
    }
    
    public void setNoteRecptnId(String noteRecptnId) {
        this.noteRecptnId = noteRecptnId;
    }
    
    public String getRcverId() {
        return this.rcverId;
    }
    
    public void setRcverId(String rcverId) {
        this.rcverId = rcverId;
    }
    
    public String getOpenYn() {
        return this.openYn;
    }
    
    public void setOpenYn(String openYn) {
        this.openYn = openYn;
    }
    
    public String getRecptnSe() {
        return this.recptnSe;
    }
    
    public void setRecptnSe(String recptnSe) {
        this.recptnSe = recptnSe;
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
