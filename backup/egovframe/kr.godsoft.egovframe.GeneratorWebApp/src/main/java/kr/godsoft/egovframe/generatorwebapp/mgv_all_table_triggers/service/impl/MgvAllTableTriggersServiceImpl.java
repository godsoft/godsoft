package kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_table_triggers.service.MgvAllTableTriggersVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllTableTriggersServiceImpl.java
 * @Description : MgvAllTableTriggers Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllTableTriggersService")
public class MgvAllTableTriggersServiceImpl extends AbstractServiceImpl implements
        MgvAllTableTriggersService {

    @Resource(name="mgvAllTableTriggersDAO")
    private MgvAllTableTriggersDAO mgvAllTableTriggersDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllTableTriggersIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_TABLE_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllTableTriggersDAO.insertMgvAllTableTriggers(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        mgvAllTableTriggersDAO.updateMgvAllTableTriggers(vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllTableTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        mgvAllTableTriggersDAO.deleteMgvAllTableTriggers(vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllTableTriggersVO
	 * @return 조회한 MGV_ALL_TABLE_TRIGGERS
	 * @exception Exception
	 */
    public MgvAllTableTriggersVO selectMgvAllTableTriggers(MgvAllTableTriggersVO vo) throws Exception {
        MgvAllTableTriggersVO resultVO = mgvAllTableTriggersDAO.selectMgvAllTableTriggers(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLE_TRIGGERS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllTableTriggersList(MgvAllTableTriggersVO vo) throws Exception {
        return mgvAllTableTriggersDAO.selectMgvAllTableTriggersList(vo);
    }

    /**
	 * MGV_ALL_TABLE_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_TABLE_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMgvAllTableTriggersListTotCnt(MgvAllTableTriggersVO vo) {
		return mgvAllTableTriggersDAO.selectMgvAllTableTriggersListTotCnt(vo);
	}
    
}
