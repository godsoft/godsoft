package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnanswerService.java
 * @Description : Comtnanswer Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnanswerService {
	
	/**
	 * COMTNANSWER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnanswerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * COMTNANSWER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnanswerVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * COMTNANSWER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnanswerVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * COMTNANSWER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnanswerVO
	 * @return 조회한 COMTNANSWER
	 * @exception Exception
	 */
    ComtnanswerVO selectComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * COMTNANSWER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNANSWER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnanswerList(ComtnanswerVO vo) throws Exception;
    
    /**
	 * COMTNANSWER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNANSWER 총 갯수
	 * @exception
	 */
    int selectComtnanswerListTotCnt(ComtnanswerVO vo);
    
}
