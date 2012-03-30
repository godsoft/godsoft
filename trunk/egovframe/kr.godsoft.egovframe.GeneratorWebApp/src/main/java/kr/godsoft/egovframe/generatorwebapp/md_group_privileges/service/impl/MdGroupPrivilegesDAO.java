package kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service.MdGroupPrivilegesVO;

/**
 * @Class Name : MdGroupPrivilegesDAO.java
 * @Description : MdGroupPrivileges DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdGroupPrivilegesDAO")
public class MdGroupPrivilegesDAO extends EgovAbstractDAO {

	/**
	 * MD_GROUP_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        return (String)insert("mdGroupPrivilegesDAO.insertMdGroupPrivileges_S", vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        update("mdGroupPrivilegesDAO.updateMdGroupPrivileges_S", vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        delete("mdGroupPrivilegesDAO.deleteMdGroupPrivileges_S", vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 조회한 MD_GROUP_PRIVILEGES
	 * @exception Exception
	 */
    public MdGroupPrivilegesVO selectMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        return (MdGroupPrivilegesVO) selectByPk("mdGroupPrivilegesDAO.selectMdGroupPrivileges_S", vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUP_PRIVILEGES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdGroupPrivilegesList(MdGroupPrivilegesVO vo) throws Exception {
        return list("mdGroupPrivilegesDAO.selectMdGroupPrivilegesList_D", vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUP_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdGroupPrivilegesListTotCnt(MdGroupPrivilegesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdGroupPrivilegesDAO.selectMdGroupPrivilegesListTotCnt_S", vo);
    }

}
