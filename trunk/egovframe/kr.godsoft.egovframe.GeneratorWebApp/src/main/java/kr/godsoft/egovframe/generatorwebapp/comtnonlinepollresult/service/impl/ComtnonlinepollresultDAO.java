package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service.ComtnonlinepollresultVO;

/**
 * @Class Name : ComtnonlinepollresultDAO.java
 * @Description : Comtnonlinepollresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnonlinepollresultDAO")
public class ComtnonlinepollresultDAO extends EgovAbstractDAO {

	/**
	 * COMTNONLINEPOLLRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        return (String)insert("comtnonlinepollresultDAO.insertComtnonlinepollresult_S", vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        update("comtnonlinepollresultDAO.updateComtnonlinepollresult_S", vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        delete("comtnonlinepollresultDAO.deleteComtnonlinepollresult_S", vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 조회한 COMTNONLINEPOLLRESULT
	 * @exception Exception
	 */
    public ComtnonlinepollresultVO selectComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception {
        return (ComtnonlinepollresultVO) selectByPk("comtnonlinepollresultDAO.selectComtnonlinepollresult_S", vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNONLINEPOLLRESULT 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnonlinepollresultList(ComtnonlinepollresultVO vo) throws Exception {
        return list("comtnonlinepollresultDAO.selectComtnonlinepollresultList_D", vo);
    }

    /**
	 * COMTNONLINEPOLLRESULT 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNONLINEPOLLRESULT 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepollresultListTotCnt(ComtnonlinepollresultVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnonlinepollresultDAO.selectComtnonlinepollresultListTotCnt_S", vo);
    }

}
