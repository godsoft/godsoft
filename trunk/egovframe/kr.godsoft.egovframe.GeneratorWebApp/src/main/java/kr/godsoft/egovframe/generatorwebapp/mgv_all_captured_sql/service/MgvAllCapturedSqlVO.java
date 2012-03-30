package kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.service;

/**
 * @Class Name : MgvAllCapturedSqlVO.java
 * @Description : MgvAllCapturedSql VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MgvAllCapturedSqlVO extends MgvAllCapturedSqlDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** OBJTYPE */
    private String objtype;
    
    /** OBJECTNAME */
    private String objectname;
    
    /** NATIVE_SQL */
    private String nativeSql;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getObjtype() {
        return this.objtype;
    }
    
    public void setObjtype(String objtype) {
        this.objtype = objtype;
    }
    
    public String getObjectname() {
        return this.objectname;
    }
    
    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }
    
    public String getNativeSql() {
        return this.nativeSql;
    }
    
    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }
    
}
