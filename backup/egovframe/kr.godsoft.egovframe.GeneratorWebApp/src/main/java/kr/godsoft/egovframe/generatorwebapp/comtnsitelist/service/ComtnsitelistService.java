package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsitelistService.java
 * @Description : Comtnsitelist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsitelistService {
	
	/**
	 * COMTNSITELIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitelistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * COMTNSITELIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitelistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * COMTNSITELIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitelistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * COMTNSITELIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitelistVO
	 * @return 조회한 COMTNSITELIST
	 * @exception Exception
	 */
    ComtnsitelistVO selectComtnsitelist(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * COMTNSITELIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSITELIST 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsitelistList(ComtnsitelistVO vo) throws Exception;
    
    /**
	 * COMTNSITELIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSITELIST 총 갯수
	 * @exception
	 */
    int selectComtnsitelistListTotCnt(ComtnsitelistVO vo);
    
}