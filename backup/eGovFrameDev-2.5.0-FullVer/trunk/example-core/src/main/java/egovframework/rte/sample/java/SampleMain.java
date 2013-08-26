package egovframework.rte.sample.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.SampleDefaultVO;

public class SampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String configLocation = "/egovframework/spring/example-core.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocation);

		EgovSampleService sampleService = (EgovSampleService) context
				.getBean("sampleService");

		SampleDefaultVO searchVO = new SampleDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		try {
			List<EgovMap> samples = sampleService.selectSampleList(searchVO);

			for (EgovMap egovMap : samples) {
				System.out.println(egovMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
