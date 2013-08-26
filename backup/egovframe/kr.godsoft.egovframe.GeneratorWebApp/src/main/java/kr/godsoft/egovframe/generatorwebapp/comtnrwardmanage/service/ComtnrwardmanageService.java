package kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrwardmanageService.java
 * @Description : Comtnrwardmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrwardmanageService {
	
	/**
	 * COMTNRWARDMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrwardmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception;
    
    /**
	 * COMTNRWARDMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception;
    
    /**
	 * COMTNRWARDMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception;
    
    /**
	 * COMTNRWARDMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrwardmanageVO
	 * @return 조회한 COMTNRWARDMANAGE
	 * @exception Exception
	 */
    ComtnrwardmanageVO selectComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception;
    
    /**
	 * COMTNRWARDMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRWARDMANAGE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrwardmanageList(ComtnrwardmanageVO vo) throws Exception;
    
    /**
	 * COMTNRWARDMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRWARDMANAGE 총 갯수
	 * @exception
	 */
    int selectComtnrwardmanageListTotCnt(ComtnrwardmanageVO vo);
    
}
