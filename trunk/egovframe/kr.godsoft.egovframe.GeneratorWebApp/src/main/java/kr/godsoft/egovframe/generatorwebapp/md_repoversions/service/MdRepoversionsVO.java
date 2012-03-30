package kr.godsoft.egovframe.generatorwebapp.md_repoversions.service;

/**
 * @Class Name : MdRepoversionsVO.java
 * @Description : MdRepoversions VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdRepoversionsVO extends MdRepoversionsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** REVISION */
    private String revision;
    
    public String getRevision() {
        return this.revision;
    }
    
    public void setRevision(String revision) {
        this.revision = revision;
    }
    
}
