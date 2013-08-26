package kr.godsoft.egovframe.generatorwebapp.md_users.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdUsersService.java
 * @Description : MdUsers Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdUsersService {
	
	/**
	 * MD_USERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUsersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdUsers(MdUsersVO vo) throws Exception;
    
    /**
	 * MD_USERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUsersVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdUsers(MdUsersVO vo) throws Exception;
    
    /**
	 * MD_USERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUsersVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdUsers(MdUsersVO vo) throws Exception;
    
    /**
	 * MD_USERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUsersVO
	 * @return 조회한 MD_USERS
	 * @exception Exception
	 */
    MdUsersVO selectMdUsers(MdUsersVO vo) throws Exception;
    
    /**
	 * MD_USERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USERS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdUsersList(MdUsersVO vo) throws Exception;
    
    /**
	 * MD_USERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USERS 총 갯수
	 * @exception
	 */
    int selectMdUsersListTotCnt(MdUsersVO vo);
    
}
