package kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesVO;

/**
 * @Class Name : MdAdditionalPropertiesDAO.java
 * @Description : MdAdditionalProperties DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdAdditionalPropertiesDAO")
public class MdAdditionalPropertiesDAO extends EgovAbstractDAO {

	/**
	 * MD_ADDITIONAL_PROPERTIES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        return (String)insert("mdAdditionalPropertiesDAO.insertMdAdditionalProperties_S", vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        update("mdAdditionalPropertiesDAO.updateMdAdditionalProperties_S", vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        delete("mdAdditionalPropertiesDAO.deleteMdAdditionalProperties_S", vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 조회한 MD_ADDITIONAL_PROPERTIES
	 * @exception Exception
	 */
    public MdAdditionalPropertiesVO selectMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        return (MdAdditionalPropertiesVO) selectByPk("mdAdditionalPropertiesDAO.selectMdAdditionalProperties_S", vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_ADDITIONAL_PROPERTIES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdAdditionalPropertiesList(MdAdditionalPropertiesVO vo) throws Exception {
        return list("mdAdditionalPropertiesDAO.selectMdAdditionalPropertiesList_D", vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_ADDITIONAL_PROPERTIES 총 갯수
	 * @exception
	 */
    public int selectMdAdditionalPropertiesListTotCnt(MdAdditionalPropertiesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdAdditionalPropertiesDAO.selectMdAdditionalPropertiesListTotCnt_S", vo);
    }

}
