package kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.ComtnrwardmanageVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrwardmanage.service.impl.ComtnrwardmanageDAO;

/**
 * @Class Name : ComtnrwardmanageServiceImpl.java
 * @Description : Comtnrwardmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrwardmanageService")
public class ComtnrwardmanageServiceImpl extends AbstractServiceImpl implements
        ComtnrwardmanageService {

    @Resource(name="comtnrwardmanageDAO")
    private ComtnrwardmanageDAO comtnrwardmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrwardmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnrwardmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrwardmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrwardmanageDAO.insertComtnrwardmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnrwardmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        comtnrwardmanageDAO.updateComtnrwardmanage(vo);
    }

    /**
	 * comtnrwardmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrwardmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        comtnrwardmanageDAO.deleteComtnrwardmanage(vo);
    }

    /**
	 * comtnrwardmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrwardmanageVO
	 * @return 조회한 comtnrwardmanage
	 * @exception Exception
	 */
    public ComtnrwardmanageVO selectComtnrwardmanage(ComtnrwardmanageVO vo) throws Exception {
        ComtnrwardmanageVO resultVO = comtnrwardmanageDAO.selectComtnrwardmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnrwardmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrwardmanage 목록
	 * @exception Exception
	 */
    public List selectComtnrwardmanageList(ComtnrwardmanageDefaultVO searchVO) throws Exception {
        return comtnrwardmanageDAO.selectComtnrwardmanageList(searchVO);
    }

    /**
	 * comtnrwardmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrwardmanage 총 갯수
	 * @exception
	 */
    public int selectComtnrwardmanageListTotCnt(ComtnrwardmanageDefaultVO searchVO) {
		return comtnrwardmanageDAO.selectComtnrwardmanageListTotCnt(searchVO);
	}
    
}