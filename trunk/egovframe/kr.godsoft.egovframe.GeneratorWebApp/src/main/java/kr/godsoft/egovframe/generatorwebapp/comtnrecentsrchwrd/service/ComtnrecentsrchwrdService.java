package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrecentsrchwrdService.java
 * @Description : Comtnrecentsrchwrd Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrecentsrchwrdService {
	
	/**
	 * COMTNRECENTSRCHWRD을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * COMTNRECENTSRCHWRD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * COMTNRECENTSRCHWRD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * COMTNRECENTSRCHWRD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 조회한 COMTNRECENTSRCHWRD
	 * @exception Exception
	 */
    ComtnrecentsrchwrdVO selectComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * COMTNRECENTSRCHWRD 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECENTSRCHWRD 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrecentsrchwrdList(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * COMTNRECENTSRCHWRD 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECENTSRCHWRD 총 갯수
	 * @exception
	 */
    int selectComtnrecentsrchwrdListTotCnt(ComtnrecentsrchwrdVO vo);
    
}
