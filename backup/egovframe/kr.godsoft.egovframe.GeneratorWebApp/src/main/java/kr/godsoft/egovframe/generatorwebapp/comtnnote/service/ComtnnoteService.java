package kr.godsoft.egovframe.generatorwebapp.comtnnote.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnnoteService.java
 * @Description : Comtnnote Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnoteService {
	
	/**
	 * COMTNNOTE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoteVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * COMTNNOTE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoteVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * COMTNNOTE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoteVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * COMTNNOTE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoteVO
	 * @return 조회한 COMTNNOTE
	 * @exception Exception
	 */
    ComtnnoteVO selectComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * COMTNNOTE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnnoteList(ComtnnoteVO vo) throws Exception;
    
    /**
	 * COMTNNOTE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTE 총 갯수
	 * @exception
	 */
    int selectComtnnoteListTotCnt(ComtnnoteVO vo);
    
}