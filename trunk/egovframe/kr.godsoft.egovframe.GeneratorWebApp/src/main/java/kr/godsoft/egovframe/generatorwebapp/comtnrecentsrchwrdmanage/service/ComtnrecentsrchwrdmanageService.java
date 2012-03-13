package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageVO;

/**
 * @Class Name : ComtnrecentsrchwrdmanageService.java
 * @Description : Comtnrecentsrchwrdmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrecentsrchwrdmanageService {
	
	/**
	 * comtnrecentsrchwrdmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrdmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrdmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrdmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 조회한 comtnrecentsrchwrdmanage
	 * @exception Exception
	 */
    ComtnrecentsrchwrdmanageVO selectComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrdmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrdmanage 목록
	 * @exception Exception
	 */
    List selectComtnrecentsrchwrdmanageList(ComtnrecentsrchwrdmanageDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnrecentsrchwrdmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrdmanage 총 갯수
	 * @exception
	 */
    int selectComtnrecentsrchwrdmanageListTotCnt(ComtnrecentsrchwrdmanageDefaultVO searchVO);
    
}
