package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollresult.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnonlinepollresultService.java
 * @Description : Comtnonlinepollresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnonlinepollresultService {
	
	/**
	 * COMTNONLINEPOLLRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollresultVO
	 * @return 조회한 COMTNONLINEPOLLRESULT
	 * @exception Exception
	 */
    ComtnonlinepollresultVO selectComtnonlinepollresult(ComtnonlinepollresultVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLRESULT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnonlinepollresultList(ComtnonlinepollresultVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLRESULT 총 갯수
	 * @exception
	 */
    int selectComtnonlinepollresultListTotCnt(ComtnonlinepollresultVO vo);
    
}
