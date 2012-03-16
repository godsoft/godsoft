package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsVO;

/**
 * @Class Name : ComtnindvdlpgeestbsDAO.java
 * @Description : Comtnindvdlpgeestbs DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnindvdlpgeestbsDAO")
public class ComtnindvdlpgeestbsDAO extends EgovAbstractDAO {

	/**
	 * comtnindvdlpgeestbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        return (String)insert("comtnindvdlpgeestbsDAO.insertComtnindvdlpgeestbs_S", vo);
    }

    /**
	 * comtnindvdlpgeestbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        update("comtnindvdlpgeestbsDAO.updateComtnindvdlpgeestbs_S", vo);
    }

    /**
	 * comtnindvdlpgeestbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        delete("comtnindvdlpgeestbsDAO.deleteComtnindvdlpgeestbs_S", vo);
    }

    /**
	 * comtnindvdlpgeestbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 조회한 comtnindvdlpgeestbs
	 * @exception Exception
	 */
    public ComtnindvdlpgeestbsVO selectComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        return (ComtnindvdlpgeestbsVO) selectByPk("comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbs_S", vo);
    }

    /**
	 * comtnindvdlpgeestbs 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlpgeestbs 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnindvdlpgeestbsList(ComtnindvdlpgeestbsVO vo) throws Exception {
        return list("comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbsList_D", vo);
    }

    /**
	 * comtnindvdlpgeestbs 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnindvdlpgeestbs 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlpgeestbsListTotCnt(ComtnindvdlpgeestbsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbsListTotCnt_S", vo);
    }

}
