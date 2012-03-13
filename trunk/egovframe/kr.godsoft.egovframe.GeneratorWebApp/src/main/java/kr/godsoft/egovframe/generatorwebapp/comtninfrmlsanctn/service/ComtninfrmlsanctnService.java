package kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service.ComtninfrmlsanctnVO;

/**
 * @Class Name : ComtninfrmlsanctnService.java
 * @Description : Comtninfrmlsanctn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtninfrmlsanctnService {
	
	/**
	 * comtninfrmlsanctn을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * comtninfrmlsanctn을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * comtninfrmlsanctn을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * comtninfrmlsanctn을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 조회한 comtninfrmlsanctn
	 * @exception Exception
	 */
    ComtninfrmlsanctnVO selectComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * comtninfrmlsanctn 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninfrmlsanctn 목록
	 * @exception Exception
	 */
    List selectComtninfrmlsanctnList(ComtninfrmlsanctnDefaultVO searchVO) throws Exception;
    
    /**
	 * comtninfrmlsanctn 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninfrmlsanctn 총 갯수
	 * @exception
	 */
    int selectComtninfrmlsanctnListTotCnt(ComtninfrmlsanctnDefaultVO searchVO);
    
}