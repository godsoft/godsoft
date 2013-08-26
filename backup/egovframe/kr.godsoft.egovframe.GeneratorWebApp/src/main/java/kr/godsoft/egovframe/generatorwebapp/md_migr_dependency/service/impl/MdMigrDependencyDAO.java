package kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_migr_dependency.service.MdMigrDependencyVO;

/**
 * @Class Name : MdMigrDependencyDAO.java
 * @Description : MdMigrDependency DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdMigrDependencyDAO")
public class MdMigrDependencyDAO extends EgovAbstractDAO {

	/**
	 * MD_MIGR_DEPENDENCY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdMigrDependencyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdMigrDependency(MdMigrDependencyVO vo) throws Exception {
        return (String)insert("mdMigrDependencyDAO.insertMdMigrDependency_S", vo);
    }

    /**
	 * MD_MIGR_DEPENDENCY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdMigrDependencyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdMigrDependency(MdMigrDependencyVO vo) throws Exception {
        update("mdMigrDependencyDAO.updateMdMigrDependency_S", vo);
    }

    /**
	 * MD_MIGR_DEPENDENCY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdMigrDependencyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdMigrDependency(MdMigrDependencyVO vo) throws Exception {
        delete("mdMigrDependencyDAO.deleteMdMigrDependency_S", vo);
    }

    /**
	 * MD_MIGR_DEPENDENCY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdMigrDependencyVO
	 * @return 조회한 MD_MIGR_DEPENDENCY
	 * @exception Exception
	 */
    public MdMigrDependencyVO selectMdMigrDependency(MdMigrDependencyVO vo) throws Exception {
        return (MdMigrDependencyVO) selectByPk("mdMigrDependencyDAO.selectMdMigrDependency_S", vo);
    }

    /**
	 * MD_MIGR_DEPENDENCY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_MIGR_DEPENDENCY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdMigrDependencyList(MdMigrDependencyVO vo) throws Exception {
        return list("mdMigrDependencyDAO.selectMdMigrDependencyList_D", vo);
    }

    /**
	 * MD_MIGR_DEPENDENCY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_MIGR_DEPENDENCY 총 갯수
	 * @exception
	 */
    public int selectMdMigrDependencyListTotCnt(MdMigrDependencyVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdMigrDependencyDAO.selectMdMigrDependencyListTotCnt_S", vo);
    }

}
