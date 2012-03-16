package kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service.ComtnentrprsmberVO;

/**
 * @Class Name : ComtnentrprsmberDAO.java
 * @Description : Comtnentrprsmber DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnentrprsmberDAO")
public class ComtnentrprsmberDAO extends EgovAbstractDAO {

	/**
	 * comtnentrprsmber을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnentrprsmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        return (String)insert("comtnentrprsmberDAO.insertComtnentrprsmber_S", vo);
    }

    /**
	 * comtnentrprsmber을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        update("comtnentrprsmberDAO.updateComtnentrprsmber_S", vo);
    }

    /**
	 * comtnentrprsmber을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        delete("comtnentrprsmberDAO.deleteComtnentrprsmber_S", vo);
    }

    /**
	 * comtnentrprsmber을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnentrprsmberVO
	 * @return 조회한 comtnentrprsmber
	 * @exception Exception
	 */
    public ComtnentrprsmberVO selectComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception {
        return (ComtnentrprsmberVO) selectByPk("comtnentrprsmberDAO.selectComtnentrprsmber_S", vo);
    }

    /**
	 * comtnentrprsmber 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnentrprsmber 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnentrprsmberList(ComtnentrprsmberVO vo) throws Exception {
        return list("comtnentrprsmberDAO.selectComtnentrprsmberList_D", vo);
    }

    /**
	 * comtnentrprsmber 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnentrprsmber 총 갯수
	 * @exception
	 */
    public int selectComtnentrprsmberListTotCnt(ComtnentrprsmberVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnentrprsmberDAO.selectComtnentrprsmberListTotCnt_S", vo);
    }

}
