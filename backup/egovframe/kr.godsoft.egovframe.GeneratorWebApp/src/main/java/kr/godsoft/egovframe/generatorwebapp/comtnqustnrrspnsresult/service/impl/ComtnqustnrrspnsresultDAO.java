package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;

/**
 * @Class Name : ComtnqustnrrspnsresultDAO.java
 * @Description : Comtnqustnrrspnsresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnqustnrrspnsresultDAO")
public class ComtnqustnrrspnsresultDAO extends EgovAbstractDAO {

	/**
	 * COMTNQUSTNRRSPNSRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        return (String)insert("comtnqustnrrspnsresultDAO.insertComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        update("comtnqustnrrspnsresultDAO.updateComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        delete("comtnqustnrrspnsresultDAO.deleteComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 COMTNQUSTNRRSPNSRESULT
	 * @exception Exception
	 */
    public ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception {
        return (ComtnqustnrrspnsresultVO) selectByPk("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresult_S", vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRRSPNSRESULT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultVO vo) throws Exception {
        return list("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultList_D", vo);
    }

    /**
	 * COMTNQUSTNRRSPNSRESULT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNQUSTNRRSPNSRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnqustnrrspnsresultDAO.selectComtnqustnrrspnsresultListTotCnt_S", vo);
    }

}
