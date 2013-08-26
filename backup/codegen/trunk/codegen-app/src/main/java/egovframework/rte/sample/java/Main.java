package egovframework.rte.sample.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.SampleDefaultVO;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:egovframework/spring/codegen-app.xml");

        EgovSampleService sampleService = (EgovSampleService) context
                .getBean("sampleService");

        try {
            SampleDefaultVO searchVO = new SampleDefaultVO();

            searchVO.setRecordCountPerPage(10);
            searchVO.setFirstIndex(0);

            List<EgovMap> samples;

            samples = sampleService.selectSampleList(searchVO);

            for (EgovMap sample : samples) {
                System.out.println(sample);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
