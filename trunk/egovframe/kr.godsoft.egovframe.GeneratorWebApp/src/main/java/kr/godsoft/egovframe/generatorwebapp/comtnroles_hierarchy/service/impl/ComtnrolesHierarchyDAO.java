package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyVO;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyDefaultVO;

/**
 * @Class Name : ComtnrolesHierarchyDAO.java
 * @Description : ComtnrolesHierarchy DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrolesHierarchyDAO")
public class ComtnrolesHierarchyDAO extends EgovAbstractDAO {

	/**
	 * comtnroles_hierarchy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        return (String)insert("comtnrolesHierarchyDAO.insertComtnrolesHierarchy_S", vo);
    }

    /**
	 * comtnroles_hierarchy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        update("comtnrolesHierarchyDAO.updateComtnrolesHierarchy_S", vo);
    }

    /**
	 * comtnroles_hierarchy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        delete("comtnrolesHierarchyDAO.deleteComtnrolesHierarchy_S", vo);
    }

    /**
	 * comtnroles_hierarchy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 조회한 comtnroles_hierarchy
	 * @exception Exception
	 */
    public ComtnrolesHierarchyVO selectComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        return (ComtnrolesHierarchyVO) selectByPk("comtnrolesHierarchyDAO.selectComtnrolesHierarchy_S", vo);
    }

    /**
	 * comtnroles_hierarchy 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnroles_hierarchy 목록
	 * @exception Exception
	 */
    public List selectComtnrolesHierarchyList(ComtnrolesHierarchyDefaultVO searchVO) throws Exception {
        return list("comtnrolesHierarchyDAO.selectComtnrolesHierarchyList_D", searchVO);
    }

    /**
	 * comtnroles_hierarchy 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnroles_hierarchy 총 갯수
	 * @exception
	 */
    public int selectComtnrolesHierarchyListTotCnt(ComtnrolesHierarchyDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrolesHierarchyDAO.selectComtnrolesHierarchyListTotCnt_S", searchVO);
    }

}
