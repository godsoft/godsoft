package kr.godsoft.egovframe.egovframegenerator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClientTest {

	private static final Log log = LogFactory.getLog(ColumnsClientTest.class);

	private static ColumnsClient columnsClient;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		columnsClient = new ColumnsClient();
	}

	@Test
	public void selectColumnsListColumnsVO() throws Exception {
		ColumnsVO columnsVO = new ColumnsVO();

		columnsVO.setTableSchema("rte");

		List<EgovMap> colnums = columnsClient.selectColumnsList(columnsVO);

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
	}

}
