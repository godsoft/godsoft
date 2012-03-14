package kr.godsoft.egovframe.egovframegenerator.columns.service;

/**
 * @Class Name : ColumnsVO.java
 * @Description : Columns VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-14
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ColumnsVO extends ColumnsDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** TABLE_CATALOG */
    private java.lang.String tableCatalog;
    
    /** TABLE_SCHEMA */
    private java.lang.String tableSchema;
    
    /** TABLE_NAME */
    private java.lang.String tableName;
    
    /** COLUMN_NAME */
    private java.lang.String columnName;
    
    /** ORDINAL_POSITION */
    private java.math.BigInteger ordinalPosition;
    
    /** COLUMN_DEFAULT */
    private java.lang.String columnDefault;
    
    /** IS_NULLABLE */
    private java.lang.String isNullable;
    
    /** DATA_TYPE */
    private java.lang.String dataType;
    
    /** CHARACTER_MAXIMUM_LENGTH */
    private java.math.BigInteger characterMaximumLength;
    
    /** CHARACTER_OCTET_LENGTH */
    private java.math.BigInteger characterOctetLength;
    
    /** NUMERIC_PRECISION */
    private java.math.BigInteger numericPrecision;
    
    /** NUMERIC_SCALE */
    private java.math.BigInteger numericScale;
    
    /** CHARACTER_SET_NAME */
    private java.lang.String characterSetName;
    
    /** COLLATION_NAME */
    private java.lang.String collationName;
    
    /** COLUMN_TYPE */
    private java.lang.String columnType;
    
    /** COLUMN_KEY */
    private java.lang.String columnKey;
    
    /** EXTRA */
    private java.lang.String extra;
    
    /** PRIVILEGES */
    private java.lang.String privileges;
    
    /** COLUMN_COMMENT */
    private java.lang.String columnComment;
    
    public java.lang.String getTableCatalog() {
        return this.tableCatalog;
    }
    
    public void setTableCatalog(java.lang.String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }
    
    public java.lang.String getTableSchema() {
        return this.tableSchema;
    }
    
    public void setTableSchema(java.lang.String tableSchema) {
        this.tableSchema = tableSchema;
    }
    
    public java.lang.String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }
    
    public java.lang.String getColumnName() {
        return this.columnName;
    }
    
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }
    
    public java.math.BigInteger getOrdinalPosition() {
        return this.ordinalPosition;
    }
    
    public void setOrdinalPosition(java.math.BigInteger ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
    
    public java.lang.String getColumnDefault() {
        return this.columnDefault;
    }
    
    public void setColumnDefault(java.lang.String columnDefault) {
        this.columnDefault = columnDefault;
    }
    
    public java.lang.String getIsNullable() {
        return this.isNullable;
    }
    
    public void setIsNullable(java.lang.String isNullable) {
        this.isNullable = isNullable;
    }
    
    public java.lang.String getDataType() {
        return this.dataType;
    }
    
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }
    
    public java.math.BigInteger getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }
    
    public void setCharacterMaximumLength(java.math.BigInteger characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }
    
    public java.math.BigInteger getCharacterOctetLength() {
        return this.characterOctetLength;
    }
    
    public void setCharacterOctetLength(java.math.BigInteger characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }
    
    public java.math.BigInteger getNumericPrecision() {
        return this.numericPrecision;
    }
    
    public void setNumericPrecision(java.math.BigInteger numericPrecision) {
        this.numericPrecision = numericPrecision;
    }
    
    public java.math.BigInteger getNumericScale() {
        return this.numericScale;
    }
    
    public void setNumericScale(java.math.BigInteger numericScale) {
        this.numericScale = numericScale;
    }
    
    public java.lang.String getCharacterSetName() {
        return this.characterSetName;
    }
    
    public void setCharacterSetName(java.lang.String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    public java.lang.String getCollationName() {
        return this.collationName;
    }
    
    public void setCollationName(java.lang.String collationName) {
        this.collationName = collationName;
    }
    
    public java.lang.String getColumnType() {
        return this.columnType;
    }
    
    public void setColumnType(java.lang.String columnType) {
        this.columnType = columnType;
    }
    
    public java.lang.String getColumnKey() {
        return this.columnKey;
    }
    
    public void setColumnKey(java.lang.String columnKey) {
        this.columnKey = columnKey;
    }
    
    public java.lang.String getExtra() {
        return this.extra;
    }
    
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }
    
    public java.lang.String getPrivileges() {
        return this.privileges;
    }
    
    public void setPrivileges(java.lang.String privileges) {
        this.privileges = privileges;
    }
    
    public java.lang.String getColumnComment() {
        return this.columnComment;
    }
    
    public void setColumnComment(java.lang.String columnComment) {
        this.columnComment = columnComment;
    }
    
}
