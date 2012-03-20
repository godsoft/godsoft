package kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service.ComtnbkmkmenumanageresultVO;

/**
 * @Class Name : ComtnbkmkmenumanageresultDAO.java
 * @Description : Comtnbkmkmenumanageresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbkmkmenumanageresultDAO")
public class ComtnbkmkmenumanageresultDAO extends EgovAbstractDAO {

	/**
	 * comtnbkmkmenumanageresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        return (String)insert("comtnbkmkmenumanageresultDAO.insertComtnbkmkmenumanageresult_S", vo);
    }

    /**
	 * comtnbkmkmenumanageresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        update("comtnbkmkmenumanageresultDAO.updateComtnbkmkmenumanageresult_S", vo);
    }

    /**
	 * comtnbkmkmenumanageresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        delete("comtnbkmkmenumanageresultDAO.deleteComtnbkmkmenumanageresult_S", vo);
    }

    /**
	 * comtnbkmkmenumanageresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 조회한 comtnbkmkmenumanageresult
	 * @exception Exception
	 */
    public ComtnbkmkmenumanageresultVO selectComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception {
        return (ComtnbkmkmenumanageresultVO) selectByPk("comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresult_S", vo);
    }

    /**
	 * comtnbkmkmenumanageresult 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbkmkmenumanageresult 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbkmkmenumanageresultList(ComtnbkmkmenumanageresultVO vo) throws Exception {
        return list("comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresultList_D", vo);
    }

    /**
	 * comtnbkmkmenumanageresult 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbkmkmenumanageresult 총 갯수
	 * @exception
	 */
    public int selectComtnbkmkmenumanageresultListTotCnt(ComtnbkmkmenumanageresultVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbkmkmenumanageresultDAO.selectComtnbkmkmenumanageresultListTotCnt_S", vo);
    }

}
