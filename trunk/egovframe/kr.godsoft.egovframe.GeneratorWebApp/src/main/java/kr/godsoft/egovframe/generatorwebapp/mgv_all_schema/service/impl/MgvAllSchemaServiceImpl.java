package kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_schema.service.MgvAllSchemaVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllSchemaServiceImpl.java
 * @Description : MgvAllSchema Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllSchemaService")
public class MgvAllSchemaServiceImpl extends AbstractServiceImpl implements
        MgvAllSchemaService {

    @Resource(name="mgvAllSchemaDAO")
    private MgvAllSchemaDAO mgvAllSchemaDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllSchemaIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_SCHEMA을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllSchemaVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllSchemaDAO.insertMgvAllSchema(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_SCHEMA을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllSchemaVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        mgvAllSchemaDAO.updateMgvAllSchema(vo);
    }

    /**
	 * MGV_ALL_SCHEMA을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllSchemaVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        mgvAllSchemaDAO.deleteMgvAllSchema(vo);
    }

    /**
	 * MGV_ALL_SCHEMA을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllSchemaVO
	 * @return 조회한 MGV_ALL_SCHEMA
	 * @exception Exception
	 */
    public MgvAllSchemaVO selectMgvAllSchema(MgvAllSchemaVO vo) throws Exception {
        MgvAllSchemaVO resultVO = mgvAllSchemaDAO.selectMgvAllSchema(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_SCHEMA 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_SCHEMA 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllSchemaList(MgvAllSchemaVO vo) throws Exception {
        return mgvAllSchemaDAO.selectMgvAllSchemaList(vo);
    }

    /**
	 * MGV_ALL_SCHEMA 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_SCHEMA 총 갯수
	 * @exception
	 */
    public int selectMgvAllSchemaListTotCnt(MgvAllSchemaVO vo) {
		return mgvAllSchemaDAO.selectMgvAllSchemaListTotCnt(vo);
	}
    
}
