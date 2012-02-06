package kr.godsoft.egovframe.generator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;

import org.junit.Before;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClinetTest {

	@Before
	public void setUp() throws Exception {
	}

	public void testSelectColumnsList() {
		ColumnsClinet columnsClinet = new ColumnsClinet();

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setFirstIndex(0);
			searchVO.setRecordCountPerPage(1000);

			List<EgovMap> columns = columnsClinet.selectColumnsList(searchVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
