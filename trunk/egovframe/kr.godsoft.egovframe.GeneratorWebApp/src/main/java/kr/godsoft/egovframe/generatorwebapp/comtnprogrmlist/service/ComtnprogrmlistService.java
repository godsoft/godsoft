package kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnprogrmlistService.java
 * @Description : Comtnprogrmlist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnprogrmlistService {
	
	/**
	 * comtnprogrmlist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprogrmlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception;
    
    /**
	 * comtnprogrmlist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception;
    
    /**
	 * comtnprogrmlist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception;
    
    /**
	 * comtnprogrmlist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprogrmlistVO
	 * @return 조회한 comtnprogrmlist
	 * @exception Exception
	 */
    ComtnprogrmlistVO selectComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception;
    
    /**
	 * comtnprogrmlist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprogrmlist 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnprogrmlistList(ComtnprogrmlistVO vo) throws Exception;
    
    /**
	 * comtnprogrmlist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprogrmlist 총 갯수
	 * @exception
	 */
    int selectComtnprogrmlistListTotCnt(ComtnprogrmlistVO vo);
    
}
