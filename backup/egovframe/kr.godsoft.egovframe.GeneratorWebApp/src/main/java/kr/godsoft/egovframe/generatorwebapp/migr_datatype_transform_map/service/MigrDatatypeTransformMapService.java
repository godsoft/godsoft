package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MigrDatatypeTransformMapService.java
 * @Description : MigrDatatypeTransformMap Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MigrDatatypeTransformMapService {
	
	/**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 조회한 MIGR_DATATYPE_TRANSFORM_MAP
	 * @exception Exception
	 */
    MigrDatatypeTransformMapVO selectMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMigrDatatypeTransformMapList(MigrDatatypeTransformMapVO vo) throws Exception;
    
    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 총 갯수
	 * @exception
	 */
    int selectMigrDatatypeTransformMapListTotCnt(MigrDatatypeTransformMapVO vo);
    
}
