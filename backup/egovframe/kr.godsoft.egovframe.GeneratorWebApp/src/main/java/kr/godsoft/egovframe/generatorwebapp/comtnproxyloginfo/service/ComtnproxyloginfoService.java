package kr.godsoft.egovframe.generatorwebapp.comtnproxyloginfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnproxyloginfoService.java
 * @Description : Comtnproxyloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnproxyloginfoService {
	
	/**
	 * COMTNPROXYLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyloginfoVO
	 * @return 조회한 COMTNPROXYLOGINFO
	 * @exception Exception
	 */
    ComtnproxyloginfoVO selectComtnproxyloginfo(ComtnproxyloginfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYLOGINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYLOGINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnproxyloginfoList(ComtnproxyloginfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYLOGINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYLOGINFO 총 갯수
	 * @exception
	 */
    int selectComtnproxyloginfoListTotCnt(ComtnproxyloginfoVO vo);
    
}