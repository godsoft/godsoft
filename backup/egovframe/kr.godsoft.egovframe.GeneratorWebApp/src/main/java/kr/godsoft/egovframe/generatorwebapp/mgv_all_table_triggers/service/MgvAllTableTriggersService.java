package kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllTableTriggersService.java
 * @Description : MgvAllTableTriggers Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllTableTriggersService {
	
	/**
	 * MGV_ALL_TABLE_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLE_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLE_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLE_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 조회한 MGV_ALL_TABLE_TRIGGERS
	 * @exception Exception
	 */
    MgvAllTableTriggersVO selectMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLE_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLE_TRIGGERS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllTableTriggersList(MgvAllTableTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLE_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLE_TRIGGERS 총 갯수
	 * @exception
	 */
    int selectMgvAllTableTriggersListTotCnt(MgvAllTableTriggersVO vo);
    
}
