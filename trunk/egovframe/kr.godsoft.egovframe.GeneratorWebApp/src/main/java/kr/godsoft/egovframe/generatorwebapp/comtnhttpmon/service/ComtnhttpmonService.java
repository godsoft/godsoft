package kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnhttpmon.service.ComtnhttpmonVO;

/**
 * @Class Name : ComtnhttpmonService.java
 * @Description : Comtnhttpmon Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnhttpmonService {
	
	/**
	 * comtnhttpmon을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnhttpmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnhttpmon(ComtnhttpmonVO vo) throws Exception;
    
    /**
	 * comtnhttpmon을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnhttpmonVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnhttpmon(ComtnhttpmonVO vo) throws Exception;
    
    /**
	 * comtnhttpmon을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnhttpmonVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnhttpmon(ComtnhttpmonVO vo) throws Exception;
    
    /**
	 * comtnhttpmon을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnhttpmonVO
	 * @return 조회한 comtnhttpmon
	 * @exception Exception
	 */
    ComtnhttpmonVO selectComtnhttpmon(ComtnhttpmonVO vo) throws Exception;
    
    /**
	 * comtnhttpmon 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhttpmon 목록
	 * @exception Exception
	 */
    List selectComtnhttpmonList(ComtnhttpmonDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnhttpmon 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnhttpmon 총 갯수
	 * @exception
	 */
    int selectComtnhttpmonListTotCnt(ComtnhttpmonDefaultVO searchVO);
    
}
