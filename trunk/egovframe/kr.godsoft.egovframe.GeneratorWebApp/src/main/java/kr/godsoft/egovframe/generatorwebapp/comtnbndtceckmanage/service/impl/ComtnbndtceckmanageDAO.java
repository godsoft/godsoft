package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageVO;

/**
 * @Class Name : ComtnbndtceckmanageDAO.java
 * @Description : Comtnbndtceckmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbndtceckmanageDAO")
public class ComtnbndtceckmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnbndtceckmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        return (String)insert("comtnbndtceckmanageDAO.insertComtnbndtceckmanage_S", vo);
    }

    /**
	 * comtnbndtceckmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        update("comtnbndtceckmanageDAO.updateComtnbndtceckmanage_S", vo);
    }

    /**
	 * comtnbndtceckmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        delete("comtnbndtceckmanageDAO.deleteComtnbndtceckmanage_S", vo);
    }

    /**
	 * comtnbndtceckmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 조회한 comtnbndtceckmanage
	 * @exception Exception
	 */
    public ComtnbndtceckmanageVO selectComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        return (ComtnbndtceckmanageVO) selectByPk("comtnbndtceckmanageDAO.selectComtnbndtceckmanage_S", vo);
    }

    /**
	 * comtnbndtceckmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtceckmanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbndtceckmanageList(ComtnbndtceckmanageVO vo) throws Exception {
        return list("comtnbndtceckmanageDAO.selectComtnbndtceckmanageList_D", vo);
    }

    /**
	 * comtnbndtceckmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbndtceckmanage 총 갯수
	 * @exception
	 */
    public int selectComtnbndtceckmanageListTotCnt(ComtnbndtceckmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbndtceckmanageDAO.selectComtnbndtceckmanageListTotCnt_S", vo);
    }

}
