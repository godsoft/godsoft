package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrolesHierarchyService.java
 * @Description : ComtnrolesHierarchy Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrolesHierarchyService {
	
	/**
	 * COMTNROLES_HIERARCHY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * COMTNROLES_HIERARCHY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * COMTNROLES_HIERARCHY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * COMTNROLES_HIERARCHY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 조회한 COMTNROLES_HIERARCHY
	 * @exception Exception
	 */
    ComtnrolesHierarchyVO selectComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * COMTNROLES_HIERARCHY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNROLES_HIERARCHY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrolesHierarchyList(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * COMTNROLES_HIERARCHY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNROLES_HIERARCHY 총 갯수
	 * @exception
	 */
    int selectComtnrolesHierarchyListTotCnt(ComtnrolesHierarchyVO vo);
    
}
