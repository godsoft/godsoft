package kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageVO;

/**
 * @Class Name : ComtnadbkmanageDAO.java
 * @Description : Comtnadbkmanage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnadbkmanageDAO")
public class ComtnadbkmanageDAO extends EgovAbstractDAO {

	/**
	 * comtnadbkmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        return (String)insert("comtnadbkmanageDAO.insertComtnadbkmanage_S", vo);
    }

    /**
	 * comtnadbkmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        update("comtnadbkmanageDAO.updateComtnadbkmanage_S", vo);
    }

    /**
	 * comtnadbkmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        delete("comtnadbkmanageDAO.deleteComtnadbkmanage_S", vo);
    }

    /**
	 * comtnadbkmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkmanageVO
	 * @return 조회한 comtnadbkmanage
	 * @exception Exception
	 */
    public ComtnadbkmanageVO selectComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        return (ComtnadbkmanageVO) selectByPk("comtnadbkmanageDAO.selectComtnadbkmanage_S", vo);
    }

    /**
	 * comtnadbkmanage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadbkmanage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnadbkmanageList(ComtnadbkmanageVO vo) throws Exception {
        return list("comtnadbkmanageDAO.selectComtnadbkmanageList_D", vo);
    }

    /**
	 * comtnadbkmanage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnadbkmanage 총 갯수
	 * @exception
	 */
    public int selectComtnadbkmanageListTotCnt(ComtnadbkmanageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnadbkmanageDAO.selectComtnadbkmanageListTotCnt_S", vo);
    }

}
