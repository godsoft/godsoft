package kr.godsoft.egovframe.generatorwebapp.comtccmmncode.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtccmmncodeService.java
 * @Description : Comtccmmncode Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtccmmncodeService {
	
	/**
	 * COMTCCMMNCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmncodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtccmmncode(ComtccmmncodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmncodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtccmmncode(ComtccmmncodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmncodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtccmmncode(ComtccmmncodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmncodeVO
	 * @return 조회한 COMTCCMMNCODE
	 * @exception Exception
	 */
    ComtccmmncodeVO selectComtccmmncode(ComtccmmncodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCODE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtccmmncodeList(ComtccmmncodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCODE 총 갯수
	 * @exception
	 */
    int selectComtccmmncodeListTotCnt(ComtccmmncodeVO vo);
    
}