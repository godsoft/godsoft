package kr.godsoft.egovframe.generatorwebapp.md_triggers.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersService;
import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdTriggersServiceImpl.java
 * @Description : MdTriggers Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdTriggersService")
public class MdTriggersServiceImpl extends AbstractServiceImpl implements
        MdTriggersService {

    @Resource(name="mdTriggersDAO")
    private MdTriggersDAO mdTriggersDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdTriggersIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTriggers(MdTriggersVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdTriggersDAO.insertMdTriggers(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTriggers(MdTriggersVO vo) throws Exception {
        mdTriggersDAO.updateMdTriggers(vo);
    }

    /**
	 * MD_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTriggers(MdTriggersVO vo) throws Exception {
        mdTriggersDAO.deleteMdTriggers(vo);
    }

    /**
	 * MD_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTriggersVO
	 * @return 조회한 MD_TRIGGERS
	 * @exception Exception
	 */
    public MdTriggersVO selectMdTriggers(MdTriggersVO vo) throws Exception {
        MdTriggersVO resultVO = mdTriggersDAO.selectMdTriggers(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_TRIGGERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TRIGGERS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdTriggersList(MdTriggersVO vo) throws Exception {
        return mdTriggersDAO.selectMdTriggersList(vo);
    }

    /**
	 * MD_TRIGGERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMdTriggersListTotCnt(MdTriggersVO vo) {
		return mdTriggersDAO.selectMdTriggersListTotCnt(vo);
	}
    
}
