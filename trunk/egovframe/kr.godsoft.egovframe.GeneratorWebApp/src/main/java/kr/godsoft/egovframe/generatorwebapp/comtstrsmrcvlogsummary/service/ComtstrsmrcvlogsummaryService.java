package kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtstrsmrcvlogsummaryService.java
 * @Description : Comtstrsmrcvlogsummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtstrsmrcvlogsummaryService {
	
	/**
	 * comtstrsmrcvlogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception;
    
    /**
	 * comtstrsmrcvlogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception;
    
    /**
	 * comtstrsmrcvlogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception;
    
    /**
	 * comtstrsmrcvlogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 조회한 comtstrsmrcvlogsummary
	 * @exception Exception
	 */
    ComtstrsmrcvlogsummaryVO selectComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception;
    
    /**
	 * comtstrsmrcvlogsummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtstrsmrcvlogsummary 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtstrsmrcvlogsummaryList(ComtstrsmrcvlogsummaryVO vo) throws Exception;
    
    /**
	 * comtstrsmrcvlogsummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtstrsmrcvlogsummary 총 갯수
	 * @exception
	 */
    int selectComtstrsmrcvlogsummaryListTotCnt(ComtstrsmrcvlogsummaryVO vo);
    
}
