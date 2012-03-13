package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageVO;

/**
 * @Class Name : ComtnonlinepollmanageService.java
 * @Description : Comtnonlinepollmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnonlinepollmanageService {
	
	/**
	 * comtnonlinepollmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception;
    
    /**
	 * comtnonlinepollmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception;
    
    /**
	 * comtnonlinepollmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception;
    
    /**
	 * comtnonlinepollmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 조회한 comtnonlinepollmanage
	 * @exception Exception
	 */
    ComtnonlinepollmanageVO selectComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception;
    
    /**
	 * comtnonlinepollmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepollmanage 목록
	 * @exception Exception
	 */
    List selectComtnonlinepollmanageList(ComtnonlinepollmanageDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnonlinepollmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinepollmanage 총 갯수
	 * @exception
	 */
    int selectComtnonlinepollmanageListTotCnt(ComtnonlinepollmanageDefaultVO searchVO);
    
}
