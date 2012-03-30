package kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsVO;

/**
 * @Class Name : ComtnemplyrscrtyestbsDAO.java
 * @Description : Comtnemplyrscrtyestbs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnemplyrscrtyestbsDAO")
public class ComtnemplyrscrtyestbsDAO extends EgovAbstractDAO {

	/**
	 * COMTNEMPLYRSCRTYESTBS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        return (String)insert("comtnemplyrscrtyestbsDAO.insertComtnemplyrscrtyestbs_S", vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        update("comtnemplyrscrtyestbsDAO.updateComtnemplyrscrtyestbs_S", vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        delete("comtnemplyrscrtyestbsDAO.deleteComtnemplyrscrtyestbs_S", vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 조회한 COMTNEMPLYRSCRTYESTBS
	 * @exception Exception
	 */
    public ComtnemplyrscrtyestbsVO selectComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        return (ComtnemplyrscrtyestbsVO) selectByPk("comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbs_S", vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEMPLYRSCRTYESTBS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnemplyrscrtyestbsList(ComtnemplyrscrtyestbsVO vo) throws Exception {
        return list("comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbsList_D", vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNEMPLYRSCRTYESTBS 총 갯수
	 * @exception
	 */
    public int selectComtnemplyrscrtyestbsListTotCnt(ComtnemplyrscrtyestbsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbsListTotCnt_S", vo);
    }

}
