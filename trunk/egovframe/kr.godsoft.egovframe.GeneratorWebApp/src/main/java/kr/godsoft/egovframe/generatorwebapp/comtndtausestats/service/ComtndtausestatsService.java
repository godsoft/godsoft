package kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndtausestats.service.ComtndtausestatsVO;

/**
 * @Class Name : ComtndtausestatsService.java
 * @Description : Comtndtausestats Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndtausestatsService {
	
	/**
	 * comtndtausestats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndtausestatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * comtndtausestats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndtausestatsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * comtndtausestats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndtausestatsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * comtndtausestats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndtausestatsVO
	 * @return 조회한 comtndtausestats
	 * @exception Exception
	 */
    ComtndtausestatsVO selectComtndtausestats(ComtndtausestatsVO vo) throws Exception;
    
    /**
	 * comtndtausestats 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndtausestats 목록
	 * @exception Exception
	 */
    List selectComtndtausestatsList(ComtndtausestatsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndtausestats 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndtausestats 총 갯수
	 * @exception
	 */
    int selectComtndtausestatsListTotCnt(ComtndtausestatsDefaultVO searchVO);
    
}
