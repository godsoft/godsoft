package kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemDefaultVO;

/**
 * @Class Name : ComtncntcsystemDAO.java
 * @Description : Comtncntcsystem DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntcsystemDAO")
public class ComtncntcsystemDAO extends EgovAbstractDAO {

	/**
	 * comtncntcsystem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcsystemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        return (String)insert("comtncntcsystemDAO.insertComtncntcsystem_S", vo);
    }

    /**
	 * comtncntcsystem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcsystemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        update("comtncntcsystemDAO.updateComtncntcsystem_S", vo);
    }

    /**
	 * comtncntcsystem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcsystemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        delete("comtncntcsystemDAO.deleteComtncntcsystem_S", vo);
    }

    /**
	 * comtncntcsystem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcsystemVO
	 * @return 조회한 comtncntcsystem
	 * @exception Exception
	 */
    public ComtncntcsystemVO selectComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        return (ComtncntcsystemVO) selectByPk("comtncntcsystemDAO.selectComtncntcsystem_S", vo);
    }

    /**
	 * comtncntcsystem 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcsystem 목록
	 * @exception Exception
	 */
    public List selectComtncntcsystemList(ComtncntcsystemDefaultVO searchVO) throws Exception {
        return list("comtncntcsystemDAO.selectComtncntcsystemList_D", searchVO);
    }

    /**
	 * comtncntcsystem 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtncntcsystem 총 갯수
	 * @exception
	 */
    public int selectComtncntcsystemListTotCnt(ComtncntcsystemDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntcsystemDAO.selectComtncntcsystemListTotCnt_S", searchVO);
    }

}
