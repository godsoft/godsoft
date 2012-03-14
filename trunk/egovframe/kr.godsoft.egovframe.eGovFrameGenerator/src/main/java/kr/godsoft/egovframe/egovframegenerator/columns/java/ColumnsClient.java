package kr.godsoft.egovframe.egovframegenerator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsService;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;
import kr.godsoft.egovframe.egovframegenerator.util.Util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClient {

	private static final Log log = LogFactory.getLog(ColumnsClient.class);

	private ApplicationContext applicationContext;

	private ColumnsService columnsService;

	public ColumnsClient() {
		applicationContext = Util.getApplicationContext();

		columnsService = (ColumnsService) applicationContext
				.getBean("columnsService");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColumnsClient columnsClient = new ColumnsClient();

		try {
			// columnsClient.selectColumnsList();

			columnsClient.selectColumnsListColumnsVO();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Deprecated
	public void selectColumnsList() throws Exception {
		ColumnsDefaultVO searchVO = new ColumnsDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		@SuppressWarnings("unchecked")
		List<EgovMap> colnums = columnsService.selectColumnsList(searchVO);

		if (colnums != null) {
			System.out.println(colnums);

			for (int i = 0; i < colnums.size(); i++) {
				EgovMap egovMap = colnums.get(i);

				System.out.println(egovMap);
			}
		}

	}

	@Deprecated
	public void selectColumnsListColumnsVO() throws Exception {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		ColumnsVO columnsVO = new ColumnsVO();

		columnsVO.setTableSchema("rte");

		List<EgovMap> colnums = columnsService.selectColumnsList(columnsVO);

		if (log.isDebugEnabled()) {
			log.debug("colnums=" + colnums);
		}

		if (colnums != null) {
			for (int i = 0; i < colnums.size(); i++) {
				EgovMap egovMap = colnums.get(i);

				if (log.isDebugEnabled()) {
					log.debug("egovMap=" + egovMap);
				}
			}
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public List<EgovMap> selectColumnsList(ColumnsVO columnsVO)
			throws Exception {
		return columnsService.selectColumnsList(columnsVO);
	}

}
