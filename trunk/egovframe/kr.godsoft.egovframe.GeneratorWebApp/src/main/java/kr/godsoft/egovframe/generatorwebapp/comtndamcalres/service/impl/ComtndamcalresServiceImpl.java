package kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresService;
import kr.godsoft.egovframe.generatorwebapp.comtndamcalres.service.ComtndamcalresVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndamcalresServiceImpl.java
 * @Description : Comtndamcalres Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndamcalresService")
public class ComtndamcalresServiceImpl extends AbstractServiceImpl implements
        ComtndamcalresService {

    @Resource(name="comtndamcalresDAO")
    private ComtndamcalresDAO comtndamcalresDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndamcalresIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndamcalres을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamcalresVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndamcalres(ComtndamcalresVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndamcalresDAO.insertComtndamcalres(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndamcalres을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamcalresVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndamcalres(ComtndamcalresVO vo) throws Exception {
        comtndamcalresDAO.updateComtndamcalres(vo);
    }

    /**
	 * comtndamcalres을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamcalresVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndamcalres(ComtndamcalresVO vo) throws Exception {
        comtndamcalresDAO.deleteComtndamcalres(vo);
    }

    /**
	 * comtndamcalres을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamcalresVO
	 * @return 조회한 comtndamcalres
	 * @exception Exception
	 */
    public ComtndamcalresVO selectComtndamcalres(ComtndamcalresVO vo) throws Exception {
        ComtndamcalresVO resultVO = comtndamcalresDAO.selectComtndamcalres(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndamcalres 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamcalres 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndamcalresList(ComtndamcalresVO vo) throws Exception {
        return comtndamcalresDAO.selectComtndamcalresList(vo);
    }

    /**
	 * comtndamcalres 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndamcalres 총 갯수
	 * @exception
	 */
    public int selectComtndamcalresListTotCnt(ComtndamcalresVO vo) {
		return comtndamcalresDAO.selectComtndamcalresListTotCnt(vo);
	}
    
}
