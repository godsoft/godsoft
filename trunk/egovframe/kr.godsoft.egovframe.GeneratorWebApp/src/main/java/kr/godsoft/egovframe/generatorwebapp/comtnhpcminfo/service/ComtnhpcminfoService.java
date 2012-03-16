package kr.godsoft.egovframe.generatorwebapp.comtnhpcminfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnhpcminfoService.java
 * @Description : Comtnhpcminfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnhpcminfoService {
	
	/**
	 * comtnhpcminfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhpcminfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception;
    
    /**
	 * comtnhpcminfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception;
    
    /**
	 * comtnhpcminfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhpcminfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception;
    
    /**
	 * comtnhpcminfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhpcminfoVO
	 * @return 조회한 comtnhpcminfo
	 * @exception Exception
	 */
    ComtnhpcminfoVO selectComtnhpcminfo(ComtnhpcminfoVO vo) throws Exception;
    
    /**
	 * comtnhpcminfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhpcminfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnhpcminfoList(ComtnhpcminfoVO vo) throws Exception;
    
    /**
	 * comtnhpcminfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhpcminfo 총 갯수
	 * @exception
	 */
    int selectComtnhpcminfoListTotCnt(ComtnhpcminfoVO vo);
    
}
