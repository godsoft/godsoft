package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageDefaultVO;

/**
 * @Class Name : ComtnindvdlyrycmanageDAO.java
 * @Description : Comtnindvdlyrycmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnindvdlyrycmanageDAO")
public class ComtnindvdlyrycmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnindvdlyrycmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        return (String)insert("comtnindvdlyrycmanageDAO.insertComtnindvdlyrycmanage_S", vo);
    }

    /**
	 * comtnindvdlyrycmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        update("comtnindvdlyrycmanageDAO.updateComtnindvdlyrycmanage_S", vo);
    }

    /**
	 * comtnindvdlyrycmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        delete("comtnindvdlyrycmanageDAO.deleteComtnindvdlyrycmanage_S", vo);
    }

    /**
	 * comtnindvdlyrycmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 조회한 comtnindvdlyrycmanage
	 * @exception Exception
	 */
    public ComtnindvdlyrycmanageVO selectComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        return (ComtnindvdlyrycmanageVO) selectByPk("comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanage_S", vo);
    }

    /**
	 * comtnindvdlyrycmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlyrycmanage 목록
	 * @exception Exception
	 */
    public List selectComtnindvdlyrycmanageList(ComtnindvdlyrycmanageDefaultVO searchVO) throws Exception {
        return list("comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanageList_D", searchVO);
    }

    /**
	 * comtnindvdlyrycmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlyrycmanage 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlyrycmanageListTotCnt(ComtnindvdlyrycmanageDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanageListTotCnt_S", searchVO);
    }

}
