package kr.godsoft.egovframe.generatorwebapp.md_columns.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_columns.service.MdColumnsVO;

/**
 * @Class Name : MdColumnsDAO.java
 * @Description : MdColumns DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdColumnsDAO")
public class MdColumnsDAO extends EgovAbstractDAO {

	/**
	 * MD_COLUMNS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdColumns(MdColumnsVO vo) throws Exception {
        return (String)insert("mdColumnsDAO.insertMdColumns_S", vo);
    }

    /**
	 * MD_COLUMNS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdColumnsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdColumns(MdColumnsVO vo) throws Exception {
        update("mdColumnsDAO.updateMdColumns_S", vo);
    }

    /**
	 * MD_COLUMNS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdColumnsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdColumns(MdColumnsVO vo) throws Exception {
        delete("mdColumnsDAO.deleteMdColumns_S", vo);
    }

    /**
	 * MD_COLUMNS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdColumnsVO
	 * @return 조회한 MD_COLUMNS
	 * @exception Exception
	 */
    public MdColumnsVO selectMdColumns(MdColumnsVO vo) throws Exception {
        return (MdColumnsVO) selectByPk("mdColumnsDAO.selectMdColumns_S", vo);
    }

    /**
	 * MD_COLUMNS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_COLUMNS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdColumnsList(MdColumnsVO vo) throws Exception {
        return list("mdColumnsDAO.selectMdColumnsList_D", vo);
    }

    /**
	 * MD_COLUMNS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_COLUMNS 총 갯수
	 * @exception
	 */
    public int selectMdColumnsListTotCnt(MdColumnsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdColumnsDAO.selectMdColumnsListTotCnt_S", vo);
    }

}
