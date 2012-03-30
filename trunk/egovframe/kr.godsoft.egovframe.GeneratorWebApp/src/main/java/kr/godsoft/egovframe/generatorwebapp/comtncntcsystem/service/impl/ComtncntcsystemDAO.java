package kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtncntcsystem.service.ComtncntcsystemVO;

/**
 * @Class Name : ComtncntcsystemDAO.java
 * @Description : Comtncntcsystem DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtncntcsystemDAO")
public class ComtncntcsystemDAO extends EgovAbstractDAO {

	/**
	 * COMTNCNTCSYSTEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcsystemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        return (String)insert("comtncntcsystemDAO.insertComtncntcsystem_S", vo);
    }

    /**
	 * COMTNCNTCSYSTEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcsystemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        update("comtncntcsystemDAO.updateComtncntcsystem_S", vo);
    }

    /**
	 * COMTNCNTCSYSTEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcsystemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        delete("comtncntcsystemDAO.deleteComtncntcsystem_S", vo);
    }

    /**
	 * COMTNCNTCSYSTEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcsystemVO
	 * @return 조회한 COMTNCNTCSYSTEM
	 * @exception Exception
	 */
    public ComtncntcsystemVO selectComtncntcsystem(ComtncntcsystemVO vo) throws Exception {
        return (ComtncntcsystemVO) selectByPk("comtncntcsystemDAO.selectComtncntcsystem_S", vo);
    }

    /**
	 * COMTNCNTCSYSTEM 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCNTCSYSTEM 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtncntcsystemList(ComtncntcsystemVO vo) throws Exception {
        return list("comtncntcsystemDAO.selectComtncntcsystemList_D", vo);
    }

    /**
	 * COMTNCNTCSYSTEM 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNCNTCSYSTEM 총 갯수
	 * @exception
	 */
    public int selectComtncntcsystemListTotCnt(ComtncntcsystemVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtncntcsystemDAO.selectComtncntcsystemListTotCnt_S", vo);
    }

}
