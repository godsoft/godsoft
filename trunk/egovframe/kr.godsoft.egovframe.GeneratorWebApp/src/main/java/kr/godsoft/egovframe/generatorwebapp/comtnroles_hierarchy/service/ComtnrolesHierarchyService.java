package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrolesHierarchyService.java
 * @Description : ComtnrolesHierarchy Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrolesHierarchyService {
	
	/**
	 * comtnroles_hierarchy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * comtnroles_hierarchy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * comtnroles_hierarchy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * comtnroles_hierarchy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 조회한 comtnroles_hierarchy
	 * @exception Exception
	 */
    ComtnrolesHierarchyVO selectComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * comtnroles_hierarchy 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnroles_hierarchy 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrolesHierarchyList(ComtnrolesHierarchyVO vo) throws Exception;
    
    /**
	 * comtnroles_hierarchy 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnroles_hierarchy 총 갯수
	 * @exception
	 */
    int selectComtnrolesHierarchyListTotCnt(ComtnrolesHierarchyVO vo);
    
}
