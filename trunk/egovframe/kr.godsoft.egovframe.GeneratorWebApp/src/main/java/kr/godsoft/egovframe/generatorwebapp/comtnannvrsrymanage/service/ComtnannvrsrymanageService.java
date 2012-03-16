package kr.godsoft.egovframe.generatorwebapp.comtnannvrsrymanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnannvrsrymanageService.java
 * @Description : Comtnannvrsrymanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnannvrsrymanageService {
	
	/**
	 * comtnannvrsrymanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception;
    
    /**
	 * comtnannvrsrymanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception;
    
    /**
	 * comtnannvrsrymanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception;
    
    /**
	 * comtnannvrsrymanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnannvrsrymanageVO
	 * @return 조회한 comtnannvrsrymanage
	 * @exception Exception
	 */
    ComtnannvrsrymanageVO selectComtnannvrsrymanage(ComtnannvrsrymanageVO vo) throws Exception;
    
    /**
	 * comtnannvrsrymanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnannvrsrymanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnannvrsrymanageList(ComtnannvrsrymanageVO vo) throws Exception;
    
    /**
	 * comtnannvrsrymanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnannvrsrymanage 총 갯수
	 * @exception
	 */
    int selectComtnannvrsrymanageListTotCnt(ComtnannvrsrymanageVO vo);
    
}
