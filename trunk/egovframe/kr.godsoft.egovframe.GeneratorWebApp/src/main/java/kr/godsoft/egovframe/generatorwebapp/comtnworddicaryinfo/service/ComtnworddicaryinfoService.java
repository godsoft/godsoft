package kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnworddicaryinfo.service.ComtnworddicaryinfoVO;

/**
 * @Class Name : ComtnworddicaryinfoService.java
 * @Description : Comtnworddicaryinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnworddicaryinfoService {
	
	/**
	 * comtnworddicaryinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * comtnworddicaryinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * comtnworddicaryinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * comtnworddicaryinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnworddicaryinfoVO
	 * @return 조회한 comtnworddicaryinfo
	 * @exception Exception
	 */
    ComtnworddicaryinfoVO selectComtnworddicaryinfo(ComtnworddicaryinfoVO vo) throws Exception;
    
    /**
	 * comtnworddicaryinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnworddicaryinfo 목록
	 * @exception Exception
	 */
    List selectComtnworddicaryinfoList(ComtnworddicaryinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnworddicaryinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnworddicaryinfo 총 갯수
	 * @exception
	 */
    int selectComtnworddicaryinfoListTotCnt(ComtnworddicaryinfoDefaultVO searchVO);
    
}
