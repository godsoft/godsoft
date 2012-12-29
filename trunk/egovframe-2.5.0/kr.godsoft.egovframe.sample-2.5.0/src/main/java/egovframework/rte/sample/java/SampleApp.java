package egovframework.rte.sample.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.SampleDefaultVO;
import egovframework.rte.sample.service.impl.SampleDAO;

public class SampleApp {

    private SampleDAO sampleDAO;

    public SampleApp() {
        String[] configLocations = new String[] {
                "classpath:egovframework/spring/context-aspect.xml",
                "classpath:egovframework/spring/context-common.xml",
                "classpath:egovframework/spring/context-datasource.xml",
                "classpath:egovframework/spring/context-idgen.xml",
                "classpath:egovframework/spring/context-properties.xml",
                "classpath:egovframework/spring/context-sqlMap.xml",
                "classpath:egovframework/spring/context-transaction.xml" };

        ApplicationContext context = new ClassPathXmlApplicationContext(
                configLocations);

        this.sampleDAO = (SampleDAO) context.getBean("sampleDAO");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SampleApp sampleApp = new SampleApp();

        sampleApp.selectSampleList();
    }

    public void selectSampleList() {
        try {
            SampleDefaultVO searchVO = new SampleDefaultVO();
            searchVO.setRecordCountPerPage(10);
            searchVO.setFirstIndex(0);

            List<EgovMap> samples = this.sampleDAO.selectSampleList(searchVO);

            for (EgovMap sample : samples) {
                System.out.println(sample);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
