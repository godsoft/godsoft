package kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnadministrationwordService.java
 * @Description : Comtnadministrationword Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnadministrationwordService {
	
	/**
	 * comtnadministrationword을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadministrationwordVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnadministrationword(ComtnadministrationwordVO vo) throws Exception;
    
    /**
	 * comtnadministrationword을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnadministrationword(ComtnadministrationwordVO vo) throws Exception;
    
    /**
	 * comtnadministrationword을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnadministrationword(ComtnadministrationwordVO vo) throws Exception;
    
    /**
	 * comtnadministrationword을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadministrationwordVO
	 * @return 조회한 comtnadministrationword
	 * @exception Exception
	 */
    ComtnadministrationwordVO selectComtnadministrationword(ComtnadministrationwordVO vo) throws Exception;
    
    /**
	 * comtnadministrationword 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadministrationword 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnadministrationwordList(ComtnadministrationwordVO vo) throws Exception;
    
    /**
	 * comtnadministrationword 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadministrationword 총 갯수
	 * @exception
	 */
    int selectComtnadministrationwordListTotCnt(ComtnadministrationwordVO vo);
    
}
