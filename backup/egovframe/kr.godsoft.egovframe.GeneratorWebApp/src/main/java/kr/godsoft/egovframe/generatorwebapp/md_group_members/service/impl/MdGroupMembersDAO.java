package kr.godsoft.egovframe.generatorwebapp.md_group_members.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersVO;

/**
 * @Class Name : MdGroupMembersDAO.java
 * @Description : MdGroupMembers DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdGroupMembersDAO")
public class MdGroupMembersDAO extends EgovAbstractDAO {

	/**
	 * MD_GROUP_MEMBERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupMembersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        return (String)insert("mdGroupMembersDAO.insertMdGroupMembers_S", vo);
    }

    /**
	 * MD_GROUP_MEMBERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupMembersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        update("mdGroupMembersDAO.updateMdGroupMembers_S", vo);
    }

    /**
	 * MD_GROUP_MEMBERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupMembersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        delete("mdGroupMembersDAO.deleteMdGroupMembers_S", vo);
    }

    /**
	 * MD_GROUP_MEMBERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupMembersVO
	 * @return 조회한 MD_GROUP_MEMBERS
	 * @exception Exception
	 */
    public MdGroupMembersVO selectMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        return (MdGroupMembersVO) selectByPk("mdGroupMembersDAO.selectMdGroupMembers_S", vo);
    }

    /**
	 * MD_GROUP_MEMBERS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUP_MEMBERS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdGroupMembersList(MdGroupMembersVO vo) throws Exception {
        return list("mdGroupMembersDAO.selectMdGroupMembersList_D", vo);
    }

    /**
	 * MD_GROUP_MEMBERS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUP_MEMBERS 총 갯수
	 * @exception
	 */
    public int selectMdGroupMembersListTotCnt(MdGroupMembersVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdGroupMembersDAO.selectMdGroupMembersListTotCnt_S", vo);
    }

}
