package kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service.ComtnbackupresultVO;

/**
 * @Class Name : ComtnbackupresultDAO.java
 * @Description : Comtnbackupresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbackupresultDAO")
public class ComtnbackupresultDAO extends EgovAbstractDAO {

	/**
	 * COMTNBACKUPRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        return (String)insert("comtnbackupresultDAO.insertComtnbackupresult_S", vo);
    }

    /**
	 * COMTNBACKUPRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        update("comtnbackupresultDAO.updateComtnbackupresult_S", vo);
    }

    /**
	 * COMTNBACKUPRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        delete("comtnbackupresultDAO.deleteComtnbackupresult_S", vo);
    }

    /**
	 * COMTNBACKUPRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupresultVO
	 * @return 조회한 COMTNBACKUPRESULT
	 * @exception Exception
	 */
    public ComtnbackupresultVO selectComtnbackupresult(ComtnbackupresultVO vo) throws Exception {
        return (ComtnbackupresultVO) selectByPk("comtnbackupresultDAO.selectComtnbackupresult_S", vo);
    }

    /**
	 * COMTNBACKUPRESULT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBACKUPRESULT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbackupresultList(ComtnbackupresultVO vo) throws Exception {
        return list("comtnbackupresultDAO.selectComtnbackupresultList_D", vo);
    }

    /**
	 * COMTNBACKUPRESULT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBACKUPRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnbackupresultListTotCnt(ComtnbackupresultVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbackupresultDAO.selectComtnbackupresultListTotCnt_S", vo);
    }

}
