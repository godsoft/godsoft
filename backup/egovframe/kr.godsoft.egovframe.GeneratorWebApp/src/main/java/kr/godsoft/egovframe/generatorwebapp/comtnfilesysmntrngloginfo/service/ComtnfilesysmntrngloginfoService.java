package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfilesysmntrngloginfoService.java
 * @Description : Comtnfilesysmntrngloginfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfilesysmntrngloginfoService {
	
	/**
	 * COMTNFILESYSMNTRNGLOGINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception;
    
    /**
	 * COMTNFILESYSMNTRNGLOGINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception;
    
    /**
	 * COMTNFILESYSMNTRNGLOGINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception;
    
    /**
	 * COMTNFILESYSMNTRNGLOGINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 조회한 COMTNFILESYSMNTRNGLOGINFO
	 * @exception Exception
	 */
    ComtnfilesysmntrngloginfoVO selectComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception;
    
    /**
	 * COMTNFILESYSMNTRNGLOGINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILESYSMNTRNGLOGINFO 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfilesysmntrngloginfoList(ComtnfilesysmntrngloginfoVO vo) throws Exception;
    
    /**
	 * COMTNFILESYSMNTRNGLOGINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILESYSMNTRNGLOGINFO 총 갯수
	 * @exception
	 */
    int selectComtnfilesysmntrngloginfoListTotCnt(ComtnfilesysmntrngloginfoVO vo);
    
}
