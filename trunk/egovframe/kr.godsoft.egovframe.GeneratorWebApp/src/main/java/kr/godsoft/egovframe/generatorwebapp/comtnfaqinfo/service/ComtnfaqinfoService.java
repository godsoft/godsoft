package kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfaqinfo.service.ComtnfaqinfoVO;

/**
 * @Class Name : ComtnfaqinfoService.java
 * @Description : Comtnfaqinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnfaqinfoService {
	
	/**
	 * comtnfaqinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfaqinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * comtnfaqinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * comtnfaqinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfaqinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * comtnfaqinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfaqinfoVO
	 * @return 조회한 comtnfaqinfo
	 * @exception Exception
	 */
    ComtnfaqinfoVO selectComtnfaqinfo(ComtnfaqinfoVO vo) throws Exception;
    
    /**
	 * comtnfaqinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfaqinfo 목록
	 * @exception Exception
	 */
    List selectComtnfaqinfoList(ComtnfaqinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnfaqinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfaqinfo 총 갯수
	 * @exception
	 */
    int selectComtnfaqinfoListTotCnt(ComtnfaqinfoDefaultVO searchVO);
    
}
