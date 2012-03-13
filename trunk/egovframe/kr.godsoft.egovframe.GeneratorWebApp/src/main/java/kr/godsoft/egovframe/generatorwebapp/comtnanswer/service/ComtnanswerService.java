package kr.godsoft.egovframe.generatorwebapp.comtnanswer.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnanswer.service.ComtnanswerVO;

/**
 * @Class Name : ComtnanswerService.java
 * @Description : Comtnanswer Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnanswerService {
	
	/**
	 * comtnanswer을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnanswerVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * comtnanswer을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnanswerVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * comtnanswer을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnanswerVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * comtnanswer을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnanswerVO
	 * @return 조회한 comtnanswer
	 * @exception Exception
	 */
    ComtnanswerVO selectComtnanswer(ComtnanswerVO vo) throws Exception;
    
    /**
	 * comtnanswer 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnanswer 목록
	 * @exception Exception
	 */
    List selectComtnanswerList(ComtnanswerDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnanswer 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnanswer 총 갯수
	 * @exception
	 */
    int selectComtnanswerListTotCnt(ComtnanswerDefaultVO searchVO);
    
}
