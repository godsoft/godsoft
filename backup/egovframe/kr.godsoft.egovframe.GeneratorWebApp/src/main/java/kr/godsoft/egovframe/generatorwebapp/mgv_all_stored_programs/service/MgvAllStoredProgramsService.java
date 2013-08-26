package kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MgvAllStoredProgramsService.java
 * @Description : MgvAllStoredPrograms Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MgvAllStoredProgramsService {
	
	/**
	 * MGV_ALL_STORED_PROGRAMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_STORED_PROGRAMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_STORED_PROGRAMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_STORED_PROGRAMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 조회한 MGV_ALL_STORED_PROGRAMS
	 * @exception Exception
	 */
    MgvAllStoredProgramsVO selectMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_STORED_PROGRAMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_STORED_PROGRAMS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMgvAllStoredProgramsList(MgvAllStoredProgramsVO vo) throws Exception;
    
    /**
	 * MGV_ALL_STORED_PROGRAMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_STORED_PROGRAMS 총 갯수
	 * @exception
	 */
    int selectMgvAllStoredProgramsListTotCnt(MgvAllStoredProgramsVO vo);
    
}