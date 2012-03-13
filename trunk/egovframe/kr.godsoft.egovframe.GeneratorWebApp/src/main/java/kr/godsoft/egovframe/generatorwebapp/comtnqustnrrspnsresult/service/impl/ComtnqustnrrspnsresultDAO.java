package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultDefaultVO;

/**
 * @Class Name : ComtnqustnrrspnsresultDAO.java
 * @Description : Comtnqustnrrspnsresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnrrspnsresultDAO")
public class ComtnqustnrrspnsresultDAO extends EgovAbstractDAO {

	/**
	 * comtnqustnrrspnsresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        return (String)insert("comtnqustnrrspnsresultDAO.insertComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * comtnqustnrrspnsresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        update("comtnqustnrrspnsresultDAO.updateComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * comtnqustnrrspnsresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        delete("comtnqustnrrspnsresultDAO.deleteComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * comtnqustnrrspnsresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 comtnqustnrrspnsresult
	 * @exception Exception
	 */
    public ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        return (ComtnqustnrrspnsresultVO) selectByPk("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * comtnqustnrrspnsresult 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrrspnsresult 목록
	 * @exception Exception
	 */
    public List selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultDefaultVO searchVO) throws Exception {
        return list("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultList_D", searchVO);
    }

    /**
	 * comtnqustnrrspnsresult 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnqustnrrspnsresult 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultListTotCnt_S", searchVO);
    }

}
