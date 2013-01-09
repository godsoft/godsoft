package egovframework.codegen.ids.service;

/**
 * @Class Name : IdsVO.java
 * @Description : Ids VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public class IdsVO extends IdsDefaultVO {
    private static final long serialVersionUID = 1L;

    /** table_name */
    private String tableName;

    /** next_id */
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
