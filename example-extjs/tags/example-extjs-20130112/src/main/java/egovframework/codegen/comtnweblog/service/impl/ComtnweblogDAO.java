package egovframework.codegen.comtnweblog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.comtnweblog.service.ComtnweblogDefaultVO;
import egovframework.codegen.comtnweblog.service.ComtnweblogVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnweblogDAO.java
 * @Description : Comtnweblog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnweblogDAO")
public class ComtnweblogDAO extends EgovAbstractDAO {

    /**
     * comtnweblog을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnweblogVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertComtnweblog(ComtnweblogVO vo) throws Exception {
        return (String) insert("comtnweblogDAO.insertComtnweblog_S", vo);
    }

    /**
     * comtnweblog을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnweblogVO
     * @return void형
     * @exception Exception
     */
    public int updateComtnweblog(ComtnweblogVO vo) throws Exception {
        return update("comtnweblogDAO.updateComtnweblog_S", vo);
    }

    /**
     * comtnweblog을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnweblogVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtnweblog(ComtnweblogVO vo) throws Exception {
        return delete("comtnweblogDAO.deleteComtnweblog_S", vo);
    }

    /**
     * comtnweblog을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnweblogVO
     * @return 조회한 comtnweblog
     * @exception Exception
     */
    public ComtnweblogVO selectComtnweblog(ComtnweblogVO vo) throws Exception {
        return (ComtnweblogVO) selectByPk("comtnweblogDAO.selectComtnweblog_S", vo);
    }

    /**
     * comtnweblog 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnweblog 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnweblogList(ComtnweblogDefaultVO searchVO) throws Exception {
        return list("comtnweblogDAO.selectComtnweblogList_D", searchVO);
    }

    /**
     * comtnweblog 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtnweblog 총 갯수
     * @exception
     */
    public int selectComtnweblogListTotCnt(ComtnweblogDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("comtnweblogDAO.selectComtnweblogListTotCnt_S", searchVO);
    }

}
