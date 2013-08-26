package kr.godsoft.egovframe.generatorwebapp.comtnbndtmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbndtmanageService.java
 * @Description : Comtnbndtmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbndtmanageService {
	
	/**
	 * COMTNBNDTMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception;
    
    /**
	 * COMTNBNDTMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception;
    
    /**
	 * COMTNBNDTMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception;
    
    /**
	 * COMTNBNDTMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtmanageVO
	 * @return 조회한 COMTNBNDTMANAGE
	 * @exception Exception
	 */
    ComtnbndtmanageVO selectComtnbndtmanage(ComtnbndtmanageVO vo) throws Exception;
    
    /**
	 * COMTNBNDTMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTMANAGE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbndtmanageList(ComtnbndtmanageVO vo) throws Exception;
    
    /**
	 * COMTNBNDTMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTMANAGE 총 갯수
	 * @exception
	 */
    int selectComtnbndtmanageListTotCnt(ComtnbndtmanageVO vo);
    
}