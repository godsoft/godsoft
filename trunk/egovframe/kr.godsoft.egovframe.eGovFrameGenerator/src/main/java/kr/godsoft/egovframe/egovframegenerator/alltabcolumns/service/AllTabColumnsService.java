package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ColumnsService.java
 * @Description : Columns Business class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-03-14
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */
public interface AllTabColumnsService {

	/**
	 * all_tab_columns 목록을 조회한다.
	 * 
	 * @param egovMapVO
	 *            - 조회할 정보가 담긴 VO
	 * @return all_tab_columns 목록
	 * @exception Exception
	 */
	List<EgovMap> selectAllTabColumnsList(EgovMap egovMapVO) throws Exception;

}
