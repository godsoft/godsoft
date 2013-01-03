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
        String[] configLocations = new String[] {
                "classpath:egovframework/spring/context-aspect.xml",
                "classpath:egovframework/spring/context-common.xml",
                "classpath:egovframework/spring/context-datasource.xml",
                "classpath:egovframework/spring/context-idgen.xml",
                "classpath:egovframework/spring/context-properties.xml",
                "classpath:egovframework/spring/context-sqlMap.xml",
                "classpath:egovframework/spring/context-transaction.xml"

        };

        ApplicationContext context = new ClassPathXmlApplicationContext(
                configLocations);

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
