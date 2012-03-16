package kr.godsoft.egovframe.generatorwebapp.comtnmtginfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmtginfoService.java
 * @Description : Comtnmtginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmtginfoService {
	
	/**
	 * comtnmtginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmtginfo(ComtnmtginfoVO vo) throws Exception;
    
    /**
	 * comtnmtginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmtginfo(ComtnmtginfoVO vo) throws Exception;
    
    /**
	 * comtnmtginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmtginfo(ComtnmtginfoVO vo) throws Exception;
    
    /**
	 * comtnmtginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtginfoVO
	 * @return 조회한 comtnmtginfo
	 * @exception Exception
	 */
    ComtnmtginfoVO selectComtnmtginfo(ComtnmtginfoVO vo) throws Exception;
    
    /**
	 * comtnmtginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtginfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmtginfoList(ComtnmtginfoVO vo) throws Exception;
    
    /**
	 * comtnmtginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmtginfo 총 갯수
	 * @exception
	 */
    int selectComtnmtginfoListTotCnt(ComtnmtginfoVO vo);
    
}
