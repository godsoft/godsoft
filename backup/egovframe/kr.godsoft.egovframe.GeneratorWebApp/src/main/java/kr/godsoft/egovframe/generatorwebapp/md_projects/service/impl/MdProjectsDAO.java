package kr.godsoft.egovframe.generatorwebapp.md_projects.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsVO;

/**
 * @Class Name : MdProjectsDAO.java
 * @Description : MdProjects DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdProjectsDAO")
public class MdProjectsDAO extends EgovAbstractDAO {

	/**
	 * MD_PROJECTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdProjectsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdProjects(MdProjectsVO vo) throws Exception {
        return (String)insert("mdProjectsDAO.insertMdProjects_S", vo);
    }

    /**
	 * MD_PROJECTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdProjectsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdProjects(MdProjectsVO vo) throws Exception {
        update("mdProjectsDAO.updateMdProjects_S", vo);
    }

    /**
	 * MD_PROJECTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdProjectsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdProjects(MdProjectsVO vo) throws Exception {
        delete("mdProjectsDAO.deleteMdProjects_S", vo);
    }

    /**
	 * MD_PROJECTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdProjectsVO
	 * @return 조회한 MD_PROJECTS
	 * @exception Exception
	 */
    public MdProjectsVO selectMdProjects(MdProjectsVO vo) throws Exception {
        return (MdProjectsVO) selectByPk("mdProjectsDAO.selectMdProjects_S", vo);
    }

    /**
	 * MD_PROJECTS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PROJECTS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdProjectsList(MdProjectsVO vo) throws Exception {
        return list("mdProjectsDAO.selectMdProjectsList_D", vo);
    }

    /**
	 * MD_PROJECTS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PROJECTS 총 갯수
	 * @exception
	 */
    public int selectMdProjectsListTotCnt(MdProjectsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdProjectsDAO.selectMdProjectsListTotCnt_S", vo);
    }

}
