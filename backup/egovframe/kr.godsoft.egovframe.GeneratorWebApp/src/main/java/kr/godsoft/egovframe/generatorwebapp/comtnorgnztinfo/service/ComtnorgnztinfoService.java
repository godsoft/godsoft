package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnorgnztinfoService.java
 * @Description : Comtnorgnztinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnorgnztinfoService {
	
	/**
	 * COMTNORGNZTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * COMTNORGNZTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * COMTNORGNZTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * COMTNORGNZTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 조회한 COMTNORGNZTINFO
	 * @exception Exception
	 */
    ComtnorgnztinfoVO selectComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * COMTNORGNZTINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNORGNZTINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnorgnztinfoList(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * COMTNORGNZTINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNORGNZTINFO 총 갯수
	 * @exception
	 */
    int selectComtnorgnztinfoListTotCnt(ComtnorgnztinfoVO vo);
    
}