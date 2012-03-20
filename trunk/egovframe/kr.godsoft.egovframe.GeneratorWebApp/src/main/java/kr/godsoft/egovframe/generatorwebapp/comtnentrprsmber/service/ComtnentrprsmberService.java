package kr.godsoft.egovframe.generatorwebapp.comtnentrprsmber.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnentrprsmberService.java
 * @Description : Comtnentrprsmber Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnentrprsmberService {
	
	/**
	 * comtnentrprsmber을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnentrprsmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception;
    
    /**
	 * comtnentrprsmber을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception;
    
    /**
	 * comtnentrprsmber을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnentrprsmberVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception;
    
    /**
	 * comtnentrprsmber을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnentrprsmberVO
	 * @return 조회한 comtnentrprsmber
	 * @exception Exception
	 */
    ComtnentrprsmberVO selectComtnentrprsmber(ComtnentrprsmberVO vo) throws Exception;
    
    /**
	 * comtnentrprsmber 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnentrprsmber 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnentrprsmberList(ComtnentrprsmberVO vo) throws Exception;
    
    /**
	 * comtnentrprsmber 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnentrprsmber 총 갯수
	 * @exception
	 */
    int selectComtnentrprsmberListTotCnt(ComtnentrprsmberVO vo);
    
}
