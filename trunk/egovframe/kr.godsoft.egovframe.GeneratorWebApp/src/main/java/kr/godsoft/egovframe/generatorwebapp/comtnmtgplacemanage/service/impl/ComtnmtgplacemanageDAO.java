package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service.ComtnmtgplacemanageVO;

/**
 * @Class Name : ComtnmtgplacemanageDAO.java
 * @Description : Comtnmtgplacemanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmtgplacemanageDAO")
public class ComtnmtgplacemanageDAO extends EgovAbstractDAO {

	/**
	 * comtnmtgplacemanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        return (String)insert("comtnmtgplacemanageDAO.insertComtnmtgplacemanage_S", vo);
    }

    /**
	 * comtnmtgplacemanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        update("comtnmtgplacemanageDAO.updateComtnmtgplacemanage_S", vo);
    }

    /**
	 * comtnmtgplacemanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        delete("comtnmtgplacemanageDAO.deleteComtnmtgplacemanage_S", vo);
    }

    /**
	 * comtnmtgplacemanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 조회한 comtnmtgplacemanage
	 * @exception Exception
	 */
    public ComtnmtgplacemanageVO selectComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception {
        return (ComtnmtgplacemanageVO) selectByPk("comtnmtgplacemanageDAO.selectComtnmtgplacemanage_S", vo);
    }

    /**
	 * comtnmtgplacemanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtgplacemanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmtgplacemanageList(ComtnmtgplacemanageVO vo) throws Exception {
        return list("comtnmtgplacemanageDAO.selectComtnmtgplacemanageList_D", vo);
    }

    /**
	 * comtnmtgplacemanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmtgplacemanage 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplacemanageListTotCnt(ComtnmtgplacemanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmtgplacemanageDAO.selectComtnmtgplacemanageListTotCnt_S", vo);
    }

}
