package kr.godsoft.egovframe.generatorwebapp.comtnbkmkmenumanageresult.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbkmkmenumanageresultService.java
 * @Description : Comtnbkmkmenumanageresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbkmkmenumanageresultService {
	
	/**
	 * COMTNBKMKMENUMANAGERESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception;
    
    /**
	 * COMTNBKMKMENUMANAGERESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception;
    
    /**
	 * COMTNBKMKMENUMANAGERESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception;
    
    /**
	 * COMTNBKMKMENUMANAGERESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbkmkmenumanageresultVO
	 * @return 조회한 COMTNBKMKMENUMANAGERESULT
	 * @exception Exception
	 */
    ComtnbkmkmenumanageresultVO selectComtnbkmkmenumanageresult(ComtnbkmkmenumanageresultVO vo) throws Exception;
    
    /**
	 * COMTNBKMKMENUMANAGERESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBKMKMENUMANAGERESULT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbkmkmenumanageresultList(ComtnbkmkmenumanageresultVO vo) throws Exception;
    
    /**
	 * COMTNBKMKMENUMANAGERESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBKMKMENUMANAGERESULT 총 갯수
	 * @exception
	 */
    int selectComtnbkmkmenumanageresultListTotCnt(ComtnbkmkmenumanageresultVO vo);
    
}
