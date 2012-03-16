package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrngloginfo.service.ComtnntwrksvcmntrngloginfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnntwrksvcmntrngloginfoServiceImpl.java
 * @Description : Comtnntwrksvcmntrngloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnntwrksvcmntrngloginfoService")
public class ComtnntwrksvcmntrngloginfoServiceImpl extends AbstractServiceImpl implements
        ComtnntwrksvcmntrngloginfoService {

    @Resource(name="comtnntwrksvcmntrngloginfoDAO")
    private ComtnntwrksvcmntrngloginfoDAO comtnntwrksvcmntrngloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnntwrksvcmntrngloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnntwrksvcmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnntwrksvcmntrngloginfoDAO.insertComtnntwrksvcmntrngloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        comtnntwrksvcmntrngloginfoDAO.updateComtnntwrksvcmntrngloginfo(vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        comtnntwrksvcmntrngloginfoDAO.deleteComtnntwrksvcmntrngloginfo(vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngloginfoVO
	 * @return 조회한 comtnntwrksvcmntrngloginfo
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngloginfoVO selectComtnntwrksvcmntrngloginfo(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        ComtnntwrksvcmntrngloginfoVO resultVO = comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnntwrksvcmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrngloginfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnntwrksvcmntrngloginfoList(ComtnntwrksvcmntrngloginfoVO vo) throws Exception {
        return comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoList(vo);
    }

    /**
	 * comtnntwrksvcmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngloginfoListTotCnt(ComtnntwrksvcmntrngloginfoVO vo) {
		return comtnntwrksvcmntrngloginfoDAO.selectComtnntwrksvcmntrngloginfoListTotCnt(vo);
	}
    
}
