package kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.ComtnadbkmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnadbkmanage.service.impl.ComtnadbkmanageDAO;

/**
 * @Class Name : ComtnadbkmanageServiceImpl.java
 * @Description : Comtnadbkmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnadbkmanageService")
public class ComtnadbkmanageServiceImpl extends AbstractServiceImpl implements
        ComtnadbkmanageService {

    @Resource(name="comtnadbkmanageDAO")
    private ComtnadbkmanageDAO comtnadbkmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnadbkmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnadbkmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadbkmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnadbkmanageDAO.insertComtnadbkmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnadbkmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        comtnadbkmanageDAO.updateComtnadbkmanage(vo);
    }

    /**
	 * comtnadbkmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadbkmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        comtnadbkmanageDAO.deleteComtnadbkmanage(vo);
    }

    /**
	 * comtnadbkmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadbkmanageVO
	 * @return 조회한 comtnadbkmanage
	 * @exception Exception
	 */
    public ComtnadbkmanageVO selectComtnadbkmanage(ComtnadbkmanageVO vo) throws Exception {
        ComtnadbkmanageVO resultVO = comtnadbkmanageDAO.selectComtnadbkmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnadbkmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbkmanage 목록
	 * @exception Exception
	 */
    public List selectComtnadbkmanageList(ComtnadbkmanageDefaultVO searchVO) throws Exception {
        return comtnadbkmanageDAO.selectComtnadbkmanageList(searchVO);
    }

    /**
	 * comtnadbkmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnadbkmanage 총 갯수
	 * @exception
	 */
    public int selectComtnadbkmanageListTotCnt(ComtnadbkmanageDefaultVO searchVO) {
		return comtnadbkmanageDAO.selectComtnadbkmanageListTotCnt(searchVO);
	}
    
}