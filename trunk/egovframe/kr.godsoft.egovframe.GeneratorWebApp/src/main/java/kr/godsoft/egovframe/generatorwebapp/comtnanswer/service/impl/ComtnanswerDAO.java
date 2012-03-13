package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerVO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerDefaultVO;

/**
 * @Class Name : ComtnanswerDAO.java
 * @Description : Comtnanswer DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnanswerDAO")
public class ComtnanswerDAO extends EgovAbstractDAO {

	/**
	 * comtnanswer을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnanswerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnanswer(ComtnanswerVO vo) throws Exception {
        return (String)insert("comtnanswerDAO.insertComtnanswer_S", vo);
    }

    /**
	 * comtnanswer을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnanswerVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnanswer(ComtnanswerVO vo) throws Exception {
        update("comtnanswerDAO.updateComtnanswer_S", vo);
    }

    /**
	 * comtnanswer을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnanswerVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnanswer(ComtnanswerVO vo) throws Exception {
        delete("comtnanswerDAO.deleteComtnanswer_S", vo);
    }

    /**
	 * comtnanswer을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnanswerVO
	 * @return 조회한 comtnanswer
	 * @exception Exception
	 */
    public ComtnanswerVO selectComtnanswer(ComtnanswerVO vo) throws Exception {
        return (ComtnanswerVO) selectByPk("comtnanswerDAO.selectComtnanswer_S", vo);
    }

    /**
	 * comtnanswer 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnanswer 목록
	 * @exception Exception
	 */
    public List selectComtnanswerList(ComtnanswerDefaultVO searchVO) throws Exception {
        return list("comtnanswerDAO.selectComtnanswerList_D", searchVO);
    }

    /**
	 * comtnanswer 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnanswer 총 갯수
	 * @exception
	 */
    public int selectComtnanswerListTotCnt(ComtnanswerDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnanswerDAO.selectComtnanswerListTotCnt_S", searchVO);
    }

}
