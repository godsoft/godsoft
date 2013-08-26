package kr.godsoft.egovframe.generator.tables.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generator.tables.service.TablesVO;
import kr.godsoft.egovframe.generator.tables.service.TablesDefaultVO;

/**
 * @Class Name : TablesDAO.java
 * @Description : Tables DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-01-29
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("tablesDAO")
public class TablesDAO extends EgovAbstractDAO {

	/**
	 * TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 TablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertTables(TablesVO vo) throws Exception {
        return (String)insert("tablesDAO.insertTables_S", vo);
    }

    /**
	 * TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 TablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateTables(TablesVO vo) throws Exception {
        update("tablesDAO.updateTables_S", vo);
    }

    /**
	 * TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 TablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteTables(TablesVO vo) throws Exception {
        delete("tablesDAO.deleteTables_S", vo);
    }

    /**
	 * TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 TablesVO
	 * @return 조회한 TABLES
	 * @exception Exception
	 */
    public TablesVO selectTables(TablesVO vo) throws Exception {
        return (TablesVO) selectByPk("tablesDAO.selectTables_S", vo);
    }

    /**
	 * TABLES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return TABLES 목록
	 * @exception Exception
	 */
    public List selectTablesList(TablesDefaultVO searchVO) throws Exception {
        return list("tablesDAO.selectTablesList_D", searchVO);
    }

    /**
	 * TABLES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return TABLES 총 갯수
	 * @exception
	 */
    public int selectTablesListTotCnt(TablesDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("tablesDAO.selectTablesListTotCnt_S", searchVO);
    }

}
