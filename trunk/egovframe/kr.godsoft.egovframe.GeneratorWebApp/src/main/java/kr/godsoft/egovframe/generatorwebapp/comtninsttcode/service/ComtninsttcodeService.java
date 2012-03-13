package kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeVO;

/**
 * @Class Name : ComtninsttcodeService.java
 * @Description : Comtninsttcode Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtninsttcodeService {
	
	/**
	 * comtninsttcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtninsttcode(ComtninsttcodeVO vo) throws Exception;
    
    /**
	 * comtninsttcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtninsttcode(ComtninsttcodeVO vo) throws Exception;
    
    /**
	 * comtninsttcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtninsttcode(ComtninsttcodeVO vo) throws Exception;
    
    /**
	 * comtninsttcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcodeVO
	 * @return 조회한 comtninsttcode
	 * @exception Exception
	 */
    ComtninsttcodeVO selectComtninsttcode(ComtninsttcodeVO vo) throws Exception;
    
    /**
	 * comtninsttcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninsttcode 목록
	 * @exception Exception
	 */
    List selectComtninsttcodeList(ComtninsttcodeDefaultVO searchVO) throws Exception;
    
    /**
	 * comtninsttcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninsttcode 총 갯수
	 * @exception
	 */
    int selectComtninsttcodeListTotCnt(ComtninsttcodeDefaultVO searchVO);
    
}
