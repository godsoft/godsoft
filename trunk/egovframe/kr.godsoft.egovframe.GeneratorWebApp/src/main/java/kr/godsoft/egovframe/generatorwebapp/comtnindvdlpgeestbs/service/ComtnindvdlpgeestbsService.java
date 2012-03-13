package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsVO;

/**
 * @Class Name : ComtnindvdlpgeestbsService.java
 * @Description : Comtnindvdlpgeestbs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnindvdlpgeestbsService {
	
	/**
	 * comtnindvdlpgeestbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgeestbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgeestbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgeestbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 조회한 comtnindvdlpgeestbs
	 * @exception Exception
	 */
    ComtnindvdlpgeestbsVO selectComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception;
    
    /**
	 * comtnindvdlpgeestbs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgeestbs 목록
	 * @exception Exception
	 */
    List selectComtnindvdlpgeestbsList(ComtnindvdlpgeestbsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnindvdlpgeestbs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgeestbs 총 갯수
	 * @exception
	 */
    int selectComtnindvdlpgeestbsListTotCnt(ComtnindvdlpgeestbsDefaultVO searchVO);
    
}
