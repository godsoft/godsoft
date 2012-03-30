package kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdConstraintDetailsService.java
 * @Description : MdConstraintDetails Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdConstraintDetailsService {
	
	/**
	 * MD_CONSTRAINT_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINT_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINT_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINT_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintDetailsVO
	 * @return 조회한 MD_CONSTRAINT_DETAILS
	 * @exception Exception
	 */
    MdConstraintDetailsVO selectMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINT_DETAILS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINT_DETAILS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdConstraintDetailsList(MdConstraintDetailsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINT_DETAILS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINT_DETAILS 총 갯수
	 * @exception
	 */
    int selectMdConstraintDetailsListTotCnt(MdConstraintDetailsVO vo);
    
}
