package kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_tables.service.MgvAllTablesVO;

/**
 * @Class Name : MgvAllTablesDAO.java
 * @Description : MgvAllTables DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllTablesDAO")
public class MgvAllTablesDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllTables(MgvAllTablesVO vo) throws Exception {
        return (String)insert("mgvAllTablesDAO.insertMgvAllTables_S", vo);
    }

    /**
	 * MGV_ALL_TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllTables(MgvAllTablesVO vo) throws Exception {
        update("mgvAllTablesDAO.updateMgvAllTables_S", vo);
    }

    /**
	 * MGV_ALL_TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllTables(MgvAllTablesVO vo) throws Exception {
        delete("mgvAllTablesDAO.deleteMgvAllTables_S", vo);
    }

    /**
	 * MGV_ALL_TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTablesVO
	 * @return 조회한 MGV_ALL_TABLES
	 * @exception Exception
	 */
    public MgvAllTablesVO selectMgvAllTables(MgvAllTablesVO vo) throws Exception {
        return (MgvAllTablesVO) selectByPk("mgvAllTablesDAO.selectMgvAllTables_S", vo);
    }

    /**
	 * MGV_ALL_TABLES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_TABLES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllTablesList(MgvAllTablesVO vo) throws Exception {
        return list("mgvAllTablesDAO.selectMgvAllTablesList_D", vo);
    }

    /**
	 * MGV_ALL_TABLES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_TABLES 총 갯수
	 * @exception
	 */
    public int selectMgvAllTablesListTotCnt(MgvAllTablesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllTablesDAO.selectMgvAllTablesListTotCnt_S", vo);
    }

}
