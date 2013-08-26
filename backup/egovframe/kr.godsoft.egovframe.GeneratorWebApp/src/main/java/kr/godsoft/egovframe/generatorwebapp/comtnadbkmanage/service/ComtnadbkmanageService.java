package kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnadbkmanageService.java
 * @Description : Comtnadbkmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnadbkmanageService {
	
	/**
	 * COMTNADBKMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception;
    
    /**
	 * COMTNADBKMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception;
    
    /**
	 * COMTNADBKMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception;
    
    /**
	 * COMTNADBKMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkmanageVO
	 * @return 조회한 COMTNADBKMANAGE
	 * @exception Exception
	 */
    ComtnadbkmanageVO selectComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception;
    
    /**
	 * COMTNADBKMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNADBKMANAGE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnadbkmanageList(ComtnadbkmanageVO vo) throws Exception;
    
    /**
	 * COMTNADBKMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNADBKMANAGE 총 갯수
	 * @exception
	 */
    int selectComtnadbkmanageListTotCnt(ComtnadbkmanageVO vo);
    
}
