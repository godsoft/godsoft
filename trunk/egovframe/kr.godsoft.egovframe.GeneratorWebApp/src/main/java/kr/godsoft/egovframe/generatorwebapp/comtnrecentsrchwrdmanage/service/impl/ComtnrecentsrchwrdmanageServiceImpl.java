package kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecentsrchwrdmanage.service.ComtnrecentsrchwrdmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrecentsrchwrdmanageServiceImpl.java
 * @Description : Comtnrecentsrchwrdmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrecentsrchwrdmanageService")
public class ComtnrecentsrchwrdmanageServiceImpl extends AbstractServiceImpl implements
        ComtnrecentsrchwrdmanageService {

    @Resource(name="comtnrecentsrchwrdmanageDAO")
    private ComtnrecentsrchwrdmanageDAO comtnrecentsrchwrdmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrecentsrchwrdmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnrecentsrchwrdmanage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrecentsrchwrdmanageDAO.insertComtnrecentsrchwrdmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnrecentsrchwrdmanage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        comtnrecentsrchwrdmanageDAO.updateComtnrecentsrchwrdmanage(vo);
    }

    /**
	 * comtnrecentsrchwrdmanage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        comtnrecentsrchwrdmanageDAO.deleteComtnrecentsrchwrdmanage(vo);
    }

    /**
	 * comtnrecentsrchwrdmanage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecentsrchwrdmanageVO
	 * @return 조회한 comtnrecentsrchwrdmanage
	 * @exception Exception
	 */
    public ComtnrecentsrchwrdmanageVO selectComtnrecentsrchwrdmanage(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        ComtnrecentsrchwrdmanageVO resultVO = comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnrecentsrchwrdmanage 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrdmanage 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrecentsrchwrdmanageList(ComtnrecentsrchwrdmanageVO vo) throws Exception {
        return comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanageList(vo);
    }

    /**
	 * comtnrecentsrchwrdmanage 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecentsrchwrdmanage 총 갯수
	 * @exception
	 */
    public int selectComtnrecentsrchwrdmanageListTotCnt(ComtnrecentsrchwrdmanageVO vo) {
		return comtnrecentsrchwrdmanageDAO.selectComtnrecentsrchwrdmanageListTotCnt(vo);
	}
    
}
