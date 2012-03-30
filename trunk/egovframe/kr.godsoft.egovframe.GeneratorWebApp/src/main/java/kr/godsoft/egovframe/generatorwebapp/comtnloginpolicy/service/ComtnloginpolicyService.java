package kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnloginpolicyService.java
 * @Description : Comtnloginpolicy Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnloginpolicyService {
	
	/**
	 * COMTNLOGINPOLICY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginpolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception;
    
    /**
	 * COMTNLOGINPOLICY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception;
    
    /**
	 * COMTNLOGINPOLICY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception;
    
    /**
	 * COMTNLOGINPOLICY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginpolicyVO
	 * @return 조회한 COMTNLOGINPOLICY
	 * @exception Exception
	 */
    ComtnloginpolicyVO selectComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception;
    
    /**
	 * COMTNLOGINPOLICY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLOGINPOLICY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnloginpolicyList(ComtnloginpolicyVO vo) throws Exception;
    
    /**
	 * COMTNLOGINPOLICY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLOGINPOLICY 총 갯수
	 * @exception
	 */
    int selectComtnloginpolicyListTotCnt(ComtnloginpolicyVO vo);
    
}
