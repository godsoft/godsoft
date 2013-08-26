package kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllViewTriggersService.java
 * @Description : MgvAllViewTriggers Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllViewTriggersService {
	
	/**
	 * MGV_ALL_VIEW_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEW_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEW_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEW_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 조회한 MGV_ALL_VIEW_TRIGGERS
	 * @exception Exception
	 */
    MgvAllViewTriggersVO selectMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEW_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEW_TRIGGERS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllViewTriggersList(MgvAllViewTriggersVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEW_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEW_TRIGGERS 총 갯수
	 * @exception
	 */
    int selectMgvAllViewTriggersListTotCnt(MgvAllViewTriggersVO vo);
    
}
