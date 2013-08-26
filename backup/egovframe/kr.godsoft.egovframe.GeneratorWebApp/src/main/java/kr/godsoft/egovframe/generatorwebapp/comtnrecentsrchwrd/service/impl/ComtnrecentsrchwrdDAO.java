package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdVO;

/**
 * @Class Name : ComtnrecentsrchwrdDAO.java
 * @Description : Comtnrecentsrchwrd DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrecentsrchwrdDAO")
public class ComtnrecentsrchwrdDAO extends EgovAbstractDAO {

	/**
	 * COMTNRECENTSRCHWRD을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        return (String)insert("comtnrecentsrchwrdDAO.insertComtnrecentsrchwrd_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        update("comtnrecentsrchwrdDAO.updateComtnrecentsrchwrd_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        delete("comtnrecentsrchwrdDAO.deleteComtnrecentsrchwrd_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 조회한 COMTNRECENTSRCHWRD
	 * @exception Exception
	 */
    public ComtnrecentsrchwrdVO selectComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception {
        return (ComtnrecentsrchwrdVO) selectByPk("comtnrecentsrchwrdDAO.selectComtnrecentsrchwrd_S", vo);
    }

    /**
	 * COMTNRECENTSRCHWRD 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRECENTSRCHWRD 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrecentsrchwrdList(ComtnrecentsrchwrdVO vo) throws Exception {
        return list("comtnrecentsrchwrdDAO.selectComtnrecentsrchwrdList_D", vo);
    }

    /**
	 * COMTNRECENTSRCHWRD 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNRECENTSRCHWRD 총 갯수
	 * @exception
	 */
    public int selectComtnrecentsrchwrdListTotCnt(ComtnrecentsrchwrdVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrecentsrchwrdDAO.selectComtnrecentsrchwrdListTotCnt_S", vo);
    }

}
