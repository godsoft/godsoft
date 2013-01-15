package egovframework.codegen.alltables.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import egovframework.codegen.alltables.service.AllTablesService;
import egovframework.codegen.alltables.service.AllTablesServiceTest;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class AllTablesServiceImplTest extends AllTablesServiceTest {

    protected Log log = LogFactory.getLog(this.getClass());

    @Resource(name = "allTablesService")
    AllTablesService allTablesService;

    // // 필요할 경우, 스프링 ApplicationContext을 선언한다.
    // @Autowired
    // ApplicationContext aplicationContext;
    //
    // // VO를 사용한 경우, 관련 VO들을 선언한다.
    // NoticeVo testNoticeVo;

    // VO를 사용한 경우, 테스트에 사용할 VO들을 생성한다.
    @Before
    public void createTestNoticeVo() {
        // try {
        // testNoticeVo = (NoticeVo) aplicationContext.getBean("testNoticeVo");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",
        // java.util.Locale.getDefault());
        // testNoticeVo.setRegistrationDate(sdf.parse("2009-03-31"));
        // }
        // catch(ParseException e) {
        // fail(e.getMessage());
        // }
    }

    // 필요할 경우, 관련 자원들을 확인하고 테스트 한다.
    @Test
    public void check() {
        // assertNotNull(noticeService);
        // assertNotNull(testNoticeVo);
    }

    /**
     * AllTablesServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodA() {

    }

    /**
     * AllTablesServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodZ() {

    }

    @Override
    @Test
    public void selectAllTabColumnsList() throws Exception {
        EgovMap egovMap = new EgovMap();

        egovMap.put("owner", "RTE");

        List<String> tableNames = new ArrayList<String>();

        tableNames.add("SAMPLE");

        egovMap.put("tableNames", tableNames);

        List<EgovMap> columns = allTablesService.selectAllTablesList(egovMap);

        for (EgovMap table : columns) {
            if (log.isDebugEnabled()) {
                log.debug(table);
            }
        }
    }

}
