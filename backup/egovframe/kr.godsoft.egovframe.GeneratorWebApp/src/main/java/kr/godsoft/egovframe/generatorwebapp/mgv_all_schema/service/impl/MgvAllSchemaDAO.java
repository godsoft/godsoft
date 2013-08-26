package kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaVO;

/**
 * @Class Name : MgvAllSchemaDAO.java
 * @Description : MgvAllSchema DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mgvAllSchemaDAO")
public class MgvAllSchemaDAO extends EgovAbstractDAO {

	/**
	 * MGV_ALL_SCHEMA을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllSchemaVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        return (String)insert("mgvAllSchemaDAO.insertMgvAllSchema_S", vo);
    }

    /**
	 * MGV_ALL_SCHEMA을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllSchemaVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        update("mgvAllSchemaDAO.updateMgvAllSchema_S", vo);
    }

    /**
	 * MGV_ALL_SCHEMA을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllSchemaVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        delete("mgvAllSchemaDAO.deleteMgvAllSchema_S", vo);
    }

    /**
	 * MGV_ALL_SCHEMA을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllSchemaVO
	 * @return 조회한 MGV_ALL_SCHEMA
	 * @exception Exception
	 */
    public MgvAllSchemaVO selectMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        return (MgvAllSchemaVO) selectByPk("mgvAllSchemaDAO.selectMgvAllSchema_S", vo);
    }

    /**
	 * MGV_ALL_SCHEMA 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_SCHEMA 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMgvAllSchemaList(MgvAllSchemaVO vo) throws Exception {
        return list("mgvAllSchemaDAO.selectMgvAllSchemaList_D", vo);
    }

    /**
	 * MGV_ALL_SCHEMA 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MGV_ALL_SCHEMA 총 갯수
	 * @exception
	 */
    public int selectMgvAllSchemaListTotCnt(MgvAllSchemaVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mgvAllSchemaDAO.selectMgvAllSchemaListTotCnt_S", vo);
    }

}
