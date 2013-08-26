package kr.godsoft.egovframe.generatorwebapp.md_groups.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsVO;

/**
 * @Class Name : MdGroupsDAO.java
 * @Description : MdGroups DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdGroupsDAO")
public class MdGroupsDAO extends EgovAbstractDAO {

	/**
	 * MD_GROUPS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroups(MdGroupsVO vo) throws Exception {
        return (String)insert("mdGroupsDAO.insertMdGroups_S", vo);
    }

    /**
	 * MD_GROUPS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroups(MdGroupsVO vo) throws Exception {
        update("mdGroupsDAO.updateMdGroups_S", vo);
    }

    /**
	 * MD_GROUPS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroups(MdGroupsVO vo) throws Exception {
        delete("mdGroupsDAO.deleteMdGroups_S", vo);
    }

    /**
	 * MD_GROUPS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupsVO
	 * @return 조회한 MD_GROUPS
	 * @exception Exception
	 */
    public MdGroupsVO selectMdGroups(MdGroupsVO vo) throws Exception {
        return (MdGroupsVO) selectByPk("mdGroupsDAO.selectMdGroups_S", vo);
    }

    /**
	 * MD_GROUPS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUPS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdGroupsList(MdGroupsVO vo) throws Exception {
        return list("mdGroupsDAO.selectMdGroupsList_D", vo);
    }

    /**
	 * MD_GROUPS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_GROUPS 총 갯수
	 * @exception
	 */
    public int selectMdGroupsListTotCnt(MdGroupsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdGroupsDAO.selectMdGroupsListTotCnt_S", vo);
    }

}
