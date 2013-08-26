package kr.godsoft.egovframe.generatorwebapp.comtnleadersttus.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnleadersttusService.java
 * @Description : Comtnleadersttus Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnleadersttusService {
	
	/**
	 * COMTNLEADERSTTUS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleadersttusVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnleadersttus(ComtnleadersttusVO vo) throws Exception;
    
    /**
	 * COMTNLEADERSTTUS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleadersttusVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnleadersttus(ComtnleadersttusVO vo) throws Exception;
    
    /**
	 * COMTNLEADERSTTUS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleadersttusVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnleadersttus(ComtnleadersttusVO vo) throws Exception;
    
    /**
	 * COMTNLEADERSTTUS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleadersttusVO
	 * @return 조회한 COMTNLEADERSTTUS
	 * @exception Exception
	 */
    ComtnleadersttusVO selectComtnleadersttus(ComtnleadersttusVO vo) throws Exception;
    
    /**
	 * COMTNLEADERSTTUS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLEADERSTTUS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnleadersttusList(ComtnleadersttusVO vo) throws Exception;
    
    /**
	 * COMTNLEADERSTTUS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLEADERSTTUS 총 갯수
	 * @exception
	 */
    int selectComtnleadersttusListTotCnt(ComtnleadersttusVO vo);
    
}
