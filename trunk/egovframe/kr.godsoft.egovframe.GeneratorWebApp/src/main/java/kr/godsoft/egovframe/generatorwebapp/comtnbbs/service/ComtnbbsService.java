package kr.godsoft.egovframe.generatorwebapp.comtnbbs.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbbs.service.ComtnbbsVO;

/**
 * @Class Name : ComtnbbsService.java
 * @Description : Comtnbbs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbbsService {
	
	/**
	 * comtnbbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * comtnbbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * comtnbbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * comtnbbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsVO
	 * @return 조회한 comtnbbs
	 * @exception Exception
	 */
    ComtnbbsVO selectComtnbbs(ComtnbbsVO vo) throws Exception;
    
    /**
	 * comtnbbs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbs 목록
	 * @exception Exception
	 */
    List selectComtnbbsList(ComtnbbsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbbs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbs 총 갯수
	 * @exception
	 */
    int selectComtnbbsListTotCnt(ComtnbbsDefaultVO searchVO);
    
}
