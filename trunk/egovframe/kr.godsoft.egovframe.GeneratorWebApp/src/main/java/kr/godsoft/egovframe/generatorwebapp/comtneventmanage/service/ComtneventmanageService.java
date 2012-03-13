package kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageVO;

/**
 * @Class Name : ComtneventmanageService.java
 * @Description : Comtneventmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtneventmanageService {
	
	/**
	 * comtneventmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtneventmanage(ComtneventmanageVO vo) throws Exception;
    
    /**
	 * comtneventmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtneventmanage(ComtneventmanageVO vo) throws Exception;
    
    /**
	 * comtneventmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtneventmanage(ComtneventmanageVO vo) throws Exception;
    
    /**
	 * comtneventmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventmanageVO
	 * @return 조회한 comtneventmanage
	 * @exception Exception
	 */
    ComtneventmanageVO selectComtneventmanage(ComtneventmanageVO vo) throws Exception;
    
    /**
	 * comtneventmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventmanage 목록
	 * @exception Exception
	 */
    List selectComtneventmanageList(ComtneventmanageDefaultVO searchVO) throws Exception;
    
    /**
	 * comtneventmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventmanage 총 갯수
	 * @exception
	 */
    int selectComtneventmanageListTotCnt(ComtneventmanageDefaultVO searchVO);
    
}
