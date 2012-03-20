package kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ComtnrecomendsiteinfoService.java
 * @Description : Comtnrecomendsiteinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnrecomendsiteinfoService {
	
	/**
	 * comtnrecomendsiteinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception;
    
    /**
	 * comtnrecomendsiteinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception;
    
    /**
	 * comtnrecomendsiteinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception;
    
    /**
	 * comtnrecomendsiteinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 조회한 comtnrecomendsiteinfo
	 * @exception Exception
	 */
    ComtnrecomendsiteinfoVO selectComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception;
    
    /**
	 * comtnrecomendsiteinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecomendsiteinfo 목록
	 * @exception Exception
	 */
    List<EgovMap> selectComtnrecomendsiteinfoList(ComtnrecomendsiteinfoVO vo) throws Exception;
    
    /**
	 * comtnrecomendsiteinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrecomendsiteinfo 총 갯수
	 * @exception
	 */
    int selectComtnrecomendsiteinfoListTotCnt(ComtnrecomendsiteinfoVO vo);
    
}
