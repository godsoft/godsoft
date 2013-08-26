package kr.godsoft.egovframe.generatorwebapp.md_tables.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_tables.service.MdTablesVO;

/**
 * @Class Name : MdTablesDAO.java
 * @Description : MdTables DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdTablesDAO")
public class MdTablesDAO extends EgovAbstractDAO {

	/**
	 * MD_TABLES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTablesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTables(MdTablesVO vo) throws Exception {
        return (String)insert("mdTablesDAO.insertMdTables_S", vo);
    }

    /**
	 * MD_TABLES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTablesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTables(MdTablesVO vo) throws Exception {
        update("mdTablesDAO.updateMdTables_S", vo);
    }

    /**
	 * MD_TABLES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTablesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTables(MdTablesVO vo) throws Exception {
        delete("mdTablesDAO.deleteMdTables_S", vo);
    }

    /**
	 * MD_TABLES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTablesVO
	 * @return 조회한 MD_TABLES
	 * @exception Exception
	 */
    public MdTablesVO selectMdTables(MdTablesVO vo) throws Exception {
        return (MdTablesVO) selectByPk("mdTablesDAO.selectMdTables_S", vo);
    }

    /**
	 * MD_TABLES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TABLES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdTablesList(MdTablesVO vo) throws Exception {
        return list("mdTablesDAO.selectMdTablesList_D", vo);
    }

    /**
	 * MD_TABLES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TABLES 총 갯수
	 * @exception
	 */
    public int selectMdTablesListTotCnt(MdTablesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdTablesDAO.selectMdTablesListTotCnt_S", vo);
    }

}
