package kr.godsoft.egovframe.generatorwebapp.comtntwitter.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtntwitterService.java
 * @Description : Comtntwitter Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntwitterService {
	
	/**
	 * COMTNTWITTER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntwitterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntwitter(ComtntwitterVO vo) throws Exception;
    
    /**
	 * COMTNTWITTER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntwitterVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntwitter(ComtntwitterVO vo) throws Exception;
    
    /**
	 * COMTNTWITTER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntwitterVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntwitter(ComtntwitterVO vo) throws Exception;
    
    /**
	 * COMTNTWITTER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntwitterVO
	 * @return 조회한 COMTNTWITTER
	 * @exception Exception
	 */
    ComtntwitterVO selectComtntwitter(ComtntwitterVO vo) throws Exception;
    
    /**
	 * COMTNTWITTER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTWITTER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtntwitterList(ComtntwitterVO vo) throws Exception;
    
    /**
	 * COMTNTWITTER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTWITTER 총 갯수
	 * @exception
	 */
    int selectComtntwitterListTotCnt(ComtntwitterVO vo);
    
}