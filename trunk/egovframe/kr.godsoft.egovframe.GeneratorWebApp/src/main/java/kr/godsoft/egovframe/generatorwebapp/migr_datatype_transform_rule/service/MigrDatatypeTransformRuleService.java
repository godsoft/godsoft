package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_rule.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MigrDatatypeTransformRuleService.java
 * @Description : MigrDatatypeTransformRule Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MigrDatatypeTransformRuleService {
	
	/**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrDatatypeTransformRuleVO
	 * @return 조회한 MIGR_DATATYPE_TRANSFORM_RULE
	 * @exception Exception
	 */
    MigrDatatypeTransformRuleVO selectMigrDatatypeTransformRule(MigrDatatypeTransformRuleVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_RULE 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMigrDatatypeTransformRuleList(MigrDatatypeTransformRuleVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_RULE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_RULE 총 갯수
	 * @exception
	 */
    int selectMigrDatatypeTransformRuleListTotCnt(MigrDatatypeTransformRuleVO vo);
    
}
