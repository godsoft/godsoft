package kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageVO;

/**
 * @Class Name : ComtnpopupmanageDAO.java
 * @Description : Comtnpopupmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnpopupmanageDAO")
public class ComtnpopupmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnpopupmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnpopupmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        return (String)insert("comtnpopupmanageDAO.insertComtnpopupmanage_S", vo);
    }

    /**
	 * comtnpopupmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        update("comtnpopupmanageDAO.updateComtnpopupmanage_S", vo);
    }

    /**
	 * comtnpopupmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        delete("comtnpopupmanageDAO.deleteComtnpopupmanage_S", vo);
    }

    /**
	 * comtnpopupmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnpopupmanageVO
	 * @return 조회한 comtnpopupmanage
	 * @exception Exception
	 */
    public ComtnpopupmanageVO selectComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        return (ComtnpopupmanageVO) selectByPk("comtnpopupmanageDAO.selectComtnpopupmanage_S", vo);
    }

    /**
	 * comtnpopupmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnpopupmanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnpopupmanageList(ComtnpopupmanageVO vo) throws Exception {
        return list("comtnpopupmanageDAO.selectComtnpopupmanageList_D", vo);
    }

    /**
	 * comtnpopupmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnpopupmanage 총 갯수
	 * @exception
	 */
    public int selectComtnpopupmanageListTotCnt(ComtnpopupmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnpopupmanageDAO.selectComtnpopupmanageListTotCnt_S", vo);
    }

}
