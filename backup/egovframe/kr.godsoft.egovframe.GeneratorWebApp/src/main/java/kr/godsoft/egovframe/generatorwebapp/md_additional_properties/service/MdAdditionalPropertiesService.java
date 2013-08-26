package kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdAdditionalPropertiesService.java
 * @Description : MdAdditionalProperties Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdAdditionalPropertiesService {
	
	/**
	 * MD_ADDITIONAL_PROPERTIES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception;
    
    /**
	 * MD_ADDITIONAL_PROPERTIES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception;
    
    /**
	 * MD_ADDITIONAL_PROPERTIES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception;
    
    /**
	 * MD_ADDITIONAL_PROPERTIES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 조회한 MD_ADDITIONAL_PROPERTIES
	 * @exception Exception
	 */
    MdAdditionalPropertiesVO selectMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception;
    
    /**
	 * MD_ADDITIONAL_PROPERTIES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_ADDITIONAL_PROPERTIES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdAdditionalPropertiesList(MdAdditionalPropertiesVO vo) throws Exception;
    
    /**
	 * MD_ADDITIONAL_PROPERTIES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_ADDITIONAL_PROPERTIES 총 갯수
	 * @exception
	 */
    int selectMdAdditionalPropertiesListTotCnt(MdAdditionalPropertiesVO vo);
    
}
