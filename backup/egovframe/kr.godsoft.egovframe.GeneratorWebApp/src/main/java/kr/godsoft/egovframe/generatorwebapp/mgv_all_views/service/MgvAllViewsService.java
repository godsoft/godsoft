package kr.godsoft.egovframe.generatorwebapp.mgv_all_views.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllViewsService.java
 * @Description : MgvAllViews Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllViewsService {
	
	/**
	 * MGV_ALL_VIEWS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllViewsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllViews(MgvAllViewsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEWS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllViewsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllViews(MgvAllViewsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEWS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllViewsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllViews(MgvAllViewsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEWS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllViewsVO
	 * @return 조회한 MGV_ALL_VIEWS
	 * @exception Exception
	 */
    MgvAllViewsVO selectMgvAllViews(MgvAllViewsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEWS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEWS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllViewsList(MgvAllViewsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_VIEWS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEWS 총 갯수
	 * @exception
	 */
    int selectMgvAllViewsListTotCnt(MgvAllViewsVO vo);
    
}
