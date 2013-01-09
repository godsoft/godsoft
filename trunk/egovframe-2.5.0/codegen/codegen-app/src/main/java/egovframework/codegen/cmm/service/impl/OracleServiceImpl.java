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

    private StringBuilder appJs = new StringBuilder();
    private StringBuilder appJs1 = new StringBuilder();
    private StringBuilder appJs2 = new StringBuilder();

    public void tables(EgovMap egovMap) throws Exception {
        tables = allTablesDAO.selectAllTablesList(egovMap);
    }

    public void columns(EgovMap egovMap) throws Exception {
        columns = allTabColumnsDAO.selectAllTabColumnsList(egovMap);
    }

    public void init(DataModelContext dataModel) throws Exception {
        this.dataModel = dataModel;

        dataModels();

        sqlMapResources();

        crudCodeGen = new CrudCodeGen();
    }

    private void dataModels() throws Exception {
        dataModels = new ArrayList<DataModelContext>();

        for (EgovMap table : tables) {
            String tableName = (String) table.get("tableName");

            DataModelContext dataModel = new DataModelContext();

            BeanUtils.copyProperties(dataModel, this.dataModel);

            String alias = "";

            if ("SAMPLE".equals(tableName)) {
                alias = tableName.toLowerCase();
                tableName = "sample2";
            }

            Entity entity = new Entity(tableName.toLowerCase());
            entity.setAlias(alias);
            dataModel.setEntity(entity);

            List<Attribute> primaryKeys = new ArrayList<Attribute>();
            List<Attribute> attributes = new ArrayList<Attribute>();

            for (EgovMap column : columns) {
                String tableNameColumn = (String) column.get("tableName");
                String columnName = (String) column.get("columnName");
                String dataType = (String) column.get("dataType");
                String columnComments = (String) column.get("columnComments");
                String constraintType = (String) column.get("constraintType");

                if (tableNameColumn.equals((String) table.get("tableName"))) {
                    Attribute attribute = new Attribute(
                            columnName.toLowerCase());
                    attribute.setJavaType(CmmUtils.getJavaType(dataType));

                    attribute.setColumnComments(columnComments);

                    if ("P".equals(constraintType)) {
                        attribute.setPrimaryKey(true);

                        primaryKeys.add(attribute);
                    }

                    attributes.add(attribute);
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

            // js
            if (isGen.isExtjs() == true) {
                dataModel.getPathname().setExtjsPath(dataModel);

                generate(dataModel, "godsoft/crud/js/GridWindow.vm", dataModel
                        .getPathname().getExtjsPath());

                // 'MyDesktop.GridWindow',
                appJs.append("'MyDesktop.");
                appJs.append(dataModel.getEntity().getPcName());
                appJs.append("GridWindow',");
                appJs.append("\n");

                // new MyDesktop.GridWindow(),
                appJs1.append("new MyDesktop.");
                appJs1.append(dataModel.getEntity().getPcName());
                appJs1.append("GridWindow(),");
                appJs1.append("\n");

                // { name: 'Grid Window', iconCls: 'grid-shortcut', module:
                // 'grid-win' },
                appJs2.append("{ name: '");
                appJs2.append(dataModel.getEntity().getPcName());
                appJs2.append(" Grid Window', iconCls: 'grid-shortcut'");
                appJs2.append(", module: 'grid-win-");
                appJs2.append(dataModel.getEntity().getLcName());
                appJs2.append("' },");
                appJs2.append("\n");
            }
        }

        if (isGen.isSqlMapConfig() == true) {
            dataModel.getPathname().setSqlMapConfigPath(dataModel);

            generate(dataModel, "godsoft/crud/resource/pkg/sql-map-config.vm",
                    dataModel.getPathname().getSqlMapConfigPath());

        }

        // js
        if (isGen.isExtjs() == true) {
            if (log.isDebugEnabled()) {
                log.debug(appJs.toString());
                log.debug(appJs1.toString());
                log.debug(appJs2.toString());
            }
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
