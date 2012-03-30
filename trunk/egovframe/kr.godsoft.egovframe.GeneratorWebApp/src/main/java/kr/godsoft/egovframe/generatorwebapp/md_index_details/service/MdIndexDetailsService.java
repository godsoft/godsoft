package kr.godsoft.egovframe.generatorwebapp.md_index_details.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdIndexDetailsService.java
 * @Description : MdIndexDetails Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdIndexDetailsService {
	
	/**
	 * MD_INDEX_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdIndexDetails(MdIndexDetailsVO vo) throws Exception;
    
    /**
	 * MD_INDEX_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdIndexDetails(MdIndexDetailsVO vo) throws Exception;
    
    /**
	 * MD_INDEX_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdIndexDetails(MdIndexDetailsVO vo) throws Exception;
    
    /**
	 * MD_INDEX_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexDetailsVO
	 * @return 조회한 MD_INDEX_DETAILS
	 * @exception Exception
	 */
    MdIndexDetailsVO selectMdIndexDetails(MdIndexDetailsVO vo) throws Exception;
    
    /**
	 * MD_INDEX_DETAILS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEX_DETAILS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdIndexDetailsList(MdIndexDetailsVO vo) throws Exception;
    
    /**
	 * MD_INDEX_DETAILS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_INDEX_DETAILS 총 갯수
	 * @exception
	 */
    int selectMdIndexDetailsListTotCnt(MdIndexDetailsVO vo);
    
}
