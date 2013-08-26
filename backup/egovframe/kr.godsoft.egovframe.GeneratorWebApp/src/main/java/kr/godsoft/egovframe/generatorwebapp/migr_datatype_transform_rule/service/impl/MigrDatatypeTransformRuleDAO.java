package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_rule.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_rule.service.MigrDatatypeTransformRuleVO;

/**
 * @Class Name : MigrDatatypeTransformRuleDAO.java
 * @Description : MigrDatatypeTransformRule DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("migrDatatypeTransformRuleDAO")
public class MigrDatatypeTransformRuleDAO extends EgovAbstractDAO {

	/**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception {
        return (String)insert("migrDatatypeTransformRuleDAO.insertMigrDatatypeTransformRule_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception {
        update("migrDatatypeTransformRuleDAO.updateMigrDatatypeTransformRule_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception {
        delete("migrDatatypeTransformRuleDAO.deleteMigrDatatypeTransformRule_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return 조회한 MIGR_DATATYPE_TRANSFORM_RULE
	 * @exception Exception
	 */
    public MigrDatatypeTransformRuleVO selectMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception {
        return (MigrDatatypeTransformRuleVO) selectByPk("migrDatatypeTransformRuleDAO.selectMigrDatatypeTransformRule_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_DATATYPE_TRANSFORM_RULE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMigrDatatypeTransformRuleList(MigrDatatypeTransformRuleVO vo) throws Exception {
        return list("migrDatatypeTransformRuleDAO.selectMigrDatatypeTransformRuleList_D", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_DATATYPE_TRANSFORM_RULE 총 갯수
	 * @exception
	 */
    public int selectMigrDatatypeTransformRuleListTotCnt(MigrDatatypeTransformRuleVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("migrDatatypeTransformRuleDAO.selectMigrDatatypeTransformRuleListTotCnt_S", vo);
    }

}
