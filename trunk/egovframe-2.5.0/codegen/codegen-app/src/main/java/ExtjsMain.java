import java.util.ArrayList;
import java.util.List;

import model.DataModelContext;
import model.Pathname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.codegen.cmm.service.IsGen;
import egovframework.codegen.cmm.service.OracleService;
import egovframework.codegen.util.CmmUtils;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ExtjsMain {

    protected static final Log LOG = LogFactory.getLog(ExtjsMain.class);

    private OracleService oracleService;

    public ExtjsMain() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:egovframework/spring/codegen-dao.xml");

        oracleService = (OracleService) context.getBean("oracleService");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExtjsMain app = new ExtjsMain();

        try {
            app.oracle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void oracle() throws Exception {
        // tables, columns
        EgovMap egovMap = new EgovMap();

        egovMap.put("owner", "RTE");

        // egovMap.put("tableName", "IDS");
        // egovMap.put("tableName", "SAMPLE");

        List<String> tableNames = new ArrayList<String>();

        // tableNames.add("IDS");
        // tableNames.add("SAMPLE");

        tableNames.add("COMTCCMMNCODE");
        tableNames.add("COMTCCMMNDETAILCODE");
        tableNames.add("COMTNAUTHORINFO");
        tableNames.add("COMTNMENUINFO");
        tableNames.add("COMTNPROGRMLIST");
        tableNames.add("COMTNROLEINFO");
        tableNames.add("COMTNSYSLOG");
        tableNames.add("COMTNUSERLOG");
        tableNames.add("COMTNWEBLOG");
        tableNames.add("COMTSSYSLOGSUMMARY");
        tableNames.add("COMTSUSERSUMMARY");
        tableNames.add("COMTSWEBLOGSUMMARY");

        egovMap.put("tableNames", tableNames);

        oracleService.tables(egovMap);

        oracleService.columns(egovMap);

        // init
        DataModelContext dataModel = new DataModelContext();

        dataModel.setAuthor("이백행");
        dataModel.setCreateDate(CmmUtils.getCreateDate());
        dataModel.setTeam("갓소프트");

        dataModel.setPackageName("egovframework.codegen");

        dataModel.setVendor("Oracle");

        dataModel.setPathname(new Pathname("../example-extjs"));

        dataModel.setProjectName("codegen");

        oracleService.init(dataModel);

        IsGen isGen = new IsGen();

        isGen.setSqlMap(true);
        isGen.setSqlMapConfig(true);

        // service
        isGen.setDefaultVO(true);
        isGen.setVo(true);
        isGen.setService(true);

        // service.impl
        isGen.setDao(true);
        isGen.setServiceImpl(true);

        // web
        isGen.setController(true);

        // jsp
        isGen.setList(true);
        isGen.setRegist(true);
        isGen.setIndex(true);

        // js
        isGen.setExtjs(true);
        // isGen.setAppJs(true);

        oracleService.sqlMap(isGen);
    }

}
