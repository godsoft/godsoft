package kr.godsoft.egovframe.generatorwebapp.comtrdnmadrzip.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtrdnmadrzipService.java
 * @Description : Comtrdnmadrzip Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtrdnmadrzipService {
	
	/**
	 * comtrdnmadrzip을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception;
    
    /**
	 * comtrdnmadrzip을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception;
    
    /**
	 * comtrdnmadrzip을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtrdnmadrzipVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception;
    
    /**
	 * comtrdnmadrzip을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtrdnmadrzipVO
	 * @return 조회한 comtrdnmadrzip
	 * @exception Exception
	 */
    ComtrdnmadrzipVO selectComtrdnmadrzip(ComtrdnmadrzipVO vo) throws Exception;
    
    /**
	 * comtrdnmadrzip 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtrdnmadrzip 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtrdnmadrzipList(ComtrdnmadrzipVO vo) throws Exception;
    
    /**
	 * comtrdnmadrzip 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtrdnmadrzip 총 갯수
	 * @exception
	 */
    int selectComtrdnmadrzipListTotCnt(ComtrdnmadrzipVO vo);
    
}
