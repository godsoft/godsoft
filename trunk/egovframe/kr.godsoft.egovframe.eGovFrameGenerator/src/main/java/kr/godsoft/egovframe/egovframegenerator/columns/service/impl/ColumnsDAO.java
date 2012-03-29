package kr.godsoft.egovframe.egovframegenerator.columns.service.impl;

import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ColumnsDAO.java
 * @Description : Columns DAO Class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-03-14
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */

@Repository("columnsDAO")
public class ColumnsDAO extends EgovAbstractDAO {

	/**
	 * COLUMNS을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 ColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	public String insertColumns(ColumnsVO vo) throws Exception {
		return (String) insert("columnsDAO.insertColumns_S", vo);
	}

	/**
	 * COLUMNS을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void updateColumns(ColumnsVO vo) throws Exception {
		update("columnsDAO.updateColumns_S", vo);
	}

	/**
	 * COLUMNS을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void deleteColumns(ColumnsVO vo) throws Exception {
		delete("columnsDAO.deleteColumns_S", vo);
	}

	/**
	 * COLUMNS을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 ColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
	public ColumnsVO selectColumns(ColumnsVO vo) throws Exception {
		return (ColumnsVO) selectByPk("columnsDAO.selectColumns_S", vo);
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param searchMap
	 *            - 조회할 정보가 담긴 Map
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	public List selectColumnsList(ColumnsDefaultVO searchVO) throws Exception {
		return list("columnsDAO.selectColumnsList_D", searchVO);
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param columnsVO
	 *            - 조회할 정보가 담긴 Map
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectColumnsList(ColumnsVO columnsVO)
			throws Exception {
		return list("columnsDAO.selectColumnsList_D_ColumnsVO", columnsVO);
	}

	/**
	 * COLUMNS 총 갯수를 조회한다.
	 * 
	 * @param searchMap
	 *            - 조회할 정보가 담긴 Map
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
	public int selectColumnsListTotCnt(ColumnsDefaultVO searchVO) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"columnsDAO.selectColumnsListTotCnt_S", searchVO);
	}

	/**
	 * all_tab_columns 목록을 조회한다.
	 * 
	 * @param egovMapVO
	 *            - 조회할 정보가 담긴 Map
	 * @return all_tab_columns 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColumnsList(EgovMap egovMapVO)
			throws Exception {
		return list("columnsDAO.selectAllTabColumnsList", egovMapVO);
	}

}
