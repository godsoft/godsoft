package kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComvnusermasterService.java
 * @Description : Comvnusermaster Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComvnusermasterService {
	
	/**
	 * COMVNUSERMASTER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComvnusermasterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComvnusermaster(ComvnusermasterVO vo) throws Exception;
    
    /**
	 * COMVNUSERMASTER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComvnusermasterVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComvnusermaster(ComvnusermasterVO vo) throws Exception;
    
    /**
	 * COMVNUSERMASTER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComvnusermasterVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComvnusermaster(ComvnusermasterVO vo) throws Exception;
    
    /**
	 * COMVNUSERMASTER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComvnusermasterVO
	 * @return 조회한 COMVNUSERMASTER
	 * @exception Exception
	 */
    ComvnusermasterVO selectComvnusermaster(ComvnusermasterVO vo) throws Exception;
    
    /**
	 * COMVNUSERMASTER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMVNUSERMASTER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComvnusermasterList(ComvnusermasterVO vo) throws Exception;
    
    /**
	 * COMVNUSERMASTER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMVNUSERMASTER 총 갯수
	 * @exception
	 */
    int selectComvnusermasterListTotCnt(ComvnusermasterVO vo);
    
}
