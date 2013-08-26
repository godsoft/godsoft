package kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdUserPrivilegesService.java
 * @Description : MdUserPrivileges Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdUserPrivilegesService {
	
	/**
	 * MD_USER_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUserPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_USER_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_USER_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_USER_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUserPrivilegesVO
	 * @return 조회한 MD_USER_PRIVILEGES
	 * @exception Exception
	 */
    MdUserPrivilegesVO selectMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_USER_PRIVILEGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_PRIVILEGES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdUserPrivilegesList(MdUserPrivilegesVO vo) throws Exception;
    
    /**
	 * MD_USER_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_PRIVILEGES 총 갯수
	 * @exception
	 */
    int selectMdUserPrivilegesListTotCnt(MdUserPrivilegesVO vo);
    
}
