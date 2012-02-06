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

	private static String[] configLocations;

	private static ApplicationContext context;

	private static ColumnsService columnsService;

	static {
		configLocations = new String[] {
				"egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				"kr/godsoft/egovframe/generator/spring/columns-beans.xml" };

		context = new ClassPathXmlApplicationContext(configLocations);

		columnsService = (ColumnsService) context.getBean("columnsService");
	}

	public List<EgovMap> selectColumnsList(ColumnsDefaultVO searchVO)
			throws Exception {
		return columnsService.selectColumnsList(searchVO);
	}

}
