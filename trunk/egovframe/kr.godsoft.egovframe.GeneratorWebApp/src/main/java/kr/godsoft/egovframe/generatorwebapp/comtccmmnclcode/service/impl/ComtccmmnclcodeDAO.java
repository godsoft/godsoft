package kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeVO;

/**
 * @Class Name : ComtccmmnclcodeDAO.java
 * @Description : Comtccmmnclcode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtccmmnclcodeDAO")
public class ComtccmmnclcodeDAO extends EgovAbstractDAO {

	/**
	 * comtccmmnclcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        return (String)insert("comtccmmnclcodeDAO.insertComtccmmnclcode_S", vo);
    }

    /**
	 * comtccmmnclcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        update("comtccmmnclcodeDAO.updateComtccmmnclcode_S", vo);
    }

    /**
	 * comtccmmnclcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        delete("comtccmmnclcodeDAO.deleteComtccmmnclcode_S", vo);
    }

    /**
	 * comtccmmnclcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 comtccmmnclcode
	 * @exception Exception
	 */
    public ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        return (ComtccmmnclcodeVO) selectByPk("comtccmmnclcodeDAO.selectComtccmmnclcode_S", vo);
    }

    /**
	 * comtccmmnclcode 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtccmmnclcode 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtccmmnclcodeList(ComtccmmnclcodeVO vo) throws Exception {
        return list("comtccmmnclcodeDAO.selectComtccmmnclcodeList_D", vo);
    }

    /**
	 * comtccmmnclcode 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtccmmnclcode 총 갯수
	 * @exception
	 */
    public int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtccmmnclcodeDAO.selectComtccmmnclcodeListTotCnt_S", vo);
    }

}
