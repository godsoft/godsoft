package egovframework.codegen.comtnweblog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnweblogService.java
 * @Description : Comtnweblog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public interface ComtnweblogService {

    /**
     * comtnweblog을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnweblogVO
     * @return 등록 결과
     * @exception Exception
     */
    String insertComtnweblog(ComtnweblogVO vo) throws Exception;

    /**
     * comtnweblog을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnweblogVO
     * @return void형
     * @exception Exception
     */
    int updateComtnweblog(ComtnweblogVO vo) throws Exception;

    /**
     * comtnweblog을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnweblogVO
     * @return void형
     * @exception Exception
     */
    int deleteComtnweblog(ComtnweblogVO vo) throws Exception;

    /**
     * comtnweblog을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnweblogVO
     * @return 조회한 comtnweblog
     * @exception Exception
     */
    ComtnweblogVO selectComtnweblog(ComtnweblogVO vo) throws Exception;

    /**
     * comtnweblog 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnweblog 목록
     * @exception Exception
     */
    List<EgovMap> selectComtnweblogList(ComtnweblogDefaultVO searchVO) throws Exception;

    /**
     * comtnweblog 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnweblog 총 갯수
     * @exception
     */
    int selectComtnweblogListTotCnt(ComtnweblogDefaultVO searchVO);

}
