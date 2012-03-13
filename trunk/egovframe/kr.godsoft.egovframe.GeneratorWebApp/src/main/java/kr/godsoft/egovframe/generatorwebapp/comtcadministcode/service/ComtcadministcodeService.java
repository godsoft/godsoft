package kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcode.service.ComtcadministcodeVO;

/**
 * @Class Name : ComtcadministcodeService.java
 * @Description : Comtcadministcode Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtcadministcodeService {
	
	/**
	 * comtcadministcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtcadministcode(ComtcadministcodeVO vo) throws Exception;
    
    /**
	 * comtcadministcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtcadministcode(ComtcadministcodeVO vo) throws Exception;
    
    /**
	 * comtcadministcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtcadministcode(ComtcadministcodeVO vo) throws Exception;
    
    /**
	 * comtcadministcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcodeVO
	 * @return 조회한 comtcadministcode
	 * @exception Exception
	 */
    ComtcadministcodeVO selectComtcadministcode(ComtcadministcodeVO vo) throws Exception;
    
    /**
	 * comtcadministcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtcadministcode 목록
	 * @exception Exception
	 */
    List selectComtcadministcodeList(ComtcadministcodeDefaultVO searchVO) throws Exception;
    
    /**
	 * comtcadministcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtcadministcode 총 갯수
	 * @exception
	 */
    int selectComtcadministcodeListTotCnt(ComtcadministcodeDefaultVO searchVO);
    
}