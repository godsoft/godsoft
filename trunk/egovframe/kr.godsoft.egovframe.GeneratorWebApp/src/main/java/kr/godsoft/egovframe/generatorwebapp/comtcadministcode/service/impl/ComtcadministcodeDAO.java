package kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeVO;

/**
 * @Class Name : ComtcadministcodeDAO.java
 * @Description : Comtcadministcode DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtcadministcodeDAO")
public class ComtcadministcodeDAO extends EgovAbstractDAO {

	/**
	 * comtcadministcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        return (String)insert("comtcadministcodeDAO.insertComtcadministcode_S", vo);
    }

    /**
	 * comtcadministcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        update("comtcadministcodeDAO.updateComtcadministcode_S", vo);
    }

    /**
	 * comtcadministcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        delete("comtcadministcodeDAO.deleteComtcadministcode_S", vo);
    }

    /**
	 * comtcadministcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcodeVO
	 * @return 조회한 comtcadministcode
	 * @exception Exception
	 */
    public ComtcadministcodeVO selectComtcadministcode(ComtcadministcodeVO vo) throws Exception {
        return (ComtcadministcodeVO) selectByPk("comtcadministcodeDAO.selectComtcadministcode_S", vo);
    }

    /**
	 * comtcadministcode 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtcadministcode 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtcadministcodeList(ComtcadministcodeVO vo) throws Exception {
        return list("comtcadministcodeDAO.selectComtcadministcodeList_D", vo);
    }

    /**
	 * comtcadministcode 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtcadministcode 총 갯수
	 * @exception
	 */
    public int selectComtcadministcodeListTotCnt(ComtcadministcodeVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtcadministcodeDAO.selectComtcadministcodeListTotCnt_S", vo);
    }

}
