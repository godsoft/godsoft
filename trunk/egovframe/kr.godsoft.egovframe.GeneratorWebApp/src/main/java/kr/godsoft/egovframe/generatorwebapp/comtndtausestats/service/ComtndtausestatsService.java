package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndtausestatsService.java
 * @Description : Comtndtausestats Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndtausestatsService {
	
	/**
	 * COMTNDTAUSESTATS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndtausestatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * COMTNDTAUSESTATS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndtausestatsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * COMTNDTAUSESTATS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndtausestatsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * COMTNDTAUSESTATS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndtausestatsVO
	 * @return 조회한 COMTNDTAUSESTATS
	 * @exception Exception
	 */
    ComtndtausestatsVO selectComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * COMTNDTAUSESTATS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDTAUSESTATS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndtausestatsList(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * COMTNDTAUSESTATS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDTAUSESTATS 총 갯수
	 * @exception
	 */
    int selectComtndtausestatsListTotCnt(ComtndtausestatsVO vo);
    
}
