package kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MigrGenerationOrderService.java
 * @Description : MigrGenerationOrder Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MigrGenerationOrderService {
	
	/**
	 * MIGR_GENERATION_ORDER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrGenerationOrderVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception;
    
    /**
	 * MIGR_GENERATION_ORDER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrGenerationOrderVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception;
    
    /**
	 * MIGR_GENERATION_ORDER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrGenerationOrderVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception;
    
    /**
	 * MIGR_GENERATION_ORDER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrGenerationOrderVO
	 * @return 조회한 MIGR_GENERATION_ORDER
	 * @exception Exception
	 */
    MigrGenerationOrderVO selectMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception;
    
    /**
	 * MIGR_GENERATION_ORDER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_GENERATION_ORDER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMigrGenerationOrderList(MigrGenerationOrderVO vo) throws Exception;
    
    /**
	 * MIGR_GENERATION_ORDER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_GENERATION_ORDER 총 갯수
	 * @exception
	 */
    int selectMigrGenerationOrderListTotCnt(MigrGenerationOrderVO vo);
    
}
