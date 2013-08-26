package kr.godsoft.egovframe.generatorwebapp.comtnnewsinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnnewsinfoService.java
 * @Description : Comtnnewsinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnewsinfoService {
	
	/**
	 * COMTNNEWSINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnewsinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception;
    
    /**
	 * COMTNNEWSINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception;
    
    /**
	 * COMTNNEWSINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnewsinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception;
    
    /**
	 * COMTNNEWSINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnewsinfoVO
	 * @return 조회한 COMTNNEWSINFO
	 * @exception Exception
	 */
    ComtnnewsinfoVO selectComtnnewsinfo(ComtnnewsinfoVO vo) throws Exception;
    
    /**
	 * COMTNNEWSINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNEWSINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnnewsinfoList(ComtnnewsinfoVO vo) throws Exception;
    
    /**
	 * COMTNNEWSINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNEWSINFO 총 갯수
	 * @exception
	 */
    int selectComtnnewsinfoListTotCnt(ComtnnewsinfoVO vo);
    
}
