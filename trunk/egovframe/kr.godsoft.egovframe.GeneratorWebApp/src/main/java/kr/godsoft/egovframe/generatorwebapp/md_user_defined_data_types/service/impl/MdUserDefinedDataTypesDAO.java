package kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesVO;

/**
 * @Class Name : MdUserDefinedDataTypesDAO.java
 * @Description : MdUserDefinedDataTypes DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdUserDefinedDataTypesDAO")
public class MdUserDefinedDataTypesDAO extends EgovAbstractDAO {

	/**
	 * MD_USER_DEFINED_DATA_TYPES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        return (String)insert("mdUserDefinedDataTypesDAO.insertMdUserDefinedDataTypes_S", vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        update("mdUserDefinedDataTypesDAO.updateMdUserDefinedDataTypes_S", vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        delete("mdUserDefinedDataTypesDAO.deleteMdUserDefinedDataTypes_S", vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return 조회한 MD_USER_DEFINED_DATA_TYPES
	 * @exception Exception
	 */
    public MdUserDefinedDataTypesVO selectMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        return (MdUserDefinedDataTypesVO) selectByPk("mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypes_S", vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USER_DEFINED_DATA_TYPES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdUserDefinedDataTypesList(MdUserDefinedDataTypesVO vo) throws Exception {
        return list("mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypesList_D", vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_USER_DEFINED_DATA_TYPES 총 갯수
	 * @exception
	 */
    public int selectMdUserDefinedDataTypesListTotCnt(MdUserDefinedDataTypesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypesListTotCnt_S", vo);
    }

}
