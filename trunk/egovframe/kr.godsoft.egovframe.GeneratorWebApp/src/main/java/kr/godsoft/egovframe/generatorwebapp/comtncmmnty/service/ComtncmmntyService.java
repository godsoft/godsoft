package kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncmmnty.service.ComtncmmntyVO;

/**
 * @Class Name : ComtncmmntyService.java
 * @Description : Comtncmmnty Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncmmntyService {
	
	/**
	 * comtncmmnty을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncmmnty(ComtncmmntyVO vo) throws Exception;
    
    /**
	 * comtncmmnty을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncmmnty(ComtncmmntyVO vo) throws Exception;
    
    /**
	 * comtncmmnty을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncmmnty(ComtncmmntyVO vo) throws Exception;
    
    /**
	 * comtncmmnty을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyVO
	 * @return 조회한 comtncmmnty
	 * @exception Exception
	 */
    ComtncmmntyVO selectComtncmmnty(ComtncmmntyVO vo) throws Exception;
    
    /**
	 * comtncmmnty 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmnty 목록
	 * @exception Exception
	 */
    List selectComtncmmntyList(ComtncmmntyDefaultVO searchVO) throws Exception;
    
    /**
	 * comtncmmnty 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmnty 총 갯수
	 * @exception
	 */
    int selectComtncmmntyListTotCnt(ComtncmmntyDefaultVO searchVO);
    
}
