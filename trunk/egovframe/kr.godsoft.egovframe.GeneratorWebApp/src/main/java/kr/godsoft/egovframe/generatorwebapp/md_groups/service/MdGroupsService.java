package kr.godsoft.egovframe.generatorwebapp.md_groups.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdGroupsService.java
 * @Description : MdGroups Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdGroupsService {
	
	/**
	 * MD_GROUPS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdGroups(MdGroupsVO vo) throws Exception;
    
    /**
	 * MD_GROUPS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdGroups(MdGroupsVO vo) throws Exception;
    
    /**
	 * MD_GROUPS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdGroups(MdGroupsVO vo) throws Exception;
    
    /**
	 * MD_GROUPS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupsVO
	 * @return 조회한 MD_GROUPS
	 * @exception Exception
	 */
    MdGroupsVO selectMdGroups(MdGroupsVO vo) throws Exception;
    
    /**
	 * MD_GROUPS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUPS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdGroupsList(MdGroupsVO vo) throws Exception;
    
    /**
	 * MD_GROUPS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUPS 총 갯수
	 * @exception
	 */
    int selectMdGroupsListTotCnt(MdGroupsVO vo);
    
}
