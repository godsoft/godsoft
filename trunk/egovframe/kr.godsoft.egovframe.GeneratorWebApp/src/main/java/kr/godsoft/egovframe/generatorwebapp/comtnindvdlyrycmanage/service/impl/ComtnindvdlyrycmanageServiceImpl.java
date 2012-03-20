package kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlyrycmanage.service.ComtnindvdlyrycmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnindvdlyrycmanageServiceImpl.java
 * @Description : Comtnindvdlyrycmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnindvdlyrycmanageService")
public class ComtnindvdlyrycmanageServiceImpl extends AbstractServiceImpl implements
        ComtnindvdlyrycmanageService {

    @Resource(name="comtnindvdlyrycmanageDAO")
    private ComtnindvdlyrycmanageDAO comtnindvdlyrycmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnindvdlyrycmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnindvdlyrycmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnindvdlyrycmanageDAO.insertComtnindvdlyrycmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnindvdlyrycmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        comtnindvdlyrycmanageDAO.updateComtnindvdlyrycmanage(vo);
    }

    /**
	 * comtnindvdlyrycmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        comtnindvdlyrycmanageDAO.deleteComtnindvdlyrycmanage(vo);
    }

    /**
	 * comtnindvdlyrycmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlyrycmanageVO
	 * @return 조회한 comtnindvdlyrycmanage
	 * @exception Exception
	 */
    public ComtnindvdlyrycmanageVO selectComtnindvdlyrycmanage(ComtnindvdlyrycmanageVO vo) throws Exception {
        ComtnindvdlyrycmanageVO resultVO = comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnindvdlyrycmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlyrycmanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnindvdlyrycmanageList(ComtnindvdlyrycmanageVO vo) throws Exception {
        return comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanageList(vo);
    }

    /**
	 * comtnindvdlyrycmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlyrycmanage 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlyrycmanageListTotCnt(ComtnindvdlyrycmanageVO vo) {
		return comtnindvdlyrycmanageDAO.selectComtnindvdlyrycmanageListTotCnt(vo);
	}
    
}
