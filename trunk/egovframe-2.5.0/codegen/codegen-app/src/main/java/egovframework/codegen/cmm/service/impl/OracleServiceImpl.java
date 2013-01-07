package egovframework.codegen.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Attribute;
import model.DataModelContext;
import model.Entity;
import model.Packages;
import operation.CrudCodeGen;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import egovframework.codegen.alltabcolumns.service.impl.AllTabColumnsDAO;
import egovframework.codegen.alltables.service.impl.AllTablesDAO;
import egovframework.codegen.cmm.service.IsGen;
import egovframework.codegen.cmm.service.OracleService;
import egovframework.codegen.util.CmmUtils;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("oracleService")
public class OracleServiceImpl extends AbstractServiceImpl implements
        OracleService {

    @Resource(name = "allTablesDAO")
    private AllTablesDAO allTablesDAO;

    @Resource(name = "allTabColumnsDAO")
    private AllTabColumnsDAO allTabColumnsDAO;

    private List<EgovMap> tables;
    private List<EgovMap> columns;

    private DataModelContext dataModel;
    private List<DataModelContext> dataModels;
    private CrudCodeGen crudCodeGen;

    public void tables(EgovMap egovMap) throws Exception {
        tables = allTablesDAO.selectAllTablesList(egovMap);
    }

    public void columns(EgovMap egovMap) throws Exception {
        columns = allTabColumnsDAO.selectAllTabColumnsList(egovMap);
    }

    public void init(DataModelContext dataModel) throws Exception {
        this.dataModel = dataModel;

        dataModels();

        // pathname();

        sqlMapResources();

        crudCodeGen = new CrudCodeGen();
    }

    private void dataModels() throws Exception {
        dataModels = new ArrayList<DataModelContext>();

        for (EgovMap table : tables) {
            String tableName = (String) table.get("tableName");

            if ("SAMPLE".equals(tableName)) {
                tableName = "SAMPLE2";
            }

            DataModelContext dataModel = new DataModelContext();

            BeanUtils.copyProperties(dataModel, this.dataModel);

            dataModel.setEntity(new Entity(tableName.toLowerCase()));

            List<Attribute> primaryKeys = new ArrayList<Attribute>();
            List<Attribute> attributes = new ArrayList<Attribute>();

            for (EgovMap column : columns) {
                String tableNameColumn = (String) column.get("tableName");
                String columnName = (String) column.get("columnName");
                String dataType = (String) column.get("dataType");
                String columnComments = (String) column.get("columnComments");
                String constraintType = (String) column.get("constraintType");

                if (tableNameColumn.equals(tableName)) {
                    Attribute attribute = new Attribute(
                            columnName.toLowerCase());
                    attribute.setJavaType(CmmUtils.getJavaType(dataType));

                    attribute.setColumnComments(columnComments);

                    attributes.add(attribute);

                    if ("P".equals(constraintType)) {
                        primaryKeys.add(attribute);
                    }
                }
            }

            dataModel.setPrimaryKeys(primaryKeys);
            dataModel.setAttributes(attributes);

            setPackage(dataModel);

            dataModels.add(dataModel);
        }
    }

    private void setPackage(DataModelContext dataModel) {
        Packages packages = new Packages();

        packages.setVoPackage(dataModel);
        packages.setServicePackage(dataModel);
        packages.setDaoPackage(dataModel);
        packages.setImplPackage(dataModel);
        packages.setControllerPackage(dataModel);

        dataModel.setPackages(packages);
    }

    // private void pathname() throws Exception {
    // for (DataModelContext dataModel : dataModels) {
    // dataModel.getPathname().setSqlMapPath(dataModel);
    //
    // // service
    // dataModel.getPathname().setDefaultVoPath(dataModel);
    // dataModel.getPathname().setVoPath(dataModel);
    // dataModel.getPathname().setServicePath(dataModel);
    //
    // // service.impl
    // dataModel.getPathname().setDaoPath(dataModel);
    // dataModel.getPathname().setServiceImplPath(dataModel);
    //
    // // web
    // dataModel.getPathname().setControllerPath(dataModel);
    //
    // // jsp
    // dataModel.getPathname().setListPath(dataModel);
    // dataModel.getPathname().setRegistPath(dataModel);
    //
    // if (log.isDebugEnabled()) {
    // log.debug("sqlMapPath="
    // + dataModel.getPathname().getSqlMapPath());
    //
    // // service
    // log.debug("defaultVoPath="
    // + dataModel.getPathname().getDefaultVoPath());
    // log.debug("voPath=" + dataModel.getPathname().getVoPath());
    // log.debug("servicePath="
    // + dataModel.getPathname().getServicePath());
    //
    // // service.impl
    // log.debug("daoPath=" + dataModel.getPathname().getDaoPath());
    // log.debug("daoPath="
    // + dataModel.getPathname().getServiceImplPath());
    //
    // // web
    // log.debug("controllerPath="
    // + dataModel.getPathname().getControllerPath());
    //
    // // jsp
    // log.debug("listPath=" + dataModel.getPathname().getListPath());
    // log.debug("registPath="
    // + dataModel.getPathname().getRegistPath());
    // }
    // }
    //
    // dataModel.getPathname().setSqlMapConfigPath(dataModel);
    //
    // if (log.isDebugEnabled()) {
    // log.debug("sqlMapConfigPath="
    // + dataModel.getPathname().getSqlMapConfigPath());
    // }
    // }

    private void sqlMapResources() throws Exception {
        List<String> sqlMapResources = new ArrayList<String>();

        for (DataModelContext dataModel : dataModels) {
            StringBuilder sb = new StringBuilder();

            sb.append("egovframework/sqlmap/");
            sb.append(dataModel.getProjectName());
            sb.append("/");
            sb.append(dataModel.getEntity().getLcName());
            sb.append("/");
            sb.append(dataModel.getEntity().getPcName());
            sb.append("_SQL_");
            sb.append(dataModel.getVendor());
            sb.append(".xml");

            sqlMapResources.add(sb.toString());
        }

        dataModel.setSqlMapResources(sqlMapResources);
    }

    public void sqlMap(IsGen isGen) throws Exception {
        for (DataModelContext dataModel : dataModels) {
            if (isGen.isSqlMap() == true) {
                dataModel.getPathname().setSqlMapPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/resource/pkg/EgovSample_Sample2_SQL.vm",
                        dataModel.getPathname().getSqlMapPath());
            }

            // service
            if (isGen.isDefaultVO() == true) {
                dataModel.getPathname().setDefaultVoPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/java/pkg/service/Sample2DefaultVO.vm",
                        dataModel.getPathname().getDefaultVoPath());
            }

            if (isGen.isVo() == true) {
                dataModel.getPathname().setVoPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/java/pkg/service/Sample2VO.vm", dataModel
                                .getPathname().getVoPath());
            }

            if (isGen.isService() == true) {
                dataModel.getPathname().setServicePath(dataModel);

                generate(dataModel,
                        "godsoft/crud/java/pkg/service/EgovSample2Service.vm",
                        dataModel.getPathname().getServicePath());
            }

            // service.impl
            if (isGen.isDao() == true) {
                dataModel.getPathname().setDaoPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/java/pkg/service/impl/Sample2DAO.vm",
                        dataModel.getPathname().getDaoPath());
            }

            if (isGen.isServiceImpl() == true) {
                dataModel.getPathname().setServiceImplPath(dataModel);

                generate(
                        dataModel,
                        "godsoft/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm",
                        dataModel.getPathname().getServiceImplPath());
            }

            // web
            if (isGen.isController() == true) {
                dataModel.getPathname().setControllerPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/java/pkg/web/EgovSample2Controller.vm",
                        dataModel.getPathname().getControllerPath());
            }

            // jsp
            if (isGen.isList() == true) {

                dataModel.getPathname().setListPath(dataModel);

                generate(dataModel, "godsoft/crud/jsp/pkg/egovSample2List.vm",
                        dataModel.getPathname().getListPath());
            }

            if (isGen.isRegist() == true) {
                dataModel.getPathname().setRegistPath(dataModel);

                generate(dataModel,
                        "godsoft/crud/jsp/pkg/egovSample2Register.vm",
                        dataModel.getPathname().getRegistPath());
            }
        }

        if (isGen.isSqlMapConfig() == true) {
            dataModel.getPathname().setSqlMapConfigPath(dataModel);

            generate(dataModel, "godsoft/crud/resource/pkg/sql-map-config.vm",
                    dataModel.getPathname().getSqlMapConfigPath());
        }
    }

    private void generate(DataModelContext dataModel, String templateFile,
            String pathname) throws Exception {
        if (log.isDebugEnabled()) {
            log.debug(pathname);
        }

        String data = crudCodeGen.generate(dataModel, templateFile);

        CmmUtils.writeStringToFile(pathname, data);
    }

}
