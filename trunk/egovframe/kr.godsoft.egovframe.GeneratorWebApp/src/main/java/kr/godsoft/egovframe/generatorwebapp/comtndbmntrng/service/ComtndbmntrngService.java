package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndbmntrngService.java
 * @Description : Comtndbmntrng Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndbmntrngService {
	
	/**
	 * comtndbmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndbmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndbmntrng(ComtndbmntrngVO vo) throws Exception;
    
    /**
	 * comtndbmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndbmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndbmntrng(ComtndbmntrngVO vo) throws Exception;
    
    /**
	 * comtndbmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndbmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndbmntrng(ComtndbmntrngVO vo) throws Exception;
    
    /**
	 * comtndbmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndbmntrngVO
	 * @return 조회한 comtndbmntrng
	 * @exception Exception
	 */
    ComtndbmntrngVO selectComtndbmntrng(ComtndbmntrngVO vo) throws Exception;
    
    /**
	 * comtndbmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndbmntrng 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndbmntrngList(ComtndbmntrngVO vo) throws Exception;
    
    /**
	 * comtndbmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndbmntrng 총 갯수
	 * @exception
	 */
    int selectComtndbmntrngListTotCnt(ComtndbmntrngVO vo);
    
}
