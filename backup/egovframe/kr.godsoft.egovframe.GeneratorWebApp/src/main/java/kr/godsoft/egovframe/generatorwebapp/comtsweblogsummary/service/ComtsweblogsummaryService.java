package kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtsweblogsummaryService.java
 * @Description : Comtsweblogsummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtsweblogsummaryService {
	
	/**
	 * COMTSWEBLOGSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * COMTSWEBLOGSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * COMTSWEBLOGSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * COMTSWEBLOGSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 조회한 COMTSWEBLOGSUMMARY
	 * @exception Exception
	 */
    ComtsweblogsummaryVO selectComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * COMTSWEBLOGSUMMARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSWEBLOGSUMMARY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtsweblogsummaryList(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * COMTSWEBLOGSUMMARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSWEBLOGSUMMARY 총 갯수
	 * @exception
	 */
    int selectComtsweblogsummaryListTotCnt(ComtsweblogsummaryVO vo);
    
}