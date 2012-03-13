package kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsService;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.ComtnindvdlpgeestbsVO;
import kr.godsoft.egovframe.generatorwebapp.comtnindvdlpgeestbs.service.impl.ComtnindvdlpgeestbsDAO;

/**
 * @Class Name : ComtnindvdlpgeestbsServiceImpl.java
 * @Description : Comtnindvdlpgeestbs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnindvdlpgeestbsService")
public class ComtnindvdlpgeestbsServiceImpl extends AbstractServiceImpl implements
        ComtnindvdlpgeestbsService {

    @Resource(name="comtnindvdlpgeestbsDAO")
    private ComtnindvdlpgeestbsDAO comtnindvdlpgeestbsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnindvdlpgeestbsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnindvdlpgeestbs을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnindvdlpgeestbsDAO.insertComtnindvdlpgeestbs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnindvdlpgeestbs을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        comtnindvdlpgeestbsDAO.updateComtnindvdlpgeestbs(vo);
    }

    /**
	 * comtnindvdlpgeestbs을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        comtnindvdlpgeestbsDAO.deleteComtnindvdlpgeestbs(vo);
    }

    /**
	 * comtnindvdlpgeestbs을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnindvdlpgeestbsVO
	 * @return 조회한 comtnindvdlpgeestbs
	 * @exception Exception
	 */
    public ComtnindvdlpgeestbsVO selectComtnindvdlpgeestbs(ComtnindvdlpgeestbsVO vo) throws Exception {
        ComtnindvdlpgeestbsVO resultVO = comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnindvdlpgeestbs 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgeestbs 목록
	 * @exception Exception
	 */
    public List selectComtnindvdlpgeestbsList(ComtnindvdlpgeestbsDefaultVO searchVO) throws Exception {
        return comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbsList(searchVO);
    }

    /**
	 * comtnindvdlpgeestbs 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnindvdlpgeestbs 총 갯수
	 * @exception
	 */
    public int selectComtnindvdlpgeestbsListTotCnt(ComtnindvdlpgeestbsDefaultVO searchVO) {
		return comtnindvdlpgeestbsDAO.selectComtnindvdlpgeestbsListTotCnt(searchVO);
	}
    
}
