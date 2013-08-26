package kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyService;
import kr.godsoft.egovframe.generatorwebapp.comtnroles_hierarchy.service.ComtnrolesHierarchyVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrolesHierarchyServiceImpl.java
 * @Description : ComtnrolesHierarchy Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrolesHierarchyService")
public class ComtnrolesHierarchyServiceImpl extends AbstractServiceImpl implements
        ComtnrolesHierarchyService {

    @Resource(name="comtnrolesHierarchyDAO")
    private ComtnrolesHierarchyDAO comtnrolesHierarchyDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrolesHierarchyIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNROLES_HIERARCHY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrolesHierarchyDAO.insertComtnrolesHierarchy(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNROLES_HIERARCHY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        comtnrolesHierarchyDAO.updateComtnrolesHierarchy(vo);
    }

    /**
	 * COMTNROLES_HIERARCHY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        comtnrolesHierarchyDAO.deleteComtnrolesHierarchy(vo);
    }

    /**
	 * COMTNROLES_HIERARCHY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrolesHierarchyVO
	 * @return 조회한 COMTNROLES_HIERARCHY
	 * @exception Exception
	 */
    public ComtnrolesHierarchyVO selectComtnrolesHierarchy(ComtnrolesHierarchyVO vo) throws Exception {
        ComtnrolesHierarchyVO resultVO = comtnrolesHierarchyDAO.selectComtnrolesHierarchy(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNROLES_HIERARCHY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNROLES_HIERARCHY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrolesHierarchyList(ComtnrolesHierarchyVO vo) throws Exception {
        return comtnrolesHierarchyDAO.selectComtnrolesHierarchyList(vo);
    }

    /**
	 * COMTNROLES_HIERARCHY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNROLES_HIERARCHY 총 갯수
	 * @exception
	 */
    public int selectComtnrolesHierarchyListTotCnt(ComtnrolesHierarchyVO vo) {
		return comtnrolesHierarchyDAO.selectComtnrolesHierarchyListTotCnt(vo);
	}
    
}
