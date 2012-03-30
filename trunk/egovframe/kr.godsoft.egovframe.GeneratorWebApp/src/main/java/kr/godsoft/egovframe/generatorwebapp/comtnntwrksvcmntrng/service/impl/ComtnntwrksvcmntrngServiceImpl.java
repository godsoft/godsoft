package kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtnntwrksvcmntrng.service.ComtnntwrksvcmntrngVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnntwrksvcmntrngServiceImpl.java
 * @Description : Comtnntwrksvcmntrng Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNNTWRKSVCMNTRNG을 등록한다.
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
	 * COMTNNTWRKSVCMNTRNG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        comtnntwrksvcmntrngDAO.updateComtnntwrksvcmntrng(vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        comtnntwrksvcmntrngDAO.deleteComtnntwrksvcmntrng(vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnntwrksvcmntrngVO
	 * @return 조회한 COMTNNTWRKSVCMNTRNG
	 * @exception Exception
	 */
    public ComtnntwrksvcmntrngVO selectComtnntwrksvcmntrng(ComtnntwrksvcmntrngVO vo) throws Exception {
        ComtnntwrksvcmntrngVO resultVO = comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrng(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNTWRKSVCMNTRNG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNTWRKSVCMNTRNG 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnntwrksvcmntrngList(ComtnntwrksvcmntrngVO vo) throws Exception {
        return comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngList(vo);
    }

    /**
	 * COMTNNTWRKSVCMNTRNG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNTWRKSVCMNTRNG 총 갯수
	 * @exception
	 */
    public int selectComtnntwrksvcmntrngListTotCnt(ComtnntwrksvcmntrngVO vo) {
		return comtnntwrksvcmntrngDAO.selectComtnntwrksvcmntrngListTotCnt(vo);
	}
    
}
