package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyVO;

/**
 * @Class Name : ComtnrolesHierarchyDAO.java
 * @Description : ComtnrolesHierarchy DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrolesHierarchyDAO")
public class ComtnrolesHierarchyDAO extends EgovAbstractDAO {

	/**
	 * COMTNROLES_HIERARCHY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        return (String)insert("comtnrolesHierarchyDAO.insertComtnrolesHierarchy_S", vo);
    }

    /**
	 * COMTNROLES_HIERARCHY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        update("comtnrolesHierarchyDAO.updateComtnrolesHierarchy_S", vo);
    }

    /**
	 * COMTNROLES_HIERARCHY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        delete("comtnrolesHierarchyDAO.deleteComtnrolesHierarchy_S", vo);
    }

    /**
	 * COMTNROLES_HIERARCHY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 조회한 COMTNROLES_HIERARCHY
	 * @exception Exception
	 */
    public ComtnrolesHierarchyVO selectComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        return (ComtnrolesHierarchyVO) selectByPk("comtnrolesHierarchyDAO.selectComtnrolesHierarchy_S", vo);
    }

    /**
	 * COMTNROLES_HIERARCHY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNROLES_HIERARCHY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrolesHierarchyList(ComtnrolesHierarchyVO vo) throws Exception {
        return list("comtnrolesHierarchyDAO.selectComtnrolesHierarchyList_D", vo);
    }

    /**
	 * COMTNROLES_HIERARCHY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNROLES_HIERARCHY 총 갯수
	 * @exception
	 */
    public int selectComtnrolesHierarchyListTotCnt(ComtnrolesHierarchyVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrolesHierarchyDAO.selectComtnrolesHierarchyListTotCnt_S", vo);
    }

}
