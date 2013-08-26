package kr.godsoft.egovframe.generatorwebapp.comtntmplatinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtntmplatinfoService.java
 * @Description : Comtntmplatinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntmplatinfoService {
	
	/**
	 * COMTNTMPLATINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntmplatinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNTMPLATINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNTMPLATINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntmplatinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNTMPLATINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntmplatinfoVO
	 * @return 조회한 COMTNTMPLATINFO
	 * @exception Exception
	 */
    ComtntmplatinfoVO selectComtntmplatinfo(ComtntmplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNTMPLATINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTMPLATINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtntmplatinfoList(ComtntmplatinfoVO vo) throws Exception;
    
    /**
	 * COMTNTMPLATINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTMPLATINFO 총 갯수
	 * @exception
	 */
    int selectComtntmplatinfoListTotCnt(ComtntmplatinfoVO vo);
    
}
