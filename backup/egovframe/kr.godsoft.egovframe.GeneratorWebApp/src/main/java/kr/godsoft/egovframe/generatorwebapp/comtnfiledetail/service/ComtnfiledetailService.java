package kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnfiledetailService.java
 * @Description : Comtnfiledetail Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfiledetailService {
	
	/**
	 * COMTNFILEDETAIL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfiledetailVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfiledetail(ComtnfiledetailVO vo) throws Exception;
    
    /**
	 * COMTNFILEDETAIL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfiledetailVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfiledetail(ComtnfiledetailVO vo) throws Exception;
    
    /**
	 * COMTNFILEDETAIL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfiledetailVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfiledetail(ComtnfiledetailVO vo) throws Exception;
    
    /**
	 * COMTNFILEDETAIL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfiledetailVO
	 * @return 조회한 COMTNFILEDETAIL
	 * @exception Exception
	 */
    ComtnfiledetailVO selectComtnfiledetail(ComtnfiledetailVO vo) throws Exception;
    
    /**
	 * COMTNFILEDETAIL 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILEDETAIL 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnfiledetailList(ComtnfiledetailVO vo) throws Exception;
    
    /**
	 * COMTNFILEDETAIL 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNFILEDETAIL 총 갯수
	 * @exception
	 */
    int selectComtnfiledetailListTotCnt(ComtnfiledetailVO vo);
    
}
