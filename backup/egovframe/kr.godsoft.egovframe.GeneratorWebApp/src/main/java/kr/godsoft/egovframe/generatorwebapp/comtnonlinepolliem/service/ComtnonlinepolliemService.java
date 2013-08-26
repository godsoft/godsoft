package kr.godsoft.egovframe.generatorwebapp.comtnonlinepolliem.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnonlinepolliemService.java
 * @Description : Comtnonlinepolliem Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnonlinepolliemService {
	
	/**
	 * COMTNONLINEPOLLIEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLIEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLIEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepolliemVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLIEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepolliemVO
	 * @return 조회한 COMTNONLINEPOLLIEM
	 * @exception Exception
	 */
    ComtnonlinepolliemVO selectComtnonlinepolliem(ComtnonlinepolliemVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLIEM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLIEM 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnonlinepolliemList(ComtnonlinepolliemVO vo) throws Exception;
    
    /**
	 * COMTNONLINEPOLLIEM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLIEM 총 갯수
	 * @exception
	 */
    int selectComtnonlinepolliemListTotCnt(ComtnonlinepolliemVO vo);
    
}
