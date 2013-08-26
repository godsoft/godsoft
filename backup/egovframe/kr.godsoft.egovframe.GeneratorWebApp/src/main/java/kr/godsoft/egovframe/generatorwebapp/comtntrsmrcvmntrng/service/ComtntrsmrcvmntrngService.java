package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvmntrng.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtntrsmrcvmntrngService.java
 * @Description : Comtntrsmrcvmntrng Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntrsmrcvmntrngService {
	
	/**
	 * COMTNTRSMRCVMNTRNG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVMNTRNG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVMNTRNG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVMNTRNG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvmntrngVO
	 * @return 조회한 COMTNTRSMRCVMNTRNG
	 * @exception Exception
	 */
    ComtntrsmrcvmntrngVO selectComtntrsmrcvmntrng(ComtntrsmrcvmntrngVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVMNTRNG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTRSMRCVMNTRNG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtntrsmrcvmntrngList(ComtntrsmrcvmntrngVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVMNTRNG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTRSMRCVMNTRNG 총 갯수
	 * @exception
	 */
    int selectComtntrsmrcvmntrngListTotCnt(ComtntrsmrcvmntrngVO vo);
    
}