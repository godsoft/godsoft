package kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.ComtnctsnnmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnctsnnmanage.service.impl.ComtnctsnnmanageDAO;

/**
 * @Class Name : ComtnctsnnmanageServiceImpl.java
 * @Description : Comtnctsnnmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnctsnnmanageService")
public class ComtnctsnnmanageServiceImpl extends AbstractServiceImpl implements
        ComtnctsnnmanageService {

    @Resource(name="comtnctsnnmanageDAO")
    private ComtnctsnnmanageDAO comtnctsnnmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnctsnnmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnctsnnmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnctsnnmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnctsnnmanageDAO.insertComtnctsnnmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnctsnnmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnctsnnmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        comtnctsnnmanageDAO.updateComtnctsnnmanage(vo);
    }

    /**
	 * comtnctsnnmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnctsnnmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        comtnctsnnmanageDAO.deleteComtnctsnnmanage(vo);
    }

    /**
	 * comtnctsnnmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnctsnnmanageVO
	 * @return 조회한 comtnctsnnmanage
	 * @exception Exception
	 */
    public ComtnctsnnmanageVO selectComtnctsnnmanage(ComtnctsnnmanageVO vo) throws Exception {
        ComtnctsnnmanageVO resultVO = comtnctsnnmanageDAO.selectComtnctsnnmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnctsnnmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnctsnnmanage 목록
	 * @exception Exception
	 */
    public List selectComtnctsnnmanageList(ComtnctsnnmanageDefaultVO searchVO) throws Exception {
        return comtnctsnnmanageDAO.selectComtnctsnnmanageList(searchVO);
    }

    /**
	 * comtnctsnnmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnctsnnmanage 총 갯수
	 * @exception
	 */
    public int selectComtnctsnnmanageListTotCnt(ComtnctsnnmanageDefaultVO searchVO) {
		return comtnctsnnmanageDAO.selectComtnctsnnmanageListTotCnt(searchVO);
	}
    
}