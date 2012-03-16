package kr.godsoft.egovframe.generatorwebapp.ids.service;

/**
 * @Class Name : IdsVO.java
 * @Description : Ids VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class IdsVO extends IdsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** TABLE_NAME */
    private String tableName;
    
    /** NEXT_ID */
    private int nextId;
    
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    public int getNextId() {
        return this.nextId;
    }
    
    public void setNextId(int nextId) {
        this.nextId = nextId;
    }
    
}
