package egovframework.codegen.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Attribute;
import model.DataModelContext;
import model.Entity;
import operation.CrudCodeGen;

import org.springframework.stereotype.Service;

import egovframework.codegen.cmm.service.OracleService;
import egovframework.codegen.util.CmmUtils;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("oracleService")
public class OracleServiceImpl extends AbstractServiceImpl implements
        OracleService {

    public void init() throws Exception {
        DataModelContext dataModel = new DataModelContext();

        dataModel.setAuthor("이백행");
        dataModel.setCreateDate(CmmUtils.getCreateDate());
        dataModel.setTeam("갓소프트");

        dataModel.setPackageName("kr.godsoft.egovframe.codegen");

        Entity entity = new Entity("SAMPLE2");

        dataModel.setEntity(entity);

        List<Attribute> attributes = new ArrayList<Attribute>();

        Attribute attr = null;

        attr = new Attribute("NAME");
        attr.setJavaType("String");
        attributes.add(attr);
        // primaryKeys.add(attr);

        attr = new Attribute("DESCRIPTION");
        attr.setJavaType("String");
        attributes.add(attr);

        attr = new Attribute("USE_YN");
        attr.setJavaType("String");
        attributes.add(attr);

        attr = new Attribute("REG_USER");
        attr.setJavaType("String");
        attributes.add(attr);

        dataModel.setAttributes(attributes);

        List<Attribute> primaryKeys = new ArrayList<Attribute>();

        attr = new Attribute("ID");
        attr.setJavaType("String");
        attributes.add(attr);
        primaryKeys.add(attr);

        dataModel.setPrimaryKeys(primaryKeys);

        CrudCodeGen crudCodeGen = new CrudCodeGen();

        String templateFile = null;
        templateFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.vm";
        templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

        String result = crudCodeGen.generate(dataModel, templateFile);

        if (log.isDebugEnabled()) {
            log.debug(result);
        }
    }

}
