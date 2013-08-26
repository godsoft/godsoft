package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbndtdiaryService.java
 * @Description : Comtnbndtdiary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbndtdiaryService {
	
	/**
	 * COMTNBNDTDIARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * COMTNBNDTDIARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * COMTNBNDTDIARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * COMTNBNDTDIARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 조회한 COMTNBNDTDIARY
	 * @exception Exception
	 */
    ComtnbndtdiaryVO selectComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * COMTNBNDTDIARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTDIARY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbndtdiaryList(ComtnbndtdiaryVO vo) throws Exception;
    
    /**
	 * COMTNBNDTDIARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTDIARY 총 갯수
	 * @exception
	 */
    int selectComtnbndtdiaryListTotCnt(ComtnbndtdiaryVO vo);
    
}
