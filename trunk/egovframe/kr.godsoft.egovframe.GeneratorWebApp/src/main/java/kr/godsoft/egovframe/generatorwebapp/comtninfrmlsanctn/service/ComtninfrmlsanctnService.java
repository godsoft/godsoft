package kr.godsoft.egovframe.generatorwebapp.comtninfrmlsanctn.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtninfrmlsanctnService.java
 * @Description : Comtninfrmlsanctn Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtninfrmlsanctnService {
	
	/**
	 * COMTNINFRMLSANCTN을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * COMTNINFRMLSANCTN을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * COMTNINFRMLSANCTN을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * COMTNINFRMLSANCTN을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninfrmlsanctnVO
	 * @return 조회한 COMTNINFRMLSANCTN
	 * @exception Exception
	 */
    ComtninfrmlsanctnVO selectComtninfrmlsanctn(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * COMTNINFRMLSANCTN 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINFRMLSANCTN 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtninfrmlsanctnList(ComtninfrmlsanctnVO vo) throws Exception;
    
    /**
	 * COMTNINFRMLSANCTN 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINFRMLSANCTN 총 갯수
	 * @exception
	 */
    int selectComtninfrmlsanctnListTotCnt(ComtninfrmlsanctnVO vo);
    
}
