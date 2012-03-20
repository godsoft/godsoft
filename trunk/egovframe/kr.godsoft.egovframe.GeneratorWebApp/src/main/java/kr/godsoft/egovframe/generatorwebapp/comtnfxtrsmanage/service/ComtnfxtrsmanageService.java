package kr.godsoft.egovframe.generatorwebapp.comtnfxtrsmanage.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfxtrsmanageService.java
 * @Description : Comtnfxtrsmanage Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfxtrsmanageService {
	
	/**
	 * comtnfxtrsmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception;
    
    /**
	 * comtnfxtrsmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception;
    
    /**
	 * comtnfxtrsmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception;
    
    /**
	 * comtnfxtrsmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfxtrsmanageVO
	 * @return 조회한 comtnfxtrsmanage
	 * @exception Exception
	 */
    ComtnfxtrsmanageVO selectComtnfxtrsmanage(ComtnfxtrsmanageVO vo) throws Exception;
    
    /**
	 * comtnfxtrsmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfxtrsmanage 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfxtrsmanageList(ComtnfxtrsmanageVO vo) throws Exception;
    
    /**
	 * comtnfxtrsmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfxtrsmanage 총 갯수
	 * @exception
	 */
    int selectComtnfxtrsmanageListTotCnt(ComtnfxtrsmanageVO vo);
    
}
