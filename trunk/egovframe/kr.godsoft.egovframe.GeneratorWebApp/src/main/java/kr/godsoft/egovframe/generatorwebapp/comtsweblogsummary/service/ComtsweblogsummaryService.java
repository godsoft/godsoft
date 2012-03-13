package kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryVO;

/**
 * @Class Name : ComtsweblogsummaryService.java
 * @Description : Comtsweblogsummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtsweblogsummaryService {
	
	/**
	 * comtsweblogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * comtsweblogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * comtsweblogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * comtsweblogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 조회한 comtsweblogsummary
	 * @exception Exception
	 */
    ComtsweblogsummaryVO selectComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;
    
    /**
	 * comtsweblogsummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsweblogsummary 목록
	 * @exception Exception
	 */
    List selectComtsweblogsummaryList(ComtsweblogsummaryDefaultVO searchVO) throws Exception;
    
    /**
	 * comtsweblogsummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsweblogsummary 총 갯수
	 * @exception
	 */
    int selectComtsweblogsummaryListTotCnt(ComtsweblogsummaryDefaultVO searchVO);
    
}
