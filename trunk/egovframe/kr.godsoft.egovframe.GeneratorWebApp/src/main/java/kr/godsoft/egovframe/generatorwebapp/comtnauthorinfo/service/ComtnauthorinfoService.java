package kr.godsoft.egovframe.generatorwebapp.comtnauthorinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnauthorinfoService.java
 * @Description : Comtnauthorinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnauthorinfoService {
	
	/**
	 * comtnauthorinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorinfoVO
	 * @return 조회한 comtnauthorinfo
	 * @exception Exception
	 */
    ComtnauthorinfoVO selectComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorinfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnauthorinfoList(ComtnauthorinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorinfo 총 갯수
	 * @exception
	 */
    int selectComtnauthorinfoListTotCnt(ComtnauthorinfoVO vo);
    
}
