package kr.godsoft.egovframe.generatorwebapp.comtndamknoifm.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndamknoifmService.java
 * @Description : Comtndamknoifm Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndamknoifmService {
	
	/**
	 * COMTNDAMKNOIFM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamknoifmVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * COMTNDAMKNOIFM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamknoifmVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * COMTNDAMKNOIFM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamknoifmVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * COMTNDAMKNOIFM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamknoifmVO
	 * @return 조회한 COMTNDAMKNOIFM
	 * @exception Exception
	 */
    ComtndamknoifmVO selectComtndamknoifm(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * COMTNDAMKNOIFM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMKNOIFM 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndamknoifmList(ComtndamknoifmVO vo) throws Exception;
    
    /**
	 * COMTNDAMKNOIFM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMKNOIFM 총 갯수
	 * @exception
	 */
    int selectComtndamknoifmListTotCnt(ComtndamknoifmVO vo);
    
}