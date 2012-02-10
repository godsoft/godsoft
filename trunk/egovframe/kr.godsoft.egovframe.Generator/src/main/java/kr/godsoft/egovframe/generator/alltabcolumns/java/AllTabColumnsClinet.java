package kr.godsoft.egovframe.generator.alltabcolumns.java;

import java.util.List;

import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsDefaultVO;
import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class AllTabColumnsClinet {

	// private static Log log = LogFactory.getLog(ColumnsClinet.class);

	private static String[] configLocations;

	private static ApplicationContext context;

	private static AllTabColumnsService allTabColumnsService;

	static {
		configLocations = new String[] {
				"egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				"kr/godsoft/egovframe/generator/spring/alltabcolumns-beans.xml" };

		context = new ClassPathXmlApplicationContext(configLocations);

		allTabColumnsService = (AllTabColumnsService) context
				.getBean("allTabColumnsService");
	}

	public List<EgovMap> selectColumnsList(AllTabColumnsDefaultVO searchVO)
			throws Exception {
		return allTabColumnsService.selectColumnsList(searchVO);
	}

}
