package kr.godsoft.egovframe.generatorwebapp.comtnschdulinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnschdulinfoService.java
 * @Description : Comtnschdulinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnschdulinfoService {
	
	/**
	 * COMTNSCHDULINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnschdulinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception;
    
    /**
	 * COMTNSCHDULINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception;
    
    /**
	 * COMTNSCHDULINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnschdulinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception;
    
    /**
	 * COMTNSCHDULINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnschdulinfoVO
	 * @return 조회한 COMTNSCHDULINFO
	 * @exception Exception
	 */
    ComtnschdulinfoVO selectComtnschdulinfo(ComtnschdulinfoVO vo) throws Exception;
    
    /**
	 * COMTNSCHDULINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSCHDULINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnschdulinfoList(ComtnschdulinfoVO vo) throws Exception;
    
    /**
	 * COMTNSCHDULINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSCHDULINFO 총 갯수
	 * @exception
	 */
    int selectComtnschdulinfoListTotCnt(ComtnschdulinfoVO vo);
    
}
