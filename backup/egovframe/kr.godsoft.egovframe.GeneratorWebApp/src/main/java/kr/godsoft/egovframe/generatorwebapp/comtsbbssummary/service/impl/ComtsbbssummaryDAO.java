package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryVO;

/**
 * @Class Name : ComtsbbssummaryDAO.java
 * @Description : Comtsbbssummary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtsbbssummaryDAO")
public class ComtsbbssummaryDAO extends EgovAbstractDAO {

	/**
	 * COMTSBBSSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsbbssummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        return (String)insert("comtsbbssummaryDAO.insertComtsbbssummary_S", vo);
    }

    /**
	 * COMTSBBSSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        update("comtsbbssummaryDAO.updateComtsbbssummary_S", vo);
    }

    /**
	 * COMTSBBSSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        delete("comtsbbssummaryDAO.deleteComtsbbssummary_S", vo);
    }

    /**
	 * COMTSBBSSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsbbssummaryVO
	 * @return 조회한 COMTSBBSSUMMARY
	 * @exception Exception
	 */
    public ComtsbbssummaryVO selectComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        return (ComtsbbssummaryVO) selectByPk("comtsbbssummaryDAO.selectComtsbbssummary_S", vo);
    }

    /**
	 * COMTSBBSSUMMARY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTSBBSSUMMARY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtsbbssummaryList(ComtsbbssummaryVO vo) throws Exception {
        return list("comtsbbssummaryDAO.selectComtsbbssummaryList_D", vo);
    }

    /**
	 * COMTSBBSSUMMARY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTSBBSSUMMARY 총 갯수
	 * @exception
	 */
    public int selectComtsbbssummaryListTotCnt(ComtsbbssummaryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtsbbssummaryDAO.selectComtsbbssummaryListTotCnt_S", vo);
    }

}
