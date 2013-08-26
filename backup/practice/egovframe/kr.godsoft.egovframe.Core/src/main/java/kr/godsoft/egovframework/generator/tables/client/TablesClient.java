package kr.godsoft.egovframework.generator.tables.client;

import java.util.List;

import kr.godsoft.egovframework.generator.tables.service.TablesDefaultVO;
import kr.godsoft.egovframework.generator.tables.service.TablesService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.SampleVO;

public class TablesClient {

	private static Log log = LogFactory.getLog(TablesClient.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		String[] configLocations = { "egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				// "egovframework/spring/context-validator.xml",
				// "egovframework/spring/hello-beans.xml",
//				 "egovframework/spring/sample-beans.xml",
				"egovframework/spring/tables-beans.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);

//		TablesService tablesService = (TablesService) context
//				.getBean("tablesService");

		try {
			// insertSample
			SampleVO vo = new SampleVO();

			// vo.setName("이백행");
			// vo.setDescription("이백행입니다.");
			// vo.setUseYn("Y");
			// vo.setRegUser("dlqorgod");

			// vo.setName("이백행2");
			// vo.setDescription("이백행입니다.2");
			// vo.setUseYn("N");
			// vo.setRegUser("dlqorgod2");

			// sampleService.insertSample(vo);

			// // selectSample
			// // vo.setId("SAMPLE-00010");
			// vo.setId("SAMPLE-00020");
			//
			// SampleVO sampleVO = sampleService.selectSample(vo);
			//
			// if (log.isDebugEnabled()) {
			// log.debug("id=" + sampleVO.getId());
			// log.debug("name" + sampleVO.getName());
			// log.debug("description=" + sampleVO.getDescription());
			// log.debug("useYn=" + sampleVO.getUseYn());
			// log.debug("regUser=" + sampleVO.getRegUser());
			// }

//			// selectSampleList
//			TablesDefaultVO searchVO = new TablesDefaultVO();
//
//			searchVO.setFirstIndex(0);
//			searchVO.setPageSize(10);
//
//			@SuppressWarnings("rawtypes")
//			List tables = tablesService.selectTablesList(searchVO);
//
//			for (int index = 0, size = tables.size(); index < size; index++) {
//				EgovMap egovMap = (EgovMap) tables.get(index);
//
//				if (log.isDebugEnabled()) {
//					log.debug("id=" + egovMap.get("id"));
//					log.debug("name" + egovMap.get("name"));
//					log.debug("description=" + egovMap.get("description"));
//					log.debug("useYn=" + egovMap.get("useYn"));
//					log.debug("regUser=" + egovMap.get("regUser"));
//				}
//			}

			// // selectSampleListTotCnt
			// int totCnt = tablesService.selectSampleListTotCnt(searchVO);
			//
			// if (log.isDebugEnabled()) {
			// log.debug("totCnt=" + totCnt);
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

}
