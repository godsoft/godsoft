package kr.godsoft.egovframe.generatorwebapp.comtnmenucreatdtls.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmenucreatdtlsService.java
 * @Description : Comtnmenucreatdtls Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmenucreatdtlsService {
	
	/**
	 * COMTNMENUCREATDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception;
    
    /**
	 * COMTNMENUCREATDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception;
    
    /**
	 * COMTNMENUCREATDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception;
    
    /**
	 * COMTNMENUCREATDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenucreatdtlsVO
	 * @return 조회한 COMTNMENUCREATDTLS
	 * @exception Exception
	 */
    ComtnmenucreatdtlsVO selectComtnmenucreatdtls(ComtnmenucreatdtlsVO vo) throws Exception;
    
    /**
	 * COMTNMENUCREATDTLS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUCREATDTLS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmenucreatdtlsList(ComtnmenucreatdtlsVO vo) throws Exception;
    
    /**
	 * COMTNMENUCREATDTLS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUCREATDTLS 총 갯수
	 * @exception
	 */
    int selectComtnmenucreatdtlsListTotCnt(ComtnmenucreatdtlsVO vo);
    
}