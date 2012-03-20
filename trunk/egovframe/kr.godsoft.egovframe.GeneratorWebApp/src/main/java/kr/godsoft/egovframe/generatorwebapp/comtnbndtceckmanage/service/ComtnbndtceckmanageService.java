package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbndtceckmanageService.java
 * @Description : Comtnbndtceckmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbndtceckmanageService {
	
	/**
	 * comtnbndtceckmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception;
    
    /**
	 * comtnbndtceckmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception;
    
    /**
	 * comtnbndtceckmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception;
    
    /**
	 * comtnbndtceckmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 조회한 comtnbndtceckmanage
	 * @exception Exception
	 */
    ComtnbndtceckmanageVO selectComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception;
    
    /**
	 * comtnbndtceckmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtceckmanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbndtceckmanageList(ComtnbndtceckmanageVO vo) throws Exception;
    
    /**
	 * comtnbndtceckmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtceckmanage 총 갯수
	 * @exception
	 */
    int selectComtnbndtceckmanageListTotCnt(ComtnbndtceckmanageVO vo);
    
}
