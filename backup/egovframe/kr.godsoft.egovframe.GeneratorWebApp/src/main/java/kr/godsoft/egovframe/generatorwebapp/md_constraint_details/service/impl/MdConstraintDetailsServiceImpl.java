package kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsService;
import kr.godsoft.egovframe.generatorwebapp.md_constraint_details.service.MdConstraintDetailsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdConstraintDetailsServiceImpl.java
 * @Description : MdConstraintDetails Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdConstraintDetailsService")
public class MdConstraintDetailsServiceImpl extends AbstractServiceImpl implements
        MdConstraintDetailsService {

    @Resource(name="mdConstraintDetailsDAO")
    private MdConstraintDetailsDAO mdConstraintDetailsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdConstraintDetailsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_CONSTRAINT_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdConstraintDetailsDAO.insertMdConstraintDetails(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        mdConstraintDetailsDAO.updateMdConstraintDetails(vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        mdConstraintDetailsDAO.deleteMdConstraintDetails(vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintDetailsVO
	 * @return 조회한 MD_CONSTRAINT_DETAILS
	 * @exception Exception
	 */
    public MdConstraintDetailsVO selectMdConstraintDetails(MdConstraintDetailsVO vo) throws Exception {
        MdConstraintDetailsVO resultVO = mdConstraintDetailsDAO.selectMdConstraintDetails(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_CONSTRAINT_DETAILS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINT_DETAILS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdConstraintDetailsList(MdConstraintDetailsVO vo) throws Exception {
        return mdConstraintDetailsDAO.selectMdConstraintDetailsList(vo);
    }

    /**
	 * MD_CONSTRAINT_DETAILS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINT_DETAILS 총 갯수
	 * @exception
	 */
    public int selectMdConstraintDetailsListTotCnt(MdConstraintDetailsVO vo) {
		return mdConstraintDetailsDAO.selectMdConstraintDetailsListTotCnt(vo);
	}
    
}
