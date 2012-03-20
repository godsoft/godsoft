package kr.godsoft.egovframe.generatorwebapp.comtnrss.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrssService.java
 * @Description : Comtnrss Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrssService {
	
	/**
	 * comtnrss을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrssVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrss(ComtnrssVO vo) throws Exception;
    
    /**
	 * comtnrss을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrssVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrss(ComtnrssVO vo) throws Exception;
    
    /**
	 * comtnrss을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrssVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrss(ComtnrssVO vo) throws Exception;
    
    /**
	 * comtnrss을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrssVO
	 * @return 조회한 comtnrss
	 * @exception Exception
	 */
    ComtnrssVO selectComtnrss(ComtnrssVO vo) throws Exception;
    
    /**
	 * comtnrss 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrss 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrssList(ComtnrssVO vo) throws Exception;
    
    /**
	 * comtnrss 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrss 총 갯수
	 * @exception
	 */
    int selectComtnrssListTotCnt(ComtnrssVO vo);
    
}
