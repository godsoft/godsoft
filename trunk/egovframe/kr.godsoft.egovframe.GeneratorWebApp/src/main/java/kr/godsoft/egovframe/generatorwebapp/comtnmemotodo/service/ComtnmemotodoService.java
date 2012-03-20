package kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmemotodoService.java
 * @Description : Comtnmemotodo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmemotodoService {
	
	/**
	 * comtnmemotodo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemotodoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmemotodo(ComtnmemotodoVO vo) throws Exception;
    
    /**
	 * comtnmemotodo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemotodoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmemotodo(ComtnmemotodoVO vo) throws Exception;
    
    /**
	 * comtnmemotodo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemotodoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmemotodo(ComtnmemotodoVO vo) throws Exception;
    
    /**
	 * comtnmemotodo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemotodoVO
	 * @return 조회한 comtnmemotodo
	 * @exception Exception
	 */
    ComtnmemotodoVO selectComtnmemotodo(ComtnmemotodoVO vo) throws Exception;
    
    /**
	 * comtnmemotodo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemotodo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmemotodoList(ComtnmemotodoVO vo) throws Exception;
    
    /**
	 * comtnmemotodo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemotodo 총 갯수
	 * @exception
	 */
    int selectComtnmemotodoListTotCnt(ComtnmemotodoVO vo);
    
}
