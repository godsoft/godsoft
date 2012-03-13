package kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageDefaultVO;

/**
 * @Class Name : ComtnctsnnmanageDAO.java
 * @Description : Comtnctsnnmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnctsnnmanageDAO")
public class ComtnctsnnmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnctsnnmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnctsnnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        return (String)insert("comtnctsnnmanageDAO.insertComtnctsnnmanage_S", vo);
    }

    /**
	 * comtnctsnnmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnctsnnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        update("comtnctsnnmanageDAO.updateComtnctsnnmanage_S", vo);
    }

    /**
	 * comtnctsnnmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnctsnnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        delete("comtnctsnnmanageDAO.deleteComtnctsnnmanage_S", vo);
    }

    /**
	 * comtnctsnnmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnctsnnmanageVO
	 * @return 조회한 comtnctsnnmanage
	 * @exception Exception
	 */
    public ComtnctsnnmanageVO selectComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        return (ComtnctsnnmanageVO) selectByPk("comtnctsnnmanageDAO.selectComtnctsnnmanage_S", vo);
    }

    /**
	 * comtnctsnnmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnctsnnmanage 목록
	 * @exception Exception
	 */
    public List selectComtnctsnnmanageList(ComtnctsnnmanageDefaultVO searchVO) throws Exception {
        return list("comtnctsnnmanageDAO.selectComtnctsnnmanageList_D", searchVO);
    }

    /**
	 * comtnctsnnmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnctsnnmanage 총 갯수
	 * @exception
	 */
    public int selectComtnctsnnmanageListTotCnt(ComtnctsnnmanageDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnctsnnmanageDAO.selectComtnctsnnmanageListTotCnt_S", searchVO);
    }

}
