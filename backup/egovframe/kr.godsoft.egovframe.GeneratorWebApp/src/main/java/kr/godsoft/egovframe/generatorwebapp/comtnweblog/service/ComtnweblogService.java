package kr.godsoft.egovframe.generatorwebapp.comtnweblog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnweblogService.java
 * @Description : Comtnweblog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnweblogService {
	
	/**
	 * COMTNWEBLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnweblogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnweblog(ComtnweblogVO vo) throws Exception;
    
    /**
	 * COMTNWEBLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnweblogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnweblog(ComtnweblogVO vo) throws Exception;
    
    /**
	 * COMTNWEBLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnweblogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnweblog(ComtnweblogVO vo) throws Exception;
    
    /**
	 * COMTNWEBLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnweblogVO
	 * @return 조회한 COMTNWEBLOG
	 * @exception Exception
	 */
    ComtnweblogVO selectComtnweblog(ComtnweblogVO vo) throws Exception;
    
    /**
	 * COMTNWEBLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWEBLOG 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnweblogList(ComtnweblogVO vo) throws Exception;
    
    /**
	 * COMTNWEBLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNWEBLOG 총 갯수
	 * @exception
	 */
    int selectComtnweblogListTotCnt(ComtnweblogVO vo);
    
}
