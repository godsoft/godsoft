package kr.godsoft.egovframe.generatorwebapp.md_columns.service;

/**
 * @Class Name : MdColumnsVO.java
 * @Description : MdColumns VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdColumnsVO extends MdColumnsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** TABLE_ID_FK */
    private String tableIdFk;
    
    /** COLUMN_NAME */
    private String columnName;
    
    /** COLUMN_ORDER */
    private String columnOrder;
    
    /** COLUMN_TYPE */
    private String columnType;
    
    /** PRECISION */
    private String precision;
    
    /** SCALE */
    private String scale;
    
    /** NULLABLE */
    private String nullable;
    
    /** DEFAULT_VALUE */
    private String defaultValue;
    
    /** NATIVE_SQL */
    private String nativeSql;
    
    /** NATIVE_KEY */
    private String nativeKey;
    
    /** DATATYPE_TRANSFORMED_FLAG */
    private String datatypeTransformedFlag;
    
    /** COMMENTS */
    private String comments;
    
    /** SECURITY_GROUP_ID */
    private String securityGroupId;
    
    /** CREATED_BY */
    private String createdBy;
    
    /** CREATED_ON */
    private String createdOn;
    
    /** LAST_UPDATED_BY */
    private String lastUpdatedBy;
    
    /** LAST_UPDATED_ON */
    private String lastUpdatedOn;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTableIdFk() {
        return this.tableIdFk;
    }
    
    public void setTableIdFk(String tableIdFk) {
        this.tableIdFk = tableIdFk;
    }
    
    public String getColumnName() {
        return this.columnName;
    }
    
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    
    public String getColumnOrder() {
        return this.columnOrder;
    }
    
    public void setColumnOrder(String columnOrder) {
        this.columnOrder = columnOrder;
    }
    
    public String getColumnType() {
        return this.columnType;
    }
    
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }
    
    public String getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(String precision) {
        this.precision = precision;
    }
    
    public String getScale() {
        return this.scale;
    }
    
    public void setScale(String scale) {
        this.scale = scale;
    }
    
    public String getNullable() {
        return this.nullable;
    }
    
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    public String getNativeSql() {
        return this.nativeSql;
    }
    
    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }
    
    public String getNativeKey() {
        return this.nativeKey;
    }
    
    public void setNativeKey(String nativeKey) {
        this.nativeKey = nativeKey;
    }
    
    public String getDatatypeTransformedFlag() {
        return this.datatypeTransformedFlag;
    }
    
    public void setDatatypeTransformedFlag(String datatypeTransformedFlag) {
        this.datatypeTransformedFlag = datatypeTransformedFlag;
    }
    
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }
    
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    public String getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
    
}
