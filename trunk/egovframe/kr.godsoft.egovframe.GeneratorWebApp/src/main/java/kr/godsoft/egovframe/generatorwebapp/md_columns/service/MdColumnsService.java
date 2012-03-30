package kr.godsoft.egovframe.generatorwebapp.md_columns.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdColumnsService.java
 * @Description : MdColumns Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdColumnsService {
	
	/**
	 * MD_COLUMNS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdColumns(MdColumnsVO vo) throws Exception;
    
    /**
	 * MD_COLUMNS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdColumnsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdColumns(MdColumnsVO vo) throws Exception;
    
    /**
	 * MD_COLUMNS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdColumnsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdColumns(MdColumnsVO vo) throws Exception;
    
    /**
	 * MD_COLUMNS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdColumnsVO
	 * @return 조회한 MD_COLUMNS
	 * @exception Exception
	 */
    MdColumnsVO selectMdColumns(MdColumnsVO vo) throws Exception;
    
    /**
	 * MD_COLUMNS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_COLUMNS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdColumnsList(MdColumnsVO vo) throws Exception;
    
    /**
	 * MD_COLUMNS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_COLUMNS 총 갯수
	 * @exception
	 */
    int selectMdColumnsListTotCnt(MdColumnsVO vo);
    
}
