package kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncnsltlistService.java
 * @Description : Comtncnsltlist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncnsltlistService {
	
	/**
	 * COMTNCNSLTLIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncnsltlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncnsltlist(ComtncnsltlistVO vo) throws Exception;
    
    /**
	 * COMTNCNSLTLIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncnsltlistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncnsltlist(ComtncnsltlistVO vo) throws Exception;
    
    /**
	 * COMTNCNSLTLIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncnsltlistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncnsltlist(ComtncnsltlistVO vo) throws Exception;
    
    /**
	 * COMTNCNSLTLIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncnsltlistVO
	 * @return 조회한 COMTNCNSLTLIST
	 * @exception Exception
	 */
    ComtncnsltlistVO selectComtncnsltlist(ComtncnsltlistVO vo) throws Exception;
    
    /**
	 * COMTNCNSLTLIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNSLTLIST 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncnsltlistList(ComtncnsltlistVO vo) throws Exception;
    
    /**
	 * COMTNCNSLTLIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNSLTLIST 총 갯수
	 * @exception
	 */
    int selectComtncnsltlistListTotCnt(ComtncnsltlistVO vo);
    
}
