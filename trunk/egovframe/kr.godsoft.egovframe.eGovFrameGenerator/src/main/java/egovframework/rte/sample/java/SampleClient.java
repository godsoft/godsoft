package egovframework.rte.sample.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.SampleDefaultVO;

public class SampleClient {
	private ApplicationContext applicationContext;

	private EgovSampleService sampleService;

	public SampleClient() {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:egovframework/spring/eGovFrameGenerator.xml");

		sampleService = (EgovSampleService) applicationContext
				.getBean("sampleService");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SampleClient sampleClient = new SampleClient();

		try {
			sampleClient.selectSampleList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectSampleList() throws Exception {
		SampleDefaultVO searchVO = new SampleDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		@SuppressWarnings("unchecked")
		List<EgovMap> samples = sampleService.selectSampleList(searchVO);

		if (samples != null) {
			System.out.println(samples);

			for (int i = 0; i < samples.size(); i++) {
				EgovMap egovMap = samples.get(i);

				System.out.println(egovMap);
			}
		}

	}

}
