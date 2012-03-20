package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnindvdlyrycmanageService.java
 * @Description : Comtnindvdlyrycmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlyrycmanageService {
	
	/**
	 * comtnindvdlyrycmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception;
    
    /**
	 * comtnindvdlyrycmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception;
    
    /**
	 * comtnindvdlyrycmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception;
    
    /**
	 * comtnindvdlyrycmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 조회한 comtnindvdlyrycmanage
	 * @exception Exception
	 */
    ComtnindvdlyrycmanageVO selectComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception;
    
    /**
	 * comtnindvdlyrycmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlyrycmanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnindvdlyrycmanageList(ComtnindvdlyrycmanageVO vo) throws Exception;
    
    /**
	 * comtnindvdlyrycmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlyrycmanage 총 갯수
	 * @exception
	 */
    int selectComtnindvdlyrycmanageListTotCnt(ComtnindvdlyrycmanageVO vo);
    
}
