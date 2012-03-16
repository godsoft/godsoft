package kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbbsmasterService.java
 * @Description : Comtnbbsmaster Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsmasterService {
	
	/**
	 * comtnbbsmaster을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception;
    
    /**
	 * comtnbbsmaster을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception;
    
    /**
	 * comtnbbsmaster을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception;
    
    /**
	 * comtnbbsmaster을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasterVO
	 * @return 조회한 comtnbbsmaster
	 * @exception Exception
	 */
    ComtnbbsmasterVO selectComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception;
    
    /**
	 * comtnbbsmaster 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsmaster 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbbsmasterList(ComtnbbsmasterVO vo) throws Exception;
    
    /**
	 * comtnbbsmaster 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsmaster 총 갯수
	 * @exception
	 */
    int selectComtnbbsmasterListTotCnt(ComtnbbsmasterVO vo);
    
}
