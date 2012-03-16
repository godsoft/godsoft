package kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryVO;

/**
 * @Class Name : ComtstrsmrcvlogsummaryDAO.java
 * @Description : Comtstrsmrcvlogsummary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtstrsmrcvlogsummaryDAO")
public class ComtstrsmrcvlogsummaryDAO extends EgovAbstractDAO {

	/**
	 * comtstrsmrcvlogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        return (String)insert("comtstrsmrcvlogsummaryDAO.insertComtstrsmrcvlogsummary_S", vo);
    }

    /**
	 * comtstrsmrcvlogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        update("comtstrsmrcvlogsummaryDAO.updateComtstrsmrcvlogsummary_S", vo);
    }

    /**
	 * comtstrsmrcvlogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        delete("comtstrsmrcvlogsummaryDAO.deleteComtstrsmrcvlogsummary_S", vo);
    }

    /**
	 * comtstrsmrcvlogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 조회한 comtstrsmrcvlogsummary
	 * @exception Exception
	 */
    public ComtstrsmrcvlogsummaryVO selectComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        return (ComtstrsmrcvlogsummaryVO) selectByPk("comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummary_S", vo);
    }

    /**
	 * comtstrsmrcvlogsummary 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtstrsmrcvlogsummary 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtstrsmrcvlogsummaryList(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        return list("comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummaryList_D", vo);
    }

    /**
	 * comtstrsmrcvlogsummary 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtstrsmrcvlogsummary 총 갯수
	 * @exception
	 */
    public int selectComtstrsmrcvlogsummaryListTotCnt(ComtstrsmrcvlogsummaryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummaryListTotCnt_S", vo);
    }

}
