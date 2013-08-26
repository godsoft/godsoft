package egovframework.codegen.comtnauthorinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.comtnauthorinfo.service.ComtnauthorinfoDefaultVO;
import egovframework.codegen.comtnauthorinfo.service.ComtnauthorinfoVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnauthorinfoDAO.java
 * @Description : Comtnauthorinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnauthorinfoDAO")
public class ComtnauthorinfoDAO extends EgovAbstractDAO {

    /**
     * comtnauthorinfo을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnauthorinfoVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return (String) insert("comtnauthorinfoDAO.insertComtnauthorinfo_S", vo);
    }

    /**
     * comtnauthorinfo을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnauthorinfoVO
     * @return void형
     * @exception Exception
     */
    public int updateComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return update("comtnauthorinfoDAO.updateComtnauthorinfo_S", vo);
    }

    /**
     * comtnauthorinfo을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnauthorinfoVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return delete("comtnauthorinfoDAO.deleteComtnauthorinfo_S", vo);
    }

    /**
     * comtnauthorinfo을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnauthorinfoVO
     * @return 조회한 comtnauthorinfo
     * @exception Exception
     */
    public ComtnauthorinfoVO selectComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return (ComtnauthorinfoVO) selectByPk("comtnauthorinfoDAO.selectComtnauthorinfo_S", vo);
    }

    /**
     * comtnauthorinfo 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnauthorinfo 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnauthorinfoList(ComtnauthorinfoDefaultVO searchVO) throws Exception {
        return list("comtnauthorinfoDAO.selectComtnauthorinfoList_D", searchVO);
    }

    /**
     * comtnauthorinfo 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnauthorinfo 총 갯수
     * @exception
     */
    public int selectComtnauthorinfoListTotCnt(ComtnauthorinfoDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("comtnauthorinfoDAO.selectComtnauthorinfoListTotCnt_S", searchVO);
    }

}
