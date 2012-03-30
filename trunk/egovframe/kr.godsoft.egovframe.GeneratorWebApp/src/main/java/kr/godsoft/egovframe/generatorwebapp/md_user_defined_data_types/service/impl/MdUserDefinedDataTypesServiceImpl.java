package kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesService;
import kr.godsoft.egovframe.generatorwebapp.md_user_defined_data_types.service.MdUserDefinedDataTypesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdUserDefinedDataTypesServiceImpl.java
 * @Description : MdUserDefinedDataTypes Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdUserDefinedDataTypesService")
public class MdUserDefinedDataTypesServiceImpl extends AbstractServiceImpl implements
        MdUserDefinedDataTypesService {

    @Resource(name="mdUserDefinedDataTypesDAO")
    private MdUserDefinedDataTypesDAO mdUserDefinedDataTypesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdUserDefinedDataTypesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_USER_DEFINED_DATA_TYPES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdUserDefinedDataTypesDAO.insertMdUserDefinedDataTypes(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        mdUserDefinedDataTypesDAO.updateMdUserDefinedDataTypes(vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        mdUserDefinedDataTypesDAO.deleteMdUserDefinedDataTypes(vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUserDefinedDataTypesVO
	 * @return 조회한 MD_USER_DEFINED_DATA_TYPES
	 * @exception Exception
	 */
    public MdUserDefinedDataTypesVO selectMdUserDefinedDataTypes(MdUserDefinedDataTypesVO vo) throws Exception {
        MdUserDefinedDataTypesVO resultVO = mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypes(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_DEFINED_DATA_TYPES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdUserDefinedDataTypesList(MdUserDefinedDataTypesVO vo) throws Exception {
        return mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypesList(vo);
    }

    /**
	 * MD_USER_DEFINED_DATA_TYPES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_DEFINED_DATA_TYPES 총 갯수
	 * @exception
	 */
    public int selectMdUserDefinedDataTypesListTotCnt(MdUserDefinedDataTypesVO vo) {
		return mdUserDefinedDataTypesDAO.selectMdUserDefinedDataTypesListTotCnt(vo);
	}
    
}
