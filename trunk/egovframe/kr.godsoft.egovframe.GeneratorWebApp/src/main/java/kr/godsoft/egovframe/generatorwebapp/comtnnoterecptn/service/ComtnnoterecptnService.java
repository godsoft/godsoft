package kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnnoterecptn.service.ComtnnoterecptnVO;

/**
 * @Class Name : ComtnnoterecptnService.java
 * @Description : Comtnnoterecptn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnnoterecptnService {
	
	/**
	 * comtnnoterecptn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoterecptnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception;
    
    /**
	 * comtnnoterecptn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception;
    
    /**
	 * comtnnoterecptn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoterecptnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception;
    
    /**
	 * comtnnoterecptn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoterecptnVO
	 * @return 조회한 comtnnoterecptn
	 * @exception Exception
	 */
    ComtnnoterecptnVO selectComtnnoterecptn(ComtnnoterecptnVO vo) throws Exception;
    
    /**
	 * comtnnoterecptn 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnoterecptn 목록
	 * @exception Exception
	 */
    List selectComtnnoterecptnList(ComtnnoterecptnDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnnoterecptn 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnnoterecptn 총 갯수
	 * @exception
	 */
    int selectComtnnoterecptnListTotCnt(ComtnnoterecptnDefaultVO searchVO);
    
}
