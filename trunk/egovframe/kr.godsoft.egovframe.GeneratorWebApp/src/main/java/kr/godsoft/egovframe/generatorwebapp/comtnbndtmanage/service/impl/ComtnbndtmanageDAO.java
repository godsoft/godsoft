package kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.ComtnbndtmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.ComtnbndtmanageDefaultVO;

/**
 * @Class Name : ComtnbndtmanageDAO.java
 * @Description : Comtnbndtmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbndtmanageDAO")
public class ComtnbndtmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnbndtmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        return (String)insert("comtnbndtmanageDAO.insertComtnbndtmanage_S", vo);
    }

    /**
	 * comtnbndtmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        update("comtnbndtmanageDAO.updateComtnbndtmanage_S", vo);
    }

    /**
	 * comtnbndtmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        delete("comtnbndtmanageDAO.deleteComtnbndtmanage_S", vo);
    }

    /**
	 * comtnbndtmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtmanageVO
	 * @return 조회한 comtnbndtmanage
	 * @exception Exception
	 */
    public ComtnbndtmanageVO selectComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        return (ComtnbndtmanageVO) selectByPk("comtnbndtmanageDAO.selectComtnbndtmanage_S", vo);
    }

    /**
	 * comtnbndtmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtmanage 목록
	 * @exception Exception
	 */
    public List selectComtnbndtmanageList(ComtnbndtmanageDefaultVO searchVO) throws Exception {
        return list("comtnbndtmanageDAO.selectComtnbndtmanageList_D", searchVO);
    }

    /**
	 * comtnbndtmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtmanage 총 갯수
	 * @exception
	 */
    public int selectComtnbndtmanageListTotCnt(ComtnbndtmanageDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbndtmanageDAO.selectComtnbndtmanageListTotCnt_S", searchVO);
    }

}
