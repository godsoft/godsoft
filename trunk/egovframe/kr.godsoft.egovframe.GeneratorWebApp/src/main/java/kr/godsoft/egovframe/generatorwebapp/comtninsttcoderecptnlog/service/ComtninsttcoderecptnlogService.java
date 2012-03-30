package kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtninsttcoderecptnlogService.java
 * @Description : Comtninsttcoderecptnlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtninsttcoderecptnlogService {
	
	/**
	 * COMTNINSTTCODERECPTNLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTNINSTTCODERECPTNLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTNINSTTCODERECPTNLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTNINSTTCODERECPTNLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 조회한 COMTNINSTTCODERECPTNLOG
	 * @exception Exception
	 */
    ComtninsttcoderecptnlogVO selectComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTNINSTTCODERECPTNLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINSTTCODERECPTNLOG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtninsttcoderecptnlogList(ComtninsttcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTNINSTTCODERECPTNLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINSTTCODERECPTNLOG 총 갯수
	 * @exception
	 */
    int selectComtninsttcoderecptnlogListTotCnt(ComtninsttcoderecptnlogVO vo);
    
}
