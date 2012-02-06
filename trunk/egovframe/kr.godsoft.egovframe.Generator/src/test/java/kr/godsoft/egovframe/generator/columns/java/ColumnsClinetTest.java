package kr.godsoft.egovframe.generator.columns.java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;

import org.junit.Before;
import org.junit.Test;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClinetTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectColumnsList() {
		ColumnsClinet columnsClinet = new ColumnsClinet();

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setFirstIndex(0);
			searchVO.setRecordCountPerPage(1000);

			List<EgovMap> columns = columnsClinet.selectColumnsList(searchVO);

			List<Integer> value1 = Arrays.asList(3, 2, 1);
			List<Integer> value2 = Arrays.asList(3, 2, 1);
			assertEquals("두 리스트의 값과 순서가 같음", value1, value2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
