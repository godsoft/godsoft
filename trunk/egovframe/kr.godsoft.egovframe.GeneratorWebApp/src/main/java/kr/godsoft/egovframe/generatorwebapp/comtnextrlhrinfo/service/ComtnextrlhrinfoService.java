package kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnextrlhrinfoService.java
 * @Description : Comtnextrlhrinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnextrlhrinfoService {
	
	/**
	 * comtnextrlhrinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception;
    
    /**
	 * comtnextrlhrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception;
    
    /**
	 * comtnextrlhrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception;
    
    /**
	 * comtnextrlhrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 조회한 comtnextrlhrinfo
	 * @exception Exception
	 */
    ComtnextrlhrinfoVO selectComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception;
    
    /**
	 * comtnextrlhrinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnextrlhrinfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnextrlhrinfoList(ComtnextrlhrinfoVO vo) throws Exception;
    
    /**
	 * comtnextrlhrinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnextrlhrinfo 총 갯수
	 * @exception
	 */
    int selectComtnextrlhrinfoListTotCnt(ComtnextrlhrinfoVO vo);
    
}
