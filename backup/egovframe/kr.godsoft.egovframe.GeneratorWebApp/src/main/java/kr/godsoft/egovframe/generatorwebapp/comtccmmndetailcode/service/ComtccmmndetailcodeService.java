package kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtccmmndetailcodeService.java
 * @Description : Comtccmmndetailcode Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtccmmndetailcodeService {
	
	/**
	 * COMTCCMMNDETAILCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNDETAILCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNDETAILCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNDETAILCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 조회한 COMTCCMMNDETAILCODE
	 * @exception Exception
	 */
    ComtccmmndetailcodeVO selectComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNDETAILCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNDETAILCODE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtccmmndetailcodeList(ComtccmmndetailcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNDETAILCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNDETAILCODE 총 갯수
	 * @exception
	 */
    int selectComtccmmndetailcodeListTotCnt(ComtccmmndetailcodeVO vo);
    
}
