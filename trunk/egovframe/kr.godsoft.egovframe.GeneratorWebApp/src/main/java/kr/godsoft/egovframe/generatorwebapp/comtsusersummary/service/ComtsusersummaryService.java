package kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryVO;

/**
 * @Class Name : ComtsusersummaryService.java
 * @Description : Comtsusersummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtsusersummaryService {
	
	/**
	 * comtsusersummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsusersummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtsusersummary(ComtsusersummaryVO vo) throws Exception;
    
    /**
	 * comtsusersummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsusersummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtsusersummary(ComtsusersummaryVO vo) throws Exception;
    
    /**
	 * comtsusersummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsusersummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtsusersummary(ComtsusersummaryVO vo) throws Exception;
    
    /**
	 * comtsusersummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsusersummaryVO
	 * @return 조회한 comtsusersummary
	 * @exception Exception
	 */
    ComtsusersummaryVO selectComtsusersummary(ComtsusersummaryVO vo) throws Exception;
    
    /**
	 * comtsusersummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsusersummary 목록
	 * @exception Exception
	 */
    List selectComtsusersummaryList(ComtsusersummaryDefaultVO searchVO) throws Exception;
    
    /**
	 * comtsusersummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsusersummary 총 갯수
	 * @exception
	 */
    int selectComtsusersummaryListTotCnt(ComtsusersummaryDefaultVO searchVO);
    
}