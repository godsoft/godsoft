import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.codegen.alltables.service.impl.AllTablesDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudCodeGenApp {

    protected static final Log LOG = LogFactory.getLog(CrudCodeGenApp.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:egovframework/spring/codegen-dao.xml");

        AllTablesDAO allTablesDAO = (AllTablesDAO) context
                .getBean("allTablesDAO");

        try {
            EgovMap egovMap = new EgovMap();

            egovMap.put("owner", "RTE");
            // egovMap.put("tableName", "IDS");

            List<EgovMap> tables = allTablesDAO.selectAllTablesList(egovMap);

            for (EgovMap table : tables) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug(table);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
