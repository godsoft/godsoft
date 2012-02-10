package kr.godsoft.egovframe.generator.alltabcolumns.service;

import java.util.List;

/**
 * @Class Name : ColumnsService.java
 * @Description : Columns Business class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-02-01
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */
public interface AllTabColumnsService {

	/**
	 * COLUMNS을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 ColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	String insertColumns(AllTabColumnsVO vo) throws Exception;

	/**
	 * COLUMNS을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	void updateColumns(AllTabColumnsVO vo) throws Exception;

	/**
	 * COLUMNS을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	void deleteColumns(AllTabColumnsVO vo) throws Exception;

	/**
	 * COLUMNS을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 ColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
	AllTabColumnsVO selectColumns(AllTabColumnsVO vo) throws Exception;

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	List selectColumnsList(AllTabColumnsDefaultVO searchVO) throws Exception;

	/**
	 * COLUMNS 총 갯수를 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
	int selectColumnsListTotCnt(AllTabColumnsDefaultVO searchVO);

}
