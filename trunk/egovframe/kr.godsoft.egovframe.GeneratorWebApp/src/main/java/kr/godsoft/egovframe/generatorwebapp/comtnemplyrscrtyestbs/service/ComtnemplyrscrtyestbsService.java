package kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsVO;

/**
 * @Class Name : ComtnemplyrscrtyestbsService.java
 * @Description : Comtnemplyrscrtyestbs Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnemplyrscrtyestbsService {
	
	/**
	 * comtnemplyrscrtyestbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception;
    
    /**
	 * comtnemplyrscrtyestbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception;
    
    /**
	 * comtnemplyrscrtyestbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception;
    
    /**
	 * comtnemplyrscrtyestbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 조회한 comtnemplyrscrtyestbs
	 * @exception Exception
	 */
    ComtnemplyrscrtyestbsVO selectComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception;
    
    /**
	 * comtnemplyrscrtyestbs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnemplyrscrtyestbs 목록
	 * @exception Exception
	 */
    List selectComtnemplyrscrtyestbsList(ComtnemplyrscrtyestbsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnemplyrscrtyestbs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnemplyrscrtyestbs 총 갯수
	 * @exception
	 */
    int selectComtnemplyrscrtyestbsListTotCnt(ComtnemplyrscrtyestbsDefaultVO searchVO);
    
}
