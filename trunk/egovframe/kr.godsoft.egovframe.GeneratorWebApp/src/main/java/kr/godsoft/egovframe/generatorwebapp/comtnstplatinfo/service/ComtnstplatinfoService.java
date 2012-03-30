package kr.godsoft.egovframe.generatorwebapp.comtnstplatinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnstplatinfoService.java
 * @Description : Comtnstplatinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnstplatinfoService {
	
	/**
	 * COMTNSTPLATINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNSTPLATINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNSTPLATINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNSTPLATINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstplatinfoVO
	 * @return 조회한 COMTNSTPLATINFO
	 * @exception Exception
	 */
    ComtnstplatinfoVO selectComtnstplatinfo(ComtnstplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNSTPLATINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTPLATINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnstplatinfoList(ComtnstplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNSTPLATINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTPLATINFO 총 갯수
	 * @exception
	 */
    int selectComtnstplatinfoListTotCnt(ComtnstplatinfoVO vo);
    
}
