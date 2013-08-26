package egovframework.codegen.comtsweblogsummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtsweblogsummaryService.java
 * @Description : Comtsweblogsummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public interface ComtsweblogsummaryService {

    /**
     * comtsweblogsummary을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtsweblogsummaryVO
     * @return 등록 결과
     * @exception Exception
     */
    String insertComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;

    /**
     * comtsweblogsummary을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtsweblogsummaryVO
     * @return void형
     * @exception Exception
     */
    int updateComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;

    /**
     * comtsweblogsummary을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtsweblogsummaryVO
     * @return void형
     * @exception Exception
     */
    int deleteComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;

    /**
     * comtsweblogsummary을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtsweblogsummaryVO
     * @return 조회한 comtsweblogsummary
     * @exception Exception
     */
    ComtsweblogsummaryVO selectComtsweblogsummary(ComtsweblogsummaryVO vo) throws Exception;

    /**
     * comtsweblogsummary 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsweblogsummary 목록
     * @exception Exception
     */
    List<EgovMap> selectComtsweblogsummaryList(ComtsweblogsummaryDefaultVO searchVO) throws Exception;

    /**
     * comtsweblogsummary 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsweblogsummary 총 갯수
     * @exception
     */
    int selectComtsweblogsummaryListTotCnt(ComtsweblogsummaryDefaultVO searchVO);

}
