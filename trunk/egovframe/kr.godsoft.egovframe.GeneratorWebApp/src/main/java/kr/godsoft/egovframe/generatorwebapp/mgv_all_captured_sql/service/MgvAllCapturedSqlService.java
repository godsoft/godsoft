package kr.godsoft.egovframe.generatorwebapp.mgv_all_captured_sql.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllCapturedSqlService.java
 * @Description : MgvAllCapturedSql Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllCapturedSqlService {
	
	/**
	 * MGV_ALL_CAPTURED_SQL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllCapturedSqlVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllCapturedSql(MgvAllCapturedSqlVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CAPTURED_SQL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllCapturedSqlVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllCapturedSql(MgvAllCapturedSqlVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CAPTURED_SQL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllCapturedSqlVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllCapturedSql(MgvAllCapturedSqlVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CAPTURED_SQL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllCapturedSqlVO
	 * @return 조회한 MGV_ALL_CAPTURED_SQL
	 * @exception Exception
	 */
    MgvAllCapturedSqlVO selectMgvAllCapturedSql(MgvAllCapturedSqlVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CAPTURED_SQL 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CAPTURED_SQL 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllCapturedSqlList(MgvAllCapturedSqlVO vo) throws Exception;
    
    /**
	 * MGV_ALL_CAPTURED_SQL 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CAPTURED_SQL 총 갯수
	 * @exception
	 */
    int selectMgvAllCapturedSqlListTotCnt(MgvAllCapturedSqlVO vo);
    
}
