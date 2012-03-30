package kr.godsoft.egovframe.generatorwebapp.comtnqestnrinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnqestnrinfoService.java
 * @Description : Comtnqestnrinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnqestnrinfoService {
	
	/**
	 * COMTNQESTNRINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception;
    
    /**
	 * COMTNQESTNRINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception;
    
    /**
	 * COMTNQESTNRINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqestnrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception;
    
    /**
	 * COMTNQESTNRINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqestnrinfoVO
	 * @return 조회한 COMTNQESTNRINFO
	 * @exception Exception
	 */
    ComtnqestnrinfoVO selectComtnqestnrinfo(ComtnqestnrinfoVO vo) throws Exception;
    
    /**
	 * COMTNQESTNRINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQESTNRINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnqestnrinfoList(ComtnqestnrinfoVO vo) throws Exception;
    
    /**
	 * COMTNQESTNRINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNQESTNRINFO 총 갯수
	 * @exception
	 */
    int selectComtnqestnrinfoListTotCnt(ComtnqestnrinfoVO vo);
    
}
