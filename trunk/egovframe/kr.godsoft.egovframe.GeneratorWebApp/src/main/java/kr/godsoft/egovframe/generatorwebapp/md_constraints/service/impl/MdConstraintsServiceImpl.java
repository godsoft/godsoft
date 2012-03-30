package kr.godsoft.egovframe.generatorwebapp.md_constraints.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsService;
import kr.godsoft.egovframe.generatorwebapp.md_constraints.service.MdConstraintsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdConstraintsServiceImpl.java
 * @Description : MdConstraints Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdConstraintsService")
public class MdConstraintsServiceImpl extends AbstractServiceImpl implements
        MdConstraintsService {

    @Resource(name="mdConstraintsDAO")
    private MdConstraintsDAO mdConstraintsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdConstraintsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_CONSTRAINTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConstraintsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdConstraints(MdConstraintsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdConstraintsDAO.insertMdConstraints(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_CONSTRAINTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConstraintsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdConstraints(MdConstraintsVO vo) throws Exception {
        mdConstraintsDAO.updateMdConstraints(vo);
    }

    /**
	 * MD_CONSTRAINTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConstraintsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdConstraints(MdConstraintsVO vo) throws Exception {
        mdConstraintsDAO.deleteMdConstraints(vo);
    }

    /**
	 * MD_CONSTRAINTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConstraintsVO
	 * @return 조회한 MD_CONSTRAINTS
	 * @exception Exception
	 */
    public MdConstraintsVO selectMdConstraints(MdConstraintsVO vo) throws Exception {
        MdConstraintsVO resultVO = mdConstraintsDAO.selectMdConstraints(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_CONSTRAINTS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINTS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdConstraintsList(MdConstraintsVO vo) throws Exception {
        return mdConstraintsDAO.selectMdConstraintsList(vo);
    }

    /**
	 * MD_CONSTRAINTS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CONSTRAINTS 총 갯수
	 * @exception
	 */
    public int selectMdConstraintsListTotCnt(MdConstraintsVO vo) {
		return mdConstraintsDAO.selectMdConstraintsListTotCnt(vo);
	}
    
}
