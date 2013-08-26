package kr.godsoft.egovframe.generatorwebapp.md_indexes.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdIndexesService.java
 * @Description : MdIndexes Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdIndexesService {
	
	/**
	 * MD_INDEXES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdIndexes(MdIndexesVO vo) throws Exception;
    
    /**
	 * MD_INDEXES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdIndexes(MdIndexesVO vo) throws Exception;
    
    /**
	 * MD_INDEXES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdIndexes(MdIndexesVO vo) throws Exception;
    
    /**
	 * MD_INDEXES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexesVO
	 * @return 조회한 MD_INDEXES
	 * @exception Exception
	 */
    MdIndexesVO selectMdIndexes(MdIndexesVO vo) throws Exception;
    
    /**
	 * MD_INDEXES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEXES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdIndexesList(MdIndexesVO vo) throws Exception;
    
    /**
	 * MD_INDEXES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEXES 총 갯수
	 * @exception
	 */
    int selectMdIndexesListTotCnt(MdIndexesVO vo);
    
}
