package kr.godsoft.egovframe.generator.columns.java.impl;

import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClient;
import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.generator.columns.service.ColumnsService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClientImpl implements ColumnsClient {

	private static Log log = LogFactory.getLog(ColumnsClientImpl.class);

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColumnsClient columnsClient = new ColumnsClientImpl();

		columnsClient.selectColumnsList();
	}

	public void selectColumnsList() {
		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setSearchCondition("1");
			searchVO.setSearchKeyword("egovfrm");
			searchVO.setRecordCountPerPage(1000);

			@SuppressWarnings("unchecked")
			List<EgovMap> tables = columnsService.selectColumnsList(searchVO);

			for (int i = 0, size = tables.size(); i < size; i++) {
				EgovMap egovMap = tables.get(i);

				if (log.isDebugEnabled()) {
					// log.debug("tableCatalog=" + egovMap.get("tableCatalog"));
					log.debug("tableSchema=" + egovMap.get("tableSchema"));
					log.debug("tableName=" + egovMap.get("tableName"));
					log.debug("columnName=" + egovMap.get("columnName"));
					log.debug("ordinalPosition="
							+ egovMap.get("ordinalPosition"));
					log.debug("columnDefault=" + egovMap.get("columnDefault"));
					log.debug("dataType=" + egovMap.get("dataType"));
					log.debug("characterMaximumLength="
							+ egovMap.get("characterMaximumLength"));
					log.debug("columnKey=" + egovMap.get("columnKey"));
					log.debug("columnComment=" + egovMap.get("columnComment"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
