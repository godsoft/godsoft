package egovframework.codegen.cmm.service;

public class IsGen {

    private boolean sqlMap;
    private boolean sqlMapConfig;

    // service
    private boolean defaultVO;
    private boolean vo;
    private boolean service;

    // service.impl
    private boolean dao;
    private boolean serviceImpl;

    // web
    private boolean controller;

    // jsp
    private boolean list;
    private boolean regist;

    public boolean isSqlMap() {
        return sqlMap;
    }

    public void setSqlMap(boolean sqlMap) {
        this.sqlMap = sqlMap;
    }

    public boolean isSqlMapConfig() {
        return sqlMapConfig;
    }

    public void setSqlMapConfig(boolean sqlMapConfig) {
        this.sqlMapConfig = sqlMapConfig;
    }

    public boolean isDefaultVO() {
        return defaultVO;
    }

    public void setDefaultVO(boolean defaultVO) {
        this.defaultVO = defaultVO;
    }

    public boolean isVo() {
        return vo;
    }

    public void setVo(boolean vo) {
        this.vo = vo;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    public boolean isDao() {
        return dao;
    }

    public void setDao(boolean dao) {
        this.dao = dao;
    }

    public boolean isServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(boolean serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public boolean isController() {
        return controller;
    }

    public void setController(boolean controller) {
        this.controller = controller;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
    }

    public boolean isRegist() {
        return regist;
    }

    public void setRegist(boolean regist) {
        this.regist = regist;
    }

}
