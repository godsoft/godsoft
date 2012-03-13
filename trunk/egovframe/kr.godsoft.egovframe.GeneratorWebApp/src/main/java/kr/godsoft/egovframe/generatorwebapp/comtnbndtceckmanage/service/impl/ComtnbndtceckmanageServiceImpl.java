package kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.ComtnbndtceckmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtceckmanage.service.impl.ComtnbndtceckmanageDAO;

/**
 * @Class Name : ComtnbndtceckmanageServiceImpl.java
 * @Description : Comtnbndtceckmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbndtceckmanageService")
public class ComtnbndtceckmanageServiceImpl extends AbstractServiceImpl implements
        ComtnbndtceckmanageService {

    @Resource(name="comtnbndtceckmanageDAO")
    private ComtnbndtceckmanageDAO comtnbndtceckmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbndtceckmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbndtceckmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbndtceckmanageDAO.insertComtnbndtceckmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbndtceckmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        comtnbndtceckmanageDAO.updateComtnbndtceckmanage(vo);
    }

    /**
	 * comtnbndtceckmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        comtnbndtceckmanageDAO.deleteComtnbndtceckmanage(vo);
    }

    /**
	 * comtnbndtceckmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtceckmanageVO
	 * @return 조회한 comtnbndtceckmanage
	 * @exception Exception
	 */
    public ComtnbndtceckmanageVO selectComtnbndtceckmanage(ComtnbndtceckmanageVO vo) throws Exception {
        ComtnbndtceckmanageVO resultVO = comtnbndtceckmanageDAO.selectComtnbndtceckmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbndtceckmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtceckmanage 목록
	 * @exception Exception
	 */
    public List selectComtnbndtceckmanageList(ComtnbndtceckmanageDefaultVO searchVO) throws Exception {
        return comtnbndtceckmanageDAO.selectComtnbndtceckmanageList(searchVO);
    }

    /**
	 * comtnbndtceckmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtceckmanage 총 갯수
	 * @exception
	 */
    public int selectComtnbndtceckmanageListTotCnt(ComtnbndtceckmanageDefaultVO searchVO) {
		return comtnbndtceckmanageDAO.selectComtnbndtceckmanageListTotCnt(searchVO);
	}
    
}
