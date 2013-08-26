package kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnmemoreprtService.java
 * @Description : Comtnmemoreprt Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmemoreprtService {
	
	/**
	 * COMTNMEMOREPRT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemoreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * COMTNMEMOREPRT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * COMTNMEMOREPRT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * COMTNMEMOREPRT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemoreprtVO
	 * @return 조회한 COMTNMEMOREPRT
	 * @exception Exception
	 */
    ComtnmemoreprtVO selectComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * COMTNMEMOREPRT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMEMOREPRT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnmemoreprtList(ComtnmemoreprtVO vo) throws Exception;
    
    /**
	 * COMTNMEMOREPRT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMEMOREPRT 총 갯수
	 * @exception
	 */
    int selectComtnmemoreprtListTotCnt(ComtnmemoreprtVO vo);
    
}
