package kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllConnectionsService.java
 * @Description : MgvAllConnections Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllConnectionsService {
	
	/**
	 * MGV_ALL_CONNECTIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllConnectionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllConnections(MgvAllConnectionsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CONNECTIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllConnections(MgvAllConnectionsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CONNECTIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllConnections(MgvAllConnectionsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CONNECTIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllConnectionsVO
	 * @return 조회한 MGV_ALL_CONNECTIONS
	 * @exception Exception
	 */
    MgvAllConnectionsVO selectMgvAllConnections(MgvAllConnectionsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CONNECTIONS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CONNECTIONS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllConnectionsList(MgvAllConnectionsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CONNECTIONS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CONNECTIONS 총 갯수
	 * @exception
	 */
    int selectMgvAllConnectionsListTotCnt(MgvAllConnectionsVO vo);
    
}
