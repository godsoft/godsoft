package kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service;

/**
 * @Class Name : MigrGenerationOrderVO.java
 * @Description : MigrGenerationOrder VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MigrGenerationOrderVO extends MigrGenerationOrderDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** CONNECTION_ID_FK */
    private String connectionIdFk;
    
    /** OBJECT_ID */
    private String objectId;
    
    /** OBJECT_TYPE */
    private String objectType;
    
    /** GENERATION_ORDER */
    private String generationOrder;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getConnectionIdFk() {
        return this.connectionIdFk;
    }
    
    public void setConnectionIdFk(String connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }
    
    public String getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
    public String getGenerationOrder() {
        return this.generationOrder;
    }
    
    public void setGenerationOrder(String generationOrder) {
        this.generationOrder = generationOrder;
    }
    
}
