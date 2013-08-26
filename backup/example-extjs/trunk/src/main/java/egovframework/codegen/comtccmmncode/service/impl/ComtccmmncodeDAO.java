package egovframework.codegen.comtccmmncode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.comtccmmncode.service.ComtccmmncodeDefaultVO;
import egovframework.codegen.comtccmmncode.service.ComtccmmncodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtccmmncodeDAO.java
 * @Description : Comtccmmncode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("comtccmmncodeDAO")
public class ComtccmmncodeDAO extends EgovAbstractDAO {

    /**
     * comtccmmncode을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtccmmncodeVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return (String) insert("comtccmmncodeDAO.insertComtccmmncode_S", vo);
    }

    /**
     * comtccmmncode을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtccmmncodeVO
     * @return void형
     * @exception Exception
     */
    public int updateComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return update("comtccmmncodeDAO.updateComtccmmncode_S", vo);
    }

    /**
     * comtccmmncode을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtccmmncodeVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return delete("comtccmmncodeDAO.deleteComtccmmncode_S", vo);
    }

    /**
     * comtccmmncode을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtccmmncodeVO
     * @return 조회한 comtccmmncode
     * @exception Exception
     */
    public ComtccmmncodeVO selectComtccmmncode(ComtccmmncodeVO vo) throws Exception {
        return (ComtccmmncodeVO) selectByPk("comtccmmncodeDAO.selectComtccmmncode_S", vo);
    }

    /**
     * comtccmmncode 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtccmmncode 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectComtccmmncodeList(ComtccmmncodeDefaultVO searchVO) throws Exception {
        return list("comtccmmncodeDAO.selectComtccmmncodeList_D", searchVO);
    }

    /**
     * comtccmmncode 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtccmmncode 총 갯수
     * @exception
     */
    public int selectComtccmmncodeListTotCnt(ComtccmmncodeDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("comtccmmncodeDAO.selectComtccmmncodeListTotCnt_S", searchVO);
    }

}
