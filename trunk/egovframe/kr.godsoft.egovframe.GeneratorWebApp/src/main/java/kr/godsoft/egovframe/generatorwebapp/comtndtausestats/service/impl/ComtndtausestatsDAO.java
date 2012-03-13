package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsVO;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsDefaultVO;

/**
 * @Class Name : ComtndtausestatsDAO.java
 * @Description : Comtndtausestats DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndtausestatsDAO")
public class ComtndtausestatsDAO extends EgovAbstractDAO {

	/**
	 * comtndtausestats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndtausestatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        return (String)insert("comtndtausestatsDAO.insertComtndtausestats_S", vo);
    }

    /**
	 * comtndtausestats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndtausestatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        update("comtndtausestatsDAO.updateComtndtausestats_S", vo);
    }

    /**
	 * comtndtausestats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndtausestatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        delete("comtndtausestatsDAO.deleteComtndtausestats_S", vo);
    }

    /**
	 * comtndtausestats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndtausestatsVO
	 * @return 조회한 comtndtausestats
	 * @exception Exception
	 */
    public ComtndtausestatsVO selectComtndtausestats(ComtndtausestatsVO vo) throws Exception {
        return (ComtndtausestatsVO) selectByPk("comtndtausestatsDAO.selectComtndtausestats_S", vo);
    }

    /**
	 * comtndtausestats 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndtausestats 목록
	 * @exception Exception
	 */
    public List selectComtndtausestatsList(ComtndtausestatsDefaultVO searchVO) throws Exception {
        return list("comtndtausestatsDAO.selectComtndtausestatsList_D", searchVO);
    }

    /**
	 * comtndtausestats 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndtausestats 총 갯수
	 * @exception
	 */
    public int selectComtndtausestatsListTotCnt(ComtndtausestatsDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndtausestatsDAO.selectComtndtausestatsListTotCnt_S", searchVO);
    }

}
