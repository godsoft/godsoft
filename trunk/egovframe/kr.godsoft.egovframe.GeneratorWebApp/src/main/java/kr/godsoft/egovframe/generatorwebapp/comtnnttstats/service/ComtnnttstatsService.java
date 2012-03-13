package kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnttstats.service.ComtnnttstatsVO;

/**
 * @Class Name : ComtnnttstatsService.java
 * @Description : Comtnnttstats Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnttstatsService {
	
	/**
	 * comtnnttstats을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnttstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnttstats(ComtnnttstatsVO vo) throws Exception;
    
    /**
	 * comtnnttstats을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnttstatsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnttstats(ComtnnttstatsVO vo) throws Exception;
    
    /**
	 * comtnnttstats을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnttstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnttstats(ComtnnttstatsVO vo) throws Exception;
    
    /**
	 * comtnnttstats을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnttstatsVO
	 * @return 조회한 comtnnttstats
	 * @exception Exception
	 */
    ComtnnttstatsVO selectComtnnttstats(ComtnnttstatsVO vo) throws Exception;
    
    /**
	 * comtnnttstats 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnttstats 목록
	 * @exception Exception
	 */
    List selectComtnnttstatsList(ComtnnttstatsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnnttstats 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnttstats 총 갯수
	 * @exception
	 */
    int selectComtnnttstatsListTotCnt(ComtnnttstatsDefaultVO searchVO);
    
}