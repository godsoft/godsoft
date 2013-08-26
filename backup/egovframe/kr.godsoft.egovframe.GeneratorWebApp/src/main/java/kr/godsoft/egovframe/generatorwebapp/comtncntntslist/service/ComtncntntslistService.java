package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntntslistService.java
 * @Description : Comtncntntslist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntntslistService {
	
	/**
	 * COMTNCNTNTSLIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntntslistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * COMTNCNTNTSLIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntntslistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * COMTNCNTNTSLIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntntslistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * COMTNCNTNTSLIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntntslistVO
	 * @return 조회한 COMTNCNTNTSLIST
	 * @exception Exception
	 */
    ComtncntntslistVO selectComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * COMTNCNTNTSLIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTNTSLIST 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntntslistList(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * COMTNCNTNTSLIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTNTSLIST 총 갯수
	 * @exception
	 */
    int selectComtncntntslistListTotCnt(ComtncntntslistVO vo);
    
}
