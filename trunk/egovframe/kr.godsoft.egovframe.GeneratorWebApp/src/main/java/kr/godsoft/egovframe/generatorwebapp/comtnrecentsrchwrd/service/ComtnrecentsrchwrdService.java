package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrd.service.ComtnrecentsrchwrdVO;

/**
 * @Class Name : ComtnrecentsrchwrdService.java
 * @Description : Comtnrecentsrchwrd Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrecentsrchwrdService {
	
	/**
	 * comtnrecentsrchwrd을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrd을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrd을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrd을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdVO
	 * @return 조회한 comtnrecentsrchwrd
	 * @exception Exception
	 */
    ComtnrecentsrchwrdVO selectComtnrecentsrchwrd(ComtnrecentsrchwrdVO vo) throws Exception;
    
    /**
	 * comtnrecentsrchwrd 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrd 목록
	 * @exception Exception
	 */
    List selectComtnrecentsrchwrdList(ComtnrecentsrchwrdDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnrecentsrchwrd 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrd 총 갯수
	 * @exception
	 */
    int selectComtnrecentsrchwrdListTotCnt(ComtnrecentsrchwrdDefaultVO searchVO);
    
}
