package kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtneventmanage.service.ComtneventmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtneventmanageServiceImpl.java
 * @Description : Comtneventmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtneventmanageService")
public class ComtneventmanageServiceImpl extends AbstractServiceImpl implements
        ComtneventmanageService {

    @Resource(name="comtneventmanageDAO")
    private ComtneventmanageDAO comtneventmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtneventmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtneventmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtneventmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtneventmanage(ComtneventmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtneventmanageDAO.insertComtneventmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtneventmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtneventmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtneventmanage(ComtneventmanageVO vo) throws Exception {
        comtneventmanageDAO.updateComtneventmanage(vo);
    }

    /**
	 * comtneventmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtneventmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtneventmanage(ComtneventmanageVO vo) throws Exception {
        comtneventmanageDAO.deleteComtneventmanage(vo);
    }

    /**
	 * comtneventmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtneventmanageVO
	 * @return 조회한 comtneventmanage
	 * @exception Exception
	 */
    public ComtneventmanageVO selectComtneventmanage(ComtneventmanageVO vo) throws Exception {
        ComtneventmanageVO resultVO = comtneventmanageDAO.selectComtneventmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtneventmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventmanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtneventmanageList(ComtneventmanageVO vo) throws Exception {
        return comtneventmanageDAO.selectComtneventmanageList(vo);
    }

    /**
	 * comtneventmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtneventmanage 총 갯수
	 * @exception
	 */
    public int selectComtneventmanageListTotCnt(ComtneventmanageVO vo) {
		return comtneventmanageDAO.selectComtneventmanageListTotCnt(vo);
	}
    
}
