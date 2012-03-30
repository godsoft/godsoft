package kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnindvdlinfopolicyService.java
 * @Description : Comtnindvdlinfopolicy Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlinfopolicyService {
	
	/**
	 * COMTNINDVDLINFOPOLICY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLINFOPOLICY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLINFOPOLICY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLINFOPOLICY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 조회한 COMTNINDVDLINFOPOLICY
	 * @exception Exception
	 */
    ComtnindvdlinfopolicyVO selectComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLINFOPOLICY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINDVDLINFOPOLICY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnindvdlinfopolicyList(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * COMTNINDVDLINFOPOLICY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINDVDLINFOPOLICY 총 갯수
	 * @exception
	 */
    int selectComtnindvdlinfopolicyListTotCnt(ComtnindvdlinfopolicyVO vo);
    
}
