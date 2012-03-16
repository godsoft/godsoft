package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnntwrksvcmntrngloginfoService.java
 * @Description : Comtnntwrksvcmntrngloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnntwrksvcmntrngloginfoService {
	
	/**
	 * comtnntwrksvcmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 조회한 comtnntwrksvcmntrngloginfo
	 * @exception Exception
	 */
    ComtnntwrksvcmntrngloginfoVO selectComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrngloginfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnntwrksvcmntrngloginfoList(ComtnntwrksvcmntrngloginfoVO vo) throws Exception;
    
    /**
	 * comtnntwrksvcmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrngloginfo 총 갯수
	 * @exception
	 */
    int selectComtnntwrksvcmntrngloginfoListTotCnt(ComtnntwrksvcmntrngloginfoVO vo);
    
}
