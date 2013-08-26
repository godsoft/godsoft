package kr.godsoft.egovframe.generatorwebapp.md_groups.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsService;
import kr.godsoft.egovframe.generatorwebapp.md_groups.service.MdGroupsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdGroupsServiceImpl.java
 * @Description : MdGroups Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdGroupsService")
public class MdGroupsServiceImpl extends AbstractServiceImpl implements
        MdGroupsService {

    @Resource(name="mdGroupsDAO")
    private MdGroupsDAO mdGroupsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdGroupsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_GROUPS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroups(MdGroupsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdGroupsDAO.insertMdGroups(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_GROUPS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroups(MdGroupsVO vo) throws Exception {
        mdGroupsDAO.updateMdGroups(vo);
    }

    /**
	 * MD_GROUPS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroups(MdGroupsVO vo) throws Exception {
        mdGroupsDAO.deleteMdGroups(vo);
    }

    /**
	 * MD_GROUPS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupsVO
	 * @return 조회한 MD_GROUPS
	 * @exception Exception
	 */
    public MdGroupsVO selectMdGroups(MdGroupsVO vo) throws Exception {
        MdGroupsVO resultVO = mdGroupsDAO.selectMdGroups(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_GROUPS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUPS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdGroupsList(MdGroupsVO vo) throws Exception {
        return mdGroupsDAO.selectMdGroupsList(vo);
    }

    /**
	 * MD_GROUPS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUPS 총 갯수
	 * @exception
	 */
    public int selectMdGroupsListTotCnt(MdGroupsVO vo) {
		return mdGroupsDAO.selectMdGroupsListTotCnt(vo);
	}
    
}
