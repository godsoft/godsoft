package kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service.ComtcadministcoderecptnlogVO;

/**
 * @Class Name : ComtcadministcoderecptnlogDAO.java
 * @Description : Comtcadministcoderecptnlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtcadministcoderecptnlogDAO")
public class ComtcadministcoderecptnlogDAO extends EgovAbstractDAO {

	/**
	 * comtcadministcoderecptnlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        return (String)insert("comtcadministcoderecptnlogDAO.insertComtcadministcoderecptnlog_S", vo);
    }

    /**
	 * comtcadministcoderecptnlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        update("comtcadministcoderecptnlogDAO.updateComtcadministcoderecptnlog_S", vo);
    }

    /**
	 * comtcadministcoderecptnlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        delete("comtcadministcoderecptnlogDAO.deleteComtcadministcoderecptnlog_S", vo);
    }

    /**
	 * comtcadministcoderecptnlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 조회한 comtcadministcoderecptnlog
	 * @exception Exception
	 */
    public ComtcadministcoderecptnlogVO selectComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        return (ComtcadministcoderecptnlogVO) selectByPk("comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlog_S", vo);
    }

    /**
	 * comtcadministcoderecptnlog 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtcadministcoderecptnlog 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtcadministcoderecptnlogList(ComtcadministcoderecptnlogVO vo) throws Exception {
        return list("comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlogList_D", vo);
    }

    /**
	 * comtcadministcoderecptnlog 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtcadministcoderecptnlog 총 갯수
	 * @exception
	 */
    public int selectComtcadministcoderecptnlogListTotCnt(ComtcadministcoderecptnlogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlogListTotCnt_S", vo);
    }

}
