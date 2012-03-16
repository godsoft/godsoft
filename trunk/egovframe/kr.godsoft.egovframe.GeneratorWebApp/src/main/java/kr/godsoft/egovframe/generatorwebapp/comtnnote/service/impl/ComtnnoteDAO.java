package kr.godsoft.egovframe.generatorwebapp.comtnnote.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteVO;

/**
 * @Class Name : ComtnnoteDAO.java
 * @Description : Comtnnote DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnnoteDAO")
public class ComtnnoteDAO extends EgovAbstractDAO {

	/**
	 * comtnnote을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoteVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnote(ComtnnoteVO vo) throws Exception {
        return (String)insert("comtnnoteDAO.insertComtnnote_S", vo);
    }

    /**
	 * comtnnote을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoteVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnote(ComtnnoteVO vo) throws Exception {
        update("comtnnoteDAO.updateComtnnote_S", vo);
    }

    /**
	 * comtnnote을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoteVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnote(ComtnnoteVO vo) throws Exception {
        delete("comtnnoteDAO.deleteComtnnote_S", vo);
    }

    /**
	 * comtnnote을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoteVO
	 * @return 조회한 comtnnote
	 * @exception Exception
	 */
    public ComtnnoteVO selectComtnnote(ComtnnoteVO vo) throws Exception {
        return (ComtnnoteVO) selectByPk("comtnnoteDAO.selectComtnnote_S", vo);
    }

    /**
	 * comtnnote 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnote 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnnoteList(ComtnnoteVO vo) throws Exception {
        return list("comtnnoteDAO.selectComtnnoteList_D", vo);
    }

    /**
	 * comtnnote 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnnote 총 갯수
	 * @exception
	 */
    public int selectComtnnoteListTotCnt(ComtnnoteVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnnoteDAO.selectComtnnoteListTotCnt_S", vo);
    }

}
