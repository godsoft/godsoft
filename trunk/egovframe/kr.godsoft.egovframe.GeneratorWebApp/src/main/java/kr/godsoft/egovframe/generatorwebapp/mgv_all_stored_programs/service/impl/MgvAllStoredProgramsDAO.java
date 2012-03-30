package kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service.MgvAllStoredProgramsVO;

/**
 * @Class Name : MgvAllStoredProgramsDAO.java
 * @Description : MgvAllStoredPrograms DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllStoredProgramsDAO")
public class MgvAllStoredProgramsDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_STORED_PROGRAMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        return (String)insert("mgvAllStoredProgramsDAO.insertMgvAllStoredPrograms_S", vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        update("mgvAllStoredProgramsDAO.updateMgvAllStoredPrograms_S", vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        delete("mgvAllStoredProgramsDAO.deleteMgvAllStoredPrograms_S", vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 조회한 MGV_ALL_STORED_PROGRAMS
	 * @exception Exception
	 */
    public MgvAllStoredProgramsVO selectMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        return (MgvAllStoredProgramsVO) selectByPk("mgvAllStoredProgramsDAO.selectMgvAllStoredPrograms_S", vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_STORED_PROGRAMS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllStoredProgramsList(MgvAllStoredProgramsVO vo) throws Exception {
        return list("mgvAllStoredProgramsDAO.selectMgvAllStoredProgramsList_D", vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_STORED_PROGRAMS 총 갯수
	 * @exception
	 */
    public int selectMgvAllStoredProgramsListTotCnt(MgvAllStoredProgramsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllStoredProgramsDAO.selectMgvAllStoredProgramsListTotCnt_S", vo);
    }

}
