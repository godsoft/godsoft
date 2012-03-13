package kr.godsoft.egovframe.generatorwebapp.comtnsms.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsms.service.ComtnsmsVO;

/**
 * @Class Name : ComtnsmsService.java
 * @Description : Comtnsms Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsmsService {
	
	/**
	 * comtnsms을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsmsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * comtnsms을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsmsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * comtnsms을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsmsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * comtnsms을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsmsVO
	 * @return 조회한 comtnsms
	 * @exception Exception
	 */
    ComtnsmsVO selectComtnsms(ComtnsmsVO vo) throws Exception;
    
    /**
	 * comtnsms 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsms 목록
	 * @exception Exception
	 */
    List selectComtnsmsList(ComtnsmsDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnsms 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsms 총 갯수
	 * @exception
	 */
    int selectComtnsmsListTotCnt(ComtnsmsDefaultVO searchVO);
    
}