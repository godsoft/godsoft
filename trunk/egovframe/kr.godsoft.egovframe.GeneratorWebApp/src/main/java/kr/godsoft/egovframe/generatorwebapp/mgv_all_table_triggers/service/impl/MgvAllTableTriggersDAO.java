package kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersVO;

/**
 * @Class Name : MgvAllTableTriggersDAO.java
 * @Description : MgvAllTableTriggers DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllTableTriggersDAO")
public class MgvAllTableTriggersDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_TABLE_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        return (String)insert("mgvAllTableTriggersDAO.insertMgvAllTableTriggers_S", vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        update("mgvAllTableTriggersDAO.updateMgvAllTableTriggers_S", vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        delete("mgvAllTableTriggersDAO.deleteMgvAllTableTriggers_S", vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 조회한 MGV_ALL_TABLE_TRIGGERS
	 * @exception Exception
	 */
    public MgvAllTableTriggersVO selectMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        return (MgvAllTableTriggersVO) selectByPk("mgvAllTableTriggersDAO.selectMgvAllTableTriggers_S", vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_TABLE_TRIGGERS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllTableTriggersList(MgvAllTableTriggersVO vo) throws Exception {
        return list("mgvAllTableTriggersDAO.selectMgvAllTableTriggersList_D", vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_TABLE_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMgvAllTableTriggersListTotCnt(MgvAllTableTriggersVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllTableTriggersDAO.selectMgvAllTableTriggersListTotCnt_S", vo);
    }

}
