package kr.godsoft.egovframe.generatorwebapp.md_registry.service;

/**
 * @Class Name : MdRegistryVO.java
 * @Description : MdRegistry VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdRegistryVO extends MdRegistryDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** OBJECT_TYPE */
    private String objectType;
    
    /** OBJECT_NAME */
    private String objectName;
    
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    
}
