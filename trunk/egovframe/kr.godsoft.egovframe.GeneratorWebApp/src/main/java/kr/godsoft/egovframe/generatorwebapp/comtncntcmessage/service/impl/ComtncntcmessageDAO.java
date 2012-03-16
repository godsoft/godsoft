package kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service.ComtncntcmessageVO;

/**
 * @Class Name : ComtncntcmessageDAO.java
 * @Description : Comtncntcmessage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntcmessageDAO")
public class ComtncntcmessageDAO extends EgovAbstractDAO {

	/**
	 * comtncntcmessage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        return (String)insert("comtncntcmessageDAO.insertComtncntcmessage_S", vo);
    }

    /**
	 * comtncntcmessage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        update("comtncntcmessageDAO.updateComtncntcmessage_S", vo);
    }

    /**
	 * comtncntcmessage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        delete("comtncntcmessageDAO.deleteComtncntcmessage_S", vo);
    }

    /**
	 * comtncntcmessage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageVO
	 * @return 조회한 comtncntcmessage
	 * @exception Exception
	 */
    public ComtncntcmessageVO selectComtncntcmessage(ComtncntcmessageVO vo) throws Exception {
        return (ComtncntcmessageVO) selectByPk("comtncntcmessageDAO.selectComtncntcmessage_S", vo);
    }

    /**
	 * comtncntcmessage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcmessage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncntcmessageList(ComtncntcmessageVO vo) throws Exception {
        return list("comtncntcmessageDAO.selectComtncntcmessageList_D", vo);
    }

    /**
	 * comtncntcmessage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcmessage 총 갯수
	 * @exception
	 */
    public int selectComtncntcmessageListTotCnt(ComtncntcmessageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntcmessageDAO.selectComtncntcmessageListTotCnt_S", vo);
    }

}
