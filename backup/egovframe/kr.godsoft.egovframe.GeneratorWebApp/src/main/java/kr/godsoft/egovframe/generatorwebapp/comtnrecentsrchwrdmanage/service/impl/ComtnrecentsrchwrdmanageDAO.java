package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageVO;

/**
 * @Class Name : ComtnrecentsrchwrdmanageDAO.java
 * @Description : Comtnrecentsrchwrdmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrecentsrchwrdmanageDAO")
public class ComtnrecentsrchwrdmanageDAO extends EgovAbstractDAO {

	/**
	 * COMTNRECENTSRCHWRDMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        return (String)insert("comtnrecentsrchwrdmanageDAO.insertComtnrecentsrchwrdmanage_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRDMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        update("comtnrecentsrchwrdmanageDAO.updateComtnrecentsrchwrdmanage_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRDMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        delete("comtnrecentsrchwrdmanageDAO.deleteComtnrecentsrchwrdmanage_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRDMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 조회한 COMTNRECENTSRCHWRDMANAGE
	 * @exception Exception
	 */
    public ComtnrecentsrchwrdmanageVO selectComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        return (ComtnrecentsrchwrdmanageVO) selectByPk("comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanage_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRDMANAGE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRECENTSRCHWRDMANAGE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrecentsrchwrdmanageList(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        return list("comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanageList_D", vo);
    }

    /**
	 * COMTNRECENTSRCHWRDMANAGE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRECENTSRCHWRDMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnrecentsrchwrdmanageListTotCnt(ComtnrecentsrchwrdmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanageListTotCnt_S", vo);
    }

}
