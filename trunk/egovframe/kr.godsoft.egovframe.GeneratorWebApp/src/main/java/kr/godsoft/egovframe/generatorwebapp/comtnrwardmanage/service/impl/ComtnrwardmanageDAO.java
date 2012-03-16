package kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageVO;

/**
 * @Class Name : ComtnrwardmanageDAO.java
 * @Description : Comtnrwardmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrwardmanageDAO")
public class ComtnrwardmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnrwardmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrwardmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        return (String)insert("comtnrwardmanageDAO.insertComtnrwardmanage_S", vo);
    }

    /**
	 * comtnrwardmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        update("comtnrwardmanageDAO.updateComtnrwardmanage_S", vo);
    }

    /**
	 * comtnrwardmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        delete("comtnrwardmanageDAO.deleteComtnrwardmanage_S", vo);
    }

    /**
	 * comtnrwardmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrwardmanageVO
	 * @return 조회한 comtnrwardmanage
	 * @exception Exception
	 */
    public ComtnrwardmanageVO selectComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        return (ComtnrwardmanageVO) selectByPk("comtnrwardmanageDAO.selectComtnrwardmanage_S", vo);
    }

    /**
	 * comtnrwardmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrwardmanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrwardmanageList(ComtnrwardmanageVO vo) throws Exception {
        return list("comtnrwardmanageDAO.selectComtnrwardmanageList_D", vo);
    }

    /**
	 * comtnrwardmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrwardmanage 총 갯수
	 * @exception
	 */
    public int selectComtnrwardmanageListTotCnt(ComtnrwardmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrwardmanageDAO.selectComtnrwardmanageListTotCnt_S", vo);
    }

}
