package kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesService;
import kr.godsoft.egovframe.generatorwebapp.md_additional_properties.service.MdAdditionalPropertiesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdAdditionalPropertiesServiceImpl.java
 * @Description : MdAdditionalProperties Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdAdditionalPropertiesService")
public class MdAdditionalPropertiesServiceImpl extends AbstractServiceImpl implements
        MdAdditionalPropertiesService {

    @Resource(name="mdAdditionalPropertiesDAO")
    private MdAdditionalPropertiesDAO mdAdditionalPropertiesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdAdditionalPropertiesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_ADDITIONAL_PROPERTIES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdAdditionalPropertiesDAO.insertMdAdditionalProperties(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        mdAdditionalPropertiesDAO.updateMdAdditionalProperties(vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        mdAdditionalPropertiesDAO.deleteMdAdditionalProperties(vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdAdditionalPropertiesVO
	 * @return 조회한 MD_ADDITIONAL_PROPERTIES
	 * @exception Exception
	 */
    public MdAdditionalPropertiesVO selectMdAdditionalProperties(MdAdditionalPropertiesVO vo) throws Exception {
        MdAdditionalPropertiesVO resultVO = mdAdditionalPropertiesDAO.selectMdAdditionalProperties(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_ADDITIONAL_PROPERTIES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdAdditionalPropertiesList(MdAdditionalPropertiesVO vo) throws Exception {
        return mdAdditionalPropertiesDAO.selectMdAdditionalPropertiesList(vo);
    }

    /**
	 * MD_ADDITIONAL_PROPERTIES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_ADDITIONAL_PROPERTIES 총 갯수
	 * @exception
	 */
    public int selectMdAdditionalPropertiesListTotCnt(MdAdditionalPropertiesVO vo) {
		return mdAdditionalPropertiesDAO.selectMdAdditionalPropertiesListTotCnt(vo);
	}
    
}
