package kr.godsoft.egovframe.generatorwebapp.comthconfmhistory.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComthconfmhistoryService.java
 * @Description : Comthconfmhistory Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComthconfmhistoryService {
	
	/**
	 * comthconfmhistory을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthconfmhistoryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComthconfmhistory(ComthconfmhistoryVO vo) throws Exception;
    
    /**
	 * comthconfmhistory을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComthconfmhistory(ComthconfmhistoryVO vo) throws Exception;
    
    /**
	 * comthconfmhistory을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthconfmhistoryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComthconfmhistory(ComthconfmhistoryVO vo) throws Exception;
    
    /**
	 * comthconfmhistory을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthconfmhistoryVO
	 * @return 조회한 comthconfmhistory
	 * @exception Exception
	 */
    ComthconfmhistoryVO selectComthconfmhistory(ComthconfmhistoryVO vo) throws Exception;
    
    /**
	 * comthconfmhistory 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthconfmhistory 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComthconfmhistoryList(ComthconfmhistoryVO vo) throws Exception;
    
    /**
	 * comthconfmhistory 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthconfmhistory 총 갯수
	 * @exception
	 */
    int selectComthconfmhistoryListTotCnt(ComthconfmhistoryVO vo);
    
}
