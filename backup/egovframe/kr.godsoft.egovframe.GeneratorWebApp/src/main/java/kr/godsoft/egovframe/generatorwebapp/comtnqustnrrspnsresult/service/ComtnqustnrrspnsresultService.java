package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqustnrrspnsresultService.java
 * @Description : Comtnqustnrrspnsresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrrspnsresultService {
	
	/**
	 * COMTNQUSTNRRSPNSRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRSPNSRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRSPNSRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRSPNSRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 COMTNQUSTNRRSPNSRESULT
	 * @exception Exception
	 */
    ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRSPNSRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRSPNSRESULT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRSPNSRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRSPNSRESULT 총 갯수
	 * @exception
	 */
    int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultVO vo);
    
}
