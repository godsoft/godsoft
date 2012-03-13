package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogVO;
import kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service.ComtntrsmrcvlogDefaultVO;

/**
 * @Class Name : ComtntrsmrcvlogDAO.java
 * @Description : Comtntrsmrcvlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtntrsmrcvlogDAO")
public class ComtntrsmrcvlogDAO extends EgovAbstractDAO {

	/**
	 * comtntrsmrcvlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        return (String)insert("comtntrsmrcvlogDAO.insertComtntrsmrcvlog_S", vo);
    }

    /**
	 * comtntrsmrcvlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        update("comtntrsmrcvlogDAO.updateComtntrsmrcvlog_S", vo);
    }

    /**
	 * comtntrsmrcvlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        delete("comtntrsmrcvlogDAO.deleteComtntrsmrcvlog_S", vo);
    }

    /**
	 * comtntrsmrcvlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 조회한 comtntrsmrcvlog
	 * @exception Exception
	 */
    public ComtntrsmrcvlogVO selectComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception {
        return (ComtntrsmrcvlogVO) selectByPk("comtntrsmrcvlogDAO.selectComtntrsmrcvlog_S", vo);
    }

    /**
	 * comtntrsmrcvlog 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntrsmrcvlog 목록
	 * @exception Exception
	 */
    public List selectComtntrsmrcvlogList(ComtntrsmrcvlogDefaultVO searchVO) throws Exception {
        return list("comtntrsmrcvlogDAO.selectComtntrsmrcvlogList_D", searchVO);
    }

    /**
	 * comtntrsmrcvlog 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtntrsmrcvlog 총 갯수
	 * @exception
	 */
    public int selectComtntrsmrcvlogListTotCnt(ComtntrsmrcvlogDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtntrsmrcvlogDAO.selectComtntrsmrcvlogListTotCnt_S", searchVO);
    }

}
