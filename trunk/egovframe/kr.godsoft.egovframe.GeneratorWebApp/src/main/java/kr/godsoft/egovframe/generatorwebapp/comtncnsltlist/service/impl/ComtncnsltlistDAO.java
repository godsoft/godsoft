package kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistVO;
import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistDefaultVO;

/**
 * @Class Name : ComtncnsltlistDAO.java
 * @Description : Comtncnsltlist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncnsltlistDAO")
public class ComtncnsltlistDAO extends EgovAbstractDAO {

	/**
	 * comtncnsltlist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncnsltlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        return (String)insert("comtncnsltlistDAO.insertComtncnsltlist_S", vo);
    }

    /**
	 * comtncnsltlist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncnsltlistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        update("comtncnsltlistDAO.updateComtncnsltlist_S", vo);
    }

    /**
	 * comtncnsltlist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncnsltlistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        delete("comtncnsltlistDAO.deleteComtncnsltlist_S", vo);
    }

    /**
	 * comtncnsltlist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncnsltlistVO
	 * @return 조회한 comtncnsltlist
	 * @exception Exception
	 */
    public ComtncnsltlistVO selectComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        return (ComtncnsltlistVO) selectByPk("comtncnsltlistDAO.selectComtncnsltlist_S", vo);
    }

    /**
	 * comtncnsltlist 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncnsltlist 목록
	 * @exception Exception
	 */
    public List selectComtncnsltlistList(ComtncnsltlistDefaultVO searchVO) throws Exception {
        return list("comtncnsltlistDAO.selectComtncnsltlistList_D", searchVO);
    }

    /**
	 * comtncnsltlist 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncnsltlist 총 갯수
	 * @exception
	 */
    public int selectComtncnsltlistListTotCnt(ComtncnsltlistDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncnsltlistDAO.selectComtncnsltlistListTotCnt_S", searchVO);
    }

}
