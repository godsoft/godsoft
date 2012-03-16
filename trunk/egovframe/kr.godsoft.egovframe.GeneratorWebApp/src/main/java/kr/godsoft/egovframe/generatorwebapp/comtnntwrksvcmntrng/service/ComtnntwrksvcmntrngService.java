package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnntwrksvcmntrngService.java
 * @Description : Comtnntwrksvcmntrng Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnntwrksvcmntrngService {
	
	/**
	 * comtnntwrksvcmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 조회한 comtnntwrksvcmntrng
	 * @exception Exception
	 */
    ComtnntwrksvcmntrngVO selectComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrng 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnntwrksvcmntrngList(ComtnntwrksvcmntrngVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrng 총 갯수
	 * @exception
	 */
    int selectComtnntwrksvcmntrngListTotCnt(ComtnntwrksvcmntrngVO vo);
    
}
