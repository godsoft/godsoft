package kr.godsoft.egovframe.generator.alltabcolumns.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsDefaultVO;
import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsVO;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

/**
 * @Class Name : AllTabColumnsDAO.java
 * @Description : AllTabColumns DAO Class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-02-01
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */

@Repository("allTabColumnsDAO")
public class AllTabColumnsDAO extends EgovAbstractDAO {

    @Resource(name = "sqlMapClientOracle")
    @Override
    public void setSuperSqlMapClient(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }
	
	/**
	 * COLUMNS을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 AllTabColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	public String insertColumns(AllTabColumnsVO vo) throws Exception {
		return (String) insert("allTabColumnsDAO.insertColumns_S", vo);
	}

	/**
	 * COLUMNS을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 AllTabColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void updateColumns(AllTabColumnsVO vo) throws Exception {
		update("allTabColumnsDAO.updateColumns_S", vo);
	}

	/**
	 * COLUMNS을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 AllTabColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void deleteColumns(AllTabColumnsVO vo) throws Exception {
		delete("allTabColumnsDAO.deleteColumns_S", vo);
	}

	/**
	 * COLUMNS을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 AllTabColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
	public AllTabColumnsVO selectColumns(AllTabColumnsVO vo) throws Exception {
		return (AllTabColumnsVO) selectByPk("allTabColumnsDAO.selectColumns_S", vo);
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param searchMap
	 *            - 조회할 정보가 담긴 Map
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	public List selectColumnsList(AllTabColumnsDefaultVO searchVO) throws Exception {
		return list("allTabColumnsDAO.selectAllTabColumnsList_D", searchVO);
	}

	/**
	 * COLUMNS 총 갯수를 조회한다.
	 * 
	 * @param searchMap
	 *            - 조회할 정보가 담긴 Map
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
	public int selectColumnsListTotCnt(AllTabColumnsDefaultVO searchVO) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"allTabColumnsDAO.selectColumnsListTotCnt_S", searchVO);
	}

}
