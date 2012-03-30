package kr.godsoft.egovframe.generatorwebapp.comtntrsmrcvlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtntrsmrcvlogService.java
 * @Description : Comtntrsmrcvlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtntrsmrcvlogService {
	
	/**
	 * COMTNTRSMRCVLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtntrsmrcvlogVO
	 * @return 조회한 COMTNTRSMRCVLOG
	 * @exception Exception
	 */
    ComtntrsmrcvlogVO selectComtntrsmrcvlog(ComtntrsmrcvlogVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTRSMRCVLOG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtntrsmrcvlogList(ComtntrsmrcvlogVO vo) throws Exception;
    
    /**
	 * COMTNTRSMRCVLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNTRSMRCVLOG 총 갯수
	 * @exception
	 */
    int selectComtntrsmrcvlogListTotCnt(ComtntrsmrcvlogVO vo);
    
}
