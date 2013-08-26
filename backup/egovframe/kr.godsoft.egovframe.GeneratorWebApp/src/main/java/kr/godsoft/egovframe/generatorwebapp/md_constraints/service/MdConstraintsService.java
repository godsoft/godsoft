package kr.godsoft.egovframe.generatorwebapp.md_constraints.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdConstraintsService.java
 * @Description : MdConstraints Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdConstraintsService {
	
	/**
	 * MD_CONSTRAINTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdConstraints(MdConstraintsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdConstraints(MdConstraintsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdConstraints(MdConstraintsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintsVO
	 * @return 조회한 MD_CONSTRAINTS
	 * @exception Exception
	 */
    MdConstraintsVO selectMdConstraints(MdConstraintsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINTS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINTS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdConstraintsList(MdConstraintsVO vo) throws Exception;
    
    /**
	 * MD_CONSTRAINTS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINTS 총 갯수
	 * @exception
	 */
    int selectMdConstraintsListTotCnt(MdConstraintsVO vo);
    
}
