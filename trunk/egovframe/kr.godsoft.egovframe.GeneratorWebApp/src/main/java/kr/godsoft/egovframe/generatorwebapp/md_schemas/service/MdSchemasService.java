package kr.godsoft.egovframe.generatorwebapp.md_schemas.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdSchemasService.java
 * @Description : MdSchemas Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdSchemasService {
	
	/**
	 * MD_SCHEMAS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSchemasVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdSchemas(MdSchemasVO vo) throws Exception;
    
    /**
	 * MD_SCHEMAS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSchemasVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdSchemas(MdSchemasVO vo) throws Exception;
    
    /**
	 * MD_SCHEMAS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSchemasVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdSchemas(MdSchemasVO vo) throws Exception;
    
    /**
	 * MD_SCHEMAS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSchemasVO
	 * @return 조회한 MD_SCHEMAS
	 * @exception Exception
	 */
    MdSchemasVO selectMdSchemas(MdSchemasVO vo) throws Exception;
    
    /**
	 * MD_SCHEMAS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SCHEMAS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdSchemasList(MdSchemasVO vo) throws Exception;
    
    /**
	 * MD_SCHEMAS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SCHEMAS 총 갯수
	 * @exception
	 */
    int selectMdSchemasListTotCnt(MdSchemasVO vo);
    
}