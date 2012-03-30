package kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsusersummary.service.ComtsusersummaryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtsusersummaryServiceImpl.java
 * @Description : Comtsusersummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtsusersummaryService")
public class ComtsusersummaryServiceImpl extends AbstractServiceImpl implements
        ComtsusersummaryService {

    @Resource(name="comtsusersummaryDAO")
    private ComtsusersummaryDAO comtsusersummaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtsusersummaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTSUSERSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsusersummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsusersummary(ComtsusersummaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtsusersummaryDAO.insertComtsusersummary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTSUSERSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsusersummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        comtsusersummaryDAO.updateComtsusersummary(vo);
    }

    /**
	 * COMTSUSERSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsusersummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        comtsusersummaryDAO.deleteComtsusersummary(vo);
    }

    /**
	 * COMTSUSERSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsusersummaryVO
	 * @return 조회한 COMTSUSERSUMMARY
	 * @exception Exception
	 */
    public ComtsusersummaryVO selectComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        ComtsusersummaryVO resultVO = comtsusersummaryDAO.selectComtsusersummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTSUSERSUMMARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSUSERSUMMARY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtsusersummaryList(ComtsusersummaryVO vo) throws Exception {
        return comtsusersummaryDAO.selectComtsusersummaryList(vo);
    }

    /**
	 * COMTSUSERSUMMARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSUSERSUMMARY 총 갯수
	 * @exception
	 */
    public int selectComtsusersummaryListTotCnt(ComtsusersummaryVO vo) {
		return comtsusersummaryDAO.selectComtsusersummaryListTotCnt(vo);
	}
    
}
