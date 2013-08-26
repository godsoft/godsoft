package kr.godsoft.egovframe.generatorwebapp.md_privileges.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesVO;

/**
 * @Class Name : MdPrivilegesDAO.java
 * @Description : MdPrivileges DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdPrivilegesDAO")
public class MdPrivilegesDAO extends EgovAbstractDAO {

	/**
	 * MD_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdPrivileges(MdPrivilegesVO vo) throws Exception {
        return (String)insert("mdPrivilegesDAO.insertMdPrivileges_S", vo);
    }

    /**
	 * MD_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdPrivileges(MdPrivilegesVO vo) throws Exception {
        update("mdPrivilegesDAO.updateMdPrivileges_S", vo);
    }

    /**
	 * MD_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdPrivileges(MdPrivilegesVO vo) throws Exception {
        delete("mdPrivilegesDAO.deleteMdPrivileges_S", vo);
    }

    /**
	 * MD_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdPrivilegesVO
	 * @return 조회한 MD_PRIVILEGES
	 * @exception Exception
	 */
    public MdPrivilegesVO selectMdPrivileges(MdPrivilegesVO vo) throws Exception {
        return (MdPrivilegesVO) selectByPk("mdPrivilegesDAO.selectMdPrivileges_S", vo);
    }

    /**
	 * MD_PRIVILEGES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PRIVILEGES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdPrivilegesList(MdPrivilegesVO vo) throws Exception {
        return list("mdPrivilegesDAO.selectMdPrivilegesList_D", vo);
    }

    /**
	 * MD_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdPrivilegesListTotCnt(MdPrivilegesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdPrivilegesDAO.selectMdPrivilegesListTotCnt_S", vo);
    }

}
