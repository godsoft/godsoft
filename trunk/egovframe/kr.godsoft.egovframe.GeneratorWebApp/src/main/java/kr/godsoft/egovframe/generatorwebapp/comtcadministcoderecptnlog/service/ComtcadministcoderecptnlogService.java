package kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtcadministcoderecptnlogService.java
 * @Description : Comtcadministcoderecptnlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtcadministcoderecptnlogService {
	
	/**
	 * COMTCADMINISTCODERECPTNLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTCADMINISTCODERECPTNLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTCADMINISTCODERECPTNLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTCADMINISTCODERECPTNLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 조회한 COMTCADMINISTCODERECPTNLOG
	 * @exception Exception
	 */
    ComtcadministcoderecptnlogVO selectComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTCADMINISTCODERECPTNLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCADMINISTCODERECPTNLOG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtcadministcoderecptnlogList(ComtcadministcoderecptnlogVO vo) throws Exception;
    
    /**
	 * COMTCADMINISTCODERECPTNLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTCADMINISTCODERECPTNLOG 총 갯수
	 * @exception
	 */
    int selectComtcadministcoderecptnlogListTotCnt(ComtcadministcoderecptnlogVO vo);
    
}
