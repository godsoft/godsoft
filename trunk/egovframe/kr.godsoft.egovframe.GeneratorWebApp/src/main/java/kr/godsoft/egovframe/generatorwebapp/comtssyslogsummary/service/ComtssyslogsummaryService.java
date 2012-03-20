package kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtssyslogsummaryService.java
 * @Description : Comtssyslogsummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtssyslogsummaryService {
	
	/**
	 * comtssyslogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception;
    
    /**
	 * comtssyslogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception;
    
    /**
	 * comtssyslogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception;
    
    /**
	 * comtssyslogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 조회한 comtssyslogsummary
	 * @exception Exception
	 */
    ComtssyslogsummaryVO selectComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception;
    
    /**
	 * comtssyslogsummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtssyslogsummary 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtssyslogsummaryList(ComtssyslogsummaryVO vo) throws Exception;
    
    /**
	 * comtssyslogsummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtssyslogsummary 총 갯수
	 * @exception
	 */
    int selectComtssyslogsummaryListTotCnt(ComtssyslogsummaryVO vo);
    
}
