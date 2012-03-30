package kr.godsoft.egovframe.generatorwebapp.comtnsms.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsmsService.java
 * @Description : Comtnsms Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsmsService {
	
	/**
	 * COMTNSMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * COMTNSMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * COMTNSMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * COMTNSMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsVO
	 * @return 조회한 COMTNSMS
	 * @exception Exception
	 */
    ComtnsmsVO selectComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * COMTNSMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsmsList(ComtnsmsVO vo) throws Exception;
    
    /**
	 * COMTNSMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMS 총 갯수
	 * @exception
	 */
    int selectComtnsmsListTotCnt(ComtnsmsVO vo);
    
}
