package kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdGroupPrivilegesService.java
 * @Description : MdGroupPrivileges Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdGroupPrivilegesService {
	
	/**
	 * MD_GROUP_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_GROUP_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_GROUP_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_GROUP_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 조회한 MD_GROUP_PRIVILEGES
	 * @exception Exception
	 */
    MdGroupPrivilegesVO selectMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_GROUP_PRIVILEGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_PRIVILEGES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdGroupPrivilegesList(MdGroupPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_GROUP_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_PRIVILEGES 총 갯수
	 * @exception
	 */
    int selectMdGroupPrivilegesListTotCnt(MdGroupPrivilegesVO vo);
    
}
