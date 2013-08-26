package kr.godsoft.egovframe.generatorwebapp.comtncntcinstt.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntcinsttService.java
 * @Description : Comtncntcinstt Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntcinsttService {
	
	/**
	 * COMTNCNTCINSTT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcinsttVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntcinstt(ComtncntcinsttVO vo) throws Exception;
    
    /**
	 * COMTNCNTCINSTT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcinsttVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntcinstt(ComtncntcinsttVO vo) throws Exception;
    
    /**
	 * COMTNCNTCINSTT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcinsttVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntcinstt(ComtncntcinsttVO vo) throws Exception;
    
    /**
	 * COMTNCNTCINSTT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcinsttVO
	 * @return 조회한 COMTNCNTCINSTT
	 * @exception Exception
	 */
    ComtncntcinsttVO selectComtncntcinstt(ComtncntcinsttVO vo) throws Exception;
    
    /**
	 * COMTNCNTCINSTT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCINSTT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntcinsttList(ComtncntcinsttVO vo) throws Exception;
    
    /**
	 * COMTNCNTCINSTT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCINSTT 총 갯수
	 * @exception
	 */
    int selectComtncntcinsttListTotCnt(ComtncntcinsttVO vo);
    
}