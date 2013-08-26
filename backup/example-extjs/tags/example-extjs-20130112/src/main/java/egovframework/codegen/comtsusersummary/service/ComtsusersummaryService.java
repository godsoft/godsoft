package egovframework.codegen.comtsusersummary.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtsusersummaryService.java
 * @Description : Comtsusersummary Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public interface ComtsusersummaryService {

    /**
     * comtsusersummary을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtsusersummaryVO
     * @return 등록 결과
     * @exception Exception
     */
    String insertComtsusersummary(ComtsusersummaryVO vo) throws Exception;

    /**
     * comtsusersummary을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtsusersummaryVO
     * @return void형
     * @exception Exception
     */
    int updateComtsusersummary(ComtsusersummaryVO vo) throws Exception;

    /**
     * comtsusersummary을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtsusersummaryVO
     * @return void형
     * @exception Exception
     */
    int deleteComtsusersummary(ComtsusersummaryVO vo) throws Exception;

    /**
     * comtsusersummary을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtsusersummaryVO
     * @return 조회한 comtsusersummary
     * @exception Exception
     */
    ComtsusersummaryVO selectComtsusersummary(ComtsusersummaryVO vo) throws Exception;

    /**
     * comtsusersummary 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsusersummary 목록
     * @exception Exception
     */
    List<EgovMap> selectComtsusersummaryList(ComtsusersummaryDefaultVO searchVO) throws Exception;

    /**
     * comtsusersummary 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtsusersummary 총 갯수
     * @exception
     */
    int selectComtsusersummaryListTotCnt(ComtsusersummaryDefaultVO searchVO);

}
