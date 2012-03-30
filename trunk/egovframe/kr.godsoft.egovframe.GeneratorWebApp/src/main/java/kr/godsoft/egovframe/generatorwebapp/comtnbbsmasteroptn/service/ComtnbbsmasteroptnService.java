package kr.godsoft.egovframe.generatorwebapp.comtnbbsmasteroptn.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbbsmasteroptnService.java
 * @Description : Comtnbbsmasteroptn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsmasteroptnService {
	
	/**
	 * COMTNBBSMASTEROPTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception;
    
    /**
	 * COMTNBBSMASTEROPTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception;
    
    /**
	 * COMTNBBSMASTEROPTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception;
    
    /**
	 * COMTNBBSMASTEROPTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasteroptnVO
	 * @return 조회한 COMTNBBSMASTEROPTN
	 * @exception Exception
	 */
    ComtnbbsmasteroptnVO selectComtnbbsmasteroptn(ComtnbbsmasteroptnVO vo) throws Exception;
    
    /**
	 * COMTNBBSMASTEROPTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSMASTEROPTN 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbbsmasteroptnList(ComtnbbsmasteroptnVO vo) throws Exception;
    
    /**
	 * COMTNBBSMASTEROPTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSMASTEROPTN 총 갯수
	 * @exception
	 */
    int selectComtnbbsmasteroptnListTotCnt(ComtnbbsmasteroptnVO vo);
    
}
