package kr.godsoft.egovframe.generatorwebapp.md_schemas.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasVO;

/**
 * @Class Name : MdSchemasDAO.java
 * @Description : MdSchemas DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdSchemasDAO")
public class MdSchemasDAO extends EgovAbstractDAO {

	/**
	 * MD_SCHEMAS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSchemasVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSchemas(MdSchemasVO vo) throws Exception {
        return (String)insert("mdSchemasDAO.insertMdSchemas_S", vo);
    }

    /**
	 * MD_SCHEMAS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSchemasVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSchemas(MdSchemasVO vo) throws Exception {
        update("mdSchemasDAO.updateMdSchemas_S", vo);
    }

    /**
	 * MD_SCHEMAS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSchemasVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSchemas(MdSchemasVO vo) throws Exception {
        delete("mdSchemasDAO.deleteMdSchemas_S", vo);
    }

    /**
	 * MD_SCHEMAS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSchemasVO
	 * @return 조회한 MD_SCHEMAS
	 * @exception Exception
	 */
    public MdSchemasVO selectMdSchemas(MdSchemasVO vo) throws Exception {
        return (MdSchemasVO) selectByPk("mdSchemasDAO.selectMdSchemas_S", vo);
    }

    /**
	 * MD_SCHEMAS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SCHEMAS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdSchemasList(MdSchemasVO vo) throws Exception {
        return list("mdSchemasDAO.selectMdSchemasList_D", vo);
    }

    /**
	 * MD_SCHEMAS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SCHEMAS 총 갯수
	 * @exception
	 */
    public int selectMdSchemasListTotCnt(MdSchemasVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdSchemasDAO.selectMdSchemasListTotCnt_S", vo);
    }

}
