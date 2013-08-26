package kr.godsoft.egovframe.generatorwebapp.comtnncrd.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnncrdService.java
 * @Description : Comtnncrd Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnncrdService {
	
	/**
	 * COMTNNCRD을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrdVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnncrd(ComtnncrdVO vo) throws Exception;
    
    /**
	 * COMTNNCRD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrdVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnncrd(ComtnncrdVO vo) throws Exception;
    
    /**
	 * COMTNNCRD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrdVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnncrd(ComtnncrdVO vo) throws Exception;
    
    /**
	 * COMTNNCRD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrdVO
	 * @return 조회한 COMTNNCRD
	 * @exception Exception
	 */
    ComtnncrdVO selectComtnncrd(ComtnncrdVO vo) throws Exception;
    
    /**
	 * COMTNNCRD 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRD 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnncrdList(ComtnncrdVO vo) throws Exception;
    
    /**
	 * COMTNNCRD 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRD 총 갯수
	 * @exception
	 */
    int selectComtnncrdListTotCnt(ComtnncrdVO vo);
    
}
