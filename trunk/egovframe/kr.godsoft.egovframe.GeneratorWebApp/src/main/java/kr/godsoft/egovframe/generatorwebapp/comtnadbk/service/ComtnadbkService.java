package kr.godsoft.egovframe.generatorwebapp.comtnadbk.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbk.service.ComtnadbkVO;

/**
 * @Class Name : ComtnadbkService.java
 * @Description : Comtnadbk Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnadbkService {
	
	/**
	 * comtnadbk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnadbk(ComtnadbkVO vo) throws Exception;
    
    /**
	 * comtnadbk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnadbk(ComtnadbkVO vo) throws Exception;
    
    /**
	 * comtnadbk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnadbk(ComtnadbkVO vo) throws Exception;
    
    /**
	 * comtnadbk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkVO
	 * @return 조회한 comtnadbk
	 * @exception Exception
	 */
    ComtnadbkVO selectComtnadbk(ComtnadbkVO vo) throws Exception;
    
    /**
	 * comtnadbk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbk 목록
	 * @exception Exception
	 */
    List selectComtnadbkList(ComtnadbkDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnadbk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbk 총 갯수
	 * @exception
	 */
    int selectComtnadbkListTotCnt(ComtnadbkDefaultVO searchVO);
    
}
