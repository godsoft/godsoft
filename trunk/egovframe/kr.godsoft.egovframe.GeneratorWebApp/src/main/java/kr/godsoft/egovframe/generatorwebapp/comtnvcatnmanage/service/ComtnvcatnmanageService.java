package kr.godsoft.egovframe.generatorwebapp.comtnvcatnmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnvcatnmanageService.java
 * @Description : Comtnvcatnmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnvcatnmanageService {
	
	/**
	 * comtnvcatnmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * comtnvcatnmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * comtnvcatnmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnvcatnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * comtnvcatnmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnvcatnmanageVO
	 * @return 조회한 comtnvcatnmanage
	 * @exception Exception
	 */
    ComtnvcatnmanageVO selectComtnvcatnmanage(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * comtnvcatnmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnvcatnmanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnvcatnmanageList(ComtnvcatnmanageVO vo) throws Exception;
    
    /**
	 * comtnvcatnmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnvcatnmanage 총 갯수
	 * @exception
	 */
    int selectComtnvcatnmanageListTotCnt(ComtnvcatnmanageVO vo);
    
}
