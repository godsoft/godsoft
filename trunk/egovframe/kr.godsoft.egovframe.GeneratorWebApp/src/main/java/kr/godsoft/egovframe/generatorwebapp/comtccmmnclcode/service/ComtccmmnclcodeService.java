package kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtccmmnclcodeService.java
 * @Description : Comtccmmnclcode Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtccmmnclcodeService {
	
	/**
	 * COMTCCMMNCLCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCLCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCLCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCLCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 COMTCCMMNCLCODE
	 * @exception Exception
	 */
    ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCLCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCLCODE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtccmmnclcodeList(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * COMTCCMMNCLCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCCMMNCLCODE 총 갯수
	 * @exception
	 */
    int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeVO vo);
    
}
