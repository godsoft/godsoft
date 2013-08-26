package kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistVO;

/**
 * @Class Name : ComtnprogrmlistDAO.java
 * @Description : Comtnprogrmlist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnprogrmlistDAO")
public class ComtnprogrmlistDAO extends EgovAbstractDAO {

	/**
	 * COMTNPROGRMLIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprogrmlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return (String)insert("comtnprogrmlistDAO.insertComtnprogrmlist_S", vo);
    }

    /**
	 * COMTNPROGRMLIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        update("comtnprogrmlistDAO.updateComtnprogrmlist_S", vo);
    }

    /**
	 * COMTNPROGRMLIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        delete("comtnprogrmlistDAO.deleteComtnprogrmlist_S", vo);
    }

    /**
	 * COMTNPROGRMLIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprogrmlistVO
	 * @return 조회한 COMTNPROGRMLIST
	 * @exception Exception
	 */
    public ComtnprogrmlistVO selectComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return (ComtnprogrmlistVO) selectByPk("comtnprogrmlistDAO.selectComtnprogrmlist_S", vo);
    }

    /**
	 * COMTNPROGRMLIST 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROGRMLIST 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnprogrmlistList(ComtnprogrmlistVO vo) throws Exception {
        return list("comtnprogrmlistDAO.selectComtnprogrmlistList_D", vo);
    }

    /**
	 * COMTNPROGRMLIST 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNPROGRMLIST 총 갯수
	 * @exception
	 */
    public int selectComtnprogrmlistListTotCnt(ComtnprogrmlistVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnprogrmlistDAO.selectComtnprogrmlistListTotCnt_S", vo);
    }

}
