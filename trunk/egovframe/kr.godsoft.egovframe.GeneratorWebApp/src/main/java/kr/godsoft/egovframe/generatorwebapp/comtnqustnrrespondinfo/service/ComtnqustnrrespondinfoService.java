package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrespondinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqustnrrespondinfoService.java
 * @Description : Comtnqustnrrespondinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrrespondinfoService {
	
	/**
	 * COMTNQUSTNRRESPONDINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRESPONDINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRESPONDINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRESPONDINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrespondinfoVO
	 * @return 조회한 COMTNQUSTNRRESPONDINFO
	 * @exception Exception
	 */
    ComtnqustnrrespondinfoVO selectComtnqustnrrespondinfo(ComtnqustnrrespondinfoVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRESPONDINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRESPONDINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqustnrrespondinfoList(ComtnqustnrrespondinfoVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRRESPONDINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRRESPONDINFO 총 갯수
	 * @exception
	 */
    int selectComtnqustnrrespondinfoListTotCnt(ComtnqustnrrespondinfoVO vo);
    
}
