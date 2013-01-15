package egovframework.rte.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.SampleDefaultVO;

//  필요할 경우, 스프링 컨텍스트/트랜잭션 등의 설정을 적용한다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/codegen-dao.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class SampleDAOTest {

    protected Log log = LogFactory.getLog(this.getClass());

    @Resource(name = "sampleDAO")
    SampleDAO sampleDAO;

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
        // assertNotNull(noticeDao);
        // assertNotNull(testNoticeVo);
    }

    /**
     * SampleDAO의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodA() {

    }

    /**
     * SampleDAO의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodZ() {

    }

    @Test
    public void selectSampleList() throws Exception {
        SampleDefaultVO searchVO = new SampleDefaultVO();

        searchVO.setRecordCountPerPage(10);
        searchVO.setFirstIndex(0);

        List<EgovMap> samples = sampleDAO.selectSampleList(searchVO);

        for (EgovMap sample : samples) {
            if (log.isDebugEnabled()) {
                log.debug(sample);
            }
        }
    }

}
