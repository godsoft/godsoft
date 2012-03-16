package kr.godsoft.egovframe.generatorwebapp.comtnuserabsnce.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnuserabsnceService.java
 * @Description : Comtnuserabsnce Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnuserabsnceService {
	
	/**
	 * comtnuserabsnce을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserabsnceVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * comtnuserabsnce을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * comtnuserabsnce을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserabsnceVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * comtnuserabsnce을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserabsnceVO
	 * @return 조회한 comtnuserabsnce
	 * @exception Exception
	 */
    ComtnuserabsnceVO selectComtnuserabsnce(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * comtnuserabsnce 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserabsnce 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnuserabsnceList(ComtnuserabsnceVO vo) throws Exception;
    
    /**
	 * comtnuserabsnce 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserabsnce 총 갯수
	 * @exception
	 */
    int selectComtnuserabsnceListTotCnt(ComtnuserabsnceVO vo);
    
}
