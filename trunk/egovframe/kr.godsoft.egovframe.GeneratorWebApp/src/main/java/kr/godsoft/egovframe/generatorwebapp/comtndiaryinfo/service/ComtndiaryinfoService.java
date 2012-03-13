package kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndiaryinfo.service.ComtndiaryinfoVO;

/**
 * @Class Name : ComtndiaryinfoService.java
 * @Description : Comtndiaryinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtndiaryinfoService {
	
	/**
	 * comtndiaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndiaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception;
    
    /**
	 * comtndiaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception;
    
    /**
	 * comtndiaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndiaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception;
    
    /**
	 * comtndiaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndiaryinfoVO
	 * @return 조회한 comtndiaryinfo
	 * @exception Exception
	 */
    ComtndiaryinfoVO selectComtndiaryinfo(ComtndiaryinfoVO vo) throws Exception;
    
    /**
	 * comtndiaryinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndiaryinfo 목록
	 * @exception Exception
	 */
    List selectComtndiaryinfoList(ComtndiaryinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtndiaryinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndiaryinfo 총 갯수
	 * @exception
	 */
    int selectComtndiaryinfoListTotCnt(ComtndiaryinfoDefaultVO searchVO);
    
}
