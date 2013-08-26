package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtncmmntyuserService.java
 * @Description : Comtncmmntyuser Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncmmntyuserService {
	
	/**
	 * COMTNCMMNTYUSER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * COMTNCMMNTYUSER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * COMTNCMMNTYUSER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * COMTNCMMNTYUSER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyuserVO
	 * @return 조회한 COMTNCMMNTYUSER
	 * @exception Exception
	 */
    ComtncmmntyuserVO selectComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * COMTNCMMNTYUSER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCMMNTYUSER 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtncmmntyuserList(ComtncmmntyuserVO vo) throws Exception;
    
    /**
	 * COMTNCMMNTYUSER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCMMNTYUSER 총 갯수
	 * @exception
	 */
    int selectComtncmmntyuserListTotCnt(ComtncmmntyuserVO vo);
    
}
