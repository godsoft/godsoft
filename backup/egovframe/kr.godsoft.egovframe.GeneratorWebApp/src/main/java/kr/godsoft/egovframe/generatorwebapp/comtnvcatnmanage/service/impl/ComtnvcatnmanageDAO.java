package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service.ComtnvcatnmanageVO;

/**
 * @Class Name : ComtnvcatnmanageDAO.java
 * @Description : Comtnvcatnmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnvcatnmanageDAO")
public class ComtnvcatnmanageDAO extends EgovAbstractDAO {

	/**
	 * COMTNVCATNMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        return (String)insert("comtnvcatnmanageDAO.insertComtnvcatnmanage_S", vo);
    }

    /**
	 * COMTNVCATNMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        update("comtnvcatnmanageDAO.updateComtnvcatnmanage_S", vo);
    }

    /**
	 * COMTNVCATNMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        delete("comtnvcatnmanageDAO.deleteComtnvcatnmanage_S", vo);
    }

    /**
	 * COMTNVCATNMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 조회한 COMTNVCATNMANAGE
	 * @exception Exception
	 */
    public ComtnvcatnmanageVO selectComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception {
        return (ComtnvcatnmanageVO) selectByPk("comtnvcatnmanageDAO.selectComtnvcatnmanage_S", vo);
    }

    /**
	 * COMTNVCATNMANAGE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNVCATNMANAGE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnvcatnmanageList(ComtnvcatnmanageVO vo) throws Exception {
        return list("comtnvcatnmanageDAO.selectComtnvcatnmanageList_D", vo);
    }

    /**
	 * COMTNVCATNMANAGE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNVCATNMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnvcatnmanageListTotCnt(ComtnvcatnmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnvcatnmanageDAO.selectComtnvcatnmanageListTotCnt_S", vo);
    }

}