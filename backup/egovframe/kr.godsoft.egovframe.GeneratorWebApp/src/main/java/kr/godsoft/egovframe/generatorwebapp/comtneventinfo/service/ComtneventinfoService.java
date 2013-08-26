package kr.godsoft.egovframe.generatorwebapp.comtneventinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtneventinfoService.java
 * @Description : Comtneventinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtneventinfoService {
	
	/**
	 * COMTNEVENTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtneventinfo(ComtneventinfoVO vo) throws Exception;
    
    /**
	 * COMTNEVENTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtneventinfo(ComtneventinfoVO vo) throws Exception;
    
    /**
	 * COMTNEVENTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtneventinfo(ComtneventinfoVO vo) throws Exception;
    
    /**
	 * COMTNEVENTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventinfoVO
	 * @return 조회한 COMTNEVENTINFO
	 * @exception Exception
	 */
    ComtneventinfoVO selectComtneventinfo(ComtneventinfoVO vo) throws Exception;
    
    /**
	 * COMTNEVENTINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEVENTINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtneventinfoList(ComtneventinfoVO vo) throws Exception;
    
    /**
	 * COMTNEVENTINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEVENTINFO 총 갯수
	 * @exception
	 */
    int selectComtneventinfoListTotCnt(ComtneventinfoVO vo);
    
}
