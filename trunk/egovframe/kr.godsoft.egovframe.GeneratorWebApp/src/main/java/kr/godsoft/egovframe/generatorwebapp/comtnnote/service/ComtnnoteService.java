package kr.godsoft.egovframe.generatorwebapp.comtnnote.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteVO;

/**
 * @Class Name : ComtnnoteService.java
 * @Description : Comtnnote Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnoteService {
	
	/**
	 * comtnnote을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoteVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * comtnnote을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoteVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * comtnnote을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoteVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * comtnnote을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoteVO
	 * @return 조회한 comtnnote
	 * @exception Exception
	 */
    ComtnnoteVO selectComtnnote(ComtnnoteVO vo) throws Exception;
    
    /**
	 * comtnnote 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnote 목록
	 * @exception Exception
	 */
    List selectComtnnoteList(ComtnnoteDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnnote 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnote 총 갯수
	 * @exception
	 */
    int selectComtnnoteListTotCnt(ComtnnoteDefaultVO searchVO);
    
}
