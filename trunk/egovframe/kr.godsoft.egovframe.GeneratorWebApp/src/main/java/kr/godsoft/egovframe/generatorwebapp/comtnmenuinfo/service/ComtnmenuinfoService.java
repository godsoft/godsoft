package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmenuinfoService.java
 * @Description : Comtnmenuinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmenuinfoService {
	
	/**
	 * COMTNMENUINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenuinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * COMTNMENUINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * COMTNMENUINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * COMTNMENUINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenuinfoVO
	 * @return 조회한 COMTNMENUINFO
	 * @exception Exception
	 */
    ComtnmenuinfoVO selectComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * COMTNMENUINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmenuinfoList(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * COMTNMENUINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUINFO 총 갯수
	 * @exception
	 */
    int selectComtnmenuinfoListTotCnt(ComtnmenuinfoVO vo);
    
}
