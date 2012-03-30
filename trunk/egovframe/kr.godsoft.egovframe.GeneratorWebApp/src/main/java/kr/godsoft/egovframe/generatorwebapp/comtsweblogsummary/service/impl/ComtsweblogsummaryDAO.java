package kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryVO;

/**
 * @Class Name : ComtsweblogsummaryDAO.java
 * @Description : Comtsweblogsummary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtsweblogsummaryDAO")
public class ComtsweblogsummaryDAO extends EgovAbstractDAO {

	/**
	 * COMTSWEBLOGSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        return (String)insert("comtsweblogsummaryDAO.insertComtsweblogsummary_S", vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        update("comtsweblogsummaryDAO.updateComtsweblogsummary_S", vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        delete("comtsweblogsummaryDAO.deleteComtsweblogsummary_S", vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 조회한 COMTSWEBLOGSUMMARY
	 * @exception Exception
	 */
    public ComtsweblogsummaryVO selectComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        return (ComtsweblogsummaryVO) selectByPk("comtsweblogsummaryDAO.selectComtsweblogsummary_S", vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTSWEBLOGSUMMARY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtsweblogsummaryList(ComtsweblogsummaryVO vo) throws Exception {
        return list("comtsweblogsummaryDAO.selectComtsweblogsummaryList_D", vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTSWEBLOGSUMMARY 총 갯수
	 * @exception
	 */
    public int selectComtsweblogsummaryListTotCnt(ComtsweblogsummaryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtsweblogsummaryDAO.selectComtsweblogsummaryListTotCnt_S", vo);
    }

}
