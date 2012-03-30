package kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtngnrlmberService.java
 * @Description : Comtngnrlmber Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtngnrlmberService {
	
	/**
	 * COMTNGNRLMBER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtngnrlmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtngnrlmber(ComtngnrlmberVO vo) throws Exception;
    
    /**
	 * COMTNGNRLMBER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtngnrlmberVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtngnrlmber(ComtngnrlmberVO vo) throws Exception;
    
    /**
	 * COMTNGNRLMBER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtngnrlmberVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtngnrlmber(ComtngnrlmberVO vo) throws Exception;
    
    /**
	 * COMTNGNRLMBER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtngnrlmberVO
	 * @return 조회한 COMTNGNRLMBER
	 * @exception Exception
	 */
    ComtngnrlmberVO selectComtngnrlmber(ComtngnrlmberVO vo) throws Exception;
    
    /**
	 * COMTNGNRLMBER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNGNRLMBER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtngnrlmberList(ComtngnrlmberVO vo) throws Exception;
    
    /**
	 * COMTNGNRLMBER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNGNRLMBER 총 갯수
	 * @exception
	 */
    int selectComtngnrlmberListTotCnt(ComtngnrlmberVO vo);
    
}
