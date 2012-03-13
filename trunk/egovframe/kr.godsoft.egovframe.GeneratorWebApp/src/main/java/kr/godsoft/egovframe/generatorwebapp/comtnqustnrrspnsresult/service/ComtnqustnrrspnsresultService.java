package kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrrspnsresult.service.ComtnqustnrrspnsresultVO;

/**
 * @Class Name : ComtnqustnrrspnsresultService.java
 * @Description : Comtnqustnrrspnsresult Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrrspnsresultService {
	
	/**
	 * comtnqustnrrspnsresult을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * comtnqustnrrspnsresult을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * comtnqustnrrspnsresult을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * comtnqustnrrspnsresult을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrrspnsresultVO
	 * @return 조회한 comtnqustnrrspnsresult
	 * @exception Exception
	 */
    ComtnqustnrrspnsresultVO selectComtnqustnrrspnsresult(ComtnqustnrrspnsresultVO vo) throws Exception;
    
    /**
	 * comtnqustnrrspnsresult 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrrspnsresult 목록
	 * @exception Exception
	 */
    List selectComtnqustnrrspnsresultList(ComtnqustnrrspnsresultDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnqustnrrspnsresult 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrrspnsresult 총 갯수
	 * @exception
	 */
    int selectComtnqustnrrspnsresultListTotCnt(ComtnqustnrrspnsresultDefaultVO searchVO);
    
}
