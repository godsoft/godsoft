package kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsVO;

/**
 * @Class Name : MgvAllConnectionsDAO.java
 * @Description : MgvAllConnections DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllConnectionsDAO")
public class MgvAllConnectionsDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_CONNECTIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllConnectionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        return (String)insert("mgvAllConnectionsDAO.insertMgvAllConnections_S", vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        update("mgvAllConnectionsDAO.updateMgvAllConnections_S", vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        delete("mgvAllConnectionsDAO.deleteMgvAllConnections_S", vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllConnectionsVO
	 * @return 조회한 MGV_ALL_CONNECTIONS
	 * @exception Exception
	 */
    public MgvAllConnectionsVO selectMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        return (MgvAllConnectionsVO) selectByPk("mgvAllConnectionsDAO.selectMgvAllConnections_S", vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_CONNECTIONS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllConnectionsList(MgvAllConnectionsVO vo) throws Exception {
        return list("mgvAllConnectionsDAO.selectMgvAllConnectionsList_D", vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_CONNECTIONS 총 갯수
	 * @exception
	 */
    public int selectMgvAllConnectionsListTotCnt(MgvAllConnectionsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllConnectionsDAO.selectMgvAllConnectionsListTotCnt_S", vo);
    }

}
