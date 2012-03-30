package kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnuserabsnceService.java
 * @Description : Comtnuserabsnce Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnuserabsnceService {
	
	/**
	 * COMTNUSERABSNCE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserabsnceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * COMTNUSERABSNCE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * COMTNUSERABSNCE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * COMTNUSERABSNCE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserabsnceVO
	 * @return 조회한 COMTNUSERABSNCE
	 * @exception Exception
	 */
    ComtnuserabsnceVO selectComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * COMTNUSERABSNCE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNUSERABSNCE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnuserabsnceList(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * COMTNUSERABSNCE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNUSERABSNCE 총 갯수
	 * @exception
	 */
    int selectComtnuserabsnceListTotCnt(ComtnuserabsnceVO vo);
    
}
