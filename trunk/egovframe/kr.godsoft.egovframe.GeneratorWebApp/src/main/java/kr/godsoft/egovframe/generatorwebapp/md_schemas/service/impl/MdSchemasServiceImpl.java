package kr.godsoft.egovframe.generatorwebapp.md_schemas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasService;
import kr.godsoft.egovframe.generatorwebapp.md_schemas.service.MdSchemasVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdSchemasServiceImpl.java
 * @Description : MdSchemas Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdSchemasService")
public class MdSchemasServiceImpl extends AbstractServiceImpl implements
        MdSchemasService {

    @Resource(name="mdSchemasDAO")
    private MdSchemasDAO mdSchemasDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdSchemasIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_SCHEMAS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSchemasVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSchemas(MdSchemasVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdSchemasDAO.insertMdSchemas(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_SCHEMAS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSchemasVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSchemas(MdSchemasVO vo) throws Exception {
        mdSchemasDAO.updateMdSchemas(vo);
    }

    /**
	 * MD_SCHEMAS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSchemasVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSchemas(MdSchemasVO vo) throws Exception {
        mdSchemasDAO.deleteMdSchemas(vo);
    }

    /**
	 * MD_SCHEMAS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSchemasVO
	 * @return 조회한 MD_SCHEMAS
	 * @exception Exception
	 */
    public MdSchemasVO selectMdSchemas(MdSchemasVO vo) throws Exception {
        MdSchemasVO resultVO = mdSchemasDAO.selectMdSchemas(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_SCHEMAS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SCHEMAS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdSchemasList(MdSchemasVO vo) throws Exception {
        return mdSchemasDAO.selectMdSchemasList(vo);
    }

    /**
	 * MD_SCHEMAS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SCHEMAS 총 갯수
	 * @exception
	 */
    public int selectMdSchemasListTotCnt(MdSchemasVO vo) {
		return mdSchemasDAO.selectMdSchemasListTotCnt(vo);
	}
    
}
