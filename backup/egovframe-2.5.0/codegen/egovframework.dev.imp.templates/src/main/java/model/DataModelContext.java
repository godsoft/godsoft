package model;

import java.util.ArrayList;
import java.util.List;

public class DataModelContext {
    private String author;
    private String createDate;
    private String team;

    public String getAuthor() {
        return author;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    private String packageName;

    public String getPackageName() {
        return packageName;
    }

    public String getPackageNamePath() {
        return packageName.replaceAll("\\.", "/");
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    private Entity entity;
    private List<Attribute> attributes;
    private List<Attribute> primaryKeys;

    public List<Attribute> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<Attribute> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    private String vendor;
    private Packages packages;
    private Pathname pathname;
    private String projectName;

    private String appJs;
    private String appJs1;
    private String appJs2;

    private List<String> sqlMapResources;

    private List<Entity> entities = new ArrayList<Entity>();

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Packages getPackages() {
        return packages;
    }

    public void setPackages(Packages packages) {
        this.packages = packages;
    }

    public Pathname getPathname() {
        return pathname;
    }

    public void setPathname(Pathname pathname) {
        this.pathname = pathname;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getSqlMapResources() {
        return sqlMapResources;
    }

    public void setSqlMapResources(List<String> sqlMapResources) {
        this.sqlMapResources = sqlMapResources;
    }

    public String getAppJs() {
        return appJs;
    }

    public void setAppJs(String appJs) {
        this.appJs = appJs;
    }

    public String getAppJs1() {
        return appJs1;
    }

    public void setAppJs1(String appJs1) {
        this.appJs1 = appJs1;
    }

    public String getAppJs2() {
        return appJs2;
    }

    public void setAppJs2(String appJs2) {
        this.appJs2 = appJs2;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

}
