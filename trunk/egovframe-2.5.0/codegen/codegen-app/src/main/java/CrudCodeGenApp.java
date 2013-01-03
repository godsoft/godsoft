import model.DataModelContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.codegen.cmm.service.OracleService;
import egovframework.codegen.util.CmmUtils;

public class CrudCodeGenApp {

    protected static final Log LOG = LogFactory.getLog(CrudCodeGenApp.class);

    // private AllTablesDAO allTablesDAO;

    private OracleService oracleService;

    public CrudCodeGenApp() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:egovframework/spring/codegen-dao.xml");

        // this.allTablesDAO = (AllTablesDAO) context.getBean("allTablesDAO");

        this.oracleService = (OracleService) context.getBean("oracleService");

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CrudCodeGenApp app = new CrudCodeGenApp();

        // app.selectAllTablesList();

        try {
            app.oracle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private void selectAllTablesList() {
    // try {
    // EgovMap egovMap = new EgovMap();
    //
    // egovMap.put("owner", "RTE");
    // // egovMap.put("tableName", "IDS");
    //
    // List<EgovMap> tables = allTablesDAO.selectAllTablesList(egovMap);
    //
    // for (EgovMap table : tables) {
    // if (LOG.isDebugEnabled()) {
    // LOG.debug(table);
    // }
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    private void oracle() throws Exception {
        DataModelContext dataModel = new DataModelContext();

        dataModel.setAuthor("이백행");
        dataModel.setCreateDate(CmmUtils.getCreateDate());
        dataModel.setTeam("갓소프트");

        dataModel.setPackageName("kr.godsoft.egovframe.codegen");

        this.oracleService.init(dataModel);
    }

}
