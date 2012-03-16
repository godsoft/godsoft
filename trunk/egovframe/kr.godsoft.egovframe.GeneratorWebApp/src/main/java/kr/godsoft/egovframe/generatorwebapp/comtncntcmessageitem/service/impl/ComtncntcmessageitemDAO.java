package kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemVO;

/**
 * @Class Name : ComtncntcmessageitemDAO.java
 * @Description : Comtncntcmessageitem DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntcmessageitemDAO")
public class ComtncntcmessageitemDAO extends EgovAbstractDAO {

	/**
	 * comtncntcmessageitem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        return (String)insert("comtncntcmessageitemDAO.insertComtncntcmessageitem_S", vo);
    }

    /**
	 * comtncntcmessageitem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        update("comtncntcmessageitemDAO.updateComtncntcmessageitem_S", vo);
    }

    /**
	 * comtncntcmessageitem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        delete("comtncntcmessageitemDAO.deleteComtncntcmessageitem_S", vo);
    }

    /**
	 * comtncntcmessageitem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 조회한 comtncntcmessageitem
	 * @exception Exception
	 */
    public ComtncntcmessageitemVO selectComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        return (ComtncntcmessageitemVO) selectByPk("comtncntcmessageitemDAO.selectComtncntcmessageitem_S", vo);
    }

    /**
	 * comtncntcmessageitem 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcmessageitem 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncntcmessageitemList(ComtncntcmessageitemVO vo) throws Exception {
        return list("comtncntcmessageitemDAO.selectComtncntcmessageitemList_D", vo);
    }

    /**
	 * comtncntcmessageitem 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcmessageitem 총 갯수
	 * @exception
	 */
    public int selectComtncntcmessageitemListTotCnt(ComtncntcmessageitemVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntcmessageitemDAO.selectComtncntcmessageitemListTotCnt_S", vo);
    }

}
