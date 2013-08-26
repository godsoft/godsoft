package kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryService;
import kr.godsoft.egovframe.generatorwebapp.comtsweblogsummary.service.ComtsweblogsummaryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtsweblogsummaryServiceImpl.java
 * @Description : Comtsweblogsummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtsweblogsummaryService")
public class ComtsweblogsummaryServiceImpl extends AbstractServiceImpl implements
        ComtsweblogsummaryService {

    @Resource(name="comtsweblogsummaryDAO")
    private ComtsweblogsummaryDAO comtsweblogsummaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtsweblogsummaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTSWEBLOGSUMMARY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtsweblogsummaryDAO.insertComtsweblogsummary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTSWEBLOGSUMMARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        comtsweblogsummaryDAO.updateComtsweblogsummary(vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtsweblogsummaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        comtsweblogsummaryDAO.deleteComtsweblogsummary(vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtsweblogsummaryVO
	 * @return 조회한 COMTSWEBLOGSUMMARY
	 * @exception Exception
	 */
    public ComtsweblogsummaryVO selectComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception {
        ComtsweblogsummaryVO resultVO = comtsweblogsummaryDAO.selectComtsweblogsummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTSWEBLOGSUMMARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSWEBLOGSUMMARY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtsweblogsummaryList(ComtsweblogsummaryVO vo) throws Exception {
        return comtsweblogsummaryDAO.selectComtsweblogsummaryList(vo);
    }

    /**
	 * COMTSWEBLOGSUMMARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTSWEBLOGSUMMARY 총 갯수
	 * @exception
	 */
    public int selectComtsweblogsummaryListTotCnt(ComtsweblogsummaryVO vo) {
		return comtsweblogsummaryDAO.selectComtsweblogsummaryListTotCnt(vo);
	}
    
}
