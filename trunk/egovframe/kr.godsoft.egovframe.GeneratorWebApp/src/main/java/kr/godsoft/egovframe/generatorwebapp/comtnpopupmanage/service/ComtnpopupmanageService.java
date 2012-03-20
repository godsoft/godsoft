package kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnpopupmanageService.java
 * @Description : Comtnpopupmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnpopupmanageService {
	
	/**
	 * comtnpopupmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnpopupmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception;
    
    /**
	 * comtnpopupmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception;
    
    /**
	 * comtnpopupmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception;
    
    /**
	 * comtnpopupmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnpopupmanageVO
	 * @return 조회한 comtnpopupmanage
	 * @exception Exception
	 */
    ComtnpopupmanageVO selectComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception;
    
    /**
	 * comtnpopupmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnpopupmanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnpopupmanageList(ComtnpopupmanageVO vo) throws Exception;
    
    /**
	 * comtnpopupmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnpopupmanage 총 갯수
	 * @exception
	 */
    int selectComtnpopupmanageListTotCnt(ComtnpopupmanageVO vo);
    
}
