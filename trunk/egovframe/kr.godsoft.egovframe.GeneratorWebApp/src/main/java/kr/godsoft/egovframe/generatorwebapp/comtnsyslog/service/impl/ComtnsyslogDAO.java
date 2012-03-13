package kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogDefaultVO;

/**
 * @Class Name : ComtnsyslogDAO.java
 * @Description : Comtnsyslog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsyslogDAO")
public class ComtnsyslogDAO extends EgovAbstractDAO {

	/**
	 * comtnsyslog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsyslogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsyslog(ComtnsyslogVO vo) throws Exception {
        return (String)insert("comtnsyslogDAO.insertComtnsyslog_S", vo);
    }

    /**
	 * comtnsyslog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsyslogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsyslog(ComtnsyslogVO vo) throws Exception {
        update("comtnsyslogDAO.updateComtnsyslog_S", vo);
    }

    /**
	 * comtnsyslog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsyslogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsyslog(ComtnsyslogVO vo) throws Exception {
        delete("comtnsyslogDAO.deleteComtnsyslog_S", vo);
    }

    /**
	 * comtnsyslog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsyslogVO
	 * @return 조회한 comtnsyslog
	 * @exception Exception
	 */
    public ComtnsyslogVO selectComtnsyslog(ComtnsyslogVO vo) throws Exception {
        return (ComtnsyslogVO) selectByPk("comtnsyslogDAO.selectComtnsyslog_S", vo);
    }

    /**
	 * comtnsyslog 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsyslog 목록
	 * @exception Exception
	 */
    public List selectComtnsyslogList(ComtnsyslogDefaultVO searchVO) throws Exception {
        return list("comtnsyslogDAO.selectComtnsyslogList_D", searchVO);
    }

    /**
	 * comtnsyslog 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnsyslog 총 갯수
	 * @exception
	 */
    public int selectComtnsyslogListTotCnt(ComtnsyslogDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsyslogDAO.selectComtnsyslogListTotCnt_S", searchVO);
    }

}