package kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesVO;

/**
 * @Class Name : MdUserPrivilegesDAO.java
 * @Description : MdUserPrivileges DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdUserPrivilegesDAO")
public class MdUserPrivilegesDAO extends EgovAbstractDAO {

	/**
	 * MD_USER_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUserPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        return (String)insert("mdUserPrivilegesDAO.insertMdUserPrivileges_S", vo);
    }

    /**
	 * MD_USER_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        update("mdUserPrivilegesDAO.updateMdUserPrivileges_S", vo);
    }

    /**
	 * MD_USER_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        delete("mdUserPrivilegesDAO.deleteMdUserPrivileges_S", vo);
    }

    /**
	 * MD_USER_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUserPrivilegesVO
	 * @return 조회한 MD_USER_PRIVILEGES
	 * @exception Exception
	 */
    public MdUserPrivilegesVO selectMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        return (MdUserPrivilegesVO) selectByPk("mdUserPrivilegesDAO.selectMdUserPrivileges_S", vo);
    }

    /**
	 * MD_USER_PRIVILEGES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USER_PRIVILEGES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdUserPrivilegesList(MdUserPrivilegesVO vo) throws Exception {
        return list("mdUserPrivilegesDAO.selectMdUserPrivilegesList_D", vo);
    }

    /**
	 * MD_USER_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USER_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdUserPrivilegesListTotCnt(MdUserPrivilegesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdUserPrivilegesDAO.selectMdUserPrivilegesListTotCnt_S", vo);
    }

}
