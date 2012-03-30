package kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllTablesService.java
 * @Description : MgvAllTables Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllTablesService {
	
	/**
	 * MGV_ALL_TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllTables(MgvAllTablesVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTablesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllTables(MgvAllTablesVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTablesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllTables(MgvAllTablesVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTablesVO
	 * @return 조회한 MGV_ALL_TABLES
	 * @exception Exception
	 */
    MgvAllTablesVO selectMgvAllTables(MgvAllTablesVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllTablesList(MgvAllTablesVO vo) throws Exception;
    
    /**
	 * MGV_ALL_TABLES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLES 총 갯수
	 * @exception
	 */
    int selectMgvAllTablesListTotCnt(MgvAllTablesVO vo);
    
}
