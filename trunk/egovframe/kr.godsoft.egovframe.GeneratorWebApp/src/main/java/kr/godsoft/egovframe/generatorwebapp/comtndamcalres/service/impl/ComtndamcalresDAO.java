package kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresVO;

/**
 * @Class Name : ComtndamcalresDAO.java
 * @Description : Comtndamcalres DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndamcalresDAO")
public class ComtndamcalresDAO extends EgovAbstractDAO {

	/**
	 * comtndamcalres을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamcalresVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndamcalres(ComtndamcalresVO vo) throws Exception {
        return (String)insert("comtndamcalresDAO.insertComtndamcalres_S", vo);
    }

    /**
	 * comtndamcalres을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamcalresVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndamcalres(ComtndamcalresVO vo) throws Exception {
        update("comtndamcalresDAO.updateComtndamcalres_S", vo);
    }

    /**
	 * comtndamcalres을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamcalresVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndamcalres(ComtndamcalresVO vo) throws Exception {
        delete("comtndamcalresDAO.deleteComtndamcalres_S", vo);
    }

    /**
	 * comtndamcalres을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamcalresVO
	 * @return 조회한 comtndamcalres
	 * @exception Exception
	 */
    public ComtndamcalresVO selectComtndamcalres(ComtndamcalresVO vo) throws Exception {
        return (ComtndamcalresVO) selectByPk("comtndamcalresDAO.selectComtndamcalres_S", vo);
    }

    /**
	 * comtndamcalres 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndamcalres 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndamcalresList(ComtndamcalresVO vo) throws Exception {
        return list("comtndamcalresDAO.selectComtndamcalresList_D", vo);
    }

    /**
	 * comtndamcalres 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndamcalres 총 갯수
	 * @exception
	 */
    public int selectComtndamcalresListTotCnt(ComtndamcalresVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndamcalresDAO.selectComtndamcalresListTotCnt_S", vo);
    }

}
