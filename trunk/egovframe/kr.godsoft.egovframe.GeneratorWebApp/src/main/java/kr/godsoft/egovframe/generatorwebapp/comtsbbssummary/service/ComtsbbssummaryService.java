package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtsbbssummaryService.java
 * @Description : Comtsbbssummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtsbbssummaryService {
	
	/**
	 * COMTSBBSSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsbbssummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtsbbssummary(ComtsbbssummaryVO vo) throws Exception;
    
    /**
	 * COMTSBBSSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtsbbssummary(ComtsbbssummaryVO vo) throws Exception;
    
    /**
	 * COMTSBBSSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtsbbssummary(ComtsbbssummaryVO vo) throws Exception;
    
    /**
	 * COMTSBBSSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsbbssummaryVO
	 * @return 조회한 COMTSBBSSUMMARY
	 * @exception Exception
	 */
    ComtsbbssummaryVO selectComtsbbssummary(ComtsbbssummaryVO vo) throws Exception;
    
    /**
	 * COMTSBBSSUMMARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSBBSSUMMARY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtsbbssummaryList(ComtsbbssummaryVO vo) throws Exception;
    
    /**
	 * COMTSBBSSUMMARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSBBSSUMMARY 총 갯수
	 * @exception
	 */
    int selectComtsbbssummaryListTotCnt(ComtsbbssummaryVO vo);
    
}
