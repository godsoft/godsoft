package kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service.ComtnbndtmanageVO;

/**
 * @Class Name : ComtnbndtmanageDAO.java
 * @Description : Comtnbndtmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbndtmanageDAO")
public class ComtnbndtmanageDAO extends EgovAbstractDAO {

	/**
	 * COMTNBNDTMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        return (String)insert("comtnbndtmanageDAO.insertComtnbndtmanage_S", vo);
    }

    /**
	 * COMTNBNDTMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        update("comtnbndtmanageDAO.updateComtnbndtmanage_S", vo);
    }

    /**
	 * COMTNBNDTMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        delete("comtnbndtmanageDAO.deleteComtnbndtmanage_S", vo);
    }

    /**
	 * COMTNBNDTMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtmanageVO
	 * @return 조회한 COMTNBNDTMANAGE
	 * @exception Exception
	 */
    public ComtnbndtmanageVO selectComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception {
        return (ComtnbndtmanageVO) selectByPk("comtnbndtmanageDAO.selectComtnbndtmanage_S", vo);
    }

    /**
	 * COMTNBNDTMANAGE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBNDTMANAGE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbndtmanageList(ComtnbndtmanageVO vo) throws Exception {
        return list("comtnbndtmanageDAO.selectComtnbndtmanageList_D", vo);
    }

    /**
	 * COMTNBNDTMANAGE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBNDTMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnbndtmanageListTotCnt(ComtnbndtmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbndtmanageDAO.selectComtnbndtmanageListTotCnt_S", vo);
    }

}
