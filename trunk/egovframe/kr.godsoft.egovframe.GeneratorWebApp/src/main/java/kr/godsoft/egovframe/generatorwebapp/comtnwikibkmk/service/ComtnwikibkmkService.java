package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnwikibkmkService.java
 * @Description : Comtnwikibkmk Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnwikibkmkService {
	
	/**
	 * COMTNWIKIBKMK을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikibkmkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception;
    
    /**
	 * COMTNWIKIBKMK을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception;
    
    /**
	 * COMTNWIKIBKMK을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception;
    
    /**
	 * COMTNWIKIBKMK을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikibkmkVO
	 * @return 조회한 COMTNWIKIBKMK
	 * @exception Exception
	 */
    ComtnwikibkmkVO selectComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception;
    
    /**
	 * COMTNWIKIBKMK 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWIKIBKMK 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnwikibkmkList(ComtnwikibkmkVO vo) throws Exception;
    
    /**
	 * COMTNWIKIBKMK 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWIKIBKMK 총 갯수
	 * @exception
	 */
    int selectComtnwikibkmkListTotCnt(ComtnwikibkmkVO vo);
    
}
