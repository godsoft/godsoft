package kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnemplyrscrtyestbs.service.ComtnemplyrscrtyestbsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnemplyrscrtyestbsServiceImpl.java
 * @Description : Comtnemplyrscrtyestbs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnemplyrscrtyestbsService")
public class ComtnemplyrscrtyestbsServiceImpl extends AbstractServiceImpl implements
        ComtnemplyrscrtyestbsService {

    @Resource(name="comtnemplyrscrtyestbsDAO")
    private ComtnemplyrscrtyestbsDAO comtnemplyrscrtyestbsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnemplyrscrtyestbsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNEMPLYRSCRTYESTBS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnemplyrscrtyestbsDAO.insertComtnemplyrscrtyestbs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        comtnemplyrscrtyestbsDAO.updateComtnemplyrscrtyestbs(vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        comtnemplyrscrtyestbsDAO.deleteComtnemplyrscrtyestbs(vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnemplyrscrtyestbsVO
	 * @return 조회한 COMTNEMPLYRSCRTYESTBS
	 * @exception Exception
	 */
    public ComtnemplyrscrtyestbsVO selectComtnemplyrscrtyestbs(ComtnemplyrscrtyestbsVO vo) throws Exception {
        ComtnemplyrscrtyestbsVO resultVO = comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEMPLYRSCRTYESTBS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnemplyrscrtyestbsList(ComtnemplyrscrtyestbsVO vo) throws Exception {
        return comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbsList(vo);
    }

    /**
	 * COMTNEMPLYRSCRTYESTBS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNEMPLYRSCRTYESTBS 총 갯수
	 * @exception
	 */
    public int selectComtnemplyrscrtyestbsListTotCnt(ComtnemplyrscrtyestbsVO vo) {
		return comtnemplyrscrtyestbsDAO.selectComtnemplyrscrtyestbsListTotCnt(vo);
	}
    
}
