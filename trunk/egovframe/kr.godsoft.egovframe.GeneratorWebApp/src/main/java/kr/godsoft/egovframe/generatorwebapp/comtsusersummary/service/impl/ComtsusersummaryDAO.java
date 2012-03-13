package kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryDefaultVO;

/**
 * @Class Name : ComtsusersummaryDAO.java
 * @Description : Comtsusersummary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtsusersummaryDAO")
public class ComtsusersummaryDAO extends EgovAbstractDAO {

	/**
	 * comtsusersummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsusersummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        return (String)insert("comtsusersummaryDAO.insertComtsusersummary_S", vo);
    }

    /**
	 * comtsusersummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsusersummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        update("comtsusersummaryDAO.updateComtsusersummary_S", vo);
    }

    /**
	 * comtsusersummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsusersummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        delete("comtsusersummaryDAO.deleteComtsusersummary_S", vo);
    }

    /**
	 * comtsusersummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsusersummaryVO
	 * @return 조회한 comtsusersummary
	 * @exception Exception
	 */
    public ComtsusersummaryVO selectComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        return (ComtsusersummaryVO) selectByPk("comtsusersummaryDAO.selectComtsusersummary_S", vo);
    }

    /**
	 * comtsusersummary 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtsusersummary 목록
	 * @exception Exception
	 */
    public List selectComtsusersummaryList(ComtsusersummaryDefaultVO searchVO) throws Exception {
        return list("comtsusersummaryDAO.selectComtsusersummaryList_D", searchVO);
    }

    /**
	 * comtsusersummary 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtsusersummary 총 갯수
	 * @exception
	 */
    public int selectComtsusersummaryListTotCnt(ComtsusersummaryDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtsusersummaryDAO.selectComtsusersummaryListTotCnt_S", searchVO);
    }

}
