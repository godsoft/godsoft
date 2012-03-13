package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamDefaultVO;

/**
 * @Class Name : ComtndammapteamDAO.java
 * @Description : Comtndammapteam DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndammapteamDAO")
public class ComtndammapteamDAO extends EgovAbstractDAO {

	/**
	 * comtndammapteam을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapteamVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndammapteam(ComtndammapteamVO vo) throws Exception {
        return (String)insert("comtndammapteamDAO.insertComtndammapteam_S", vo);
    }

    /**
	 * comtndammapteam을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapteamVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndammapteam(ComtndammapteamVO vo) throws Exception {
        update("comtndammapteamDAO.updateComtndammapteam_S", vo);
    }

    /**
	 * comtndammapteam을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapteamVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndammapteam(ComtndammapteamVO vo) throws Exception {
        delete("comtndammapteamDAO.deleteComtndammapteam_S", vo);
    }

    /**
	 * comtndammapteam을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapteamVO
	 * @return 조회한 comtndammapteam
	 * @exception Exception
	 */
    public ComtndammapteamVO selectComtndammapteam(ComtndammapteamVO vo) throws Exception {
        return (ComtndammapteamVO) selectByPk("comtndammapteamDAO.selectComtndammapteam_S", vo);
    }

    /**
	 * comtndammapteam 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndammapteam 목록
	 * @exception Exception
	 */
    public List selectComtndammapteamList(ComtndammapteamDefaultVO searchVO) throws Exception {
        return list("comtndammapteamDAO.selectComtndammapteamList_D", searchVO);
    }

    /**
	 * comtndammapteam 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtndammapteam 총 갯수
	 * @exception
	 */
    public int selectComtndammapteamListTotCnt(ComtndammapteamDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndammapteamDAO.selectComtndammapteamListTotCnt_S", searchVO);
    }

}
