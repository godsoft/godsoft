package kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresVO;

/**
 * @Class Name : ComtndamcalresService.java
 * @Description : Comtndamcalres Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndamcalresService {
	
	/**
	 * comtndamcalres을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamcalresVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndamcalres(ComtndamcalresVO vo) throws Exception;
    
    /**
	 * comtndamcalres을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamcalresVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndamcalres(ComtndamcalresVO vo) throws Exception;
    
    /**
	 * comtndamcalres을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamcalresVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndamcalres(ComtndamcalresVO vo) throws Exception;
    
    /**
	 * comtndamcalres을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamcalresVO
	 * @return 조회한 comtndamcalres
	 * @exception Exception
	 */
    ComtndamcalresVO selectComtndamcalres(ComtndamcalresVO vo) throws Exception;
    
    /**
	 * comtndamcalres 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamcalres 목록
	 * @exception Exception
	 */
    List selectComtndamcalresList(ComtndamcalresDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndamcalres 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamcalres 총 갯수
	 * @exception
	 */
    int selectComtndamcalresListTotCnt(ComtndamcalresDefaultVO searchVO);
    
}
