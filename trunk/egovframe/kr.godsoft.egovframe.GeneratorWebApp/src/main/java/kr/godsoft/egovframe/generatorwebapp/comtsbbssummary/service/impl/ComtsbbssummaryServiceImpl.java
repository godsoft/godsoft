package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.impl.ComtsbbssummaryDAO;

/**
 * @Class Name : ComtsbbssummaryServiceImpl.java
 * @Description : Comtsbbssummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtsbbssummaryService")
public class ComtsbbssummaryServiceImpl extends AbstractServiceImpl implements
        ComtsbbssummaryService {

    @Resource(name="comtsbbssummaryDAO")
    private ComtsbbssummaryDAO comtsbbssummaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtsbbssummaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtsbbssummary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsbbssummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtsbbssummaryDAO.insertComtsbbssummary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtsbbssummary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        comtsbbssummaryDAO.updateComtsbbssummary(vo);
    }

    /**
	 * comtsbbssummary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        comtsbbssummaryDAO.deleteComtsbbssummary(vo);
    }

    /**
	 * comtsbbssummary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsbbssummaryVO
	 * @return 조회한 comtsbbssummary
	 * @exception Exception
	 */
    public ComtsbbssummaryVO selectComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        ComtsbbssummaryVO resultVO = comtsbbssummaryDAO.selectComtsbbssummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtsbbssummary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsbbssummary 목록
	 * @exception Exception
	 */
    public List selectComtsbbssummaryList(ComtsbbssummaryDefaultVO searchVO) throws Exception {
        return comtsbbssummaryDAO.selectComtsbbssummaryList(searchVO);
    }

    /**
	 * comtsbbssummary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtsbbssummary 총 갯수
	 * @exception
	 */
    public int selectComtsbbssummaryListTotCnt(ComtsbbssummaryDefaultVO searchVO) {
		return comtsbbssummaryDAO.selectComtsbbssummaryListTotCnt(searchVO);
	}
    
}
