package kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapService;
import kr.godsoft.egovframe.generatorwebapp.migr_datatype_transform_map.service.MigrDatatypeTransformMapVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MigrDatatypeTransformMapServiceImpl.java
 * @Description : MigrDatatypeTransformMap Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("migrDatatypeTransformMapService")
public class MigrDatatypeTransformMapServiceImpl extends AbstractServiceImpl implements
        MigrDatatypeTransformMapService {

    @Resource(name="migrDatatypeTransformMapDAO")
    private MigrDatatypeTransformMapDAO migrDatatypeTransformMapDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMigrDatatypeTransformMapIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	migrDatatypeTransformMapDAO.insertMigrDatatypeTransformMap(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        migrDatatypeTransformMapDAO.updateMigrDatatypeTransformMap(vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        migrDatatypeTransformMapDAO.deleteMigrDatatypeTransformMap(vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrDatatypeTransformMapVO
	 * @return 조회한 MIGR_DATATYPE_TRANSFORM_MAP
	 * @exception Exception
	 */
    public MigrDatatypeTransformMapVO selectMigrDatatypeTransformMap(MigrDatatypeTransformMapVO vo) throws Exception {
        MigrDatatypeTransformMapVO resultVO = migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMap(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMigrDatatypeTransformMapList(MigrDatatypeTransformMapVO vo) throws Exception {
        return migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMapList(vo);
    }

    /**
	 * MIGR_DATATYPE_TRANSFORM_MAP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGR_DATATYPE_TRANSFORM_MAP 총 갯수
	 * @exception
	 */
    public int selectMigrDatatypeTransformMapListTotCnt(MigrDatatypeTransformMapVO vo) {
		return migrDatatypeTransformMapDAO.selectMigrDatatypeTransformMapListTotCnt(vo);
	}
    
}
