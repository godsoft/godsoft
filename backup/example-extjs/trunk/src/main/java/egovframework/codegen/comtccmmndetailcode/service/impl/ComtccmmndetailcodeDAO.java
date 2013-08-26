package egovframework.codegen.comtccmmndetailcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.comtccmmndetailcode.service.ComtccmmndetailcodeDefaultVO;
import egovframework.codegen.comtccmmndetailcode.service.ComtccmmndetailcodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtccmmndetailcodeDAO.java
 * @Description : Comtccmmndetailcode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-13
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("comtccmmndetailcodeDAO")
public class ComtccmmndetailcodeDAO extends EgovAbstractDAO {

    /**
     * comtccmmndetailcode을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtccmmndetailcodeVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return (String) insert("comtccmmndetailcodeDAO.insertComtccmmndetailcode_S", vo);
    }

    /**
     * comtccmmndetailcode을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtccmmndetailcodeVO
     * @return void형
     * @exception Exception
     */
    public int updateComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return update("comtccmmndetailcodeDAO.updateComtccmmndetailcode_S", vo);
    }

    /**
     * comtccmmndetailcode을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtccmmndetailcodeVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return delete("comtccmmndetailcodeDAO.deleteComtccmmndetailcode_S", vo);
    }

    /**
     * comtccmmndetailcode을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtccmmndetailcodeVO
     * @return 조회한 comtccmmndetailcode
     * @exception Exception
     */
    public ComtccmmndetailcodeVO selectComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return (ComtccmmndetailcodeVO) selectByPk("comtccmmndetailcodeDAO.selectComtccmmndetailcode_S", vo);
    }

    /**
     * comtccmmndetailcode 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtccmmndetailcode 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectComtccmmndetailcodeList(ComtccmmndetailcodeDefaultVO searchVO) throws Exception {
        return list("comtccmmndetailcodeDAO.selectComtccmmndetailcodeList_D", searchVO);
    }

    /**
     * comtccmmndetailcode 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return comtccmmndetailcode 총 갯수
     * @exception
     */
    public int selectComtccmmndetailcodeListTotCnt(ComtccmmndetailcodeDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("comtccmmndetailcodeDAO.selectComtccmmndetailcodeListTotCnt_S", searchVO);
    }

}
