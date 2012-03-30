package kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtndammapknoService.java
 * @Description : Comtndammapkno Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndammapknoService {
	
	/**
	 * COMTNDAMMAPKNO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapknoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * COMTNDAMMAPKNO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapknoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * COMTNDAMMAPKNO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapknoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * COMTNDAMMAPKNO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapknoVO
	 * @return 조회한 COMTNDAMMAPKNO
	 * @exception Exception
	 */
    ComtndammapknoVO selectComtndammapkno(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * COMTNDAMMAPKNO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMMAPKNO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtndammapknoList(ComtndammapknoVO vo) throws Exception;
    
    /**
	 * COMTNDAMMAPKNO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMMAPKNO 총 갯수
	 * @exception
	 */
    int selectComtndammapknoListTotCnt(ComtndammapknoVO vo);
    
}
