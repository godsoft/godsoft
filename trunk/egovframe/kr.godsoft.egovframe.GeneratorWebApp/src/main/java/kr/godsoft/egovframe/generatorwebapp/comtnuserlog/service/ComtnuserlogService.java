package kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnuserlogService.java
 * @Description : Comtnuserlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnuserlogService {
	
	/**
	 * comtnuserlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnuserlog(ComtnuserlogVO vo) throws Exception;
    
    /**
	 * comtnuserlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnuserlog(ComtnuserlogVO vo) throws Exception;
    
    /**
	 * comtnuserlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnuserlog(ComtnuserlogVO vo) throws Exception;
    
    /**
	 * comtnuserlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserlogVO
	 * @return 조회한 comtnuserlog
	 * @exception Exception
	 */
    ComtnuserlogVO selectComtnuserlog(ComtnuserlogVO vo) throws Exception;
    
    /**
	 * comtnuserlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserlog 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnuserlogList(ComtnuserlogVO vo) throws Exception;
    
    /**
	 * comtnuserlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserlog 총 갯수
	 * @exception
	 */
    int selectComtnuserlogListTotCnt(ComtnuserlogVO vo);
    
}
