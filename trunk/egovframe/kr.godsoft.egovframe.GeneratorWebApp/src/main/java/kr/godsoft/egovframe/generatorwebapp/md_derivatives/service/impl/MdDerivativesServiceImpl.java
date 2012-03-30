package kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesService;
import kr.godsoft.egovframe.generatorwebapp.md_derivatives.service.MdDerivativesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdDerivativesServiceImpl.java
 * @Description : MdDerivatives Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdDerivativesService")
public class MdDerivativesServiceImpl extends AbstractServiceImpl implements
        MdDerivativesService {

    @Resource(name="mdDerivativesDAO")
    private MdDerivativesDAO mdDerivativesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdDerivativesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_DERIVATIVES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdDerivativesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdDerivatives(MdDerivativesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdDerivativesDAO.insertMdDerivatives(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_DERIVATIVES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdDerivativesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdDerivatives(MdDerivativesVO vo) throws Exception {
        mdDerivativesDAO.updateMdDerivatives(vo);
    }

    /**
	 * MD_DERIVATIVES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdDerivativesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdDerivatives(MdDerivativesVO vo) throws Exception {
        mdDerivativesDAO.deleteMdDerivatives(vo);
    }

    /**
	 * MD_DERIVATIVES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdDerivativesVO
	 * @return 조회한 MD_DERIVATIVES
	 * @exception Exception
	 */
    public MdDerivativesVO selectMdDerivatives(MdDerivativesVO vo) throws Exception {
        MdDerivativesVO resultVO = mdDerivativesDAO.selectMdDerivatives(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_DERIVATIVES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_DERIVATIVES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdDerivativesList(MdDerivativesVO vo) throws Exception {
        return mdDerivativesDAO.selectMdDerivativesList(vo);
    }

    /**
	 * MD_DERIVATIVES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_DERIVATIVES 총 갯수
	 * @exception
	 */
    public int selectMdDerivativesListTotCnt(MdDerivativesVO vo) {
		return mdDerivativesDAO.selectMdDerivativesListTotCnt(vo);
	}
    
}
