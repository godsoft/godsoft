package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnworddicaryinfoService.java
 * @Description : Comtnworddicaryinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnworddicaryinfoService {
	
	/**
	 * COMTNWORDDICARYINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * COMTNWORDDICARYINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * COMTNWORDDICARYINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * COMTNWORDDICARYINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 조회한 COMTNWORDDICARYINFO
	 * @exception Exception
	 */
    ComtnworddicaryinfoVO selectComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * COMTNWORDDICARYINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWORDDICARYINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnworddicaryinfoList(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * COMTNWORDDICARYINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWORDDICARYINFO 총 갯수
	 * @exception
	 */
    int selectComtnworddicaryinfoListTotCnt(ComtnworddicaryinfoVO vo);
    
}
