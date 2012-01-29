package egovframework.rte.sample.java;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.SampleDefaultVO;

public class SampleClient {

	private static Log log = LogFactory.getLog(SampleClient.class);

	private static String[] configLocations;

	private static ApplicationContext context;

	private static EgovSampleService sampleService;

	static {
		configLocations = new String[] {
				"egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				"egovframework/spring/sample-beans.xml" };

		context = new ClassPathXmlApplicationContext(configLocations);

		sampleService = (EgovSampleService) context.getBean("sampleService");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SampleClient sampleClient = new SampleClient();

		sampleClient.selectSampleList();
	}

	public void selectSampleList() {
		// selectSampleList
		try {
			SampleDefaultVO searchVO = new SampleDefaultVO();

			@SuppressWarnings("unchecked")
			List<EgovMap> samples = sampleService.selectSampleList(searchVO);

			for (int i = 0, size = samples.size(); i < size; i++) {
				EgovMap egovMap = samples.get(i);

				if (log.isDebugEnabled()) {
					log.debug("id=" + egovMap.get("id"));
					log.debug("name=" + egovMap.get("name"));
					log.debug("description=" + egovMap.get("description"));
					log.debug("useYn=" + egovMap.get("useYn"));
					log.debug("regUser=" + egovMap.get("regUser"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
