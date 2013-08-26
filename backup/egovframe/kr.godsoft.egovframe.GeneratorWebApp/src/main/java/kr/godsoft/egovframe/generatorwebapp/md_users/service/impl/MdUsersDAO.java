package kr.godsoft.egovframe.generatorwebapp.md_users.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersVO;

/**
 * @Class Name : MdUsersDAO.java
 * @Description : MdUsers DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdUsersDAO")
public class MdUsersDAO extends EgovAbstractDAO {

	/**
	 * MD_USERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUsersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUsers(MdUsersVO vo) throws Exception {
        return (String)insert("mdUsersDAO.insertMdUsers_S", vo);
    }

    /**
	 * MD_USERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUsersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUsers(MdUsersVO vo) throws Exception {
        update("mdUsersDAO.updateMdUsers_S", vo);
    }

    /**
	 * MD_USERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUsersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUsers(MdUsersVO vo) throws Exception {
        delete("mdUsersDAO.deleteMdUsers_S", vo);
    }

    /**
	 * MD_USERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUsersVO
	 * @return 조회한 MD_USERS
	 * @exception Exception
	 */
    public MdUsersVO selectMdUsers(MdUsersVO vo) throws Exception {
        return (MdUsersVO) selectByPk("mdUsersDAO.selectMdUsers_S", vo);
    }

    /**
	 * MD_USERS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USERS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdUsersList(MdUsersVO vo) throws Exception {
        return list("mdUsersDAO.selectMdUsersList_D", vo);
    }

    /**
	 * MD_USERS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USERS 총 갯수
	 * @exception
	 */
    public int selectMdUsersListTotCnt(MdUsersVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdUsersDAO.selectMdUsersListTotCnt_S", vo);
    }

}
