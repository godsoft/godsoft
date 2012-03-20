package kr.godsoft.egovframe.generatorwebapp.comtnntfcinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnntfcinfoService.java
 * @Description : Comtnntfcinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnntfcinfoService {
	
	/**
	 * comtnntfcinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntfcinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception;
    
    /**
	 * comtnntfcinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception;
    
    /**
	 * comtnntfcinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntfcinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception;
    
    /**
	 * comtnntfcinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntfcinfoVO
	 * @return 조회한 comtnntfcinfo
	 * @exception Exception
	 */
    ComtnntfcinfoVO selectComtnntfcinfo(ComtnntfcinfoVO vo) throws Exception;
    
    /**
	 * comtnntfcinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntfcinfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnntfcinfoList(ComtnntfcinfoVO vo) throws Exception;
    
    /**
	 * comtnntfcinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntfcinfo 총 갯수
	 * @exception
	 */
    int selectComtnntfcinfoListTotCnt(ComtnntfcinfoVO vo);
    
}
