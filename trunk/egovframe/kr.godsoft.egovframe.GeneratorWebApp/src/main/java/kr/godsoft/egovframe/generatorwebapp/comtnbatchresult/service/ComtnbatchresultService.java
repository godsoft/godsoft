package kr.godsoft.egovframe.generatorwebapp.comtnbatchresult.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbatchresultService.java
 * @Description : Comtnbatchresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchresultService {
	
	/**
	 * COMTNBATCHRESULT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchresult(ComtnbatchresultVO vo) throws Exception;
    
    /**
	 * COMTNBATCHRESULT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchresult(ComtnbatchresultVO vo) throws Exception;
    
    /**
	 * COMTNBATCHRESULT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchresult(ComtnbatchresultVO vo) throws Exception;
    
    /**
	 * COMTNBATCHRESULT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchresultVO
	 * @return 조회한 COMTNBATCHRESULT
	 * @exception Exception
	 */
    ComtnbatchresultVO selectComtnbatchresult(ComtnbatchresultVO vo) throws Exception;
    
    /**
	 * COMTNBATCHRESULT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHRESULT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbatchresultList(ComtnbatchresultVO vo) throws Exception;
    
    /**
	 * COMTNBATCHRESULT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHRESULT 총 갯수
	 * @exception
	 */
    int selectComtnbatchresultListTotCnt(ComtnbatchresultVO vo);
    
}
