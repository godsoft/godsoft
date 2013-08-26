package kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnonlinepollmanage.service.ComtnonlinepollmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnonlinepollmanageServiceImpl.java
 * @Description : Comtnonlinepollmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnonlinepollmanageService")
public class ComtnonlinepollmanageServiceImpl extends AbstractServiceImpl implements
        ComtnonlinepollmanageService {

    @Resource(name="comtnonlinepollmanageDAO")
    private ComtnonlinepollmanageDAO comtnonlinepollmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnonlinepollmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNONLINEPOLLMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnonlinepollmanageDAO.insertComtnonlinepollmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNONLINEPOLLMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        comtnonlinepollmanageDAO.updateComtnonlinepollmanage(vo);
    }

    /**
	 * COMTNONLINEPOLLMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        comtnonlinepollmanageDAO.deleteComtnonlinepollmanage(vo);
    }

    /**
	 * COMTNONLINEPOLLMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnonlinepollmanageVO
	 * @return 조회한 COMTNONLINEPOLLMANAGE
	 * @exception Exception
	 */
    public ComtnonlinepollmanageVO selectComtnonlinepollmanage(ComtnonlinepollmanageVO vo) throws Exception {
        ComtnonlinepollmanageVO resultVO = comtnonlinepollmanageDAO.selectComtnonlinepollmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNONLINEPOLLMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLMANAGE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnonlinepollmanageList(ComtnonlinepollmanageVO vo) throws Exception {
        return comtnonlinepollmanageDAO.selectComtnonlinepollmanageList(vo);
    }

    /**
	 * COMTNONLINEPOLLMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNONLINEPOLLMANAGE 총 갯수
	 * @exception
	 */
    public int selectComtnonlinepollmanageListTotCnt(ComtnonlinepollmanageVO vo) {
		return comtnonlinepollmanageDAO.selectComtnonlinepollmanageListTotCnt(vo);
	}
    
}