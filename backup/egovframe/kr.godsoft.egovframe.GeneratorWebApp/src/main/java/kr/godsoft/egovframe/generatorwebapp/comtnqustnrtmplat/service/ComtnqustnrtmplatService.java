package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqustnrtmplatService.java
 * @Description : Comtnqustnrtmplat Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrtmplatService {
	
	/**
	 * COMTNQUSTNRTMPLAT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRTMPLAT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRTMPLAT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRTMPLAT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 조회한 COMTNQUSTNRTMPLAT
	 * @exception Exception
	 */
    ComtnqustnrtmplatVO selectComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRTMPLAT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRTMPLAT 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqustnrtmplatList(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRTMPLAT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRTMPLAT 총 갯수
	 * @exception
	 */
    int selectComtnqustnrtmplatListTotCnt(ComtnqustnrtmplatVO vo);
    
}
