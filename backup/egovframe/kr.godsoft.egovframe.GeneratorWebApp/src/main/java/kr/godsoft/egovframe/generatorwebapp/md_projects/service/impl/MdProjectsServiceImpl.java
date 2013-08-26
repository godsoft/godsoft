package kr.godsoft.egovframe.generatorwebapp.md_projects.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsService;
import kr.godsoft.egovframe.generatorwebapp.md_projects.service.MdProjectsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdProjectsServiceImpl.java
 * @Description : MdProjects Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdProjectsService")
public class MdProjectsServiceImpl extends AbstractServiceImpl implements
        MdProjectsService {

    @Resource(name="mdProjectsDAO")
    private MdProjectsDAO mdProjectsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdProjectsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_PROJECTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdProjectsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdProjects(MdProjectsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdProjectsDAO.insertMdProjects(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_PROJECTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdProjectsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdProjects(MdProjectsVO vo) throws Exception {
        mdProjectsDAO.updateMdProjects(vo);
    }

    /**
	 * MD_PROJECTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdProjectsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdProjects(MdProjectsVO vo) throws Exception {
        mdProjectsDAO.deleteMdProjects(vo);
    }

    /**
	 * MD_PROJECTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdProjectsVO
	 * @return 조회한 MD_PROJECTS
	 * @exception Exception
	 */
    public MdProjectsVO selectMdProjects(MdProjectsVO vo) throws Exception {
        MdProjectsVO resultVO = mdProjectsDAO.selectMdProjects(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_PROJECTS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PROJECTS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdProjectsList(MdProjectsVO vo) throws Exception {
        return mdProjectsDAO.selectMdProjectsList(vo);
    }

    /**
	 * MD_PROJECTS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PROJECTS 총 갯수
	 * @exception
	 */
    public int selectMdProjectsListTotCnt(MdProjectsVO vo) {
		return mdProjectsDAO.selectMdProjectsListTotCnt(vo);
	}
    
}