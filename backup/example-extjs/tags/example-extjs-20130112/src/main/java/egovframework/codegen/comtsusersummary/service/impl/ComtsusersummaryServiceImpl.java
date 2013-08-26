package egovframework.codegen.comtsusersummary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.codegen.comtsusersummary.service.ComtsusersummaryService;
import egovframework.codegen.comtsusersummary.service.ComtsusersummaryDefaultVO;
import egovframework.codegen.comtsusersummary.service.ComtsusersummaryVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtsusersummaryServiceImpl.java
 * @Description : Comtsusersummary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
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
     * comtsusersummary을 등록한다.
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
     * comtsusersummary을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtsusersummaryVO
     * @return void형
     * @exception Exception
     */
    public int updateComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        return comtsusersummaryDAO.updateComtsusersummary(vo);
    }

    /**
     * comtsusersummary을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtsusersummaryVO
     * @return void형
     * @exception Exception
     */
    public int deleteComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        return comtsusersummaryDAO.deleteComtsusersummary(vo);
    }

    /**
     * comtsusersummary을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtsusersummaryVO
     * @return 조회한 comtsusersummary
     * @exception Exception
     */
    public ComtsusersummaryVO selectComtsusersummary(ComtsusersummaryVO vo) throws Exception {
        ComtsusersummaryVO resultVO = comtsusersummaryDAO.selectComtsusersummary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
     * comtsusersummary 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsusersummary 목록
     * @exception Exception
     */
    public List<EgovMap> selectComtsusersummaryList(ComtsusersummaryDefaultVO searchVO) throws Exception {
        return comtsusersummaryDAO.selectComtsusersummaryList(searchVO);
    }

    /**
     * comtsusersummary 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsusersummary 총 갯수
     * @exception
     */
    public int selectComtsusersummaryListTotCnt(ComtsusersummaryDefaultVO searchVO) {
        return comtsusersummaryDAO.selectComtsusersummaryListTotCnt(searchVO);
    }
    
}
