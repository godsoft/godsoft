package kr.godsoft.egovframe.generatorwebapp.sample.service;

/**
 * @Class Name : SampleVO.java
 * @Description : Sample VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class SampleVO extends SampleDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** NAME */
    private String name;
    
    /** DESCRIPTION */
    private String description;
    
    /** USE_YN */
    private String useYn;
    
    /** REG_USER */
    private String regUser;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getUseYn() {
        return this.useYn;
    }
    
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
    
    public String getRegUser() {
        return this.regUser;
    }
    
    public void setRegUser(String regUser) {
        this.regUser = regUser;
    }
    
}
