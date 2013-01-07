package egovframework.codegen.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Attribute;
import model.DataModelContext;
import model.Entity;
import model.Package;
import operation.CrudCodeGen;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import egovframework.codegen.alltabcolumns.service.impl.AllTabColumnsDAO;
import egovframework.codegen.alltables.service.impl.AllTablesDAO;
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

        crudCodeGen = new CrudCodeGen();
    }

    private void dataModels() throws Exception {
        dataModels = new ArrayList<DataModelContext>();

        for (EgovMap table : tables) {
            if (log.isDebugEnabled()) {
                log.debug(table);
            }

            String tableName = (String) table.get("tableName");

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
        Package package1 = new Package();

        package1.setVoPackage(dataModel);

        dataModel.setPackage(package1);
    }

    public void sqlMap() throws Exception {
        for (DataModelContext dataModel : dataModels) {
            String pathname = "target/Sample_SQL_Oracle.xml";

            String data = crudCodeGen.generate(dataModel,
                    "godsoft/crud/resource/pkg/EgovSample_Sample2_SQL.vm");

            CmmUtils.writeStringToFile(pathname, data);
        }
    }

}
