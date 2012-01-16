package egovframework.rte.sample.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class SampleClient {

	private static Log log = LogFactory.getLog(SampleClient.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		String[] configLocations = new String[] {
				"egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				// "egovframework/spring/context-validator.xml",
				"egovframework/spring/hello-beans.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);
		// SomeBean bean = context.getBean("beanName");

		EgovSampleService egovSampleService = (EgovSampleService) context
				.getBean("helloService");

		SampleDefaultVO searchVO = new SampleDefaultVO();

		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		try {
			List samples = egovSampleService.selectSampleList(searchVO);

			System.out.println("samples=" + samples);

			for (int i = 0, size = samples.size(); i < size; i++) {
				EgovMap egovMap = (EgovMap) samples.get(i);

				if (log.isDebugEnabled()) {
					log.debug("id=" + egovMap.get("id"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}
}
