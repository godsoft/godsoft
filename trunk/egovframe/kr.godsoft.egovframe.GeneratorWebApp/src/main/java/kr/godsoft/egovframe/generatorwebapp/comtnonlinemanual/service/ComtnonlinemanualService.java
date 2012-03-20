package kr.godsoft.egovframe.generatorwebapp.comtnonlinemanual.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnonlinemanualService.java
 * @Description : Comtnonlinemanual Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnonlinemanualService {
	
	/**
	 * comtnonlinemanual을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinemanualVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception;
    
    /**
	 * comtnonlinemanual을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception;
    
    /**
	 * comtnonlinemanual을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinemanualVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception;
    
    /**
	 * comtnonlinemanual을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinemanualVO
	 * @return 조회한 comtnonlinemanual
	 * @exception Exception
	 */
    ComtnonlinemanualVO selectComtnonlinemanual(ComtnonlinemanualVO vo) throws Exception;
    
    /**
	 * comtnonlinemanual 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinemanual 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnonlinemanualList(ComtnonlinemanualVO vo) throws Exception;
    
    /**
	 * comtnonlinemanual 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnonlinemanual 총 갯수
	 * @exception
	 */
    int selectComtnonlinemanualListTotCnt(ComtnonlinemanualVO vo);
    
}
