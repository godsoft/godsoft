package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageDefaultVO;

/**
 * @Class Name : ComtnonlinepollmanageDAO.java
 * @Description : Comtnonlinepollmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnonlinepollmanageDAO")
public class ComtnonlinepollmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnonlinepollmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        return (String)insert("comtnonlinepollmanageDAO.insertComtnonlinepollmanage_S", vo);
    }

    /**
	 * comtnonlinepollmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        update("comtnonlinepollmanageDAO.updateComtnonlinepollmanage_S", vo);
    }

    /**
	 * comtnonlinepollmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        delete("comtnonlinepollmanageDAO.deleteComtnonlinepollmanage_S", vo);
    }

    /**
	 * comtnonlinepollmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 조회한 comtnonlinepollmanage
	 * @exception Exception
	 */
    public ComtnonlinepollmanageVO selectComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        return (ComtnonlinepollmanageVO) selectByPk("comtnonlinepollmanageDAO.selectComtnonlinepollmanage_S", vo);
    }

    /**
	 * comtnonlinepollmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinepollmanage 목록
	 * @exception Exception
	 */
    public List selectComtnonlinepollmanageList(ComtnonlinepollmanageDefaultVO searchVO) throws Exception {
        return list("comtnonlinepollmanageDAO.selectComtnonlinepollmanageList_D", searchVO);
    }

    /**
	 * comtnonlinepollmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnonlinepollmanage 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepollmanageListTotCnt(ComtnonlinepollmanageDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnonlinepollmanageDAO.selectComtnonlinepollmanageListTotCnt_S", searchVO);
    }

}
