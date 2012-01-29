package kr.godsoft.egovframe.generator.tables.java.impl;

import java.util.List;

import kr.godsoft.egovframe.generator.tables.java.TablesClient;
import kr.godsoft.egovframe.generator.tables.service.TablesDefaultVO;
import kr.godsoft.egovframe.generator.tables.service.TablesService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class TablesClientImpl implements TablesClient {

	private static Log log = LogFactory.getLog(TablesClientImpl.class);

	private static String[] configLocations;

	private static ApplicationContext context;

	private static TablesService tablesService;

	static {
		configLocations = new String[] {
				"egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				"kr/godsoft/egovframe/generator/spring/tables-beans.xml" };

		context = new ClassPathXmlApplicationContext(configLocations);

		tablesService = (TablesService) context.getBean("tablesService");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TablesClient tablesClient = new TablesClientImpl();

		tablesClient.selectTablesList();
	}

	public void selectTablesList() {
		try {
			TablesDefaultVO searchVO = new TablesDefaultVO();

			searchVO.setSearchCondition("1");
			searchVO.setSearchKeyword("egovfrm");
			searchVO.setRecordCountPerPage(1000);

			@SuppressWarnings("unchecked")
			List<EgovMap> tables = tablesService.selectTablesList(searchVO);

			for (int i = 0, size = tables.size(); i < size; i++) {
				EgovMap egovMap = tables.get(i);

				if (log.isDebugEnabled()) {
					// log.debug("tableCatalog=" + egovMap.get("tableCatalog"));
					log.debug("tableSchema=" + egovMap.get("tableSchema"));
					log.debug("tableName=" + egovMap.get("tableName"));
					log.debug("tableComment=" + egovMap.get("tableComment"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
