package kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdStoredProgramsService.java
 * @Description : MdStoredPrograms Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdStoredProgramsService {
	
	/**
	 * MD_STORED_PROGRAMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdStoredProgramsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdStoredPrograms(MdStoredProgramsVO vo) throws Exception;
    
    /**
	 * MD_STORED_PROGRAMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdStoredProgramsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdStoredPrograms(MdStoredProgramsVO vo) throws Exception;
    
    /**
	 * MD_STORED_PROGRAMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdStoredProgramsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdStoredPrograms(MdStoredProgramsVO vo) throws Exception;
    
    /**
	 * MD_STORED_PROGRAMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdStoredProgramsVO
	 * @return 조회한 MD_STORED_PROGRAMS
	 * @exception Exception
	 */
    MdStoredProgramsVO selectMdStoredPrograms(MdStoredProgramsVO vo) throws Exception;
    
    /**
	 * MD_STORED_PROGRAMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_STORED_PROGRAMS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdStoredProgramsList(MdStoredProgramsVO vo) throws Exception;
    
    /**
	 * MD_STORED_PROGRAMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_STORED_PROGRAMS 총 갯수
	 * @exception
	 */
    int selectMdStoredProgramsListTotCnt(MdStoredProgramsVO vo);
    
}
