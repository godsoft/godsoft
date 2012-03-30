package kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsbbssummary.service.ComtsbbssummaryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtsbbssummaryServiceImpl.java
 * @Description : Comtsbbssummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTSBBSSUMMARY을 등록한다.
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
	 * COMTSBBSSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        comtsbbssummaryDAO.updateComtsbbssummary(vo);
    }

    /**
	 * COMTSBBSSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsbbssummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        comtsbbssummaryDAO.deleteComtsbbssummary(vo);
    }

    /**
	 * COMTSBBSSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsbbssummaryVO
	 * @return 조회한 COMTSBBSSUMMARY
	 * @exception Exception
	 */
    public ComtsbbssummaryVO selectComtsbbssummary(ComtsbbssummaryVO vo) throws Exception {
        ComtsbbssummaryVO resultVO = comtsbbssummaryDAO.selectComtsbbssummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTSBBSSUMMARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSBBSSUMMARY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtsbbssummaryList(ComtsbbssummaryVO vo) throws Exception {
        return comtsbbssummaryDAO.selectComtsbbssummaryList(vo);
    }

    /**
	 * COMTSBBSSUMMARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSBBSSUMMARY 총 갯수
	 * @exception
	 */
    public int selectComtsbbssummaryListTotCnt(ComtsbbssummaryVO vo) {
		return comtsbbssummaryDAO.selectComtsbbssummaryListTotCnt(vo);
	}
    
}
