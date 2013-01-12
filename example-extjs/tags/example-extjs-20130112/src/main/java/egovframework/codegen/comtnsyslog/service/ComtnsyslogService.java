package egovframework.codegen.comtnsyslog.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnsyslogService.java
 * @Description : Comtnsyslog Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsyslogService {

    /**
     * comtnsyslog을 등록한다.
     * @param vo - 등록할 정보가 담긴 ComtnsyslogVO
     * @return 등록 결과
     * @exception Exception
     */
    String insertComtnsyslog(ComtnsyslogVO vo) throws Exception;

    /**
     * comtnsyslog을 수정한다.
     * @param vo - 수정할 정보가 담긴 ComtnsyslogVO
     * @return void형
     * @exception Exception
     */
    int updateComtnsyslog(ComtnsyslogVO vo) throws Exception;

    /**
     * comtnsyslog을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 ComtnsyslogVO
     * @return void형
     * @exception Exception
     */
    int deleteComtnsyslog(ComtnsyslogVO vo) throws Exception;

    /**
     * comtnsyslog을 조회한다.
     * @param vo - 조회할 정보가 담긴 ComtnsyslogVO
     * @return 조회한 comtnsyslog
     * @exception Exception
     */
    ComtnsyslogVO selectComtnsyslog(ComtnsyslogVO vo) throws Exception;

    /**
     * comtnsyslog 목록을 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnsyslog 목록
     * @exception Exception
     */
    List<EgovMap> selectComtnsyslogList(ComtnsyslogDefaultVO searchVO) throws Exception;

    /**
     * comtnsyslog 총 갯수를 조회한다.
     * @param searchVO - 조회할 정보가 담긴 VO
     * @return comtnsyslog 총 갯수
     * @exception
     */
    int selectComtnsyslogListTotCnt(ComtnsyslogDefaultVO searchVO);

}
