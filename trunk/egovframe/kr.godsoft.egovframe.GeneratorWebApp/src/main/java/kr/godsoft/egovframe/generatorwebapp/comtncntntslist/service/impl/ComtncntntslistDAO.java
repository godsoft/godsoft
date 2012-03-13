package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistDefaultVO;

/**
 * @Class Name : ComtncntntslistDAO.java
 * @Description : Comtncntntslist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntntslistDAO")
public class ComtncntntslistDAO extends EgovAbstractDAO {

	/**
	 * comtncntntslist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntntslistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntntslist(ComtncntntslistVO vo) throws Exception {
        return (String)insert("comtncntntslistDAO.insertComtncntntslist_S", vo);
    }

    /**
	 * comtncntntslist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntntslistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntntslist(ComtncntntslistVO vo) throws Exception {
        update("comtncntntslistDAO.updateComtncntntslist_S", vo);
    }

    /**
	 * comtncntntslist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntntslistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntntslist(ComtncntntslistVO vo) throws Exception {
        delete("comtncntntslistDAO.deleteComtncntntslist_S", vo);
    }

    /**
	 * comtncntntslist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntntslistVO
	 * @return 조회한 comtncntntslist
	 * @exception Exception
	 */
    public ComtncntntslistVO selectComtncntntslist(ComtncntntslistVO vo) throws Exception {
        return (ComtncntntslistVO) selectByPk("comtncntntslistDAO.selectComtncntntslist_S", vo);
    }

    /**
	 * comtncntntslist 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntntslist 목록
	 * @exception Exception
	 */
    public List selectComtncntntslistList(ComtncntntslistDefaultVO searchVO) throws Exception {
        return list("comtncntntslistDAO.selectComtncntntslistList_D", searchVO);
    }

    /**
	 * comtncntntslist 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntntslist 총 갯수
	 * @exception
	 */
    public int selectComtncntntslistListTotCnt(ComtncntntslistDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntntslistDAO.selectComtncntntslistListTotCnt_S", searchVO);
    }

}
