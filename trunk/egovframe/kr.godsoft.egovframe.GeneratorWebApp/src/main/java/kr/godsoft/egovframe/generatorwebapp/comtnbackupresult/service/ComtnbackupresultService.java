package kr.godsoft.egovframe.generatorwebapp.comtnbackupresult.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnbackupresultService.java
 * @Description : Comtnbackupresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbackupresultService {
	
	/**
	 * comtnbackupresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbackupresult(ComtnbackupresultVO vo) throws Exception;
    
    /**
	 * comtnbackupresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbackupresult(ComtnbackupresultVO vo) throws Exception;
    
    /**
	 * comtnbackupresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbackupresult(ComtnbackupresultVO vo) throws Exception;
    
    /**
	 * comtnbackupresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupresultVO
	 * @return 조회한 comtnbackupresult
	 * @exception Exception
	 */
    ComtnbackupresultVO selectComtnbackupresult(ComtnbackupresultVO vo) throws Exception;
    
    /**
	 * comtnbackupresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupresult 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnbackupresultList(ComtnbackupresultVO vo) throws Exception;
    
    /**
	 * comtnbackupresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupresult 총 갯수
	 * @exception
	 */
    int selectComtnbackupresultListTotCnt(ComtnbackupresultVO vo);
    
}
