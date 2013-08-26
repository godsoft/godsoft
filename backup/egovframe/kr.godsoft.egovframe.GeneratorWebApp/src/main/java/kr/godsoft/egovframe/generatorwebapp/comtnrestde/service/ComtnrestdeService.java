package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrestdeService.java
 * @Description : Comtnrestde Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrestdeService {
	
	/**
	 * COMTNRESTDE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrestdeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * COMTNRESTDE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrestdeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * COMTNRESTDE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrestdeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * COMTNRESTDE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return 조회한 COMTNRESTDE
	 * @exception Exception
	 */
    ComtnrestdeVO selectComtnrestde(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * COMTNRESTDE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRESTDE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrestdeList(ComtnrestdeVO vo) throws Exception;
    
    /**
	 * COMTNRESTDE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRESTDE 총 갯수
	 * @exception
	 */
    int selectComtnrestdeListTotCnt(ComtnrestdeVO vo);
    
}
