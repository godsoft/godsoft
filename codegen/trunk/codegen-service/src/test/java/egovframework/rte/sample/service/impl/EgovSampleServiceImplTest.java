package egovframework.rte.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.EgovSampleServiceTest;
import egovframework.rte.sample.service.SampleDefaultVO;

public class EgovSampleServiceImplTest extends EgovSampleServiceTest {

    @Resource(name = "sampleService")
    EgovSampleService sampleService;

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
        // } catch (ParseException e) {
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
     * EgovSampleServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodA() {

    }

    /**
     * EgovSampleServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
     */
    public void testMethodZ() {

    }

    @Test
    public void selectSampleList() throws Exception {
        SampleDefaultVO searchVO = new SampleDefaultVO();

        searchVO.setRecordCountPerPage(10);
        searchVO.setFirstIndex(0);

        List<EgovMap> samples = sampleService.selectSampleList(searchVO);

        for (EgovMap sample : samples) {
            System.out.println(sample);
        }
    }

}
