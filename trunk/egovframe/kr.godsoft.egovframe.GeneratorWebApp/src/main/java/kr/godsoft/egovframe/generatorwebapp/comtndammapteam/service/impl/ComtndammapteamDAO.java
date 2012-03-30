package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamVO;

/**
 * @Class Name : ComtndammapteamDAO.java
 * @Description : Comtndammapteam DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtndammapteamDAO")
public class ComtndammapteamDAO extends EgovAbstractDAO {

	/**
	 * COMTNDAMMAPTEAM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapteamVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndammapteam(ComtndammapteamVO vo) throws Exception {
        return (String)insert("comtndammapteamDAO.insertComtndammapteam_S", vo);
    }

    /**
	 * COMTNDAMMAPTEAM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapteamVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndammapteam(ComtndammapteamVO vo) throws Exception {
        update("comtndammapteamDAO.updateComtndammapteam_S", vo);
    }

    /**
	 * COMTNDAMMAPTEAM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapteamVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndammapteam(ComtndammapteamVO vo) throws Exception {
        delete("comtndammapteamDAO.deleteComtndammapteam_S", vo);
    }

    /**
	 * COMTNDAMMAPTEAM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapteamVO
	 * @return 조회한 COMTNDAMMAPTEAM
	 * @exception Exception
	 */
    public ComtndammapteamVO selectComtndammapteam(ComtndammapteamVO vo) throws Exception {
        return (ComtndammapteamVO) selectByPk("comtndammapteamDAO.selectComtndammapteam_S", vo);
    }

    /**
	 * COMTNDAMMAPTEAM 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDAMMAPTEAM 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtndammapteamList(ComtndammapteamVO vo) throws Exception {
        return list("comtndammapteamDAO.selectComtndammapteamList_D", vo);
    }

    /**
	 * COMTNDAMMAPTEAM 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNDAMMAPTEAM 총 갯수
	 * @exception
	 */
    public int selectComtndammapteamListTotCnt(ComtndammapteamVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtndammapteamDAO.selectComtndammapteamListTotCnt_S", vo);
    }

}
