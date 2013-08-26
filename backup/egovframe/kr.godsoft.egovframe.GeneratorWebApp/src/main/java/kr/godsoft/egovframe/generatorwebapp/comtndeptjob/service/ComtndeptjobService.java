package kr.godsoft.egovframe.generatorwebapp.comtndeptjob.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndeptjobService.java
 * @Description : Comtndeptjob Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndeptjobService {
	
	/**
	 * COMTNDEPTJOB을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndeptjobVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndeptjob(ComtndeptjobVO vo) throws Exception;
    
    /**
	 * COMTNDEPTJOB을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndeptjobVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndeptjob(ComtndeptjobVO vo) throws Exception;
    
    /**
	 * COMTNDEPTJOB을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndeptjobVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndeptjob(ComtndeptjobVO vo) throws Exception;
    
    /**
	 * COMTNDEPTJOB을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndeptjobVO
	 * @return 조회한 COMTNDEPTJOB
	 * @exception Exception
	 */
    ComtndeptjobVO selectComtndeptjob(ComtndeptjobVO vo) throws Exception;
    
    /**
	 * COMTNDEPTJOB 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDEPTJOB 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndeptjobList(ComtndeptjobVO vo) throws Exception;
    
    /**
	 * COMTNDEPTJOB 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDEPTJOB 총 갯수
	 * @exception
	 */
    int selectComtndeptjobListTotCnt(ComtndeptjobVO vo);
    
}
