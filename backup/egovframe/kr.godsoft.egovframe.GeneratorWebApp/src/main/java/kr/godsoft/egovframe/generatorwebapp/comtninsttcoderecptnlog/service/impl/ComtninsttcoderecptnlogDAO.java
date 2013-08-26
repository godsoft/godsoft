package kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogVO;

/**
 * @Class Name : ComtninsttcoderecptnlogDAO.java
 * @Description : Comtninsttcoderecptnlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtninsttcoderecptnlogDAO")
public class ComtninsttcoderecptnlogDAO extends EgovAbstractDAO {

	/**
	 * COMTNINSTTCODERECPTNLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        return (String)insert("comtninsttcoderecptnlogDAO.insertComtninsttcoderecptnlog_S", vo);
    }

    /**
	 * COMTNINSTTCODERECPTNLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        update("comtninsttcoderecptnlogDAO.updateComtninsttcoderecptnlog_S", vo);
    }

    /**
	 * COMTNINSTTCODERECPTNLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        delete("comtninsttcoderecptnlogDAO.deleteComtninsttcoderecptnlog_S", vo);
    }

    /**
	 * COMTNINSTTCODERECPTNLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 조회한 COMTNINSTTCODERECPTNLOG
	 * @exception Exception
	 */
    public ComtninsttcoderecptnlogVO selectComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        return (ComtninsttcoderecptnlogVO) selectByPk("comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlog_S", vo);
    }

    /**
	 * COMTNINSTTCODERECPTNLOG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNINSTTCODERECPTNLOG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtninsttcoderecptnlogList(ComtninsttcoderecptnlogVO vo) throws Exception {
        return list("comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlogList_D", vo);
    }

    /**
	 * COMTNINSTTCODERECPTNLOG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNINSTTCODERECPTNLOG 총 갯수
	 * @exception
	 */
    public int selectComtninsttcoderecptnlogListTotCnt(ComtninsttcoderecptnlogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlogListTotCnt_S", vo);
    }

}