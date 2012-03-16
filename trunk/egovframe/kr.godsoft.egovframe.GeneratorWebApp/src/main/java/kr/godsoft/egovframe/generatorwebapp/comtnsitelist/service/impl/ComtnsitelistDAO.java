package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistVO;

/**
 * @Class Name : ComtnsitelistDAO.java
 * @Description : Comtnsitelist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsitelistDAO")
public class ComtnsitelistDAO extends EgovAbstractDAO {

	/**
	 * comtnsitelist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitelistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsitelist(ComtnsitelistVO vo) throws Exception {
        return (String)insert("comtnsitelistDAO.insertComtnsitelist_S", vo);
    }

    /**
	 * comtnsitelist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitelistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsitelist(ComtnsitelistVO vo) throws Exception {
        update("comtnsitelistDAO.updateComtnsitelist_S", vo);
    }

    /**
	 * comtnsitelist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitelistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsitelist(ComtnsitelistVO vo) throws Exception {
        delete("comtnsitelistDAO.deleteComtnsitelist_S", vo);
    }

    /**
	 * comtnsitelist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitelistVO
	 * @return 조회한 comtnsitelist
	 * @exception Exception
	 */
    public ComtnsitelistVO selectComtnsitelist(ComtnsitelistVO vo) throws Exception {
        return (ComtnsitelistVO) selectByPk("comtnsitelistDAO.selectComtnsitelist_S", vo);
    }

    /**
	 * comtnsitelist 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsitelist 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsitelistList(ComtnsitelistVO vo) throws Exception {
        return list("comtnsitelistDAO.selectComtnsitelistList_D", vo);
    }

    /**
	 * comtnsitelist 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsitelist 총 갯수
	 * @exception
	 */
    public int selectComtnsitelistListTotCnt(ComtnsitelistVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsitelistDAO.selectComtnsitelistListTotCnt_S", vo);
    }

}
