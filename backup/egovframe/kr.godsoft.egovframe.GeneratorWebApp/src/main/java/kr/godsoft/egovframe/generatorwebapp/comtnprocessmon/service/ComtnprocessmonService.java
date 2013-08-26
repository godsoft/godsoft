package kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnprocessmonService.java
 * @Description : Comtnprocessmon Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnprocessmonService {
	
	/**
	 * COMTNPROCESSMON을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnprocessmon(ComtnprocessmonVO vo) throws Exception;
    
    /**
	 * COMTNPROCESSMON을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnprocessmon(ComtnprocessmonVO vo) throws Exception;
    
    /**
	 * COMTNPROCESSMON을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnprocessmon(ComtnprocessmonVO vo) throws Exception;
    
    /**
	 * COMTNPROCESSMON을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonVO
	 * @return 조회한 COMTNPROCESSMON
	 * @exception Exception
	 */
    ComtnprocessmonVO selectComtnprocessmon(ComtnprocessmonVO vo) throws Exception;
    
    /**
	 * COMTNPROCESSMON 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROCESSMON 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnprocessmonList(ComtnprocessmonVO vo) throws Exception;
    
    /**
	 * COMTNPROCESSMON 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROCESSMON 총 갯수
	 * @exception
	 */
    int selectComtnprocessmonListTotCnt(ComtnprocessmonVO vo);
    
}
