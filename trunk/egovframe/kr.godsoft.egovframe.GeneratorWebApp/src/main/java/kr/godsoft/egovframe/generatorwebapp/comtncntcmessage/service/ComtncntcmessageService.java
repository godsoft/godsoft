package kr.godsoft.egovframe.generatorwebapp.comtncntcmessage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncntcmessageService.java
 * @Description : Comtncntcmessage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntcmessageService {
	
	/**
	 * comtncntcmessage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntcmessage(ComtncntcmessageVO vo) throws Exception;
    
    /**
	 * comtncntcmessage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntcmessage(ComtncntcmessageVO vo) throws Exception;
    
    /**
	 * comtncntcmessage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntcmessage(ComtncntcmessageVO vo) throws Exception;
    
    /**
	 * comtncntcmessage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageVO
	 * @return 조회한 comtncntcmessage
	 * @exception Exception
	 */
    ComtncntcmessageVO selectComtncntcmessage(ComtncntcmessageVO vo) throws Exception;
    
    /**
	 * comtncntcmessage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncntcmessageList(ComtncntcmessageVO vo) throws Exception;
    
    /**
	 * comtncntcmessage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessage 총 갯수
	 * @exception
	 */
    int selectComtncntcmessageListTotCnt(ComtncntcmessageVO vo);
    
}
