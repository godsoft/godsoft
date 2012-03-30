package kr.godsoft.egovframe.generatorwebapp.md_projects.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdProjectsService.java
 * @Description : MdProjects Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdProjectsService {
	
	/**
	 * MD_PROJECTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdProjectsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdProjects(MdProjectsVO vo) throws Exception;
    
    /**
	 * MD_PROJECTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdProjectsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdProjects(MdProjectsVO vo) throws Exception;
    
    /**
	 * MD_PROJECTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdProjectsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdProjects(MdProjectsVO vo) throws Exception;
    
    /**
	 * MD_PROJECTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdProjectsVO
	 * @return 조회한 MD_PROJECTS
	 * @exception Exception
	 */
    MdProjectsVO selectMdProjects(MdProjectsVO vo) throws Exception;
    
    /**
	 * MD_PROJECTS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PROJECTS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdProjectsList(MdProjectsVO vo) throws Exception;
    
    /**
	 * MD_PROJECTS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PROJECTS 총 갯수
	 * @exception
	 */
    int selectMdProjectsListTotCnt(MdProjectsVO vo);
    
}
