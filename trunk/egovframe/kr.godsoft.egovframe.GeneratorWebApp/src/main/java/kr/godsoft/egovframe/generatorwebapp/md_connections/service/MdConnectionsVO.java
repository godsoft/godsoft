package kr.godsoft.egovframe.generatorwebapp.md_connections.service;

/**
 * @Class Name : MdConnectionsVO.java
 * @Description : MdConnections VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MdConnectionsVO extends MdConnectionsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    private String id;
    
    /** PROJECT_ID_FK */
    private String projectIdFk;
    
    /** TYPE */
    private String type;
    
    /** HOST */
    private String host;
    
    /** PORT */
    private String port;
    
    /** USERNAME */
    private String username;
    
    /** PASSWORD */
    private String password;
    
    /** DBURL */
    private String dburl;
    
    /** NAME */
    private String name;
    
    /** NATIVE_SQL */
    private String nativeSql;
    
    /** NUM_CATALOGS */
    private String numCatalogs;
    
    /** NUM_COLUMNS */
    private String numColumns;
    
    /** NUM_CONSTRAINTS */
    private String numConstraints;
    
    /** NUM_GROUPS */
    private String numGroups;
    
    /** NUM_ROLES */
    private String numRoles;
    
    /** NUM_INDEXES */
    private String numIndexes;
    
    /** NUM_OTHER_OBJECTS */
    private String numOtherObjects;
    
    /** NUM_PACKAGES */
    private String numPackages;
    
    /** NUM_PRIVILEGES */
    private String numPrivileges;
    
    /** NUM_SCHEMAS */
    private String numSchemas;
    
    /** NUM_SEQUENCES */
    private String numSequences;
    
    /** NUM_STORED_PROGRAMS */
    private String numStoredPrograms;
    
    /** NUM_SYNONYMS */
    private String numSynonyms;
    
    /** NUM_TABLES */
    private String numTables;
    
    /** NUM_TABLESPACES */
    private String numTablespaces;
    
    /** NUM_TRIGGERS */
    private String numTriggers;
    
    /** NUM_USER_DEFINED_DATA_TYPES */
    private String numUserDefinedDataTypes;
    
    /** NUM_USERS */
    private String numUsers;
    
    /** NUM_VIEWS */
    private String numViews;
    
    /** COMMENTS */
    private String comments;
    
    /** SECURITY_GROUP_ID */
    private String securityGroupId;
    
    /** CREATED_ON */
    private String createdOn;
    
    /** CREATED_BY */
    private String createdBy;
    
    /** LAST_UPDATED_ON */
    private String lastUpdatedOn;
    
    /** LAST_UPDATED_BY */
    private String lastUpdatedBy;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getProjectIdFk() {
        return this.projectIdFk;
    }
    
    public void setProjectIdFk(String projectIdFk) {
        this.projectIdFk = projectIdFk;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public String getPort() {
        return this.port;
    }
    
    public void setPort(String port) {
        this.port = port;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getDburl() {
        return this.dburl;
    }
    
    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNativeSql() {
        return this.nativeSql;
    }
    
    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }
    
    public String getNumCatalogs() {
        return this.numCatalogs;
    }
    
    public void setNumCatalogs(String numCatalogs) {
        this.numCatalogs = numCatalogs;
    }
    
    public String getNumColumns() {
        return this.numColumns;
    }
    
    public void setNumColumns(String numColumns) {
        this.numColumns = numColumns;
    }
    
    public String getNumConstraints() {
        return this.numConstraints;
    }
    
    public void setNumConstraints(String numConstraints) {
        this.numConstraints = numConstraints;
    }
    
    public String getNumGroups() {
        return this.numGroups;
    }
    
    public void setNumGroups(String numGroups) {
        this.numGroups = numGroups;
    }
    
    public String getNumRoles() {
        return this.numRoles;
    }
    
    public void setNumRoles(String numRoles) {
        this.numRoles = numRoles;
    }
    
    public String getNumIndexes() {
        return this.numIndexes;
    }
    
    public void setNumIndexes(String numIndexes) {
        this.numIndexes = numIndexes;
    }
    
    public String getNumOtherObjects() {
        return this.numOtherObjects;
    }
    
    public void setNumOtherObjects(String numOtherObjects) {
        this.numOtherObjects = numOtherObjects;
    }
    
    public String getNumPackages() {
        return this.numPackages;
    }
    
    public void setNumPackages(String numPackages) {
        this.numPackages = numPackages;
    }
    
    public String getNumPrivileges() {
        return this.numPrivileges;
    }
    
    public void setNumPrivileges(String numPrivileges) {
        this.numPrivileges = numPrivileges;
    }
    
    public String getNumSchemas() {
        return this.numSchemas;
    }
    
    public void setNumSchemas(String numSchemas) {
        this.numSchemas = numSchemas;
    }
    
    public String getNumSequences() {
        return this.numSequences;
    }
    
    public void setNumSequences(String numSequences) {
        this.numSequences = numSequences;
    }
    
    public String getNumStoredPrograms() {
        return this.numStoredPrograms;
    }
    
    public void setNumStoredPrograms(String numStoredPrograms) {
        this.numStoredPrograms = numStoredPrograms;
    }
    
    public String getNumSynonyms() {
        return this.numSynonyms;
    }
    
    public void setNumSynonyms(String numSynonyms) {
        this.numSynonyms = numSynonyms;
    }
    
    public String getNumTables() {
        return this.numTables;
    }
    
    public void setNumTables(String numTables) {
        this.numTables = numTables;
    }
    
    public String getNumTablespaces() {
        return this.numTablespaces;
    }
    
    public void setNumTablespaces(String numTablespaces) {
        this.numTablespaces = numTablespaces;
    }
    
    public String getNumTriggers() {
        return this.numTriggers;
    }
    
    public void setNumTriggers(String numTriggers) {
        this.numTriggers = numTriggers;
    }
    
    public String getNumUserDefinedDataTypes() {
        return this.numUserDefinedDataTypes;
    }
    
    public void setNumUserDefinedDataTypes(String numUserDefinedDataTypes) {
        this.numUserDefinedDataTypes = numUserDefinedDataTypes;
    }
    
    public String getNumUsers() {
        return this.numUsers;
    }
    
    public void setNumUsers(String numUsers) {
        this.numUsers = numUsers;
    }
    
    public String getNumViews() {
        return this.numViews;
    }
    
    public void setNumViews(String numViews) {
        this.numViews = numViews;
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
    
    public String getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
    
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
}
