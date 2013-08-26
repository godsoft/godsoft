package kr.godsoft.egovframe.generatorwebapp.comtczip.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtczipService.java
 * @Description : Comtczip Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtczipService {
	
	/**
	 * COMTCZIP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtczipVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtczip(ComtczipVO vo) throws Exception;
    
    /**
	 * COMTCZIP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtczipVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtczip(ComtczipVO vo) throws Exception;
    
    /**
	 * COMTCZIP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtczipVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtczip(ComtczipVO vo) throws Exception;
    
    /**
	 * COMTCZIP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtczipVO
	 * @return 조회한 COMTCZIP
	 * @exception Exception
	 */
    ComtczipVO selectComtczip(ComtczipVO vo) throws Exception;
    
    /**
	 * COMTCZIP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCZIP 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtczipList(ComtczipVO vo) throws Exception;
    
    /**
	 * COMTCZIP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCZIP 총 갯수
	 * @exception
	 */
    int selectComtczipListTotCnt(ComtczipVO vo);
    
}
