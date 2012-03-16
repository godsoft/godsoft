package kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service;

/**
 * @Class Name : ComtnfiledetailVO.java
 * @Description : Comtnfiledetail VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnfiledetailVO extends ComtnfiledetailDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ATCH_FILE_ID */
    private String atchFileId;
    
    /** FILE_SN */
    private int fileSn;
    
    /** FILE_STRE_COURS */
    private String fileStreCours;
    
    /** STRE_FILE_NM */
    private String streFileNm;
    
    /** ORIGNL_FILE_NM */
    private String orignlFileNm;
    
    /** FILE_EXTSN */
    private String fileExtsn;
    
    /** FILE_CN */
    private String fileCn;
    
    /** FILE_SIZE */
    private int fileSize;
    
    public String getAtchFileId() {
        return this.atchFileId;
    }
    
    public void setAtchFileId(String atchFileId) {
        this.atchFileId = atchFileId;
    }
    
    public int getFileSn() {
        return this.fileSn;
    }
    
    public void setFileSn(int fileSn) {
        this.fileSn = fileSn;
    }
    
    public String getFileStreCours() {
        return this.fileStreCours;
    }
    
    public void setFileStreCours(String fileStreCours) {
        this.fileStreCours = fileStreCours;
    }
    
    public String getStreFileNm() {
        return this.streFileNm;
    }
    
    public void setStreFileNm(String streFileNm) {
        this.streFileNm = streFileNm;
    }
    
    public String getOrignlFileNm() {
        return this.orignlFileNm;
    }
    
    public void setOrignlFileNm(String orignlFileNm) {
        this.orignlFileNm = orignlFileNm;
    }
    
    public String getFileExtsn() {
        return this.fileExtsn;
    }
    
    public void setFileExtsn(String fileExtsn) {
        this.fileExtsn = fileExtsn;
    }
    
    public String getFileCn() {
        return this.fileCn;
    }
    
    public void setFileCn(String fileCn) {
        this.fileCn = fileCn;
    }
    
    public int getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    
}
