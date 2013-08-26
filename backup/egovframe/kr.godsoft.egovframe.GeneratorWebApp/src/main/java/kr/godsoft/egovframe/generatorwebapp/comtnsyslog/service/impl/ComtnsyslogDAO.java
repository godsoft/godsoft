package kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogVO;

/**
 * @Class Name : ComtnsyslogDAO.java
 * @Description : Comtnsyslog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnsyslogDAO")
public class ComtnsyslogDAO extends EgovAbstractDAO {

	/**
	 * COMTNSYSLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsyslogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsyslog(ComtnsyslogVO vo) throws Exception {
        return (String)insert("comtnsyslogDAO.insertComtnsyslog_S", vo);
    }

    /**
	 * COMTNSYSLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsyslogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsyslog(ComtnsyslogVO vo) throws Exception {
        update("comtnsyslogDAO.updateComtnsyslog_S", vo);
    }

    /**
	 * COMTNSYSLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsyslogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsyslog(ComtnsyslogVO vo) throws Exception {
        delete("comtnsyslogDAO.deleteComtnsyslog_S", vo);
    }

    /**
	 * COMTNSYSLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsyslogVO
	 * @return 조회한 COMTNSYSLOG
	 * @exception Exception
	 */
    public ComtnsyslogVO selectComtnsyslog(ComtnsyslogVO vo) throws Exception {
        return (ComtnsyslogVO) selectByPk("comtnsyslogDAO.selectComtnsyslog_S", vo);
    }

    /**
	 * COMTNSYSLOG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSYSLOG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnsyslogList(ComtnsyslogVO vo) throws Exception {
        return list("comtnsyslogDAO.selectComtnsyslogList_D", vo);
    }

    /**
	 * COMTNSYSLOG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNSYSLOG 총 갯수
	 * @exception
	 */
    public int selectComtnsyslogListTotCnt(ComtnsyslogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnsyslogDAO.selectComtnsyslogListTotCnt_S", vo);
    }

}