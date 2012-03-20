package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgecntnts.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnindvdlpgecntntsService.java
 * @Description : Comtnindvdlpgecntnts Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlpgecntntsService {
	
	/**
	 * comtnindvdlpgecntnts을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgecntnts을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgecntnts을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgecntnts을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgecntntsVO
	 * @return 조회한 comtnindvdlpgecntnts
	 * @exception Exception
	 */
    ComtnindvdlpgecntntsVO selectComtnindvdlpgecntnts(ComtnindvdlpgecntntsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgecntnts 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgecntnts 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnindvdlpgecntntsList(ComtnindvdlpgecntntsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgecntnts 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgecntnts 총 갯수
	 * @exception
	 */
    int selectComtnindvdlpgecntntsListTotCnt(ComtnindvdlpgecntntsVO vo);
    
}
