package kr.godsoft.egovframe.generatorwebapp.comtndampro.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndamproService.java
 * @Description : Comtndampro Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndamproService {
	
	/**
	 * comtndampro을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamproVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndampro(ComtndamproVO vo) throws Exception;
    
    /**
	 * comtndampro을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamproVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndampro(ComtndamproVO vo) throws Exception;
    
    /**
	 * comtndampro을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamproVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndampro(ComtndamproVO vo) throws Exception;
    
    /**
	 * comtndampro을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamproVO
	 * @return 조회한 comtndampro
	 * @exception Exception
	 */
    ComtndamproVO selectComtndampro(ComtndamproVO vo) throws Exception;
    
    /**
	 * comtndampro 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndampro 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndamproList(ComtndamproVO vo) throws Exception;
    
    /**
	 * comtndampro 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndampro 총 갯수
	 * @exception
	 */
    int selectComtndamproListTotCnt(ComtndamproVO vo);
    
}
