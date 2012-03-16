package kr.godsoft.egovframe.generatorwebapp.comtnsystemcntc.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsystemcntcService.java
 * @Description : Comtnsystemcntc Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsystemcntcService {
	
	/**
	 * comtnsystemcntc을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsystemcntcVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * comtnsystemcntc을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * comtnsystemcntc을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsystemcntcVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * comtnsystemcntc을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsystemcntcVO
	 * @return 조회한 comtnsystemcntc
	 * @exception Exception
	 */
    ComtnsystemcntcVO selectComtnsystemcntc(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * comtnsystemcntc 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsystemcntc 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnsystemcntcList(ComtnsystemcntcVO vo) throws Exception;
    
    /**
	 * comtnsystemcntc 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsystemcntc 총 갯수
	 * @exception
	 */
    int selectComtnsystemcntcListTotCnt(ComtnsystemcntcVO vo);
    
}
