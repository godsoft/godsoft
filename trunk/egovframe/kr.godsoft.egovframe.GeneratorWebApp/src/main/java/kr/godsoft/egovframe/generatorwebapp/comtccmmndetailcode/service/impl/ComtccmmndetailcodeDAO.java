package kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeVO;

/**
 * @Class Name : ComtccmmndetailcodeDAO.java
 * @Description : Comtccmmndetailcode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtccmmndetailcodeDAO")
public class ComtccmmndetailcodeDAO extends EgovAbstractDAO {

	/**
	 * COMTCCMMNDETAILCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return (String)insert("comtccmmndetailcodeDAO.insertComtccmmndetailcode_S", vo);
    }

    /**
	 * COMTCCMMNDETAILCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        update("comtccmmndetailcodeDAO.updateComtccmmndetailcode_S", vo);
    }

    /**
	 * COMTCCMMNDETAILCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        delete("comtccmmndetailcodeDAO.deleteComtccmmndetailcode_S", vo);
    }

    /**
	 * COMTCCMMNDETAILCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 조회한 COMTCCMMNDETAILCODE
	 * @exception Exception
	 */
    public ComtccmmndetailcodeVO selectComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        return (ComtccmmndetailcodeVO) selectByPk("comtccmmndetailcodeDAO.selectComtccmmndetailcode_S", vo);
    }

    /**
	 * COMTCCMMNDETAILCODE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTCCMMNDETAILCODE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtccmmndetailcodeList(ComtccmmndetailcodeVO vo) throws Exception {
        return list("comtccmmndetailcodeDAO.selectComtccmmndetailcodeList_D", vo);
    }

    /**
	 * COMTCCMMNDETAILCODE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTCCMMNDETAILCODE 총 갯수
	 * @exception
	 */
    public int selectComtccmmndetailcodeListTotCnt(ComtccmmndetailcodeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtccmmndetailcodeDAO.selectComtccmmndetailcodeListTotCnt_S", vo);
    }

}
