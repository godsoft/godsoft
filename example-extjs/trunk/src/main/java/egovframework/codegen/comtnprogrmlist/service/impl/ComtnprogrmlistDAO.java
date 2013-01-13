package egovframework.codegen.comtnprogrmlist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.comtnprogrmlist.service.ComtnprogrmlistDefaultVO;
import egovframework.codegen.comtnprogrmlist.service.ComtnprogrmlistVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnprogrmlistDAO.java
 * @Description : Comtnprogrmlist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnprogrmlistDAO")
public class ComtnprogrmlistDAO extends EgovAbstractDAO {

    /**
     * comtnprogrmlist을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnprogrmlistVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return (String) insert("comtnprogrmlistDAO.insertComtnprogrmlist_S", vo);
    }

    /**
     * comtnprogrmlist을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnprogrmlistVO
     * @return void형
     * @exception Exception
     */
    public int updateComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return update("comtnprogrmlistDAO.updateComtnprogrmlist_S", vo);
    }

    /**
     * comtnprogrmlist을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnprogrmlistVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return delete("comtnprogrmlistDAO.deleteComtnprogrmlist_S", vo);
    }

    /**
     * comtnprogrmlist을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnprogrmlistVO
     * @return 조회한 comtnprogrmlist
     * @exception Exception
     */
    public ComtnprogrmlistVO selectComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        return (ComtnprogrmlistVO) selectByPk("comtnprogrmlistDAO.selectComtnprogrmlist_S", vo);
    }

    /**
     * comtnprogrmlist 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnprogrmlist 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnprogrmlistList(ComtnprogrmlistDefaultVO searchVO) throws Exception {
        return list("comtnprogrmlistDAO.selectComtnprogrmlistList_D", searchVO);
    }

    /**
     * comtnprogrmlist 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnprogrmlist 총 갯수
     * @exception
     */
    public int selectComtnprogrmlistListTotCnt(ComtnprogrmlistDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("comtnprogrmlistDAO.selectComtnprogrmlistListTotCnt_S", searchVO);
    }

}