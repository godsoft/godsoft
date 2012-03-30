package kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service.MgvAllViewTriggersVO;

/**
 * @Class Name : MgvAllViewTriggersDAO.java
 * @Description : MgvAllViewTriggers DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllViewTriggersDAO")
public class MgvAllViewTriggersDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_VIEW_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        return (String)insert("mgvAllViewTriggersDAO.insertMgvAllViewTriggers_S", vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        update("mgvAllViewTriggersDAO.updateMgvAllViewTriggers_S", vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        delete("mgvAllViewTriggersDAO.deleteMgvAllViewTriggers_S", vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 조회한 MGV_ALL_VIEW_TRIGGERS
	 * @exception Exception
	 */
    public MgvAllViewTriggersVO selectMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        return (MgvAllViewTriggersVO) selectByPk("mgvAllViewTriggersDAO.selectMgvAllViewTriggers_S", vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_VIEW_TRIGGERS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllViewTriggersList(MgvAllViewTriggersVO vo) throws Exception {
        return list("mgvAllViewTriggersDAO.selectMgvAllViewTriggersList_D", vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_VIEW_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMgvAllViewTriggersListTotCnt(MgvAllViewTriggersVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllViewTriggersDAO.selectMgvAllViewTriggersListTotCnt_S", vo);
    }

}
