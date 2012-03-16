package kr.godsoft.egovframe.generatorwebapp.comtnintnetsvc.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnintnetsvcService.java
 * @Description : Comtnintnetsvc Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnintnetsvcService {
	
	/**
	 * comtnintnetsvc을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnintnetsvcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception;
    
    /**
	 * comtnintnetsvc을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnintnetsvcVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception;
    
    /**
	 * comtnintnetsvc을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnintnetsvcVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception;
    
    /**
	 * comtnintnetsvc을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnintnetsvcVO
	 * @return 조회한 comtnintnetsvc
	 * @exception Exception
	 */
    ComtnintnetsvcVO selectComtnintnetsvc(ComtnintnetsvcVO vo) throws Exception;
    
    /**
	 * comtnintnetsvc 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnintnetsvc 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnintnetsvcList(ComtnintnetsvcVO vo) throws Exception;
    
    /**
	 * comtnintnetsvc 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnintnetsvc 총 갯수
	 * @exception
	 */
    int selectComtnintnetsvcListTotCnt(ComtnintnetsvcVO vo);
    
}
