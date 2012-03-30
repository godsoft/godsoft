package kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnclubuserService.java
 * @Description : Comtnclubuser Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnclubuserService {
	
	/**
	 * COMTNCLUBUSER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnclubuser(ComtnclubuserVO vo) throws Exception;
    
    /**
	 * COMTNCLUBUSER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubuserVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnclubuser(ComtnclubuserVO vo) throws Exception;
    
    /**
	 * COMTNCLUBUSER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubuserVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnclubuser(ComtnclubuserVO vo) throws Exception;
    
    /**
	 * COMTNCLUBUSER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubuserVO
	 * @return 조회한 COMTNCLUBUSER
	 * @exception Exception
	 */
    ComtnclubuserVO selectComtnclubuser(ComtnclubuserVO vo) throws Exception;
    
    /**
	 * COMTNCLUBUSER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCLUBUSER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnclubuserList(ComtnclubuserVO vo) throws Exception;
    
    /**
	 * COMTNCLUBUSER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCLUBUSER 총 갯수
	 * @exception
	 */
    int selectComtnclubuserListTotCnt(ComtnclubuserVO vo);
    
}
