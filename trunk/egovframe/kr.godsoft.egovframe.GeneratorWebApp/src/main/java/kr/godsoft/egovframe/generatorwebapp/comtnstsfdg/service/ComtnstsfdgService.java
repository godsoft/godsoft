package kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnstsfdgService.java
 * @Description : Comtnstsfdg Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnstsfdgService {
	
	/**
	 * COMTNSTSFDG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstsfdgVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnstsfdg(ComtnstsfdgVO vo) throws Exception;
    
    /**
	 * COMTNSTSFDG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstsfdgVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnstsfdg(ComtnstsfdgVO vo) throws Exception;
    
    /**
	 * COMTNSTSFDG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstsfdgVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnstsfdg(ComtnstsfdgVO vo) throws Exception;
    
    /**
	 * COMTNSTSFDG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstsfdgVO
	 * @return 조회한 COMTNSTSFDG
	 * @exception Exception
	 */
    ComtnstsfdgVO selectComtnstsfdg(ComtnstsfdgVO vo) throws Exception;
    
    /**
	 * COMTNSTSFDG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTSFDG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnstsfdgList(ComtnstsfdgVO vo) throws Exception;
    
    /**
	 * COMTNSTSFDG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTSFDG 총 갯수
	 * @exception
	 */
    int selectComtnstsfdgListTotCnt(ComtnstsfdgVO vo);
    
}
