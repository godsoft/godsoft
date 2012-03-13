package kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlinfopolicy.service.ComtnindvdlinfopolicyVO;

/**
 * @Class Name : ComtnindvdlinfopolicyService.java
 * @Description : Comtnindvdlinfopolicy Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlinfopolicyService {
	
	/**
	 * comtnindvdlinfopolicy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * comtnindvdlinfopolicy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * comtnindvdlinfopolicy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * comtnindvdlinfopolicy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlinfopolicyVO
	 * @return 조회한 comtnindvdlinfopolicy
	 * @exception Exception
	 */
    ComtnindvdlinfopolicyVO selectComtnindvdlinfopolicy(ComtnindvdlinfopolicyVO vo) throws Exception;
    
    /**
	 * comtnindvdlinfopolicy 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlinfopolicy 목록
	 * @exception Exception
	 */
    List selectComtnindvdlinfopolicyList(ComtnindvdlinfopolicyDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnindvdlinfopolicy 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlinfopolicy 총 갯수
	 * @exception
	 */
    int selectComtnindvdlinfopolicyListTotCnt(ComtnindvdlinfopolicyDefaultVO searchVO);
    
}
