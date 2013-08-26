package kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncpyrhtinfoService.java
 * @Description : Comtncpyrhtinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncpyrhtinfoService {
	
	/**
	 * COMTNCPYRHTINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception;
    
    /**
	 * COMTNCPYRHTINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception;
    
    /**
	 * COMTNCPYRHTINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception;
    
    /**
	 * COMTNCPYRHTINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 조회한 COMTNCPYRHTINFO
	 * @exception Exception
	 */
    ComtncpyrhtinfoVO selectComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception;
    
    /**
	 * COMTNCPYRHTINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCPYRHTINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncpyrhtinfoList(ComtncpyrhtinfoVO vo) throws Exception;
    
    /**
	 * COMTNCPYRHTINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCPYRHTINFO 총 갯수
	 * @exception
	 */
    int selectComtncpyrhtinfoListTotCnt(ComtncpyrhtinfoVO vo);
    
}