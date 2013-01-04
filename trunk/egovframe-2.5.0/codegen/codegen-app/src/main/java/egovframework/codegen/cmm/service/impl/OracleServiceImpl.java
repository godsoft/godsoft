package egovframework.codegen.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Attribute;
import model.DataModelContext;
import model.Entity;
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

        sqlMap();
    }

    private void dataModels() throws Exception {
        dataModels = new ArrayList<DataModelContext>();

        for (EgovMap table : tables) {
            if (log.isDebugEnabled()) {
                log.debug(table);
            }

            DataModelContext dataModel = new DataModelContext();

            BeanUtils.copyProperties(dataModel, this.dataModel);

            String tableName = (String) table.get("tableName");

            dataModel.setEntity(new Entity(tableName.toLowerCase()));

            List<Attribute> attributes = new ArrayList<Attribute>();

            for (EgovMap column : columns) {
                String tableNameColumn = (String) column.get("tableName");
                String columnName = (String) column.get("columnName");
                String dataType = (String) column.get("dataType");
                String columnComments = (String) column.get("columnComments");

                if (tableNameColumn.equals(tableName)) {
                    Attribute attr = new Attribute(columnName.toLowerCase());
                    attr.setJavaType(CmmUtils.getJavaType(dataType));

                    attr.setColumnComments(columnComments);

                    attributes.add(attr);
                }
            }

            dataModel.setAttributes(attributes);

            dataModels.add(dataModel);
        }

        // Entity entity = new Entity("SAMPLE2");
        //
        // dataModel.setEntity(entity);
        //
        // List<Attribute> attributes = new ArrayList<Attribute>();
        //
        // Attribute attr = null;
        //
        // attr = new Attribute("NAME");
        // attr.setJavaType("String");
        // attributes.add(attr);
        // // primaryKeys.add(attr);
        //
        // attr = new Attribute("DESCRIPTION");
        // attr.setJavaType("String");
        // attributes.add(attr);
        //
        // attr = new Attribute("USE_YN");
        // attr.setJavaType("String");
        // attributes.add(attr);
        //
        // attr = new Attribute("REG_USER");
        // attr.setJavaType("String");
        // attributes.add(attr);
        //
        // dataModel.setAttributes(attributes);
        //
        // List<Attribute> primaryKeys = new ArrayList<Attribute>();
        //
        // attr = new Attribute("ID");
        // attr.setJavaType("String");
        // attributes.add(attr);
        // primaryKeys.add(attr);
        //
        // dataModel.setPrimaryKeys(primaryKeys);
    }

    private void sqlMap() throws Exception {
        for (DataModelContext dataModel : dataModels) {
            crudCodeGen.generate(dataModel,
                    "godsoft/crud/resource/pkg/EgovSample_Sample2_SQL.vm");
        }
    }

}
