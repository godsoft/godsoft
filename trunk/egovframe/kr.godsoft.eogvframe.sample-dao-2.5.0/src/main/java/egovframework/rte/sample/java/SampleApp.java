package egovframework.rte.sample.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.EgovSampleService;
import egovframework.rte.sample.service.SampleDefaultVO;
import egovframework.rte.sample.service.impl.SampleDAO;

public class SampleApp {

	private ApplicationContext context;

	private SampleDAO sampleDAO;
	private EgovSampleService sampleService;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SampleApp sampleApp = new SampleApp();

		sampleApp.sampleDAOselectSampleList();

		sampleApp.sampleServiceselectSampleList();
	}

	public SampleApp() {
		String[] configLocations = new String[] {
				"classpath:egovframework/spring/context-aspect.xml",
				"classpath:egovframework/spring/context-common.xml",
				"classpath:egovframework/spring/context-datasource.xml",
				"classpath:egovframework/spring/context-idgen.xml",
				"classpath:egovframework/spring/context-properties.xml",
				"classpath:egovframework/spring/context-sqlMap.xml",
				"classpath:egovframework/spring/context-transaction.xml",
				"classpath:egovframework/spring/context-validator.xml" };

		this.context = new ClassPathXmlApplicationContext(configLocations);

		this.sampleDAO = (SampleDAO) context.getBean("sampleDAO");

		this.sampleService = (EgovSampleService) context
				.getBean("sampleService");
	}

	public void sampleDAOselectSampleList() {
		try {
			SampleDefaultVO searchVO = new SampleDefaultVO();
			searchVO.setRecordCountPerPage(10);
			searchVO.setFirstIndex(0);

			List<EgovMap> samples = sampleDAO.selectSampleList(searchVO);

			for (EgovMap sample : samples) {
				System.out.println(sample);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sampleServiceselectSampleList() {
		try {
			SampleDefaultVO searchVO = new SampleDefaultVO();
			searchVO.setRecordCountPerPage(10);
			searchVO.setFirstIndex(0);

			List<EgovMap> samples = sampleService.selectSampleList(searchVO);

			for (EgovMap sample : samples) {
				System.out.println(sample);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
