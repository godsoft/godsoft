package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service;

/**
 * @Class Name : ComtecopseqVO.java
 * @Description : Comtecopseq VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtecopseqVO extends ComtecopseqDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /**  */
    private String tableName;
    
    /**  */
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
