package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfilesysmntrngService.java
 * @Description : Comtnfilesysmntrng Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfilesysmntrngService {
	
	/**
	 * comtnfilesysmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception;
    
    /**
	 * comtnfilesysmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception;
    
    /**
	 * comtnfilesysmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception;
    
    /**
	 * comtnfilesysmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 조회한 comtnfilesysmntrng
	 * @exception Exception
	 */
    ComtnfilesysmntrngVO selectComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception;
    
    /**
	 * comtnfilesysmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrng 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfilesysmntrngList(ComtnfilesysmntrngVO vo) throws Exception;
    
    /**
	 * comtnfilesysmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrng 총 갯수
	 * @exception
	 */
    int selectComtnfilesysmntrngListTotCnt(ComtnfilesysmntrngVO vo);
    
}
