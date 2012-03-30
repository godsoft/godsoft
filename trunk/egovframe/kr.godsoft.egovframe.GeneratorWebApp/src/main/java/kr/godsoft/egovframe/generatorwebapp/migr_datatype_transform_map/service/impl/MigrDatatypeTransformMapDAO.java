package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapVO;

/**
 * @Class Name : MigrDatatypeTransformMapDAO.java
 * @Description : MigrDatatypeTransformMap DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("migrDatatypeTransformMapDAO")
public class MigrDatatypeTransformMapDAO extends EgovAbstractDAO {

	/**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        return (String)insert("migrDatatypeTransformMapDAO.insertMigrDatatypeTransformMap_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        update("migrDatatypeTransformMapDAO.updateMigrDatatypeTransformMap_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        delete("migrDatatypeTransformMapDAO.deleteMigrDatatypeTransformMap_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 조회한 MIGR_DATATYPE_TRANSFORM_MAP
	 * @exception Exception
	 */
    public MigrDatatypeTransformMapVO selectMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        return (MigrDatatypeTransformMapVO) selectByPk("migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMap_S", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMigrDatatypeTransformMapList(MigrDatatypeTransformMapVO vo) throws Exception {
        return list("migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMapList_D", vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 총 갯수
	 * @exception
	 */
    public int selectMigrDatatypeTransformMapListTotCnt(MigrDatatypeTransformMapVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMapListTotCnt_S", vo);
    }

}
