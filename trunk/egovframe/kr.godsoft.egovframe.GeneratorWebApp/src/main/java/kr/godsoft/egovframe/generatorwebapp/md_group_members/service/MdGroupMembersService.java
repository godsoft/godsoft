package kr.godsoft.egovframe.generatorwebapp.md_group_members.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdGroupMembersService.java
 * @Description : MdGroupMembers Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdGroupMembersService {
	
	/**
	 * MD_GROUP_MEMBERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupMembersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdGroupMembers(MdGroupMembersVO vo) throws Exception;
    
    /**
	 * MD_GROUP_MEMBERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupMembersVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdGroupMembers(MdGroupMembersVO vo) throws Exception;
    
    /**
	 * MD_GROUP_MEMBERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupMembersVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdGroupMembers(MdGroupMembersVO vo) throws Exception;
    
    /**
	 * MD_GROUP_MEMBERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupMembersVO
	 * @return 조회한 MD_GROUP_MEMBERS
	 * @exception Exception
	 */
    MdGroupMembersVO selectMdGroupMembers(MdGroupMembersVO vo) throws Exception;
    
    /**
	 * MD_GROUP_MEMBERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_MEMBERS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdGroupMembersList(MdGroupMembersVO vo) throws Exception;
    
    /**
	 * MD_GROUP_MEMBERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_MEMBERS 총 갯수
	 * @exception
	 */
    int selectMdGroupMembersListTotCnt(MdGroupMembersVO vo);
    
}
