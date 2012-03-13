package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngVO;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.impl.ComtnntwrksvcmntrngDAO;

/**
 * @Class Name : ComtnntwrksvcmntrngServiceImpl.java
 * @Description : Comtnntwrksvcmntrng Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnntwrksvcmntrngService")
public class ComtnntwrksvcmntrngServiceImpl extends AbstractServiceImpl implements
        ComtnntwrksvcmntrngService {

    @Resource(name="comtnntwrksvcmntrngDAO")
    private ComtnntwrksvcmntrngDAO comtnntwrksvcmntrngDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnntwrksvcmntrngIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnntwrksvcmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnntwrksvcmntrngDAO.insertComtnntwrksvcmntrng(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnntwrksvcmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        comtnntwrksvcmntrngDAO.updateComtnntwrksvcmntrng(vo);
    }

    /**
	 * comtnntwrksvcmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        comtnntwrksvcmntrngDAO.deleteComtnntwrksvcmntrng(vo);
    }

    /**
	 * comtnntwrksvcmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 조회한 comtnntwrksvcmntrng
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngVO selectComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        ComtnntwrksvcmntrngVO resultVO = comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrng(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnntwrksvcmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrng 목록
	 * @exception Exception
	 */
    public List selectComtnntwrksvcmntrngList(ComtnntwrksvcmntrngDefaultVO searchVO) throws Exception {
        return comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngList(searchVO);
    }

    /**
	 * comtnntwrksvcmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnntwrksvcmntrng 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngListTotCnt(ComtnntwrksvcmntrngDefaultVO searchVO) {
		return comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngListTotCnt(searchVO);
	}
    
}
