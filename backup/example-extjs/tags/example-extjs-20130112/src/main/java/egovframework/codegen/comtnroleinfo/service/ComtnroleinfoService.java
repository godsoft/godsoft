package egovframework.codegen.comtnroleinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnroleinfoService.java
 * @Description : Comtnroleinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public interface ComtnroleinfoService {

    /**
     * comtnroleinfo을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnroleinfoVO
     * @return 등록 결과
     * @exception Exception
     */
    String insertComtnroleinfo(ComtnroleinfoVO vo) throws Exception;

    /**
     * comtnroleinfo을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnroleinfoVO
     * @return void형
     * @exception Exception
     */
    int updateComtnroleinfo(ComtnroleinfoVO vo) throws Exception;

    /**
     * comtnroleinfo을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnroleinfoVO
     * @return void형
     * @exception Exception
     */
    int deleteComtnroleinfo(ComtnroleinfoVO vo) throws Exception;

    /**
     * comtnroleinfo을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnroleinfoVO
     * @return 조회한 comtnroleinfo
     * @exception Exception
     */
    ComtnroleinfoVO selectComtnroleinfo(ComtnroleinfoVO vo) throws Exception;

    /**
     * comtnroleinfo 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnroleinfo 목록
     * @exception Exception
     */
    List<EgovMap> selectComtnroleinfoList(ComtnroleinfoDefaultVO searchVO) throws Exception;

    /**
     * comtnroleinfo 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnroleinfo 총 갯수
     * @exception
     */
    int selectComtnroleinfoListTotCnt(ComtnroleinfoDefaultVO searchVO);

}