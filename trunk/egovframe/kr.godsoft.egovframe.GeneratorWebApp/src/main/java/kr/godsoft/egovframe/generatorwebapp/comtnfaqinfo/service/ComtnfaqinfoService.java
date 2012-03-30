package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfaqinfoService.java
 * @Description : Comtnfaqinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfaqinfoService {
	
	/**
	 * COMTNFAQINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfaqinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * COMTNFAQINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * COMTNFAQINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * COMTNFAQINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfaqinfoVO
	 * @return 조회한 COMTNFAQINFO
	 * @exception Exception
	 */
    ComtnfaqinfoVO selectComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * COMTNFAQINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFAQINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfaqinfoList(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * COMTNFAQINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFAQINFO 총 갯수
	 * @exception
	 */
    int selectComtnfaqinfoListTotCnt(ComtnfaqinfoVO vo);
    
}
