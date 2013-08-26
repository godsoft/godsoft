package kr.godsoft.egovframe.generatorwebapp.comtnbbs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbbsService.java
 * @Description : Comtnbbs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsService {
	
	/**
	 * COMTNBBS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * COMTNBBS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * COMTNBBS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * COMTNBBS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsVO
	 * @return 조회한 COMTNBBS
	 * @exception Exception
	 */
    ComtnbbsVO selectComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * COMTNBBS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbbsList(ComtnbbsVO vo) throws Exception;
    
    /**
	 * COMTNBBS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBS 총 갯수
	 * @exception
	 */
    int selectComtnbbsListTotCnt(ComtnbbsVO vo);
    
}