package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogVO;

/**
 * @Class Name : ComtntrsmrcvlogDAO.java
 * @Description : Comtntrsmrcvlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntrsmrcvlogDAO")
public class ComtntrsmrcvlogDAO extends EgovAbstractDAO {

	/**
	 * COMTNTRSMRCVLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        return (String)insert("comtntrsmrcvlogDAO.insertComtntrsmrcvlog_S", vo);
    }

    /**
	 * COMTNTRSMRCVLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        update("comtntrsmrcvlogDAO.updateComtntrsmrcvlog_S", vo);
    }

    /**
	 * COMTNTRSMRCVLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        delete("comtntrsmrcvlogDAO.deleteComtntrsmrcvlog_S", vo);
    }

    /**
	 * COMTNTRSMRCVLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 조회한 COMTNTRSMRCVLOG
	 * @exception Exception
	 */
    public ComtntrsmrcvlogVO selectComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        return (ComtntrsmrcvlogVO) selectByPk("comtntrsmrcvlogDAO.selectComtntrsmrcvlog_S", vo);
    }

    /**
	 * COMTNTRSMRCVLOG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNTRSMRCVLOG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtntrsmrcvlogList(ComtntrsmrcvlogVO vo) throws Exception {
        return list("comtntrsmrcvlogDAO.selectComtntrsmrcvlogList_D", vo);
    }

    /**
	 * COMTNTRSMRCVLOG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNTRSMRCVLOG 총 갯수
	 * @exception
	 */
    public int selectComtntrsmrcvlogListTotCnt(ComtntrsmrcvlogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntrsmrcvlogDAO.selectComtntrsmrcvlogListTotCnt_S", vo);
    }

}
