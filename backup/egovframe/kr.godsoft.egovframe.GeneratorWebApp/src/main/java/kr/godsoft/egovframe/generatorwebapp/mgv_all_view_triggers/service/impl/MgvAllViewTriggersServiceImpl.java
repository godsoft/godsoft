package kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service.MgvAllViewTriggersService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_view_triggers.service.MgvAllViewTriggersVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllViewTriggersServiceImpl.java
 * @Description : MgvAllViewTriggers Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllViewTriggersService")
public class MgvAllViewTriggersServiceImpl extends AbstractServiceImpl implements
        MgvAllViewTriggersService {

    @Resource(name="mgvAllViewTriggersDAO")
    private MgvAllViewTriggersDAO mgvAllViewTriggersDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllViewTriggersIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_VIEW_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllViewTriggersDAO.insertMgvAllViewTriggers(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        mgvAllViewTriggersDAO.updateMgvAllViewTriggers(vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllViewTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        mgvAllViewTriggersDAO.deleteMgvAllViewTriggers(vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllViewTriggersVO
	 * @return 조회한 MGV_ALL_VIEW_TRIGGERS
	 * @exception Exception
	 */
    public MgvAllViewTriggersVO selectMgvAllViewTriggers(MgvAllViewTriggersVO vo) throws Exception {
        MgvAllViewTriggersVO resultVO = mgvAllViewTriggersDAO.selectMgvAllViewTriggers(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEW_TRIGGERS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllViewTriggersList(MgvAllViewTriggersVO vo) throws Exception {
        return mgvAllViewTriggersDAO.selectMgvAllViewTriggersList(vo);
    }

    /**
	 * MGV_ALL_VIEW_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_VIEW_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMgvAllViewTriggersListTotCnt(MgvAllViewTriggersVO vo) {
		return mgvAllViewTriggersDAO.selectMgvAllViewTriggersListTotCnt(vo);
	}
    
}