package kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntcmessageitemService.java
 * @Description : Comtncntcmessageitem Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntcmessageitemService {
	
	/**
	 * COMTNCNTCMESSAGEITEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception;
    
    /**
	 * COMTNCNTCMESSAGEITEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception;
    
    /**
	 * COMTNCNTCMESSAGEITEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception;
    
    /**
	 * COMTNCNTCMESSAGEITEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 조회한 COMTNCNTCMESSAGEITEM
	 * @exception Exception
	 */
    ComtncntcmessageitemVO selectComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception;
    
    /**
	 * COMTNCNTCMESSAGEITEM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCMESSAGEITEM 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntcmessageitemList(ComtncntcmessageitemVO vo) throws Exception;
    
    /**
	 * COMTNCNTCMESSAGEITEM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTCMESSAGEITEM 총 갯수
	 * @exception
	 */
    int selectComtncntcmessageitemListTotCnt(ComtncntcmessageitemVO vo);
    
}