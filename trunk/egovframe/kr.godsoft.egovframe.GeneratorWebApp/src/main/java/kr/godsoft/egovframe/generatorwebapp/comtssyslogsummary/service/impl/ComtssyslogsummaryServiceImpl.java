package kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.ComtssyslogsummaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtssyslogsummary.service.impl.ComtssyslogsummaryDAO;

/**
 * @Class Name : ComtssyslogsummaryServiceImpl.java
 * @Description : Comtssyslogsummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtssyslogsummaryService")
public class ComtssyslogsummaryServiceImpl extends AbstractServiceImpl implements
        ComtssyslogsummaryService {

    @Resource(name="comtssyslogsummaryDAO")
    private ComtssyslogsummaryDAO comtssyslogsummaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtssyslogsummaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtssyslogsummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtssyslogsummaryDAO.insertComtssyslogsummary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtssyslogsummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        comtssyslogsummaryDAO.updateComtssyslogsummary(vo);
    }

    /**
	 * comtssyslogsummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtssyslogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        comtssyslogsummaryDAO.deleteComtssyslogsummary(vo);
    }

    /**
	 * comtssyslogsummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtssyslogsummaryVO
	 * @return 조회한 comtssyslogsummary
	 * @exception Exception
	 */
    public ComtssyslogsummaryVO selectComtssyslogsummary(ComtssyslogsummaryVO vo) throws Exception {
        ComtssyslogsummaryVO resultVO = comtssyslogsummaryDAO.selectComtssyslogsummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtssyslogsummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtssyslogsummary 목록
	 * @exception Exception
	 */
    public List selectComtssyslogsummaryList(ComtssyslogsummaryDefaultVO searchVO) throws Exception {
        return comtssyslogsummaryDAO.selectComtssyslogsummaryList(searchVO);
    }

    /**
	 * comtssyslogsummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtssyslogsummary 총 갯수
	 * @exception
	 */
    public int selectComtssyslogsummaryListTotCnt(ComtssyslogsummaryDefaultVO searchVO) {
		return comtssyslogsummaryDAO.selectComtssyslogsummaryListTotCnt(searchVO);
	}
    
}
