package kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsystemcntcService.java
 * @Description : Comtnsystemcntc Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsystemcntcService {
	
	/**
	 * COMTNSYSTEMCNTC을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsystemcntcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * COMTNSYSTEMCNTC을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * COMTNSYSTEMCNTC을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * COMTNSYSTEMCNTC을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsystemcntcVO
	 * @return 조회한 COMTNSYSTEMCNTC
	 * @exception Exception
	 */
    ComtnsystemcntcVO selectComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * COMTNSYSTEMCNTC 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSYSTEMCNTC 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsystemcntcList(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * COMTNSYSTEMCNTC 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSYSTEMCNTC 총 갯수
	 * @exception
	 */
    int selectComtnsystemcntcListTotCnt(ComtnsystemcntcVO vo);
    
}
