package kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.ComtstrsmrcvlogsummaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtstrsmrcvlogsummary.service.impl.ComtstrsmrcvlogsummaryDAO;

/**
 * @Class Name : ComtstrsmrcvlogsummaryServiceImpl.java
 * @Description : Comtstrsmrcvlogsummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtstrsmrcvlogsummaryService")
public class ComtstrsmrcvlogsummaryServiceImpl extends AbstractServiceImpl implements
        ComtstrsmrcvlogsummaryService {

    @Resource(name="comtstrsmrcvlogsummaryDAO")
    private ComtstrsmrcvlogsummaryDAO comtstrsmrcvlogsummaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtstrsmrcvlogsummaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtstrsmrcvlogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtstrsmrcvlogsummaryDAO.insertComtstrsmrcvlogsummary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtstrsmrcvlogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        comtstrsmrcvlogsummaryDAO.updateComtstrsmrcvlogsummary(vo);
    }

    /**
	 * comtstrsmrcvlogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        comtstrsmrcvlogsummaryDAO.deleteComtstrsmrcvlogsummary(vo);
    }

    /**
	 * comtstrsmrcvlogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtstrsmrcvlogsummaryVO
	 * @return 조회한 comtstrsmrcvlogsummary
	 * @exception Exception
	 */
    public ComtstrsmrcvlogsummaryVO selectComtstrsmrcvlogsummary(ComtstrsmrcvlogsummaryVO vo) throws Exception {
        ComtstrsmrcvlogsummaryVO resultVO = comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtstrsmrcvlogsummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtstrsmrcvlogsummary 목록
	 * @exception Exception
	 */
    public List selectComtstrsmrcvlogsummaryList(ComtstrsmrcvlogsummaryDefaultVO searchVO) throws Exception {
        return comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummaryList(searchVO);
    }

    /**
	 * comtstrsmrcvlogsummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtstrsmrcvlogsummary 총 갯수
	 * @exception
	 */
    public int selectComtstrsmrcvlogsummaryListTotCnt(ComtstrsmrcvlogsummaryDefaultVO searchVO) {
		return comtstrsmrcvlogsummaryDAO.selectComtstrsmrcvlogsummaryListTotCnt(searchVO);
	}
    
}
