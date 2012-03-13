package kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnrtmplat.service.ComtnqustnrtmplatVO;

/**
 * @Class Name : ComtnqustnrtmplatService.java
 * @Description : Comtnqustnrtmplat Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnrtmplatService {
	
	/**
	 * comtnqustnrtmplat을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * comtnqustnrtmplat을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * comtnqustnrtmplat을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * comtnqustnrtmplat을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnrtmplatVO
	 * @return 조회한 comtnqustnrtmplat
	 * @exception Exception
	 */
    ComtnqustnrtmplatVO selectComtnqustnrtmplat(ComtnqustnrtmplatVO vo) throws Exception;
    
    /**
	 * comtnqustnrtmplat 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrtmplat 목록
	 * @exception Exception
	 */
    List selectComtnqustnrtmplatList(ComtnqustnrtmplatDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnqustnrtmplat 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnrtmplat 총 갯수
	 * @exception
	 */
    int selectComtnqustnrtmplatListTotCnt(ComtnqustnrtmplatDefaultVO searchVO);
    
}
