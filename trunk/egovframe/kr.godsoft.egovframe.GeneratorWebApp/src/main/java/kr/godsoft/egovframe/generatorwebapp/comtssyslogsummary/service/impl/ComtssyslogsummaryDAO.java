package kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryVO;

/**
 * @Class Name : ComtssyslogsummaryDAO.java
 * @Description : Comtssyslogsummary DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtssyslogsummaryDAO")
public class ComtssyslogsummaryDAO extends EgovAbstractDAO {

	/**
	 * comtssyslogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        return (String)insert("comtssyslogsummaryDAO.insertComtssyslogsummary_S", vo);
    }

    /**
	 * comtssyslogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        update("comtssyslogsummaryDAO.updateComtssyslogsummary_S", vo);
    }

    /**
	 * comtssyslogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        delete("comtssyslogsummaryDAO.deleteComtssyslogsummary_S", vo);
    }

    /**
	 * comtssyslogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 조회한 comtssyslogsummary
	 * @exception Exception
	 */
    public ComtssyslogsummaryVO selectComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        return (ComtssyslogsummaryVO) selectByPk("comtssyslogsummaryDAO.selectComtssyslogsummary_S", vo);
    }

    /**
	 * comtssyslogsummary 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtssyslogsummary 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtssyslogsummaryList(ComtssyslogsummaryVO vo) throws Exception {
        return list("comtssyslogsummaryDAO.selectComtssyslogsummaryList_D", vo);
    }

    /**
	 * comtssyslogsummary 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtssyslogsummary 총 갯수
	 * @exception
	 */
    public int selectComtssyslogsummaryListTotCnt(ComtssyslogsummaryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtssyslogsummaryDAO.selectComtssyslogsummaryListTotCnt_S", vo);
    }

}
