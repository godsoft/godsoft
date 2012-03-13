package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageDefaultVO;

/**
 * @Class Name : ComtnvcatnmanageDAO.java
 * @Description : Comtnvcatnmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnvcatnmanageDAO")
public class ComtnvcatnmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnvcatnmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        return (String)insert("comtnvcatnmanageDAO.insertComtnvcatnmanage_S", vo);
    }

    /**
	 * comtnvcatnmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        update("comtnvcatnmanageDAO.updateComtnvcatnmanage_S", vo);
    }

    /**
	 * comtnvcatnmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        delete("comtnvcatnmanageDAO.deleteComtnvcatnmanage_S", vo);
    }

    /**
	 * comtnvcatnmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 조회한 comtnvcatnmanage
	 * @exception Exception
	 */
    public ComtnvcatnmanageVO selectComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        return (ComtnvcatnmanageVO) selectByPk("comtnvcatnmanageDAO.selectComtnvcatnmanage_S", vo);
    }

    /**
	 * comtnvcatnmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnvcatnmanage 목록
	 * @exception Exception
	 */
    public List selectComtnvcatnmanageList(ComtnvcatnmanageDefaultVO searchVO) throws Exception {
        return list("comtnvcatnmanageDAO.selectComtnvcatnmanageList_D", searchVO);
    }

    /**
	 * comtnvcatnmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnvcatnmanage 총 갯수
	 * @exception
	 */
    public int selectComtnvcatnmanageListTotCnt(ComtnvcatnmanageDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnvcatnmanageDAO.selectComtnvcatnmanageListTotCnt_S", searchVO);
    }

}
