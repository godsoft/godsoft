package kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnloginlogService.java
 * @Description : Comtnloginlog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnloginlogService {
	
	/**
	 * comtnloginlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnloginlog(ComtnloginlogVO vo) throws Exception;
    
    /**
	 * comtnloginlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginlogVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnloginlog(ComtnloginlogVO vo) throws Exception;
    
    /**
	 * comtnloginlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginlogVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnloginlog(ComtnloginlogVO vo) throws Exception;
    
    /**
	 * comtnloginlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginlogVO
	 * @return 조회한 comtnloginlog
	 * @exception Exception
	 */
    ComtnloginlogVO selectComtnloginlog(ComtnloginlogVO vo) throws Exception;
    
    /**
	 * comtnloginlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginlog 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnloginlogList(ComtnloginlogVO vo) throws Exception;
    
    /**
	 * comtnloginlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginlog 총 갯수
	 * @exception
	 */
    int selectComtnloginlogListTotCnt(ComtnloginlogVO vo);
    
}
