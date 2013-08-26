package kr.godsoft.egovframe.generatorwebapp.md_connections.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdConnectionsService.java
 * @Description : MdConnections Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdConnectionsService {
	
	/**
	 * MD_CONNECTIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConnectionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdConnections(MdConnectionsVO vo) throws Exception;
    
    /**
	 * MD_CONNECTIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConnectionsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdConnections(MdConnectionsVO vo) throws Exception;
    
    /**
	 * MD_CONNECTIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConnectionsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdConnections(MdConnectionsVO vo) throws Exception;
    
    /**
	 * MD_CONNECTIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConnectionsVO
	 * @return 조회한 MD_CONNECTIONS
	 * @exception Exception
	 */
    MdConnectionsVO selectMdConnections(MdConnectionsVO vo) throws Exception;
    
    /**
	 * MD_CONNECTIONS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONNECTIONS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdConnectionsList(MdConnectionsVO vo) throws Exception;
    
    /**
	 * MD_CONNECTIONS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONNECTIONS 총 갯수
	 * @exception
	 */
    int selectMdConnectionsListTotCnt(MdConnectionsVO vo);
    
}
