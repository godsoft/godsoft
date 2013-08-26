package kr.godsoft.egovframe.generatorwebapp.comtnproxyinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnproxyinfoService.java
 * @Description : Comtnproxyinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnproxyinfoService {
	
	/**
	 * COMTNPROXYINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnproxyinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnproxyinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnproxyinfoVO
	 * @return 조회한 COMTNPROXYINFO
	 * @exception Exception
	 */
    ComtnproxyinfoVO selectComtnproxyinfo(ComtnproxyinfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnproxyinfoList(ComtnproxyinfoVO vo) throws Exception;
    
    /**
	 * COMTNPROXYINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPROXYINFO 총 갯수
	 * @exception
	 */
    int selectComtnproxyinfoListTotCnt(ComtnproxyinfoVO vo);
    
}