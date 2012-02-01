package kr.godsoft.egovframe.generator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.generator.columns.service.ColumnsService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClinet {

	private static Log log = LogFactory.getLog(ColumnsClinet.class);

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
				"kr/godsoft/egovframe/generator/spring/columns-beans.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);

		ColumnsService columnsService = (ColumnsService) context
				.getBean("columnsService");

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			List<EgovMap> columns = columnsService.selectColumnsList(searchVO);

			for (int i = 0, size = columns.size(); i < size; i++) {
				EgovMap egovMap = columns.get(i);

				if (log.isDebugEnabled()) {
					log.debug("columnName=" + egovMap.get("columnName"));
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
