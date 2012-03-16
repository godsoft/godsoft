package kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserVO;

/**
 * @Class Name : ComtnncrduserDAO.java
 * @Description : Comtnncrduser DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnncrduserDAO")
public class ComtnncrduserDAO extends EgovAbstractDAO {

	/**
	 * comtnncrduser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrduserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnncrduser(ComtnncrduserVO vo) throws Exception {
        return (String)insert("comtnncrduserDAO.insertComtnncrduser_S", vo);
    }

    /**
	 * comtnncrduser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrduserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnncrduser(ComtnncrduserVO vo) throws Exception {
        update("comtnncrduserDAO.updateComtnncrduser_S", vo);
    }

    /**
	 * comtnncrduser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrduserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnncrduser(ComtnncrduserVO vo) throws Exception {
        delete("comtnncrduserDAO.deleteComtnncrduser_S", vo);
    }

    /**
	 * comtnncrduser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrduserVO
	 * @return 조회한 comtnncrduser
	 * @exception Exception
	 */
    public ComtnncrduserVO selectComtnncrduser(ComtnncrduserVO vo) throws Exception {
        return (ComtnncrduserVO) selectByPk("comtnncrduserDAO.selectComtnncrduser_S", vo);
    }

    /**
	 * comtnncrduser 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnncrduser 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnncrduserList(ComtnncrduserVO vo) throws Exception {
        return list("comtnncrduserDAO.selectComtnncrduserList_D", vo);
    }

    /**
	 * comtnncrduser 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnncrduser 총 갯수
	 * @exception
	 */
    public int selectComtnncrduserListTotCnt(ComtnncrduserVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnncrduserDAO.selectComtnncrduserListTotCnt_S", vo);
    }

}
