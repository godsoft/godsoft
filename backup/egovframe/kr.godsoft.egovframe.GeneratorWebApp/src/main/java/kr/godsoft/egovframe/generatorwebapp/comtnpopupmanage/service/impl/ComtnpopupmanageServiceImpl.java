package kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnpopupmanage.service.ComtnpopupmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnpopupmanageServiceImpl.java
 * @Description : Comtnpopupmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnpopupmanageService")
public class ComtnpopupmanageServiceImpl extends AbstractServiceImpl implements
        ComtnpopupmanageService {

    @Resource(name="comtnpopupmanageDAO")
    private ComtnpopupmanageDAO comtnpopupmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnpopupmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNPOPUPMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnpopupmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnpopupmanageDAO.insertComtnpopupmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNPOPUPMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        comtnpopupmanageDAO.updateComtnpopupmanage(vo);
    }

    /**
	 * COMTNPOPUPMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnpopupmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        comtnpopupmanageDAO.deleteComtnpopupmanage(vo);
    }

    /**
	 * COMTNPOPUPMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnpopupmanageVO
	 * @return 조회한 COMTNPOPUPMANAGE
	 * @exception Exception
	 */
    public ComtnpopupmanageVO selectComtnpopupmanage(ComtnpopupmanageVO vo) throws Exception {
        ComtnpopupmanageVO resultVO = comtnpopupmanageDAO.selectComtnpopupmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNPOPUPMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPOPUPMANAGE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnpopupmanageList(ComtnpopupmanageVO vo) throws Exception {
        return comtnpopupmanageDAO.selectComtnpopupmanageList(vo);
    }

    /**
	 * COMTNPOPUPMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNPOPUPMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnpopupmanageListTotCnt(ComtnpopupmanageVO vo) {
		return comtnpopupmanageDAO.selectComtnpopupmanageListTotCnt(vo);
	}
    
}
