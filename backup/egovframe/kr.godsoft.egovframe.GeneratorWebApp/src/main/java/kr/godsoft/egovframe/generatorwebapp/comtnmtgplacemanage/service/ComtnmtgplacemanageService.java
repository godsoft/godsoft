package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacemanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmtgplacemanageService.java
 * @Description : Comtnmtgplacemanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmtgplacemanageService {
	
	/**
	 * COMTNMTGPLACEMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception;
    
    /**
	 * COMTNMTGPLACEMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception;
    
    /**
	 * COMTNMTGPLACEMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception;
    
    /**
	 * COMTNMTGPLACEMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacemanageVO
	 * @return 조회한 COMTNMTGPLACEMANAGE
	 * @exception Exception
	 */
    ComtnmtgplacemanageVO selectComtnmtgplacemanage(ComtnmtgplacemanageVO vo) throws Exception;
    
    /**
	 * COMTNMTGPLACEMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACEMANAGE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmtgplacemanageList(ComtnmtgplacemanageVO vo) throws Exception;
    
    /**
	 * COMTNMTGPLACEMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACEMANAGE 총 갯수
	 * @exception
	 */
    int selectComtnmtgplacemanageListTotCnt(ComtnmtgplacemanageVO vo);
    
}