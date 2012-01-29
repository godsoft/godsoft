package kr.godsoft.egovframe.generator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface ColumnsClient {

	public void selectColumnsList();

	public List<EgovMap> selectColumnsList(ColumnsDefaultVO searchVO);

}
