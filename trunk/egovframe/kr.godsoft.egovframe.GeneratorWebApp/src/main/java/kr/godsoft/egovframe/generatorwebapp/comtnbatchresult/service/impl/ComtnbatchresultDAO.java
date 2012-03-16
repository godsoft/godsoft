package kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service.ComtnbatchresultVO;

/**
 * @Class Name : ComtnbatchresultDAO.java
 * @Description : Comtnbatchresult DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbatchresultDAO")
public class ComtnbatchresultDAO extends EgovAbstractDAO {

	/**
	 * comtnbatchresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        return (String)insert("comtnbatchresultDAO.insertComtnbatchresult_S", vo);
    }

    /**
	 * comtnbatchresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchresultVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        update("comtnbatchresultDAO.updateComtnbatchresult_S", vo);
    }

    /**
	 * comtnbatchresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchresultVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        delete("comtnbatchresultDAO.deleteComtnbatchresult_S", vo);
    }

    /**
	 * comtnbatchresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchresultVO
	 * @return 조회한 comtnbatchresult
	 * @exception Exception
	 */
    public ComtnbatchresultVO selectComtnbatchresult(ComtnbatchresultVO vo) throws Exception {
        return (ComtnbatchresultVO) selectByPk("comtnbatchresultDAO.selectComtnbatchresult_S", vo);
    }

    /**
	 * comtnbatchresult 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchresult 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbatchresultList(ComtnbatchresultVO vo) throws Exception {
        return list("comtnbatchresultDAO.selectComtnbatchresultList_D", vo);
    }

    /**
	 * comtnbatchresult 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchresult 총 갯수
	 * @exception
	 */
    public int selectComtnbatchresultListTotCnt(ComtnbatchresultVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbatchresultDAO.selectComtnbatchresultListTotCnt_S", vo);
    }

}
