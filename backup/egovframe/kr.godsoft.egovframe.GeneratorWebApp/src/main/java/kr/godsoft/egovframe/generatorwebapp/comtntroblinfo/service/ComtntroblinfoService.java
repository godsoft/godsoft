package kr.godsoft.egovframe.generatorwebapp.comtntroblinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtntroblinfoService.java
 * @Description : Comtntroblinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntroblinfoService {
	
	/**
	 * COMTNTROBLINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntroblinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * COMTNTROBLINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntroblinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * COMTNTROBLINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntroblinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * COMTNTROBLINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntroblinfoVO
	 * @return 조회한 COMTNTROBLINFO
	 * @exception Exception
	 */
    ComtntroblinfoVO selectComtntroblinfo(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * COMTNTROBLINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTROBLINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtntroblinfoList(ComtntroblinfoVO vo) throws Exception;
    
    /**
	 * COMTNTROBLINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTROBLINFO 총 갯수
	 * @exception
	 */
    int selectComtntroblinfoListTotCnt(ComtntroblinfoVO vo);
    
}
