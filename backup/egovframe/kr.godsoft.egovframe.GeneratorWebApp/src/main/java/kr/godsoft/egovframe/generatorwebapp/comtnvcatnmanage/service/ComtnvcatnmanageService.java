package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnvcatnmanageService.java
 * @Description : Comtnvcatnmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnvcatnmanageService {
	
	/**
	 * COMTNVCATNMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * COMTNVCATNMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * COMTNVCATNMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * COMTNVCATNMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 조회한 COMTNVCATNMANAGE
	 * @exception Exception
	 */
    ComtnvcatnmanageVO selectComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * COMTNVCATNMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNVCATNMANAGE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnvcatnmanageList(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * COMTNVCATNMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNVCATNMANAGE 총 갯수
	 * @exception
	 */
    int selectComtnvcatnmanageListTotCnt(ComtnvcatnmanageVO vo);
    
}
