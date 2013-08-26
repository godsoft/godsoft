package kr.godsoft.egovframe.generatorwebapp.comtnsmsrecptn.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsmsrecptnService.java
 * @Description : Comtnsmsrecptn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsmsrecptnService {
	
	/**
	 * COMTNSMSRECPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception;
    
    /**
	 * COMTNSMSRECPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception;
    
    /**
	 * COMTNSMSRECPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsrecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception;
    
    /**
	 * COMTNSMSRECPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsrecptnVO
	 * @return 조회한 COMTNSMSRECPTN
	 * @exception Exception
	 */
    ComtnsmsrecptnVO selectComtnsmsrecptn(ComtnsmsrecptnVO vo) throws Exception;
    
    /**
	 * COMTNSMSRECPTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMSRECPTN 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsmsrecptnList(ComtnsmsrecptnVO vo) throws Exception;
    
    /**
	 * COMTNSMSRECPTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSMSRECPTN 총 갯수
	 * @exception
	 */
    int selectComtnsmsrecptnListTotCnt(ComtnsmsrecptnVO vo);
    
}
