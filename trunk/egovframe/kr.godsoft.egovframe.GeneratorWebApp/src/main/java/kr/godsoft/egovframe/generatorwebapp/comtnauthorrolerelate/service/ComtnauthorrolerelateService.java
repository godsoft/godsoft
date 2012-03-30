package kr.godsoft.egovframe.generatorwebapp.comtnauthorrolerelate.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnauthorrolerelateService.java
 * @Description : Comtnauthorrolerelate Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnauthorrolerelateService {
	
	/**
	 * COMTNAUTHORROLERELATE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORROLERELATE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORROLERELATE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORROLERELATE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorrolerelateVO
	 * @return 조회한 COMTNAUTHORROLERELATE
	 * @exception Exception
	 */
    ComtnauthorrolerelateVO selectComtnauthorrolerelate(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORROLERELATE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORROLERELATE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnauthorrolerelateList(ComtnauthorrolerelateVO vo) throws Exception;
    
    /**
	 * COMTNAUTHORROLERELATE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNAUTHORROLERELATE 총 갯수
	 * @exception
	 */
    int selectComtnauthorrolerelateListTotCnt(ComtnauthorrolerelateVO vo);
    
}
