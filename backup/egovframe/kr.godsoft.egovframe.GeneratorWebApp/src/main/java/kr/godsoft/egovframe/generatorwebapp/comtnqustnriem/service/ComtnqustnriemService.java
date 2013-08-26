package kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqustnriemService.java
 * @Description : Comtnqustnriem Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqustnriemService {
	
	/**
	 * COMTNQUSTNRIEM을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnriemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRIEM을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnriemVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRIEM을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnriemVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRIEM을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnriemVO
	 * @return 조회한 COMTNQUSTNRIEM
	 * @exception Exception
	 */
    ComtnqustnriemVO selectComtnqustnriem(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRIEM 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRIEM 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqustnriemList(ComtnqustnriemVO vo) throws Exception;
    
    /**
	 * COMTNQUSTNRIEM 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQUSTNRIEM 총 갯수
	 * @exception
	 */
    int selectComtnqustnriemListTotCnt(ComtnqustnriemVO vo);
    
}
