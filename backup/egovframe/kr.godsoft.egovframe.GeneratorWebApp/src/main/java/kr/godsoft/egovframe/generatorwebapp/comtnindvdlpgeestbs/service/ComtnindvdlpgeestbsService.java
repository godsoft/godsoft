package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnindvdlpgeestbsService.java
 * @Description : Comtnindvdlpgeestbs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlpgeestbsService {
	
	/**
	 * COMTNINDVDLPGEESTBS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLPGEESTBS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLPGEESTBS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLPGEESTBS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 조회한 COMTNINDVDLPGEESTBS
	 * @exception Exception
	 */
    ComtnindvdlpgeestbsVO selectComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLPGEESTBS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINDVDLPGEESTBS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnindvdlpgeestbsList(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLPGEESTBS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINDVDLPGEESTBS 총 갯수
	 * @exception
	 */
    int selectComtnindvdlpgeestbsListTotCnt(ComtnindvdlpgeestbsVO vo);
    
}
