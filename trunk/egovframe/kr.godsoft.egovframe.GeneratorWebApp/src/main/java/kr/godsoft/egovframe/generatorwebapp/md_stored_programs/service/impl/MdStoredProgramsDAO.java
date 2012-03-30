package kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_stored_programs.service.MdStoredProgramsVO;

/**
 * @Class Name : MdStoredProgramsDAO.java
 * @Description : MdStoredPrograms DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdStoredProgramsDAO")
public class MdStoredProgramsDAO extends EgovAbstractDAO {

	/**
	 * MD_STORED_PROGRAMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdStoredProgramsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdStoredPrograms(MdStoredProgramsVO vo) throws Exception {
        return (String)insert("mdStoredProgramsDAO.insertMdStoredPrograms_S", vo);
    }

    /**
	 * MD_STORED_PROGRAMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdStoredProgramsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdStoredPrograms(MdStoredProgramsVO vo) throws Exception {
        update("mdStoredProgramsDAO.updateMdStoredPrograms_S", vo);
    }

    /**
	 * MD_STORED_PROGRAMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdStoredProgramsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdStoredPrograms(MdStoredProgramsVO vo) throws Exception {
        delete("mdStoredProgramsDAO.deleteMdStoredPrograms_S", vo);
    }

    /**
	 * MD_STORED_PROGRAMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdStoredProgramsVO
	 * @return 조회한 MD_STORED_PROGRAMS
	 * @exception Exception
	 */
    public MdStoredProgramsVO selectMdStoredPrograms(MdStoredProgramsVO vo) throws Exception {
        return (MdStoredProgramsVO) selectByPk("mdStoredProgramsDAO.selectMdStoredPrograms_S", vo);
    }

    /**
	 * MD_STORED_PROGRAMS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_STORED_PROGRAMS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdStoredProgramsList(MdStoredProgramsVO vo) throws Exception {
        return list("mdStoredProgramsDAO.selectMdStoredProgramsList_D", vo);
    }

    /**
	 * MD_STORED_PROGRAMS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_STORED_PROGRAMS 총 갯수
	 * @exception
	 */
    public int selectMdStoredProgramsListTotCnt(MdStoredProgramsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdStoredProgramsDAO.selectMdStoredProgramsListTotCnt_S", vo);
    }

}
