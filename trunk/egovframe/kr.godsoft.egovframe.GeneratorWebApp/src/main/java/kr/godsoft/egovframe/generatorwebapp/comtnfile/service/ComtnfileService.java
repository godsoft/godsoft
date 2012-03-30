package kr.godsoft.egovframe.generatorwebapp.comtnfile.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfileService.java
 * @Description : Comtnfile Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfileService {
	
	/**
	 * COMTNFILE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfileVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfile(ComtnfileVO vo) throws Exception;
    
    /**
	 * COMTNFILE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfileVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfile(ComtnfileVO vo) throws Exception;
    
    /**
	 * COMTNFILE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfileVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfile(ComtnfileVO vo) throws Exception;
    
    /**
	 * COMTNFILE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfileVO
	 * @return 조회한 COMTNFILE
	 * @exception Exception
	 */
    ComtnfileVO selectComtnfile(ComtnfileVO vo) throws Exception;
    
    /**
	 * COMTNFILE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfileList(ComtnfileVO vo) throws Exception;
    
    /**
	 * COMTNFILE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILE 총 갯수
	 * @exception
	 */
    int selectComtnfileListTotCnt(ComtnfileVO vo);
    
}
